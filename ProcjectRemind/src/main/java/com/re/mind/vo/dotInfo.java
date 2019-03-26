package com.re.mind.vo;

public class dotInfo {
	String dot_num;
	int dot_x;
	int dot_y;
	public String getDot_num() {
		return dot_num;
	}
	public void setDot_num(String dot_num) {
		this.dot_num = dot_num;
	}
	public int getDot_x() {
		return dot_x;
	}
	public void setDot_x(int dot_x) {
		this.dot_x = dot_x;
	}
	public int getDot_y() {
		return dot_y;
	}
	public void setDot_y(int dot_y) {
		this.dot_y = dot_y;
	}
	@Override
	public String toString() {
		return "dotInfo [dot_num=" + dot_num + ", dot_x=" + dot_x + ", dot_y=" + dot_y + "]";
	}
	public dotInfo(String dot_num, int dot_x, int dot_y) {
		super();
		this.dot_num = dot_num;
		this.dot_x = dot_x;
		this.dot_y = dot_y;
	}
	public dotInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
}
