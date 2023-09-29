package strategy;

public class WalkStrategy implements CommunicationStrategy{
    @Override
    public String goToWork() {
        return "walk";
    }
}
