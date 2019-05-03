package guru.springframework.repositories;

import guru.springframework.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by ed.blair on 5/1/2019.
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
