package com.re.mind.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.re.mind.function.*;
import com.re.mind.service.*; 
import com.re.mind.vo.*;
@Controller
public class userController {
	@Autowired userService userSer;
	@Autowired fclService fclSer;
	@Autowired dotService dotSer;
	numbercounting numcount=new numbercounting();
	
	@GetMapping("/")
	public String home(Model model) {
		String num=numcount.number("az99");
		model.addAttribute("name",num);
		return "user/home";	
	}
	@GetMapping("/joinhome")
	public String joinhome() {
		System.out.println("가입페이지로 이동");
		return "user/join";
	}
	@PostMapping("/join")
	public String join(@ModelAttribute userInfo user) {
		return userSer.join(user);
		
	}
	
	
	
}
