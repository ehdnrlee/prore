package com.re.mind.service;

import java.io.IOException;
import java.io.PrintWriter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletResponse;

import org.mybatis.spring.SqlSessionTemplate;

import com.re.mind.vo.userInfo;
import com.re.mind.dao.userDao;
@Service
public class userService {
	@Autowired userDao userdao;
	
	public String join(userInfo user) {
		String result=null;
		System.out.println(user.getId());
		int queryResult=userdao.joinuser(user);
		if(queryResult>0) {
			System.out.println("가입완료");
			result="user/login";		
		}else {
			System.out.println("가입불가");
			result="user/join";
		}
		return result;
	}
	public ModelAndView login(userInfo user) {
		ModelAndView model=new ModelAndView();
		String result=userdao.pwdcheck(user.getId());
		if(result.equals(null)) {
			System.out.println("아이디가 존재하지 않음 ");
			model.addObject("0");
		}else {
			
		
			
		}
		
		
		
		return model;
	}
	public int idcheck(String id){
		System.out.println("중복확인 처리");
		int result=userdao.overlapcheck(id);
		
		System.out.println("중복확인 결과"+result);
		return userdao.overlapcheck(id);
	}
	
	
}
