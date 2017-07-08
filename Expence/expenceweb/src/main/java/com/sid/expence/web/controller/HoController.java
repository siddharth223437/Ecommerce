package com.sid.expence.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sid.expence.common.vo.Users;
import com.sid.expence.service.UsersSerives;







@Controller
public class HoController {
	
@Autowired
private UsersSerives userServices;
	@GetMapping("/")
	public String home(){
		return "redirect:/login";
	}
	
	@GetMapping("/login")
	public String getlogin(Model model){
		Users user = new Users();
		model.addAttribute("loginUser", user);
		return "login";
	}
	
	@PostMapping("/login")
	public String checkLogin(@ModelAttribute("loginUser") Users user){
		if(!user.equals(null)){
			user = userServices.checkLogin(user.getUsername(), user.getPassword());
			System.out.println("after user service");
			
			if(user!=null){
				System.out.println("User is not null");
				return "welcome";
			}	
		}
		return "error";
		
		
	}

}
