package com.re.mind.controller;

import java.io.IOException;
import java.security.Principal;
import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.re.mind.function.*;
import com.re.mind.service.*; 
import com.re.mind.vo.*;
@Controller
public class userController {
	@Inject
    PasswordEncoder passwordEncoder;
	
	@Autowired userService userSer;
	@Autowired fclService fclSer;
	@Autowired dotService dotSer;
	numbercounting numcount=new numbercounting();
	
	@GetMapping("/")
	public String home() {

		return "user/home";	
	}
	@GetMapping("/userhome")
	public String userhome(Principal principal, Model model){
		model.addAttribute("id", principal.getName());
		System.out.println("로그인후로 이동");
		return "user/userhome";
	
		
	}
	
	
	@GetMapping("/loginhome")
	public String loginhome() {
		System.out.println("로그인 페이지 이동 ");
		return "user/login";	
	}
	@GetMapping("/joinhome")
	public String joinhome() {
		System.out.println("가입페이지로 이동");
		return "user/join";
	}
	
	
	@PostMapping("/idcheck")
	@ResponseBody
	public int idcheck(@RequestBody String id){
		System.out.println(id+"id중복확인 진행중");
		return userSer.idcheck(id);
	}
	@PostMapping("/join")
	public String join(@ModelAttribute userInfo user){
		System.out.println(user.getId()+"의 가입 진행중");
		user.setPwd((passwordEncoder.encode(user.getPwd())));
		System.out.println(user.getPwd());
		return userSer.join(user);
	}
	@PostMapping("/login")
	public ModelAndView login(@ModelAttribute userInfo user,ModelAndView model) {
		model=userSer.login(user);
		return model;
	}
	
	
	
}
