package guru.springframework.services;

import guru.springframework.domain.Recipe;

import java.util.Set;

/**
 * Created by ed.blair on 5/2/2019.
 */
public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long l);
}
