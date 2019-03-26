package com.re.mind.vo;

public class fclinfo_main {
	String fcl_num,fcl_name;
	boolean fcl_IO;
	public String getFcl_num() {
		return fcl_num;
	}
	public void setFcl_num(String fcl_num) {
		this.fcl_num = fcl_num;
	}
	public String getFcl_name() {
		return fcl_name;
	}
	public void setFcl_name(String fcl_name) {
		this.fcl_name = fcl_name;
	}
	public boolean isFcl_IO() {
		return fcl_IO;
	}
	public void setFcl_IO(boolean fcl_IO) {
		this.fcl_IO = fcl_IO;
	}
	public fclinfo_main() {
		super();
	}
	public fclinfo_main(String fcl_num, String fcl_name, boolean fcl_IO) {
		super();
		this.fcl_num = fcl_num;
		this.fcl_name = fcl_name;
		this.fcl_IO = fcl_IO;
	}
	@Override
	public String toString() {
		return "fclinfo_main [fcl_num=" + fcl_num + ", fcl_name=" + fcl_name + ", fcl_IO=" + fcl_IO + "]";
	}
	

}
