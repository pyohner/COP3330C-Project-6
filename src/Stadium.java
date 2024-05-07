import java.util.Comparator;

public class Stadium {

    //Attributes
    private String stadiumName;
    private String location;
    private int capacity;

    //Constructor
    public Stadium(String stadiumName, String location, int capacity) {
        this.stadiumName = stadiumName;
        this.location = location;
        this.capacity = capacity;
    }

    //Getters & Setters
    public String getStadiumName() {
        return stadiumName;
    }

    public void setStadiumName(String stadiumName) {
        this.stadiumName = stadiumName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Stadium{" +
                "stadiumName='" + stadiumName + '\'' +
                ", location='" + location + '\'' +
                ", capacity=" + capacity +
                '}';
    }

    //Comparator for stadium capacity
    public static Comparator<Stadium> capacityComparator() {
        return Comparator.comparing(Stadium::getCapacity);
    }
}
