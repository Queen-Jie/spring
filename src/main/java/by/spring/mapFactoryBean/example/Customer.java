package by.spring.mapFactoryBean.example;

import java.util.Map;

public class Customer {
	private Map maps;

	public Map getMaps() {
		return maps;
	}

	public void setMaps(Map maps) {
		this.maps = maps;
	}

	public String toString() {
		return "Customer[map:" + maps + "]";
	}
}
