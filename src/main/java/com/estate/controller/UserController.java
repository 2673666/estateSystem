package com.estate.controller;

import com.estate.pojo.Owner;
import com.estate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * @author zhiyuan
 * @date 2022/11/26 -14:48
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("{url}.html")
    public String getIndexUrl(String url) {
        return url;
    }

    @RequestMapping("doLogin")
    @ResponseBody  // 返回 json 数据
    public String doLogin(HttpSession httpSession, String userName, String password){
//        System.out.println(userName);
//        System.out.println(password);
        Owner user = userService.doLogin(userName, password);
        if(user!=null){ // 登录成功
           httpSession.setAttribute("user",user);
           return "SUCCESS";
        }else{
//            model.addAttribute("errorMsg","用户名或密码输入错误！！");
            return "FAIL";
        }
    }

    @RequestMapping("loginOut")
    public String loginOut(HttpSession session){
        session.invalidate();  //清空 session中的信息
        return "redirect:/login.html";
    }

    @RequestMapping("/updateUserMessage")
    @ResponseBody  // 返回 json 数据
    public String updateUserMessage(Owner owner){
        System.out.println("修改用户信息"+owner);
        int i = userService.updateUserMessage(owner);
        if(i>0){
            return "SUCCESS";
        }
        else {

            return "FAIL";
        }
    }

//    @GetMapping("/findUserById")
//    public String findUserById(HttpSession session){
//        Owner owner = (Owner) session.getAttribute("user");
//        userService.findUserById(owner.getId());
//        return "userInfo";
//    }

}

    
