package com.blocker.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import com.blocker.dto.KakaoOAuth2User;
import com.blocker.dto.NaverOAuth2User;


@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    // Swagger 관련 문서는 모두가 볼 수 있도록 설정하기 위해 WebSecurity ignore 설정 진행
   @Override 	
	public void configure(WebSecurity web) throws Exception {
	   web.ignoring().antMatchers("/v2/api-docs", "/swagger-resources/**", "/swagger-ui.html", "/webjars/**", "/swagger/**", "/webSocket/**");
	}
   @Override
   protected void configure(HttpSecurity http) throws Exception {
       // disables cors and csrf
       http
               .cors().and()
               .csrf()
               .disable();

       // authenticate
       http.authorizeRequests()
       		   .antMatchers("/wallet/**").permitAll()
               .antMatchers("/oauth2/**").permitAll()
               .antMatchers("/login/**").permitAll()
               .anyRequest().authenticated()
               .and()
               .oauth2Login()
               .userInfoEndpoint()
               .customUserType(KakaoOAuth2User.class, "kakao")
               .customUserType(NaverOAuth2User.class, "naver");

   }
}
