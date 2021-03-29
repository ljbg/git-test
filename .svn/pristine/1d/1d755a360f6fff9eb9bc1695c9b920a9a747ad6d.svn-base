package com.lijunbo.controller;

import com.lijunbo.domain.User;
import com.lijunbo.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/login")
public class LoginController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String userName = request.getParameter("username");
        String userPassword = request.getParameter("password");
        UserService userService = new UserService();
        User   user = userService.isLogin(userName, userPassword);
        if(user==null){
         request.setAttribute("error","用户名或者密码错误");
         request.getRequestDispatcher("/login.jsp").forward(request,response);
        }else{
            HttpSession session = request.getSession();
            session.setAttribute("user",user);
          response.sendRedirect(request.getContextPath()+"/index.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
