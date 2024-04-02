package com.travels;

public class Driver {
	private String category;
	private int driverno;
	private String drivername;
	private double totaldistance;
	public Driver(String category, int driverno, String drivername, double totaldistance) {
		this.category = category;
		this.driverno = driverno;
		this.drivername = drivername;
		this.totaldistance = totaldistance;
	}
	
	public Driver() {
		
		
	}

	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getDriverno() {
		return driverno;
	}
	public void setDriverno(int driverno) {
		this.driverno = driverno;
	}
	public String getDrivername() {
		return drivername;
	}
	public void setDrivername(String drivername) {
		this.drivername = drivername;
	}
	public double getTotaldistance() {
		return totaldistance;
	}
	public void setTotaldistance(double totaldistance) {
		this.totaldistance = totaldistance;
	}





}


