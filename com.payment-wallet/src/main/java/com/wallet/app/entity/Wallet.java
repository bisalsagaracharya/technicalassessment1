package com.wallet.app.entity;

public class Wallet {
	
	private int wid;
	private String wname;
	private Double wbalance;
	
	
	public Wallet() {
		super();
	}


	public Wallet(int wid, String wname, Double wbalance) {
		super();
		this.wid = wid;
		this.wname = wname;
		this.wbalance = wbalance;
	}


	public int getWid() {
		return wid;
	}


	public void setWid(int wid) {
		this.wid = wid;
	}


	public String getWname() {
		return wname;
	}


	public void setWname(String wname) {
		this.wname = wname;
	}


	public Double getWbalance() {
		return wbalance;
	}


	public void setWbalance(Double wbalance) {
		this.wbalance = wbalance;
	}


	@Override
	public String toString() {
		return "Wallet [wid=" + wid + ", wname=" + wname + ", wbalance=" + wbalance + "]";
	}
	
	

}
