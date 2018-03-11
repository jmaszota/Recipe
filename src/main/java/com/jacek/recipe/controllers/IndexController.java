package com.jacek.recipe.controllers;

import com.jacek.recipe.repositories.CategoryRepository;
import com.jacek.recipe.repositories.UnitOfMeasureRepository;
import com.jacek.recipe.services.RecipeService;
import  org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(Model model){

        model.addAttribute("recipes", recipeService.getRecipes());

        return "Index";
    }

}
