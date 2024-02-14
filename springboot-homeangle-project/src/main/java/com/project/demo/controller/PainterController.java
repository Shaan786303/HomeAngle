package com.project.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.project.demo.entity.PainterEntity;
import com.project.demo.service.PainterService;

@Controller
public class PainterController 
{

	@Autowired
	private PainterService painterService;
	
	 @GetMapping("/showpainter")
	    public String viewPainter(Model model) {
	        model.addAttribute("listPainter", painterService.getAllPainter());
	        return "painter";
	    }
	
	   @GetMapping("/addpainter")
	    public String showPainterForm(Model model) {
	        // create model attribute to bind form data
		   PainterEntity painter = new PainterEntity();
	        model.addAttribute("savepain", painter);
	        return "addpainter";
	    }

	    @PostMapping("/savepainter")
	    public String savePainter(@ModelAttribute("savepain") PainterEntity painter) {
	        // save painter to database
	    	painterService.savePainter(painter);
	        return "redirect:/showpainter";
	    }
	    
	    @GetMapping("/showPainUpdateForm/{id}")
	    public String showFormForUpdate(@PathVariable(value = "id") String id, Model model) {

	        // get painter from the service
	    	PainterEntity painter = painterService.updatePainter(id);

	        // set painter as a model attribute to pre-populate the form
	        model.addAttribute("updatepain", painter);
	        return "updatepainter";
	    }

	    @GetMapping("/deletePainter/{id}")
	    public String deletePainter(@PathVariable(value = "id") String id) {

	        // call delete painter method 
	        this.painterService.deletePainter(id);
	        return "redirect:/showpainter";
	    }
}
