package com.re.mind.vo;

public class fclinfo_degree {
	String fcl_num;
	int fcl_kind_num;
	int degreee;
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
	public int getDegreee() {
		return degreee;
	}
	public void setDegreee(int degreee) {
		this.degreee = degreee;
	}
	@Override
	public String toString() {
		return "fclinfo_degree [fcl_num=" + fcl_num + ", fcl_kind_num=" + fcl_kind_num + ", degreee=" + degreee + "]";
	}
	public fclinfo_degree(String fcl_num, int fcl_kind_num, int degreee) {
		super();
		this.fcl_num = fcl_num;
		this.fcl_kind_num = fcl_kind_num;
		this.degreee = degreee;
	}
	public fclinfo_degree() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
