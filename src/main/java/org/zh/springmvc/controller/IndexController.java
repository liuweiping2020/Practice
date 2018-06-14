package org.zh.springmvc.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.zh.springmvc.service.UserService;


/**
 * Created by zenghang on 2018/4/4.
 */
@RestController
public class IndexController {
    private final static Logger logger = Logger.getLogger (IndexController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("home")
    public String home() {
        logger.info("this.info-log");
        logger.error("this.error-log");
        logger.debug("this.debug-log");
        logger.trace("this.trace-log");
        return "home";
    }

    @RequestMapping("user")
    public ModelAndView user() {
        return new ModelAndView("home").addObject("user", userService.findAll());
    }
}
