package lab06;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Optional;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ListView;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;

public class Controller implements Initializable {

	private Shape sourceShape;

	private Diagram diagram = new Diagram();

	static int count = 2, numberTab = 1, countCircle = 0, countRectangle = 0, countSquare = 0, countTriangle = 0,
			countHexagon = 0;

	static AnchorPane root = new AnchorPane();

	ArrayList<AnchorPane> listAnchorPane = new ArrayList<>();

	ArrayList<TextField> listTextField = new ArrayList<>();

	@FXML
	TabPane tabPane = new TabPane();

	@FXML
	TextField x1 = new TextField(), y1 = new TextField(), x2 = new TextField(), y2 = new TextField(),
			x3 = new TextField(), y3 = new TextField(), width = new TextField(), length = new TextField(),
			radius = new TextField(), side = new TextField();
	@FXML
	CheckBox True = new CheckBox();

	@FXML
	CheckBox False = new CheckBox();

	@FXML
	Button changeBtn = new Button(), drawBtn = new Button();

	ObservableList<String> elementShapes = FXCollections.observableArrayList();

	@FXML
	ListView<String> listView = new ListView();

	/*Init*/
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		AnchorPane anchorPane = new AnchorPane();
		listAnchorPane.add(anchorPane);
		Tab tab = tabPane.getSelectionModel().getSelectedItem();
		tab.setContent(anchorPane);
		root = anchorPane;
		Layer layer = new Layer();
		diagram.add(layer);
		tabPane.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Tab>() {
			@Override
			public void changed(ObservableValue<? extends Tab> arg0, Tab arg1, Tab arg2) {
				if (tabIndex() >= 0) {
					root = listAnchorPane.get(tabIndex());
					loadList();
				}
			}
		});
		listTextField.add(x1);
		listTextField.add(y1);
		listTextField.add(x2);
		listTextField.add(y2);
		listTextField.add(x3);
		listTextField.add(y3);
		listTextField.add(width);
		listTextField.add(length);
		listTextField.add(radius);
		listTextField.add(side);
		listView.setItems(elementShapes);
	}

	/* Show shapes*/
	public void setVisibleTrue() {
		True.setSelected(true);
		False.setSelected(false);
		for (AnchorPane s : listAnchorPane)
			s.setVisible(true);
	}
	
	/* Hide shapes*/
	public void setVisibleFalse() {
		False.setSelected(true);
		True.setSelected(false);
		for (AnchorPane s : listAnchorPane)
			s.setVisible(false);
	}

	public void disableTextFields() {
		for (TextField s : listTextField)
			s.setDisable(true);
	}

	/* Set input methods */
	public void startAddCircle() throws IOException {
		sourceShape = new CircleT();
		showCircleTF();
		ChangeToDrawBtn();
	}

	public void startAddRectangle() throws IOException {
		sourceShape = new RectangleT();
		showRectangleTF();
		ChangeToDrawBtn();
	}

	public void startAddSquare() throws IOException {
		sourceShape = new SquareT();
		showSquareTF();
		ChangeToDrawBtn();
	}

	public void startAddTriangle() throws IOException {
		sourceShape = new TriangleT();
		showTriangleTF();
		ChangeToDrawBtn();
	}

	public void startAddHexagon() throws IOException {
		sourceShape = new HexagonT();
		showCircleTF();
		ChangeToDrawBtn();
	}

	
	/* Handle event when click Draw Button*/
	public void handleDrawBtn() {
		try {
			if (sourceShape instanceof HexagonT) {
				sourceShape = new HexagonT(Double.parseDouble(x1.getText()), Double.parseDouble(y1.getText()),
						Double.parseDouble(radius.getText()));
				sourceShape.draw();
				elementShapes.add("Hexagon" + ++countHexagon);
			} else if (sourceShape instanceof SquareT) {
				sourceShape = new SquareT(Double.parseDouble(x1.getText()), Double.parseDouble(y1.getText()),
						Double.parseDouble(side.getText()));
				sourceShape.draw();
				elementShapes.add("Square" + ++countSquare);
			} else if (sourceShape instanceof TriangleT) {
				sourceShape = new TriangleT(Double.parseDouble(x1.getText()), Double.parseDouble(y1.getText()),
						Double.parseDouble(x2.getText()), Double.parseDouble(y2.getText()),
						Double.parseDouble(x3.getText()), Double.parseDouble(y3.getText()));
				sourceShape.draw();
				elementShapes.add("Triangle" + ++countTriangle);
			} else if (sourceShape instanceof RectangleT) {
				sourceShape = new RectangleT(Double.parseDouble(x1.getText()), Double.parseDouble(y1.getText()),
						Double.parseDouble(width.getText()), Double.parseDouble(length.getText()));
				sourceShape.draw();
				elementShapes.add("Rectangle" + ++countRectangle);
			} else if (sourceShape instanceof CircleT) {
				sourceShape = new CircleT(Double.parseDouble(x1.getText()), Double.parseDouble(y1.getText()),
						Double.parseDouble(radius.getText()));
				sourceShape.draw();
				elementShapes.add("Circle" + ++countCircle);
			}
			diagram.get(tabIndex()).add(sourceShape);			
		}
		catch(NumberFormatException e)
		{
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Information Dialog");
			alert.setHeaderText(null);
			alert.setContentText("Please check your Input !!!");
			alert.showAndWait();
		}
		
	}

	/* Handle event when click Change Button*/
	public void handleChangeBtn() {

		Layer layer = diagram.get(tabIndex());
		try
		{
			root.getChildren().clear();
			int index = listView.getSelectionModel().getSelectedIndex();
	
			sourceShape.erase();
			if (sourceShape instanceof HexagonT) {
				sourceShape = new HexagonT(Double.parseDouble(x1.getText()), Double.parseDouble(y1.getText()),
						Double.parseDouble(radius.getText()));
			} else if (sourceShape instanceof SquareT) {
				sourceShape = new SquareT(Double.parseDouble(x1.getText()), Double.parseDouble(y1.getText()),
						Double.parseDouble(side.getText()));
			} else if (sourceShape instanceof TriangleT) {
				sourceShape = new TriangleT(Double.parseDouble(x1.getText()), Double.parseDouble(y1.getText()),
						Double.parseDouble(x2.getText()), Double.parseDouble(y2.getText()),
						Double.parseDouble(x3.getText()), Double.parseDouble(y3.getText()));
			} else if (sourceShape instanceof RectangleT) {
				sourceShape = new RectangleT(Double.parseDouble(x1.getText()), Double.parseDouble(y1.getText()),
						Double.parseDouble(width.getText()), Double.parseDouble(length.getText()));
			} else if (sourceShape instanceof CircleT) {
				sourceShape = new CircleT(Double.parseDouble(x1.getText()), Double.parseDouble(y1.getText()),
						Double.parseDouble(radius.getText()));
			}
			layer.change(index, sourceShape);
		}
		catch(NumberFormatException e)
		{
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Information Dialog");
			alert.setHeaderText(null);
			alert.setContentText("Please check your Input !!!");
			alert.showAndWait();
		}
		layer.drawShape();
	}

	/* Delete duplicate Shape */
	public void deleteDuplicate() {
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Confirmation Dialog");
		alert.setHeaderText(null);
		alert.setContentText("Are you sure to delete duplitcate shapes?");
		Optional<ButtonType> result = alert.showAndWait();
		if (result.get() == ButtonType.OK)
		{
			root.getChildren().clear();
			Layer layer = diagram.get(tabIndex());
			layer.deleteDuplicate();
			layer.drawShape();
			loadList();
		}
	}

	/* Delete Triangle in layer*/
	public void deleteTriangle() {
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Confirmation Dialog");
		alert.setHeaderText(null);
		alert.setContentText("Are you sure to delete triangles?");
		Optional<ButtonType> result = alert.showAndWait();
		if (result.get() == ButtonType.OK)
		{
			root.getChildren().clear();
			Layer layer = diagram.get(tabIndex());
			layer.deleteTriangle();
			layer.drawShape();
			loadList();
		}
	}

	/* Delete Circle in diagram*/
	public void deleteAllCircle() {
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Confirmation Dialog");
		alert.setHeaderText(null);
		alert.setContentText("Are you sure to delete all circles?");
		Optional<ButtonType> result = alert.showAndWait();
		if (result.get() == ButtonType.OK)
		{
			diagram.deleteAllCircle();
			for (int i = 0; i < listAnchorPane.size(); i++) {
				root = listAnchorPane.get(i);
				root.getChildren().clear();
				Layer layer = diagram.get(i);
				layer.drawShape();
			}
			loadList();
		}
	}

	/* Creat new tab */
	public void creatNewLayer() {
		numberTab++;
		Tab tab = new Tab("layer" + count++);
		tabPane.getTabs().add(tab);
		AnchorPane anchorPane = new AnchorPane();
		listAnchorPane.add(anchorPane);
		tab.setContent(anchorPane);
		Layer layer = new Layer();
		diagram.add(layer);
		loadList();
	}

	/* Close tab */
	public void closeTab() {
		try {
			diagram.remove(tabIndex());
			tabPane.getTabs().remove(tabIndex());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/* Handle click ListView */
	public void listOnClick() {
		DrawToChangeBtn();
		sourceShape = diagram.get(tabIndex()).get(listView.getSelectionModel().getSelectedIndex());
		x1.setText(Double.toString(sourceShape.x));
		y1.setText(Double.toString(sourceShape.y));
		if (sourceShape instanceof HexagonT) {
			showCircleTF();
			HexagonT hexagon = (HexagonT) sourceShape;
			radius.setText(Double.toString(hexagon.radius));
		} else if (sourceShape instanceof SquareT) {
			showSquareTF();
			SquareT square = (SquareT) sourceShape;
			side.setText(Double.toString(square.length));
		} else if (sourceShape instanceof TriangleT) {
			showTriangleTF();
			TriangleT triangle = (TriangleT) sourceShape;
			x2.setText(Double.toString(triangle.x1));
			y2.setText(Double.toString(triangle.y1));
			x3.setText(Double.toString(triangle.x2));
			y3.setText(Double.toString(triangle.y2));
		} else if (sourceShape instanceof RectangleT) {
			showRectangleTF();
			RectangleT rectangle = (RectangleT) sourceShape;
			width.setText(Double.toString(rectangle.width));
			length.setText(Double.toString(rectangle.length));
		} else if (sourceShape instanceof CircleT) {
			showCircleTF();
			CircleT circle = (CircleT) sourceShape;
			radius.setText(Double.toString(circle.radius));
		}
	}

	public void sortShape() {
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Confirmation Dialog");
		alert.setHeaderText(null);
		alert.setContentText("Are you sure to sort Shapes?");
		Optional<ButtonType> result = alert.showAndWait();
		if (result.get() == ButtonType.OK)
		{
			if (numberTab < 5) {
				for (int i = numberTab; i < 5; i++)
					creatNewLayer();
			}
			diagram.sort();
			for (int i = 0; i < listAnchorPane.size(); i++) {
				root = listAnchorPane.get(i);
				root.getChildren().clear();
				Layer layer = diagram.get(i);
				layer.drawShape();
			}
			loadList();
		}
	}

	/* get index tab selected */
	public int tabIndex() {
		return tabPane.getSelectionModel().getSelectedIndex();
	}

	/* reset count to 0 */
	public void resetCount() {
		countCircle = 0;
		countRectangle = 0;
		countSquare = 0;
		countTriangle = 0;
		countHexagon = 0;
	}

	/* Show textField */

	public void showTriangleTF() {
		disableTextFields();
		x1.setDisable(false);
		y1.setDisable(false);
		x2.setDisable(false);
		y2.setDisable(false);
		x3.setDisable(false);
		y3.setDisable(false);
		x1.requestFocus();
	}

	public void showRectangleTF() {
		disableTextFields();
		x1.setDisable(false);
		y1.setDisable(false);
		width.setDisable(false);
		length.setDisable(false);
		x1.requestFocus();
	}

	public void showSquareTF() {
		disableTextFields();
		x1.setDisable(false);
		y1.setDisable(false);
		side.setDisable(false);
		x1.requestFocus();
	}

	public void showCircleTF() {
		disableTextFields();
		x1.setDisable(false);
		y1.setDisable(false);
		radius.setDisable(false);
		x1.requestFocus();
	}

	/* Change mode (Draw/Change)*/
	public void ChangeToDrawBtn() {
		changeBtn.setVisible(false);
		drawBtn.setVisible(true);
	}

	public void DrawToChangeBtn() {
		changeBtn.setVisible(true);
		drawBtn.setVisible(false);
	}

	/* Load ListView */
	public void loadList() {
		Layer layer = diagram.get(tabIndex());
		elementShapes.clear();
		resetCount();
		layer.addElementToListView(elementShapes);
	}
}
