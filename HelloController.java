package com.tropicalplanet.azuread.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/user")
    public String user(@AuthenticationPrincipal OAuth2User principal) {
        return principal.getAttribute("preferred_username");
    }
	
	
	@GetMapping("/api")
	public String makeChange() {
		System.out.println("Received a post call. making changes.");
		return "API endpoint called.";
	}
}
