package com.taotao.sso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/8/8 0008.
 */
@Controller
@RequestMapping("/page")
public class PageController {

    @RequestMapping("/register")
    public String showRegister() {
        return "register";
    }
    @RequestMapping("/login")
    public String showLogin(String redirect, Model model) {
        model.addAttribute("redirect", redirect);
        return "login";
    }
}
