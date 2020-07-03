package com.masivian.roulette.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.masivian.roulette.model.NumberColorBet;

@Controller
@RequestMapping("/principal")
public class GamePlayController {

	@GetMapping("/gameplay")
	public String gamePlayController() {
		return "gameplay";
	}

	@GetMapping("/closeroulette")
	public String cancelGamePlayController() {
		return "principal";
	}
	
	@PostMapping("/numbercolorbet")
	public String numberColorBet(@ModelAttribute(name="numberColorBet") NumberColorBet numberColorBet) {
		return "gameplay";
	}

}
