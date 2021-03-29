package com.lijunbo.service;


import com.lijunbo.domain.Movies;
import com.lijunbo.domain.PageBean;

import java.util.Map;

public interface MovieService {

    //通过page查找电影集合  PageBean<Movies>
    public PageBean<Movies> findMovieByPage(Map map);

    //通过id 删除电影
    public void deleteById(String id);

    //通过多选框删除电影
    public void deleteBySelected(Map map);

    //添加电影
    public void addMovies(Map map);

    //通过id 查找电影
    public Movies findMovieById(String id);

    //修改电影信息
    public void updateMovie(Map map);

}
