package by.spring.setFactoryBean.example;

import java.util.Set;

public class Customer {
	private Set sets;

	public Set getSets() {
		return sets;
	}

	public void setSets(Set sets) {
		this.sets = sets;
	}
	@Override
	public String toString() {
		return "Customer[set" + sets + "]";
	}
}
