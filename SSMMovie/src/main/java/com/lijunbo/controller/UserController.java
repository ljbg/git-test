package com.lijunbo.controller;

import com.lijunbo.domain.User;
import com.lijunbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.context.annotation.SessionScope;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/user")
@SessionAttributes("user")
public class UserController {

    //controller 调 service 层
    @Autowired
    @Qualifier("UserServiceImpl")
    private UserService userService;

    @RequestMapping("/login")
    public String login(Model model, User user){
        HashMap<Object, Object> map = new HashMap<Object, Object>();
        map.put("userName",user.getUserName());
        map.put("userPassword",user.getUserPassword());
        User user1 = userService.isLogin(map);
        if(user1 == null){
            model.addAttribute("error","用户名或者密码错误 ");
            return "login";
        }else {
            model.addAttribute("user",user1);
            return "redirect:/user/allMovies";
        }
    }


}
