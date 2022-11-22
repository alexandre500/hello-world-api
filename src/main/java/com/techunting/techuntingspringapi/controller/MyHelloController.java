package com.techunting.techuntingspringapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyHelloController {

	@GetMapping("/hello")
	public String myHello() {
		return "Hello, my friend!";
	}
}
