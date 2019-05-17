package guru.springframework.services;

import guru.springframework.commands.IngredientCommand;

/**
 * Created by ed.blair on 5/17/2019.
 */
public interface IngredientService {

    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);

    IngredientCommand saveIngredientCommand(IngredientCommand command);
}
