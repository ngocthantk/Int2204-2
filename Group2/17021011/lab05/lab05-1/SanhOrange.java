package lab05;

public class SanhOrange extends Orange {

	public SanhOrange() {
		super();
		name = "Sanh Orange";
		price = 17.5;
	}
	
	public SanhOrange(String dateImport) {
		this();
		super.dateImport = dateImport;
	}
	
}
