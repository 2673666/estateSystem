package com.estate.controller;

import com.estate.pojo.Owner;
import com.estate.pojo.PropertyInfo;
import com.estate.service.PropertyService;
import com.estate.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author zhiyuan
 * @date 2022/12/4 -15:05
 */
@Controller
public class PropertyController {
    @Autowired PropertyService propertyService;
    @RequestMapping("/propertyInfo")
    public ModelAndView findAllPropertyInfo(HttpSession session,
        @RequestParam(name = "status",required = false,defaultValue = "2") int status,
        @RequestParam(name = "pageNo",required = false,defaultValue = "1") int pageNo,
        @RequestParam(name = "pageSize",required = false,defaultValue = "5") int pageSize){

        ModelAndView modelAndView = new ModelAndView();

        Owner owner = (Owner) session.getAttribute("user");
        System.out.println("owner1:"+owner);
        PageHelper.startPage(pageNo,pageSize); //开启分页
        System.out.println("status:"+status);
        List<PropertyInfo> propertyInfoList = propertyService.findAllPropertyInfo(owner.getId(),status);

        modelAndView.addObject("propertyInfoList",propertyInfoList);
        modelAndView.setViewName("propertyInfo");

        //      存储分页信息
        PageInfo pageInfo = new PageInfo<>(propertyInfoList);

        session.setAttribute("pageInfo",pageInfo);
        session.setAttribute("pageNo",pageNo);
        session.setAttribute("pageSize",pageSize);
        session.setAttribute("pageTotal",pageInfo.getTotal());
        session.setAttribute("status",status);

        return modelAndView;
    }

    @RequestMapping("/payPropertyMoney")
    @ResponseBody
    public String payPropertyMoney(Integer propertyId){
        System.out.println(propertyId);
        int i = propertyService.payPropertyMoney(propertyId);

        if(i>0){
            return "SUCCESS";
        }
        return "FALSE";
    }
}
