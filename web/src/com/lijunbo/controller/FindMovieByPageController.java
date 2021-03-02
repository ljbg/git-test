package com.lijunbo.controller;

import com.lijunbo.domain.Movies;
import com.lijunbo.service.MovieService;
import com.lijunbo.vo.PageBean;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;

@WebServlet("/findMovieByPage")
public class FindMovieByPageController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       request.setCharacterEncoding("utf-8");
        String currentPage = request.getParameter("currentPage");  //当前页码
        String rows = request.getParameter("rows");                //每页数量
        if(currentPage==null||"".equals(currentPage)){
            currentPage = "1";
        }
        if(rows==null||"".equals(rows)){
            rows = "5";
        }
        Map<String, String[]> condition = request.getParameterMap();   //多条件查询得参数
        MovieService movieService = new MovieService();
        PageBean<Movies>   pb = movieService.findMovieByPage(currentPage, rows, condition);
        System.out.println(pb);
        request.setAttribute("pb",pb);
        request.setAttribute("condition",condition);
        request.getRequestDispatcher("/list.jsp").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
