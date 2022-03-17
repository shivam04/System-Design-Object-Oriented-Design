import java.util.Map;

/**
 * Created by shivam.si on 17/03/22 3:13 pm
 */

public class Americano extends Drink{

    public Americano() {
        super(DrinkType.AMERICANO);
    }

    public Americano(DrinkType drinkName, Recipe recipe, IngredientInventory ingredientInventory) {
        super(DrinkType.AMERICANO, recipe, ingredientInventory);
    }

    @Override
    public Response process() throws Exception{
        Map<Ingredient, Integer> map = recipe.getIngredients();
        for(Map.Entry<Ingredient, Integer> ingredient: map.entrySet()) {
            if(!ingredientInventory.getIngredient(ingredient.getKey(), ingredient.getValue()))
                throw  new Exception("Ingredient " + ingredient.getKey().getName() + " Not Available!");

        }
        return new Response(new Americano(), recipe.getTotalPrice());
    }
}
