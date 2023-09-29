public class BasicPizza implements Pizza{



    @Override
    public String getDescription() {
        return "Pizza dough";
    }

    @Override
    public int price() {
        return 40;
    }
}
