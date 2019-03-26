package com.re.mind.vo;

public class fclinfo_agelimit {
	String fcl_num;
	int fcl_kind_num;
	int age_limit;
	public String getFcl_num() {
		return fcl_num;
	}
	public void setFcl_num(String fcl_num) {
		this.fcl_num = fcl_num;
	}
	public int getFcl_kind_num() {
		return fcl_kind_num;
	}
	public void setFcl_kind_num(int fcl_kind_num) {
		this.fcl_kind_num = fcl_kind_num;
	}
	public int getAge_limit() {
		return age_limit;
	}
	public void setAge_limit(int age_limit) {
		this.age_limit = age_limit;
	}
	@Override
	public String toString() {
		return "fclinfo_agelimit [fcl_num=" + fcl_num + ", fcl_kind_num=" + fcl_kind_num + ", age_limit=" + age_limit
				+ "]";
	}
	public fclinfo_agelimit(String fcl_num, int fcl_kind_num, int age_limit) {
		super();
		this.fcl_num = fcl_num;
		this.fcl_kind_num = fcl_kind_num;
		this.age_limit = age_limit;
	}
	public fclinfo_agelimit() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
