package tuan2;

public class Dog {
	private String species; // giong loai
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	private double height; // chieu cao (m)
	private double weight; // can nang (kg)
	private int age; // tuoi doi (year)
	private boolean sex; // gioi tinh (1=duc, 0=cai)
}
