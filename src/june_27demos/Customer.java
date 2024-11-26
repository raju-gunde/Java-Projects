package june_27demos;

import java.util.Comparator;
import java.util.Scanner;

public class Customer{
	private Integer costomerNumber;
	private String CustomerName;
	private Double CustomerPrice;
	public Customer(Integer costomerNumber, String customerName, Double customerPrice) {
		super();
		this.costomerNumber = costomerNumber;
		CustomerName = customerName;
		CustomerPrice = customerPrice;
	}
	@Override
	public String toString() {
		return "Customer [costomerNumber=" + costomerNumber + ", CustomerName=" + CustomerName + ", CustomerPrice="
				+ CustomerPrice + "]";
	}
	public Integer getCostomerNumber() {
		return costomerNumber;
	}
	public void setCostomerNumber(Integer costomerNumber) {
		this.costomerNumber = costomerNumber;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public Double getCustomerPrice() {
		return CustomerPrice;
	}
	public void setCustomerPrice(Double customerPrice) {
		CustomerPrice = customerPrice;
	}
	
	
	
		
		
		
	
	
	

}
