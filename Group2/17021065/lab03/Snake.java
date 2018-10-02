package tuan2;

public class Snake {
	private String species; // giong loai
	private double length; // do dai (m)
	private double weight; // can nang (kg)
	private int age; // tuoi doi (year)
	private boolean poison; // co doc khong ?	
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
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
	public boolean isPoison() {
		return poison;
	}
	public void setPoison(boolean poison) {
		this.poison = poison;
	}
}
