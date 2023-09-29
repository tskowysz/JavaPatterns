import strategy.CommunicationStrategy;
import strategy.CompetitionStrategy;

public class Employee {

    CommunicationStrategy communicationStrategy;
    CompetitionStrategy competitionStrategy;

    String name;
    int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public CompetitionStrategy getCompetitionStrategy() {
        return competitionStrategy;
    }

    public void setCompetitionStrategy(CompetitionStrategy competitionStrategy) {
        this.competitionStrategy = competitionStrategy;
    }

    public CommunicationStrategy getCommunicationStrategy() {
        return communicationStrategy;
    }

    public void setCommunicationStrategy(CommunicationStrategy communicationStrategy) {
        this.communicationStrategy = communicationStrategy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public String printInfo() {
        return "My name is: "+name+" .I am "+age+" years old. I am a "
                +competitionStrategy.typeOfCompetition()+" and I go to work by "
                +communicationStrategy.goToWork()+".";
    }
}
