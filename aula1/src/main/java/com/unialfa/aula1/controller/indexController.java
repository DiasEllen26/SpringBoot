package com.unialfa.aula1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {

    @RequestMapping("/")
    public String iniciar(Model model) {
        model.addAttribute("teste", "Minha primeira pagina");
        return "index";
    }
}
