public class Mozzarella extends PizzaDecorator{
    public Mozzarella(Pizza pizza) {
        super(pizza);

    }

    public String getDescription() {
        return pizza.getDescription()+"/mozzarella";
    }


    public int price() {
        return pizza.price()+34;
    }

}
