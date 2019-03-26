package com.re.mind.vo;

public class userInfo {
	String id;
	String pwd;
	String name;
	boolean enable;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isEnable() {
		return enable;
	}
	public void setEnable(boolean enable) {
		this.enable = enable;
	}
	@Override
	public String toString() {
		return "userInfo [id=" + id + ", pwd=" + pwd + ", name=" + name + ", enable=" + enable + "]";
	}
	public userInfo(String id, String pwd, String name, boolean enable) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.enable = enable;
	}
	public userInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
}
