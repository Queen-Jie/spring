package by.spring.bean.configuration.inheritance;

public class Customer {
	private int type;
	private String action;
	private String contry;

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getContry() {
		return contry;
	}

	public void setContry(String contry) {
		this.contry = contry;
	}

	public String toString() {
		return "Customer[type=" + type + " action=" + action + " contry=" + contry + "]";
	}

}
