package com.tropicalplanet.azuread.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
public class SecurityConfig {
    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests()
        .requestMatchers("/api","/contact","/register").permitAll()  // no authentication needed
        .anyRequest().authenticated() // authentication required
        .and()
        .oauth2Login();
        return http.build();
    }
}


//        .and().csrf().ignoringRequestMatchers("/api")
