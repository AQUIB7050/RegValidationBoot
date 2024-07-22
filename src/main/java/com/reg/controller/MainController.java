package com.reg.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.reg.entities.User;

import jakarta.validation.Valid;

@Controller
public class MainController {

	@GetMapping("/form")
	public String formHandler(Model m) {
		m.addAttribute("user", new User());
		return "form";
	}

	@PostMapping("/process")
	public String processHandler(@Valid @ModelAttribute User user, BindingResult result) {

		if (result.hasErrors()) {
			return "form";
		}
		return "success";
	}

}
