package com.example.demo;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
public class hello{
	@GetMapping("/")
	public String homepage() {
//		return "Welcome to student list";
		return "Hello world";
	}
}