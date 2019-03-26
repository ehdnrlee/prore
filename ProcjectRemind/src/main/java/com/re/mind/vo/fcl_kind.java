package com.re.mind.vo;

public class fcl_kind {
	String fcl_kind_name;
	int fcl_kind_num;
	public String getFcl_kind_name() {
		return fcl_kind_name;
	}
	public void setFcl_kind_name(String fcl_kind_name) {
		this.fcl_kind_name = fcl_kind_name;
	}
	public int getFcl_kind_num() {
		return fcl_kind_num;
	}
	public void setFcl_kind_num(int fcl_kind_num) {
		this.fcl_kind_num = fcl_kind_num;
	}
	@Override
	public String toString() {
		return "fcl_kind [fcl_kind_name=" + fcl_kind_name + ", fcl_kind_num=" + fcl_kind_num + "]";
	}
	public fcl_kind(String fcl_kind_name, int fcl_kind_num) {
		super();
		this.fcl_kind_name = fcl_kind_name;
		this.fcl_kind_num = fcl_kind_num;
	}
	public fcl_kind() {
		super();
		// TODO Auto-generated constructor stub
	}
}
