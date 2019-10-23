package Tchat.controller;
import Tchat.mapper.UserMapper;
import Tchat.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.UUID;


@Controller
public class HelloController {


    @Autowired
  UserService userService;
    @RequestMapping(value = "/hello")
    public ModelAndView helloSpringBoot() {
        ModelAndView mav=new ModelAndView("login");
        boolean isExist1= userService.queryUserNameIsExist("123");
        System.out.println(isExist1);
        System.out.println("进入欢迎页面");
        return mav;
    }
}
