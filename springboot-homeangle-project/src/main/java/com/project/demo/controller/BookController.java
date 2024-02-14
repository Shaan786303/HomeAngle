package com.project.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.project.demo.entity.BookEntity;
import com.project.demo.service.BookService;

@Controller
public class BookController {
	
	@Autowired
	public BookService bookService;
	
	@GetMapping("/bookingpage")
    public String viewBook(Model model) {
        model.addAttribute("listBooking", bookService.getAllBookings());
        return "booking";
    }

   @GetMapping("/addbooking")
    public String showBookingForm(Model model) {
        // create model attribute to bind form data
	   BookEntity booking = new BookEntity();
        model.addAttribute("savebook", booking);
        return "addbooking";
    }

    @PostMapping("/savebooking")
    public String saveBooking(@ModelAttribute("savebook") BookEntity booking) {
        // save booking to database
    	bookService.saveBook(booking);
        return "redirect:/bookingpage";
    }
    
    @GetMapping("/deleteBooking/{id}")
    public String deleteBooking(@PathVariable(value = "id") String id) {

        // call delete booking method 
        this.bookService.deleteBook(id);
        return "redirect:/bookingpage";
    }

}
