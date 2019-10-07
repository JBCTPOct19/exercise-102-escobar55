package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeController {
    @RequestMapping("/")
    public String homePage(Model model){
        model.addAttribute("myvar1", "Say hello!");
        model.addAttribute("myvar", "Say welcome!");
        return "hometemplate";
    }
}
