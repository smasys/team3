/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.smasys.config;

import java.io.IOException;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.web.util.WebUtils;

/**
 *
 * @author student
 */
//public class CrfHeaderFilter extends OncePerRequestFilter {
//
////    @Override
////    protected void doFilterInternal(HttpServletRequest hsr, HttpServletResponse hsr1, FilterChain fc) throws ServletException, IOException {
////        
////        CsrfToken csrf = (CsrfToken) hsr.getAttribute(CsrfToken.class
////        .getName());
////    if (csrf != null) {
////      Cookie cookie = WebUtils.getCookie(hsr, "XSRF-TOKEN");
////      String token = csrf.getToken();
////      if (cookie==null || token!=null && !token.equals(cookie.getValue())) {
////        cookie = new Cookie("XSRF-TOKEN", token);
////        cookie.setPath("/");
////        hsr1.addCookie(cookie);
////      }
////    }
////    fc.doFilter(hsr, hsr1);
////    }
// 
//
//}