import java.util.HashMap;
import java.util.Map;

/**
 * Created by shivam.si on 17/03/22 3:18 pm
 */

public class Recipe {

    private Map<Ingredient, Integer> ingredients;
    private Double totalPrice;

    public Recipe() {
        this.ingredients = new HashMap<>();
        this.totalPrice = 0.0;
    }

    public Map<Ingredient, Integer> getIngredients() {
        return this.ingredients;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void addIngredient(Ingredient ingredient, Integer quantity){
        ingredients.put(ingredient, quantity);
        this.totalPrice += (ingredient.getPrice()*quantity);
    }

    public void removeIngredient(Ingredient ingredient, Integer quantity){
        Integer availableQuantity = ingredients.getOrDefault(ingredient, 0);
        this.totalPrice -= (ingredient.getPrice()*availableQuantity);
        availableQuantity -= quantity;
        if(availableQuantity <= 0) {
            this.ingredients.remove(ingredient);
            return;
        }
        this.totalPrice += (ingredient.getPrice()*availableQuantity);
        ingredients.put(ingredient, availableQuantity);
    }

    public void addCommonIngredients(Map<Ingredient, Integer> commonIngredients) {
        this.ingredients.putAll(commonIngredients);
    }
}
