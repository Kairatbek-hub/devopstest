package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class DemoApplication {

	@Value("${hello}")
	String hello;

	@Value("${database}")
	String database;

	@Value("${awsaccesskey}")
	String awsaccesskey;

	@Value("${awssecretkey}")
	String awssecretkey;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/")
	public String greeting(){
		return String.format("""
							<p> Hello world!</p>
							<p>Hii</p>
							<img src = https://orangematter.solarwinds.com/wp-content/uploads/2022/03/DevOps-lifecycle-capabilities-1024x621.png>
				    			<p>%s ->(from code) hello</p>
				                <p>%s ->(from code) database</p>
				                <p>%s ->(from code) awsaccesskey</p>
				                <p>%s ->(from code) awssecretkey</p>
				                """, hello, database, awsaccesskey, awssecretkey);
	}
}
