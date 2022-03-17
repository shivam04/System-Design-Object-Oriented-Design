import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by shivam.si on 17/03/22 3:06 pm
 */

public abstract class Drink {
    private DrinkType drinkName;
    Recipe recipe;
    IngredientInventory ingredientInventory;

    public Drink(DrinkType drinkName) {
        this.drinkName = drinkName;
    }

    public DrinkType getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(DrinkType drinkName) {
        this.drinkName = drinkName;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public IngredientInventory getIngredientInventory() {
        return ingredientInventory;
    }

    public void setIngredientInventory(IngredientInventory ingredientInventory) {
        this.ingredientInventory = ingredientInventory;
    }

    public Drink(DrinkType drinkName, Recipe recipe, IngredientInventory ingredientInventory) {
        this.drinkName = drinkName;
        this.recipe = recipe;
        this.ingredientInventory = ingredientInventory;
    }

    public abstract Response process() throws Exception;
}
