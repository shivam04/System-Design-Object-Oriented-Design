import java.util.HashMap;
import java.util.Map;

/**
 * Created by shivam.si on 17/03/22 3:28 pm
 */

public class IngredientInventory {
    Map<Ingredient, Integer> ingredientInventoryMap = new HashMap<>();

    public void addIngredient(Ingredient ingredient, Integer quantity) {
        ingredientInventoryMap.put(ingredient, quantity);
    }

    public boolean getIngredient(Ingredient ingredient, Integer requiredQuantity) {
        Integer availableQuantity = ingredientInventoryMap.getOrDefault(ingredient, 0);
        if(availableQuantity < requiredQuantity) {
            return false;
        }
        availableQuantity -= requiredQuantity;
        ingredientInventoryMap.put(ingredient, availableQuantity);
        if(availableQuantity < 5) {
            sendAlert(ingredient);
        }
        return true;
    }

    private void sendAlert(Ingredient ingredient) {
        System.out.println("Ingredient " + ingredient.getName() + " Has Low Quantity! " + this.ingredientInventoryMap.getOrDefault(ingredient, 0));
    }
}
