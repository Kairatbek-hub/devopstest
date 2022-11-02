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
							<img src = https://natureconservancy-h.assetsadobe.com/is/image/content/dam/tnc/nature/en/photos/WOPA160517_D056-resized.jpg?crop=864%2C0%2C1728%2C2304&wid=600&hei=800&scl=2.88>
				   			<p>%s ->(from code) hello</p>
				                <p>%s ->(from code) database</p>
				                <p>%s ->(from code) awsaccesskey</p>
				                <p>%s ->(from code) awssecretkey</p>
				                """, hello, database, awsaccesskey, awssecretkey);
	}
}
