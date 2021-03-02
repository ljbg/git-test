package com.lijunbo.controller;

import com.lijunbo.service.MovieService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delMovie")
public class DeleteMovieController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String  moviesId = request.getParameter("mid");
        MovieService movieService = new MovieService();
        movieService.deleteById(moviesId);
        response.sendRedirect(request.getContextPath()+"/findMovieByPage");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
