public class ToamoSouce extends PizzaDecorator{
    public ToamoSouce(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription()+"/tomato souce";
    }


    public int price() {
        return pizza.price()+15;
    }
}
