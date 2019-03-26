package com.re.mind.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

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
}
