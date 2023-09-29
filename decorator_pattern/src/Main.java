public class Main {
    public static void main(String[] args) {
        Pizza pizza=new Mozzarella(new ToamoSouce(new Ham(new BasicPizza())));
        System.out.println(pizza.getDescription());
        System.out.println("Cost of this pizza: "+pizza.price());
    }
}