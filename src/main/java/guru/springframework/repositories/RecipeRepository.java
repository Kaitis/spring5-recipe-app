package guru.springframework.repositories;

import guru.springframework.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by andreaskaitis on 04/09/2017.
 * spring5-recipe-app
 */
public interface RecipeRepository extends JpaRepository<Recipe, Long> {


}
