package com.lijunbo.controller;

import com.lijunbo.domain.Movies;
import com.lijunbo.service.MovieService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/toUpdateMovie")
public class ToUpdateMovieController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String movie_id = request.getParameter("mid");
        MovieService movieService = new MovieService();
        Movies movie = movieService.findMovieById(movie_id);
        request.setAttribute("movie",movie);
        request.getRequestDispatcher("/update.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
