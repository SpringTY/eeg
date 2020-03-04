package com.spring.eeg.config;

import com.spring.eeg.Handler.FailureHanderImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable().authorizeRequests().antMatchers("/login", "/failedLogin").permitAll()
                .antMatchers("/admin/**").hasRole("admin")
                .anyRequest().authenticated().and()
                .formLogin().//loginPage("/login").
                failureHandler(new FailureHanderImp()).
                successForwardUrl("/index");
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}