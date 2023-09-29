package strategy;

public class DoctorStrategy implements CompetitionStrategy{
    @Override
    public String typeOfCompetition() {
        return "doctor";
    }
}
