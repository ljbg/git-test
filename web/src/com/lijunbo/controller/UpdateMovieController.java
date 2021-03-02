package com.lijunbo.controller;

import com.lijunbo.domain.Movies;
import com.lijunbo.domain.Types;
import com.lijunbo.service.MovieService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/updateMovie")
public class UpdateMovieController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       request.setCharacterEncoding("utf-8");
        Movies movie = new Movies();
        String movies_id = request.getParameter("movies_id");
        String movies_name = request.getParameter("movies_name");
        String movies_date = request.getParameter("movies_date");
        String movies_type_id = request.getParameter("movies_type_id");
        movie.setMoviesId(Integer.parseInt(movies_id));
        movie.setMoviesName(movies_name);
        Types types = new Types();
        types.setType_id(Integer.parseInt(movies_type_id));
        movie.setMoviesType(types);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date moviesDate =  sdf.parse(movies_date);
            movie.setMoviesDate(moviesDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        MovieService movieService = new MovieService();
        movieService.updateMovie(movie);
        response.sendRedirect(request.getContextPath()+"/findMovieByPage");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
