import java.util.Comparator;

public class Player {

    //Attributes
    private String playerName;
    private int jerseyNumber;
    private String position;

    //Constructor
    public Player(String playerName, int jerseyNumber, String position) {
        this.playerName = playerName;
        this.jerseyNumber = jerseyNumber;
        this.position = position;
    }

    //Getters & Setters
    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerName='" + playerName + '\'' +
                ", jerseyNumber=" + jerseyNumber +
                ", position='" + position + '\'' +
                '}';
    }

    //Comparator for player names
    public static Comparator<Player> nameComparator() {
        return Comparator.comparing(Player::getPlayerName);
    }

}
