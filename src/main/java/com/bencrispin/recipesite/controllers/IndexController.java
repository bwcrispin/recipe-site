package com.bencrispin.recipesite.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	@GetMapping("/")
	public String index() {
		return "index";      //returns index.html  <--Remember this brain, please.
	}

}
