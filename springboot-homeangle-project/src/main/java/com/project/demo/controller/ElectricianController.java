package com.project.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.project.demo.entity.ElectricianEntity;
import com.project.demo.service.ElectricianService;

@Controller
public class ElectricianController 
{

	@Autowired
	private ElectricianService electricianService;
	
	 @GetMapping("/showelectrician")
	    public String viewElectrician(Model model) {
	        model.addAttribute("listElectrician", electricianService.getAllElectrician());
	        return "electrician";
	    }
	
	   @GetMapping("/addelectrician")
	    public String showElectricianForm(Model model) {
	        // create model attribute to bind form data
		   ElectricianEntity electrician = new ElectricianEntity();
	        model.addAttribute("saveelec", electrician);
	        return "addelectrician";
	    }

	    @PostMapping("/saveelectrician")
	    public String saveElectrician(@ModelAttribute("saveelec") ElectricianEntity electrician) {
	        // save electrician to database
	    	electricianService.saveElectrician(electrician);
	        return "redirect:/showelectrician";
	    }
	    
	    @GetMapping("/showElecUpdateForm/{id}")
	    public String showFormForUpdate(@PathVariable(value = "id") String id, Model model) {

	        // get electrician from the service
	    	ElectricianEntity electrician = electricianService.updateElectrician(id);

	        // set electrician as a model attribute to pre-populate the form
	        model.addAttribute("updateelec", electrician);
	        return "updateelectrician";
	    }

	    @GetMapping("/deleteElectrician/{id}")
	    public String deleteElectrician(@PathVariable(value = "id") String id) {

	        // call delete electrician method 
	        this.electricianService.deleteElectrician(id);
	        return "redirect:/showelectrician";
	    }
}
