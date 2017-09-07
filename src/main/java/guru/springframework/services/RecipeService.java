package guru.springframework.services;

import guru.springframework.model.Recipe;

import java.util.Set;

/**
 * Created by andreaskaitis on 04/09/2017.
 * spring5-recipe-app
 */
public interface RecipeService {

    Set<Recipe> getRecipes();
}
