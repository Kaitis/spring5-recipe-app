package guru.springframework.repositories;

import guru.springframework.model.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * Created by andreaskaitis on 04/09/2017.
 * spring5-recipe-app
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);
}
