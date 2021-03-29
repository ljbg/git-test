import com.lijunbo.dao.MovieMapper;
import com.lijunbo.dao.TypeMapper;
import com.lijunbo.dao.UserMapper;
import com.lijunbo.domain.Movies;
import com.lijunbo.domain.Types;
import com.lijunbo.domain.User;
import com.lijunbo.service.TypeService;
import com.lijunbo.service.TypeServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.List;

public class Test {


    @org.junit.Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        TypeMapper typeMapper = context.getBean("typeMapper", TypeMapper.class);
        List<Types> types = typeMapper.selectAll();
        for (Types type : types) {
            System.out.println(type);
        }
    }

    @org.junit.Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
        HashMap<Object, Object> map = new HashMap<Object, Object>();
        map.put("userName","a");
        map.put("userPassword","b");
        User user = userMapper.selectByNameAndPassword(map);
        System.out.println(user);
    }

    @org.junit.Test
    public void test3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
        HashMap<Object, Object> map = new HashMap<Object, Object>();
        map.put("userName","a");
        User user = userMapper.selectByName(map);
        System.out.println(user);
    }

    @org.junit.Test
    public void test4(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
        HashMap<Object, Object> map = new HashMap<Object, Object>();
        map.put("userName","a");
        map.put("userPassword","b");
        map.put("userPhone","1314");
        userMapper.insertUser(map);
    }

    //通过id查询电影
    @org.junit.Test
    public void test5(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MovieMapper movieMapper = context.getBean("movieMapper", MovieMapper.class);
        int id = 1;
        Movies movie = movieMapper.findMovieById(id);
        System.out.println(movie);
    }

    //增加电影
    @org.junit.Test
    public void test6(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MovieMapper movieMapper = context.getBean("movieMapper", MovieMapper.class);
        HashMap<Object, Object> map = new HashMap<Object, Object>();
        map.put("movies_name","a");
        map.put("movies_date","2010-01-11");
        map.put("movies_img","c.jpg");
        map.put("movies_type_id",3);
        movieMapper.addMovie(map);
    }

    //通过id删除电影
    @org.junit.Test
    public void test7(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MovieMapper movieMapper = context.getBean("movieMapper", MovieMapper.class);
        int id = 47;
        movieMapper.deleteById(id);
    }

    //修改电影信息
    @org.junit.Test
    public void test8(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MovieMapper movieMapper = context.getBean("movieMapper", MovieMapper.class);
        HashMap<Object, Object> map = new HashMap<Object, Object>();
        map.put("movies_id",48);
        map.put("movies_name","a");
        map.put("movies_date","2010-01-11");
        map.put("movies_img","c.jpg");
        map.put("movies_type_id",4);
        movieMapper.updateMovie(map);
    }

    //找到总的电影数量
    @org.junit.Test
    public void test9(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MovieMapper movieMapper = context.getBean("movieMapper", MovieMapper.class);
        HashMap<Object, Object> map = new HashMap<Object, Object>();
        map.put("movies_name","%a%");
        map.put("movies_date",null);
        map.put("movies_type_id",null);
        Integer count = movieMapper.findTotalCount(map);
        System.out.println(count);
    }


    //通过Page查找电影集合
    @org.junit.Test
    public void test10(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MovieMapper movieMapper = context.getBean("movieMapper", MovieMapper.class);
        HashMap<Object, Object> map = new HashMap<Object, Object>();
        map.put("movies_name",null);
        map.put("movies_date",null);
        map.put("movies_type_id",null);
        map.put("start",5);
        map.put("pageSize",5);
        List<Movies> movies = movieMapper.findByPage(map);
        for (Movies movie : movies) {
            System.out.println(movie);
        }

    }





}
