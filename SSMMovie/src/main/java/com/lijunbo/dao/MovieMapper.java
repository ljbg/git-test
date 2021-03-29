package com.lijunbo.dao;

import com.lijunbo.domain.Movies;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface MovieMapper {

    //找到总的电影数量
    public Integer findTotalCount(Map map);

    //通过Page查找电影集合
    public List<Movies> findByPage(Map map);

    //通过id删除电影     y
    public void deleteById(@Param("movies_id")int id);

    //增加电影        y
    public void addMovie(Map map);

    //通过id查询电影       y
    public Movies findMovieById(@Param("movies_id") int id);

    //修改电影信息
    public void updateMovie(Map map);

}
