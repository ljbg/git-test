package com.lijunbo.dao;

import com.lijunbo.domain.Movies;
import com.lijunbo.domain.Types;
import com.lijunbo.util.ConnUtil;
import javafx.scene.input.DataFormat;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MoviesDao {
    public int findTotalCount(Map<String, String[]> condition) throws SQLException {
        int count = 0;
        String sql = "select count(*) from movies  where 1 = 1 ";   //定义模板sql
        StringBuilder sb = new StringBuilder(sql);
        Set<String> keySet = condition.keySet();   //多条件 参数名集合
        ArrayList<Object> params = new ArrayList<Object>();
        for (String key : keySet) {
            if("currentPage".equals(key)||"rows".equals(key)){
                continue;
            }
            String value = condition.get(key)[0];
            if(value!=null&&!"".equals(value)){
                sb.append(" and "+key+" like ?");
                params.add("%"+value+"%");
            }
        }
        sql = sb.toString();
        Connection conn = ConnUtil.getConn();
        PreparedStatement ps = conn.prepareStatement(sql);
        Object[] arr =  params.toArray();
        for (int i = 0; i < arr.length; i++) {
            ps.setString(i+1,(String) arr[i]);
        }
        ResultSet rs = ps.executeQuery();
        if (rs.next()){
             count = rs.getInt(1);
            System.out.println(count);
        }

        return count;

    }


    public List<Movies> findByPage(int start, int rows, Map<String, String[]> condition) throws SQLException {
        List<Movies> moviesList = new ArrayList<Movies>();
        String sql = "select * from movies LEFT JOIN movies_type ON movies_type_id = type_id  where 1 = 1 ";
        StringBuilder sb = new StringBuilder(sql);
        //2.遍历map
        Set<String> keySet = condition.keySet();
        //定义参数的集合
        List<Object> params = new ArrayList<Object>();
        for (String key : keySet) {
            //排除分页条件参数
            if("currentPage".equals(key) || "rows".equals(key)){
                continue;
            }
            //获取value
            String value = condition.get(key)[0];
            //判断value是否有值
            if(value != null && !"".equals(value)){
                //有值
                sb.append(" and "+key+" like ? ");
                params.add("%"+value+"%");//？条件的值
            }
        }
        //添加分页查询
        sb.append(" limit ?,? ");
        //添加分页查询参数值
        params.add(start);
        params.add(rows);
        sql = sb.toString();
        Connection conn = ConnUtil.getConn();
        PreparedStatement ps = conn.prepareStatement(sql);
        Object[] arr =  params.toArray();
        for (int i = 0; i < arr.length; i++) {
            if(i>=arr.length-2){
                ps.setInt(i+1, (Integer) arr[i]);
            }else {
                ps.setString(i+1,(String)arr[i]);
            }
        }
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            Movies movies = new Movies();
            Types types = new Types();
            movies.setMoviesId(rs.getInt(1));
            movies.setMoviesName(rs.getString(2));
            movies.setMoviesDate(rs.getDate(3));
            movies.setMoviesImg(rs.getString(4));
            types.setType_id(rs.getInt(6));
            types.setType_name(rs.getString(7));
            movies.setMoviesType(types);
            moviesList.add(movies);
        }
       return moviesList;
    }

    public void deleteById(int movies_id) throws SQLException {
        String sql = "delete from movies where movies_id = ?";
        Connection conn = ConnUtil.getConn();
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1,movies_id);
        ps.execute();
    }

    public void addMovie(Movies movie) throws SQLException {
        String sql = "insert into Movies (movies_name,movies_date,movies_img,movies_type_id)values(?,?,?,?)";
        Connection conn = ConnUtil.getConn();
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1,movie.getMoviesName());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        ps.setString(2,  sdf.format(movie.getMoviesDate()));
        ps.setString(3,movie.getMoviesImg());
        ps.setInt(4,movie.getMoviesType().getType_id());
        ps.execute();
    }

    public Movies findMovieById(int movie_id) throws SQLException {
        String sql = "select * from movies where movies_id = ?";
        Connection conn = ConnUtil.getConn();
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1,movie_id);
        ResultSet rs = ps.executeQuery();
        Movies movies = new Movies();
        Types types = new Types();
        if(rs.next()){
            movies.setMoviesId(rs.getInt(1));
            movies.setMoviesName(rs.getString(2));
            movies.setMoviesDate(rs.getDate(3));
            movies.setMoviesImg(rs.getString(4));
            types.setType_id(rs.getInt(5));
            movies.setMoviesType(types);
        }
        return movies;
    }

    public void updateMovie(Movies movie) throws SQLException {
        String sql = "update  movies set"+" movies_name=?,movies_date= ? ,movies_type_id= ? "+"where movies_id = ?";
        Connection conn = ConnUtil.getConn();
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1,movie.getMoviesName());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        ps.setString(2,sdf.format(movie.getMoviesDate()));

        ps.setInt(3,movie.getMoviesType().getType_id());
        ps.setInt(4,movie.getMoviesId());
        ps.executeUpdate();
    }


}
