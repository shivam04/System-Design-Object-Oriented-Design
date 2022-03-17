/**
 * Created by shivam.si on 17/03/22 4:15 pm
 */

public class Response {
    private Drink drink;
    private Double price;

    public Response(Drink drink, Double price) {
        this.drink = drink;
        this.price = price;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
