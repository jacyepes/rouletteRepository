package com.masivian.roulette.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.masivian.roulette.model.UserCredencial;

@Controller
public class LoginController {


	
	@GetMapping("/")
	public String redirectTologin() {
		return "redirect:/login";
	}
	
	@GetMapping("/login")
	public String showLoginForm(Model model, @RequestParam(name="error", required=false)String error, @RequestParam(name="logout", required=false)String logout) {
		model.addAttribute("error", error);
		model.addAttribute("logout", logout);
		model.addAttribute("userCredencial", new UserCredencial());
		return "login";
	}
	
	@PostMapping("/logincheck")
	public String loginCheck(@ModelAttribute(name="userCredencial") UserCredencial userCredencial) {
		
		if(userCredencial.getUserName().equals("user") && userCredencial.getPassword().equals("user")) {
			return "principal";
		}
			return "redirect:/login?error";
		
	}
	
}
