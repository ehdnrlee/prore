package com.re.mind.vo;

public class fclinfo_restaurant {
	String fcl_num;
	int fcl_kind_num;
	int restarant_kind;
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
	public int getRestarant_kind() {
		return restarant_kind;
	}
	public void setRestarant_kind(int restarant_kind) {
		this.restarant_kind = restarant_kind;
	}
	@Override
	public String toString() {
		return "fclinfo_restaurant [fcl_num=" + fcl_num + ", fcl_kind_num=" + fcl_kind_num + ", restarant_kind="
				+ restarant_kind + "]";
	}
	public fclinfo_restaurant(String fcl_num, int fcl_kind_num, int restarant_kind) {
		super();
		this.fcl_num = fcl_num;
		this.fcl_kind_num = fcl_kind_num;
		this.restarant_kind = restarant_kind;
	}
	public fclinfo_restaurant() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
