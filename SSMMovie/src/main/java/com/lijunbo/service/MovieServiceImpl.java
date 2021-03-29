package com.lijunbo.service;

import com.lijunbo.dao.MovieMapper;
import com.lijunbo.domain.Movies;
import com.lijunbo.domain.PageBean;

import java.util.List;
import java.util.Map;

public class MovieServiceImpl implements MovieService {

     //service 层调用 dao 层
    private MovieMapper movieMapper;

    public void setMovieMapper(MovieMapper movieMapper) {
        this.movieMapper = movieMapper;
    }

    public PageBean<Movies> findMovieByPage(Map map) {

        Integer currentPage = (Integer) map.get("currentPage");
        Integer rows = (Integer) map.get("rows");
        PageBean<Movies> pb = new PageBean<Movies>();
        pb.setCurrentPage(currentPage);
        pb.setRows(rows);
        Integer totalCount = movieMapper.findTotalCount(map);
        pb.setTotalCount(totalCount);
        //计算总页码
        Integer totalPage = (totalCount % rows) == 0 ? totalCount / rows : (totalCount / rows) + 1;
        pb.setTotalPage(totalPage);
        //调用dao查询List集合
        //计算开始的记录索引
       Integer start = (currentPage - 1) * rows;
       map.put("start",start);
        List<Movies> list = movieMapper.findByPage(map);
        pb.setList(list);
        return pb;
    }

    public void deleteById(String id) {
         movieMapper.deleteById(Integer.parseInt(id));
    }

    public void deleteBySelected(Map map) {
      String[] moviesIds = (String[]) map.get("moviesIds");
        for (String moviesId : moviesIds) {
            movieMapper.deleteById(Integer.parseInt(moviesId));
        }
    }

    public void addMovies(Map map) {
        movieMapper.addMovie(map);
    }

    public Movies findMovieById(String id) {
        return movieMapper.findMovieById(Integer.parseInt(id));
    }

    public void updateMovie(Map map) {
        movieMapper.updateMovie(map);
    }
}
