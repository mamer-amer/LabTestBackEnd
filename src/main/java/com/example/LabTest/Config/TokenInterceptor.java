package com.example.LabTest.Config;


import com.example.LabTest.Commons.TokenContainer;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class TokenInterceptor implements HandlerInterceptor {

    TokenContainer tokenContainer = TokenContainer.getInstance();
    @Override
    public boolean preHandle(
            HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {


            if(request.getMethod().equalsIgnoreCase(HttpMethod.OPTIONS.name())){
                return  true;
            }
            if(request.getHeader("Authorization") != null) {

                tokenContainer.setAuthToken(request.getHeader("Authorization"));


                System.out.println("Pre Handle method is Calling " + TokenContainer.getInstance().getAuthToken());
                return true;
            }
            else{
                return false;
            }

    }


}
