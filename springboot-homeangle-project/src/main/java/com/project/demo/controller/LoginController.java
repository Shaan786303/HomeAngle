package com.project.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.project.demo.entity.LoginEntity;
import com.project.demo.service.LoginService;

@Controller
public class LoginController 
{
	@Autowired
	private LoginService loginService;
	
	
	@GetMapping("/electriciandatapage")
    public String view1() {
		return "electriciandata";
	}
	
	@GetMapping("/carpenterdatapage")
    public String view2() {
		return "carpenterdata";
	}
	
	@GetMapping("/painterdatapage")
    public String view3() {
		return "painterdata";
	}
	
	@GetMapping("/plumberdatapage")
    public String view4() {
		return "plumberdata";
	}
	
	@GetMapping("/feedbackpage")
    public String view5() {
		return "feedback";
	}
	
	@GetMapping("/userloginpage")
    public String showLoginForm(Model model) {
        // create model attribute to bind form data
		LoginEntity login = new LoginEntity();
        model.addAttribute("userlogin", login);
        return "userlogin";
    }

    @PostMapping("/savelogin")
    public String loginUser(@ModelAttribute("userlogin") LoginEntity login) {
        // save login to database
    	loginService.userLogin(login);
        return "redirect:/";
    }
}
