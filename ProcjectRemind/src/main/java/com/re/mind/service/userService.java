package com.re.mind.service;

import java.io.PrintWriter;

import org.springframework.stereotype.Service;

import com.re.mind.vo.userInfo;
import com.re.mind.dao.userDao;
@Service
public class userService {
	userDao userdao;
	public String join(userInfo user) {
		String result=null;
		if(userdao.joinuser(user)>0) {
			System.out.println("가입완료");
			result="user/userhome";		
		}else {
			System.out.println("가입불가");
			result="user/joinhome";
		}
		return result;
	}
}
