package com.spring.eeg.Handler;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spring.eeg.Model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@Slf4j
@Component
public class SuccessHandler implements AuthenticationSuccessHandler {
    @Autowired
    private ObjectMapper mapper;


    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        System.out.println(user.getUserrole());
        if(user.getUserrole().equals("ROLE_user")){
            log.info("user:"+user);
            httpServletResponse.sendRedirect("/index");
        }else{
            log.info("admin:"+user);
            httpServletResponse.sendRedirect("/admin/index");
        }

    }
}
