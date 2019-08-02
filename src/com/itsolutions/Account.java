package com.itsolutions;

public class Account {
	
	private int accNo;
	private long pin;
	private double balance;
	
	

	public Account() {}
	public Account(int accNo, long pin, double balance) {
		super();
		this.accNo = accNo;
		this.pin = pin;
		this.balance = balance;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public long getPin() {
		return pin;
	}
	public void setPin(long pin) {
		this.pin = pin;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
