package com.stackroute;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {

    @Autowired
    User user;

    @PostMapping("/add")
    public ModelAndView add(HttpServletRequest req){

        ModelAndView mv = new ModelAndView("display");

        String strUname =req.getParameter("username");
        user.setUserName(strUname);
        mv.addObject("uname",strUname);

        String strPass = req.getParameter("password");
        user.setPassword(strPass);
        mv.addObject("passwd",strPass);
        return mv;
    }
}
