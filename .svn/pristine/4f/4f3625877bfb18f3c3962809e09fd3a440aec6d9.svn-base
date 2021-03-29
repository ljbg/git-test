package com.lijunbo.controller;

import com.lijunbo.service.MovieService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delSelectedMovies")
public class DeleteSelectedController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String[] moviesIds = request.getParameterValues("mid");
        MovieService movieService = new MovieService();
        movieService.deleteBySelected(moviesIds);
        response.sendRedirect(request.getContextPath()+"/findMovieByPage");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
