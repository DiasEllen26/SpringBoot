package com.unialfa.aula1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping("/")
    public String iniciar(Model model) {
        System.out.println("teste");
        model.addAttribute("teste","Hello World!");
        return"index";
    }

}
