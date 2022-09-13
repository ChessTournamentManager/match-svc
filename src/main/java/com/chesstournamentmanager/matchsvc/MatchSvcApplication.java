package com.chesstournamentmanager.matchsvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MatchSvcApplication {

	@GetMapping("/message")
	public String getMessage() {
		return "Welcome to the match service.";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(MatchSvcApplication.class, args);
	}

}
