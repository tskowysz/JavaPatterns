public class Ham extends PizzaDecorator{
    public Ham(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription()+"/ham (200g)";
    }


    public int price() {
        return pizza.price()+20;
    }
}
