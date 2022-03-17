/**
 * Created by shivam.si on 17/03/22 3:12 pm
 */

public class Ingredient {
    private String name;
    private Double price;

    public Ingredient(String name) {
        this.name = name;
    }

    public Ingredient(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
