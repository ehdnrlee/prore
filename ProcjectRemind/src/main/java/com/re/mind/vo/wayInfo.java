package com.re.mind.vo;

public class wayInfo {
	String maindot_num;
	String connectiondot_num;
	int wayLenght;
	@Override
	public String toString() {
		return "wayInfo [maindot_num=" + maindot_num + ", connectiondot_num=" + connectiondot_num + ", wayLenght="
				+ wayLenght + "]";
	}
	public wayInfo(String maindot_num, String connectiondot_num, int wayLenght) {
		super();
		this.maindot_num = maindot_num;
		this.connectiondot_num = connectiondot_num;
		this.wayLenght = wayLenght;
	}
	public wayInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getMaindot_num() {
		return maindot_num;
	}
	public void setMaindot_num(String maindot_num) {
		this.maindot_num = maindot_num;
	}
	public String getConnectiondot_num() {
		return connectiondot_num;
	}
	public void setConnectiondot_num(String connectiondot_num) {
		this.connectiondot_num = connectiondot_num;
	}
	public int getWayLenght() {
		return wayLenght;
	}
	public void setWayLenght(int wayLenght) {
		this.wayLenght = wayLenght;
	}
	
}
