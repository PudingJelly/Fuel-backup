package com.spring.fuelplease.controller;

import javax.sql.rowset.serial.SerialArray;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mysql.cj.Session;
import com.spring.fuelplease.user.service.IUserService;
import com.spring.fuelplease.voCenter.UserVO;


@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private IUserService service;

	// 마이페이지 이동 요청
	@GetMapping("/userMypage")
	public void userMypage(Model model) {
		
		model.addAttribute("userInfo", service.getInfo(UserVO.));
	}
	
	
}
