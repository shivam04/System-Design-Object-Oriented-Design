import java.util.Map;

/**
 * Created by shivam.si on 17/03/22 3:34 pm
 */

public class Latte extends Drink{

    public Latte() {
        super(DrinkType.LATTE);
    }

    public Latte(DrinkType drinkName, Recipe recipe, IngredientInventory ingredientInventory) {
        super(drinkName, recipe, ingredientInventory);
    }

    @Override
    public Response process() throws Exception {
        Map<Ingredient, Integer> map = recipe.getIngredients();
        for(Map.Entry<Ingredient, Integer> ingredient: map.entrySet()) {
            if(!ingredientInventory.getIngredient(ingredient.getKey(), ingredient.getValue()))
                throw  new Exception("Ingredient " + ingredient.getKey().getName() + " Not Available!");

        }
        return new Response(new Latte(), recipe.getTotalPrice());
    }
}
