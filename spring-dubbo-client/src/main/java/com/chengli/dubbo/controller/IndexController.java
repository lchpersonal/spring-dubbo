package com.chengli.dubbo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.chengli.dubbo.service.IUserService;
import com.chengli.dubbo.service.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author: chengli
 * @Date: 2018/8/16 18:16
 */
@Controller
public class IndexController {

    @Reference(url = "dubbo://localhost:20880", interfaceClass = IUserService.class, check = true)
    private IUserService userService;

    @RequestMapping("/")
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("success");
        User user = userService.selectUser(1);
        System.out.println("user : " + user);
        mv.addObject("user", user);
        return mv;
    }
}
