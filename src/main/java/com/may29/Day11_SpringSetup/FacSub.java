package com.may29.Day11_SpringSetup;

public class FacSub {

	int facId;
	String subName;
	public int getFacId() {
		return facId;
	}
	public void setFacId(int facId) {
		this.facId = facId;
	}
	public String getSubName() {
		return subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}
	public FacSub() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FacSub(int facId, String subName) {
		super();
		this.facId = facId;
		this.subName = subName;
	}
	@Override
	public String toString() {
		return "FacSub [facId=" + facId + ", subName=" + subName + "]";
	}
	
	
	
}