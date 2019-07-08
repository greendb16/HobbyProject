package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){return "Home";}

    @RequestMapping("/AllRecipes")
    public String recipes(){return "Recipes";}

    @RequestMapping("/ApplePieRecipe")
    public String applePie(){return "ApplePie";}

    @RequestMapping("/KeyLimePieRecipe")
    public String keyLime(){return "KeyLimePie";}

    @RequestMapping("/ChocolateChipCookieRecipe")
    public String chocolateChip(){return "ChocolateChip";}

    @RequestMapping("/LasagnaRecipe")
    public String lasagna(){return "Lasagna";}

    @RequestMapping("/LuckyCharmsRecipe")
    public String luckyCharms(){return "LuckyCharms";}
}
