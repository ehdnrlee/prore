package com.re.mind.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.re.mind.service.dotService;
import com.re.mind.service.fclService;
import com.re.mind.service.userService;

import com.re.mind.service.*; 
import com.re.mind.vo.*;

@Controller
public class adminController {
	@Autowired userService userSer;
	@Autowired fclService fclSer;
	@Autowired dotService dotSer;
	
	@GetMapping("/addfcl")
	public String addfcl() {
		return "admin/addfcl";		
	}
	
	@PostMapping("/Save")
	@ResponseBody
	public int save(@RequestBody List<Map<String,Object>> dotinfo) {
		System.out.println("저장실행");
		System.out.println(dotinfo.get(3).get("dot_x"));
		return 0;
	}
	
}
