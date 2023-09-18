package willydekeyser.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@Value("${spring.boot.tutorial.variable01}")
	String variable01;
	
	@Value("${spring.boot.tutorial.variable02}")
	String variable02;
	
	@GetMapping("/")
	public String home() {
		return "Spring Boot Tutorial Variables: " + variable01  + " - " + variable02;
	}
}
