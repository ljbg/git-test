package com.lijunbo.service;

import com.lijunbo.dao.MoviesDao;
import com.lijunbo.dao.UserDao;
import com.lijunbo.domain.Movies;
import com.lijunbo.util.ConnUtil;
import com.lijunbo.vo.PageBean;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class MovieService {

    private MoviesDao moviesDao = new MoviesDao();

    public PageBean<Movies> findMovieByPage(String _currentPage, String _rows, Map<String, String[]> condition)  {

        int currentPage = Integer.parseInt(_currentPage);
        int rows = Integer.parseInt(_rows);
        PageBean<Movies> pb = new PageBean<Movies>();
        pb.setCurrentPage(currentPage);
        pb.setRows(rows);
        int totalCount = 0;
        try {
            totalCount = moviesDao.findTotalCount(condition);
            pb.setTotalCount(totalCount);
            //4.调用dao查询List集合
            //计算开始的记录索引
            int start = (currentPage - 1) * rows;
            List<Movies> list = moviesDao.findByPage(start, rows, condition);
            pb.setList(list);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            ConnUtil.closeConn();
        }

        //5.计算总页码
        int totalPage = (totalCount % rows) == 0 ? totalCount / rows : (totalCount / rows) + 1;
        pb.setTotalPage(totalPage);
        return pb;
    }

    public void deleteById(String moviesId)  {
        int movies_id = Integer.parseInt(moviesId);
        try {
            moviesDao.deleteById(movies_id);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            ConnUtil.closeConn();
        }
    }

    public void deleteBySelected(String[] moviesIds)  {
        try {
            ConnUtil.getConn().setAutoCommit(false);
            for (String movies_id : moviesIds) {
                moviesDao.deleteById(Integer.parseInt(movies_id));
            }
            ConnUtil.getConn().commit();
        } catch (SQLException e) {
            e.printStackTrace();
            try {
                ConnUtil.getConn().rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            throw new RuntimeException(e);
        } finally {
            ConnUtil.closeConn();
        }
    }


    public void addMovies(Movies movie)  {
        try {
            moviesDao.addMovie(movie);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }finally {
            ConnUtil.closeConn();
        }
    }

    public Movies findMovieById(String movie_id){
        try {
         return    moviesDao.findMovieById(Integer.parseInt(movie_id));
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }finally {
            ConnUtil.closeConn();
        }
    }

    public  void updateMovie(Movies movie){
        try {
            moviesDao.updateMovie(movie);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }finally {
            ConnUtil.closeConn();
        }
    }



}


