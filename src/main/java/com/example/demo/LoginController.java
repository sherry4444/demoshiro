package com.example.demo;

/**
 * Created by 74788 on 2017/7/8.
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class LoginController {

    @RequestMapping("/login.html")
    public String loginTemplate() {
        return "login";
    }


    @RequestMapping("/index")
    public String indexTemplate() {

        return "index";
    }

}