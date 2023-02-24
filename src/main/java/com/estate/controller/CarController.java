package com.estate.controller;

import com.estate.pojo.Carcharge;
import com.estate.pojo.Owner;
import com.estate.service.CarService;
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
 * @date 2022/12/3 -14:04
 */
@Controller
public class CarController {
    @Autowired
    private CarService carService;

    @RequestMapping("/carPayInfo")
//    查询车辆的实所有缴费信息
    public ModelAndView findAllCarInfo(HttpSession session,
                                       @RequestParam(name = "status",required = false,defaultValue = "2") int status,
                                       @RequestParam(name = "pageNo",required = false,defaultValue = "1") int pageNo,
                                       @RequestParam(name = "pageSize",required = false,defaultValue = "5") int pageSize){
        System.out.println("status = " + status);
        ModelAndView modelAndView = new ModelAndView();
        Owner owner = (Owner) session.getAttribute("user");
//        System.out.println(owner);
        PageHelper.startPage(pageNo,pageSize); //开启分页
        List<Carcharge> carChargeList  = carService.findAllCarInfo(owner.getId(),status);
        modelAndView.addObject("carChargeList",carChargeList);
        modelAndView.setViewName("carPayInfo");
//      存储分页信息
        PageInfo pageInfo = new PageInfo<>(carChargeList);

        session.setAttribute("pageInfo",pageInfo);
        session.setAttribute("pageNo",pageNo);
        session.setAttribute("pageSize",pageSize);
        session.setAttribute("pageTotal",pageInfo.getTotal());
        session.setAttribute("status",status);
        return modelAndView;
    }

    @RequestMapping("/payCarMoney")
    @ResponseBody
    public String payCarMoney(Integer payId){
//        System.out.println("payId:"+payId);
        int i = carService.payCarMoney(payId);
        if(i>0){
            return "SUCCESS";
        }
        return "FALSE";
    }
}
