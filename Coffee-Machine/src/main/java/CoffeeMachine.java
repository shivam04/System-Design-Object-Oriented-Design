import java.util.HashMap;

/**
 * Created by shivam.si on 17/03/22 3:53 pm
 */

public class CoffeeMachine {
    public static void main(String[] args) throws Exception {
        Ingredient ingredient1 = new Ingredient("ingredient1", 10.0);
        Ingredient ingredient2 = new Ingredient("ingredient2", 30.0);
        Ingredient ingredient3 = new Ingredient("ingredient3", 5.0);
        Ingredient ingredient4 = new Ingredient("ingredient4", 40.0);
        Ingredient commonIngredient1 = new Ingredient("commonIngredient1");
        Ingredient commonIngredient2 = new Ingredient("commonIngredient2");


        IngredientInventory ingredientInventory = new IngredientInventory();
        ingredientInventory.addIngredient(ingredient1, 10);
        ingredientInventory.addIngredient(ingredient2, 5);
        ingredientInventory.addIngredient(ingredient3, 8);
        ingredientInventory.addIngredient(ingredient4, 4);
        ingredientInventory.addIngredient(commonIngredient1, 4);
        ingredientInventory.addIngredient(commonIngredient2, 4);

        Recipe recipe = new Recipe();
        recipe.addIngredient(ingredient1, 1);
        recipe.addIngredient(ingredient2, 2);
        recipe.addCommonIngredients(new HashMap<>() {
            {
                put(commonIngredient1, 2);
                put(commonIngredient2, 4);
            }
        });

        while (true) {
            DrinkBuilder builder = new DrinkBuilder();
            Response response = builder.makeDrink(DrinkType.AMERICANO, ingredientInventory, recipe);
            System.out.println("Drink: " + response.getDrink().getDrinkName() + " Price: " + response.getPrice());
        }
    }
}
