package lab05;

public class CaoPhongOrange extends Orange {

	public CaoPhongOrange() {
		super();
		name = "Cam Phong Orange";
		color = "yellow";
		flavor = "sweet";
		price = 17.5;
	}
	
	public CaoPhongOrange(String dateImport) {
		this();
		super.dateImport = dateImport;
	}
	
}
