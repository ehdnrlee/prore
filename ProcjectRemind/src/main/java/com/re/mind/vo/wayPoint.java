package com.re.mind.vo;

public class wayPoint {
	String dot_num;
	int connection_point;
	public String getDot_num() {
		return dot_num;
	}
	public void setDot_num(String dot_num) {
		this.dot_num = dot_num;
	}
	public int getConnection_point() {
		return connection_point;
	}
	public void setConnection_point(int connection_point) {
		this.connection_point = connection_point;
	}
	@Override
	public String toString() {
		return "wayPoint [dot_num=" + dot_num + ", connection_point=" + connection_point + "]";
	}
	public wayPoint(String dot_num, int connection_point) {
		super();
		this.dot_num = dot_num;
		this.connection_point = connection_point;
	}
	public wayPoint() {
		super();
		// TODO Auto-generated constructor stub
	}
}
