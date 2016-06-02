package com.sqlInjection.web;

import com.sqlInjection.domain.UserCreateForm;
import com.sqlInjection.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 * Created by user on 30.05.16.
 */


@Controller
public class IndexController {

    private static final Logger LOGGER = LoggerFactory.getLogger(IndexController.class);


    @Autowired
    private UserService userService;


    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String getUserCreatePage(Model model) {
        LOGGER.debug("Getting user create form");
        model.addAttribute("form", new UserCreateForm());
        return "index";
    }



    @RequestMapping(value = "index", method = RequestMethod.POST)
    public String handleUserCreateForm(Model model) {


            return "index";

    }



}
