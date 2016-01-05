package by.spring.collections.example;

public class Person {
	private String name;
	private String add;
	private int age;

	public void Person() {
	}

	public void Person(String name, String add, int age) {
		this.name = name;
		this.add = add;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
 public String toString(){
	 return "person[name:" + name + " add:" + add + " age:" + age +"]";
 }
}
