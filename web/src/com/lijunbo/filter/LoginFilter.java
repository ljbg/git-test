package com.lijunbo.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(urlPatterns = {"/index.jsp","/list.jsp"})
public class LoginFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("LoginFilter.执行中*^&%^$#@#$%^&%$");
        // 设置过滤条件。登录。会话中有没有用户对象
        HttpServletRequest httpRequest = (HttpServletRequest) req;
        HttpServletResponse httpResponse = (HttpServletResponse)resp;
        HttpSession session = httpRequest.getSession();
        if (session.getAttribute("user") == null) {
            //没登录，重定向到登录页
            httpResponse.sendRedirect(httpRequest.getContextPath()+"/login.jsp");
        } else {
            //登录，放行
            chain.doFilter(req, resp);// 放行
        }
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
