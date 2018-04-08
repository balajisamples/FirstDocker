package com.balu.docker.FirstDocker;

import java.util.Collections;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FirstDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstDockerApplication.class, args);
	}
	
	@GetMapping(value="/first",produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Map<String,String> showWorking() {
		
		return Collections.singletonMap("response","Spring Docker working");
	}
}
