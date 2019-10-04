package com.example.LabTest.Config;


import com.example.LabTest.Commons.TokenContainer;
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

        //System.out.println("Pre Handle method is Calling " + request.getHeader("Authorization"));

        tokenContainer.setAuthToken(request.getHeader("Authorization"));


        System.out.println("Pre Handle method is Calling " + TokenContainer.getInstance().getAuthToken());
        return true;
    }

//    @Override
//    public void postHandle(
//            HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
//
//        System.out.println("Post Handle method is Calling");
//    }
//
//    @Override
//    public void afterCompletion(HttpServletRequest request, HttpServletResponse response,
//                                Object handler, Exception exception) throws Exception {
//        System.out.println("Request and Response are completed");
//
//    }
}
