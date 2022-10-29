package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/")
	public String greeting(){
		return """
							<p> Hello world!</p>
							<img src = https://orangematter.solarwinds.com/wp-content/uploads/2022/03/DevOps-lifecycle-capabilities-1024x621.png>
				""";
	}
}
