package com.tnc.userManagement.service.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
//@EnableWebSecurity
public class OktaAuth2Adapter extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
//                .csrf().disable()
                .authorizeRequests()
                .antMatchers("user/hello")
                .permitAll()
                .anyRequest()
                .authenticated()
                .and()
                .oauth2ResourceServer();
//                .jwt();
//                .oauth2Login()
//        http.cors();
    }
}
