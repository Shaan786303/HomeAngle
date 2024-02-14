package com.project.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.project.demo.entity.PlumberEntity;
import com.project.demo.service.PlumberService;

@Controller
public class PlumberController {

	@Autowired
	private PlumberService plumberService;

	@GetMapping("/showplumber")
	public String viewPlumber(Model model) {
		model.addAttribute("listPlumber", plumberService.getAllPlumber());
		return "plumber";
	}

	@GetMapping("/addplumber")
	public String showPlumberForm(Model model) {
		// create model attribute to bind form data
		PlumberEntity plumber = new PlumberEntity();
		model.addAttribute("saveplum", plumber);
		return "addplumber";
	}

	@PostMapping("/saveplumber")
	public String savePlumber(@ModelAttribute("saveplum") PlumberEntity plumber) {
		// save plumber to database
		plumberService.savePlumber(plumber);
		return "redirect:/showplumber";
	}

	@GetMapping("/showPlumUpdateForm/{id}")
	public String showFormForUpdate(@PathVariable(value = "id") String id, Model model) {

		// get plumber from the service
		PlumberEntity plumber = plumberService.updatePlumber(id);

		// set plumber as a model attribute to pre-populate the form
		model.addAttribute("updateplum", plumber);
		return "updateplumber";
	}

	@GetMapping("/deletePlumber/{id}")
	public String deletePlumber(@PathVariable(value = "id") String id) {

		// call delete plumber method
		this.plumberService.deletePlumber(id);
		return "redirect:/showplumber";
	}
}
