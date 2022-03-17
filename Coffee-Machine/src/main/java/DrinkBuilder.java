import java.util.Map;

/**
 * Created by shivam.si on 17/03/22 3:26 pm
 */

public class DrinkBuilder {

    public Response makeDrink(DrinkType drinkName, IngredientInventory ingredientInventory, Recipe recipe) throws Exception {
        Drink drink = switch (drinkName) {
            case AMERICANO -> new Americano(DrinkType.AMERICANO, recipe, ingredientInventory);
            case LATTE -> new Latte(DrinkType.LATTE, recipe, ingredientInventory);
            case ESPRESSO -> new Espresso(DrinkType.ESPRESSO, recipe, ingredientInventory);
            case CAPPUCCINO -> new Cappuccino(DrinkType.CAPPUCCINO, recipe, ingredientInventory);
            default -> null;
        };
        return drink.process();
    }
}
