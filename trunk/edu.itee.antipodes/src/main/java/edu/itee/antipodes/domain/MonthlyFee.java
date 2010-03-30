package edu.itee.antipodes.domain;

public class MonthlyFee {
	private int feeID;
	private int year;
	private int month;
	private double fee;
	public int getFeeID() {
		return feeID;
	}
	public void setFeeID(int feeID) {
		this.feeID = feeID;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	@Override
	public String toString() {
		return "MonthlyFee [feeID=" + feeID + ", year=" + year +", month=" + month
				+ ", fee=" + fee + "]";
	}
	
}
