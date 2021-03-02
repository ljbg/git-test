package com.lijunbo.controller;

import com.lijunbo.domain.Movies;
import com.lijunbo.domain.Types;
import com.lijunbo.service.MovieService;
import com.lijunbo.util.FileUpUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/addMovie")
@MultipartConfig
public class AddMovieController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         request.setCharacterEncoding("utf-8");
        String moviesName = request.getParameter("movies_name");
        String movies_date = request.getParameter("movies_date");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //文件上传处理
        //获取上传文件的相关信息
        Part moviesImgPart = request.getPart("movies_img");
        String fileName = moviesImgPart.getSubmittedFileName();
        String newMoviesImg = FileUpUtil.getNewFileName()+FileUpUtil.getFileType(fileName);
        //获得上传的物理路径。将URL转换成真实物理路径
        String path = request.getServletContext().getRealPath("/img");
        System.out.println(path);
        //文件上传
        moviesImgPart.write(path+"/"+newMoviesImg);
        String moviesTypeId = request.getParameter("movies_type_id");
        int type_id = Integer.parseInt(moviesTypeId);
        Movies movie = new Movies();
        Types types = new Types();
        types.setType_id(type_id);
        movie.setMoviesType(types);
        try {
           Date moviesDate =  sdf.parse(movies_date);
            movie.setMoviesDate(moviesDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        movie.setMoviesImg(newMoviesImg);
        movie.setMoviesName(moviesName);
        MovieService movieService = new MovieService();
       movieService.addMovies(movie);
       response.sendRedirect(request.getContextPath()+"/findMovieByPage");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
