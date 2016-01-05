package by.multipleconstrutor;

public class Customer {
	private String name;
	private String add;
	private int age;

	public Customer(String name, String add, int age) {
		this.name = name;
		this.add = add;
		this.age = age;
	}

	public Customer(String name, int age, String add) {
		this.name = name;
		this.age = age;
		this.add = add;
	}

	public String toString() {
		return "name:" + name + "\n add:" + add + "\n age:" + age;
	}

}
