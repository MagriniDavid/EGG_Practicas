package com.libreria.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PortalControlador {
    @GetMapping("/index2")
    public String index2(){
        return "index2.html";
    }
}
