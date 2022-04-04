package com.tnc.userManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@SpringBootApplication
public class UserManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserManagementApplication.class, args);
    }

//    @Configuration
//    public static class OktaAuth2Adapter extends WebSecurityConfigurerAdapter {
//        @Override
//        protected void configure(HttpSecurity http) throws Exception {
//            http
//                    .and()
//                    .authorizeRequests()
//                    .antMatcher("user/hello")
//                    .permitAll()
//                    .anyRequest()
//                    .authenticated()
//                    .and()
//                    .oauth2Login();
//        }
//    }
}

