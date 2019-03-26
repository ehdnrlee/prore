package com.re.mind.vo;

public class fclinfo_timelimit {
	String fcl_num;
	int fcl_kind_num;
	int time_limit;
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
	public int getTime_limit() {
		return time_limit;
	}
	public void setTime_limit(int time_limit) {
		this.time_limit = time_limit;
	}
	@Override
	public String toString() {
		return "fclinfo_timelimit [fcl_num=" + fcl_num + ", fcl_kind_num=" + fcl_kind_num + ", time_limit=" + time_limit
				+ "]";
	}
	public fclinfo_timelimit(String fcl_num, int fcl_kind_num, int time_limit) {
		super();
		this.fcl_num = fcl_num;
		this.fcl_kind_num = fcl_kind_num;
		this.time_limit = time_limit;
	}
	public fclinfo_timelimit() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
