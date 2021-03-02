package com.lijunbo.controller;

import com.lijunbo.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/register")
public class RegisterController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String userName = request.getParameter("username");
        String userPassword = request.getParameter("userpwd");
        String userPhone = request.getParameter("userPhone");
        UserService userService = new UserService();
        boolean   isRegister = userService.isRegister(userName, userPassword,userPhone);
        if(isRegister){
            response.sendRedirect(request.getContextPath()+"/login.jsp");
        }else{
            request.setAttribute("error","用户名已经存在");
            request.getRequestDispatcher("/register.jsp").forward(request,response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
