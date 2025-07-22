package com.pixelacademy.inversioncontrol;

import org.springframework.stereotype.Component;

@Component
public class ItalianChef implements Chef{
    @Override
    public String getDailyRecipe() {
        return "Prepare carbonara with guanciale and parmesan";
    }
}
