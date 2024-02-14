package com.project.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.project.demo.entity.AdminLoginEntity;
import com.project.demo.service.AdminLoginService;

@Controller
public class AdminLoginController {
	
	@Autowired
	private AdminLoginService adminloginService;
	
	@GetMapping("/adminpage")
    public String showLoginForm(Model model) {
        // create model attribute to bind form data
		AdminLoginEntity login = new AdminLoginEntity();
        model.addAttribute("adminlogins", login);
        return "adminlogin";
    }

    @PostMapping("/savelogins")
    public String loginAdmin(@ModelAttribute("adminlogins") AdminLoginEntity login) {
        // save login to database
    	adminloginService.adminLogin(login);
        return "adminpage";
    }
}
