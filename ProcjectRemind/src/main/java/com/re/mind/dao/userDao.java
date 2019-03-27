package com.re.mind.dao;

import com.re.mind.vo.userInfo;

public interface userDao {
	public int joinuser(userInfo user) ;
	public String pwdcheck(String id);
	public int overlapcheck(String id) ;
	
	
}
