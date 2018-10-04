//B3Lab03
public class TestDog{
  public static void main(String[] args){
    Dog dog = new Dog();
	dog.sound();
	dog.setCannang(15);
	dog.setTen("Milu");
	System.out.println(dog.getTen() + " nang " +dog.getCannang() + "kg");
  }
}
