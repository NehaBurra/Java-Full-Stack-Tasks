package Sim;

public class Sim {
	private int simId;
	private String customerName;
	private double balance;
	private double ratePerSecond;
	private String circle;
	
	public Sim(int simId2, String customerName2, double balance2, double ratePerSecond, String circle2) 
	{
		simId=simId2;
		customerName=customerName2;
		balance=balance2;
		this.ratePerSecond=ratePerSecond;
		circle=circle2;
	}
	public int getSimId() {
		return simId;
	}
	public void setSimId(int simId) {
		this.simId = simId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getRatePerSecond() {
		return ratePerSecond;
	}
	public void setRatePerSecond(double ratePerSecond) {
		this.ratePerSecond = ratePerSecond;
	}
	public String getCircle() {
		return circle;
	}
	public void setCircle(String circle) {
		this.circle = circle;
	}
	
	
	
}
