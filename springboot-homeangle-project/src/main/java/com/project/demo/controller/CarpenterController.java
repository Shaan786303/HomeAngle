package com.project.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.project.demo.entity.CarpenterEntity;
import com.project.demo.service.CarpenterService;

@Controller
public class CarpenterController 
{

	@Autowired
	private CarpenterService carpenterService;
	
	 @GetMapping("/showcarpenter")
	    public String viewCarpenter(Model model) {
	        model.addAttribute("listCarpenter", carpenterService.getAllCarpenter());
	        return "carpenter";
	    }
	
	   @GetMapping("/addcarpenter")
	    public String showCarpenterForm(Model model) {
	        // create model attribute to bind form data
		   CarpenterEntity carpenter = new CarpenterEntity();
	        model.addAttribute("savecarp", carpenter);
	        return "addcarpenter";
	    }

	    @PostMapping("/savecarpenter")
	    public String saveCarpenter(@ModelAttribute("savecarp") CarpenterEntity carpenter) {
	        // save carpenter to database
	    	carpenterService.saveCarpenter(carpenter);
	        return "redirect:/showcarpenter";
	    }
	    
	    @GetMapping("/showCarpUpdateForm/{id}")
	    public String showFormForUpdate(@PathVariable(value = "id") String id, Model model) {

	        // get carpenter from the service
	    	CarpenterEntity carpenter = carpenterService.updateCarpenter(id);

	        // set carpenter as a model attribute to pre-populate the form
	        model.addAttribute("updatecarp", carpenter);
	        return "updatecarpenter";
	    }

	    @GetMapping("/deleteCarpenter/{id}")
	    public String deleteCarpenter(@PathVariable(value = "id") String id) {

	        // call delete carpenter method 
	        this.carpenterService.deleteCarpenter(id);
	        return "redirect:/showcarpenter";
	    }
}
