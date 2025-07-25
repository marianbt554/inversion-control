package com.pixelacademy.inversioncontrol.rest;

import util.Chef;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Chef myChef;

    @Autowired
    public DemoController (Chef theChef) {
        myChef = theChef;
    }

    @GetMapping("/daily-recipe")
    public String getDailyRecipe() {
        return  myChef.getDailyRecipe();

    }
}
