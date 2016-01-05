package by.spring.inner.bean.example;

public class Person {
private String name;
private String add;
private int age;

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
	return "Person [add=" + add + ", age=" + age + ", name=" + name + "]";

}
}
