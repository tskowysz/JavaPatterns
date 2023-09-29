import strategy.*;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        CommunicationStrategy bike=new BikeStrategy();
        CommunicationStrategy car=new CarStrategy();
        CommunicationStrategy walk=new WalkStrategy();

        CompetitionStrategy doctor=new DoctorStrategy();
        CompetitionStrategy barman=new BarmanStrategy();


        Employee mike = new Employee("Mike", 32);
        mike.setCompetitionStrategy(doctor);
        mike.setCommunicationStrategy(bike);
        System.out.println(mike.printInfo());


    }
}