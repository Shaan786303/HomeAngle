package com.project.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;

import com.project.demo.entity.UserRegisterEntity;
import com.project.demo.service.UserRegisterService;

@Controller
public class UserRegisterController 
{
	@Autowired
	private UserRegisterService userRegisterService;
	
    @GetMapping("/profilepage")
    public String viewUser(Model model) {
        model.addAttribute("listUser", userRegisterService.getAllUsers());
        return "profile";
    }

    @GetMapping("/userregisterpage")
    public String showRegisterForm(Model model) {
        // create model attribute to bind form data
    	UserRegisterEntity user = new UserRegisterEntity();
        model.addAttribute("userregister", user);
        return "userregister";
    }

    @PostMapping("/saveregister")
    public String saveUser(@ModelAttribute("userregister") UserRegisterEntity user) {
        // save user to database
    	userRegisterService.saveUser(user);
        return "redirect:/userloginpage";
    }
    
    @GetMapping("/showupdateform/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") String userid, Model model) {

        // get user from the service
        UserRegisterEntity user = userRegisterService.updateUser(userid);

        // set user as a model attribute to pre-populate the form
        model.addAttribute("userupdate", user);
        return "updateuser";
    }

    @GetMapping("/deleteuser/{id}")
    public String deleteUser(@PathVariable(value = "id") String userid) {

        // call delete user method 
        this.userRegisterService.deleteUser(userid);
        return "redirect:/profilepage";
    }
}
