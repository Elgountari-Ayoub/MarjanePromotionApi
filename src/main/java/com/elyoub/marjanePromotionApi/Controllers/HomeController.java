package com.elyoub.marjanePromotionApi.Controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping(value = {"/"})
    public String sayHello() {
        return "Hola, Mundo!";
    }
}
