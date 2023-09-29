public class PizzaDecorator implements Pizza{

    Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription();
    }

    @Override
    public int price() {
        return pizza.price();
    }
}
