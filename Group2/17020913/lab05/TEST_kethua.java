package KeThua_2;

public class TEST_kethua {
	public static void main(String[] args) {
		Shape sp = new Shape();
		System.out.println(sp.toString());
		Circle cr = new Circle();
		System.out.println("hinh tron"+cr.toString());
		System.out.println("ChuVi:"+ cr.getChuvi()+", Dientich:"+ cr.getArea());
 		Rectangle rt = new Rectangle();
 		System.out.println("hinh chu nhat:" + rt.toString());
 		Square sq = new Square();
 		System.out.println("hinh vuong:" +sq.toString());
 		
	}

}
