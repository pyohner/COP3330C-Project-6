import java.util.Comparator;

public class Team {

    //Attributes
    private String teamName;
    private String mascot;
    private int cupWins;

    //Constructor
    public Team(String teamName, String mascot, int cupWins) {
        this.teamName = teamName;
        this.mascot = mascot;
        this.cupWins = cupWins;
    }

    //Getters & Setters
    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getMascot() {
        return mascot;
    }

    public void setMascot(String mascot) {
        this.mascot = mascot;
    }

    public int getCupWins() {
        return cupWins;
    }

    public void setCupWins(int cupWins) {
        this.cupWins = cupWins;
    }

    @Override
    public String toString() {
        return "Team{" +
                "teamName='" + teamName + '\'' +
                ", mascot='" + mascot + '\'' +
                ", cupWins=" + cupWins +
                '}';
    }

    //Comparator for team names
    public static Comparator<Team> nameComparator() {
        return Comparator.comparing(Team::getTeamName);
    }
}
