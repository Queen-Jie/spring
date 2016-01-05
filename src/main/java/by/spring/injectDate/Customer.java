package by.spring.injectDate;

import java.util.Date;

public class Customer {
	private Date date;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	public Customer(){}
	public Customer(Date date){
		this.date = date;
	}
	public String toString() {
		return "Customer[date:" + date + "]";
	}
}
