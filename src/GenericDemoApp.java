/*
Phillip Yohner
COP 3330C - CRN 24680
March 14, 2024

*** PART 2 ***

Description:
The purpose of this program - Generic Demo App - is to demonstrate the use of generics and Collections
with data that represents a set of soccer players, teams, and stadiums, which have their own class of
attributes.  Each set of data is collected in a generic container with methods that work with each data set.
The output shows the items in each container and will reprint the contents has various actions are performed,
such as add, remove, retrieve, size, and sort.
*/

public class GenericDemoApp {

    public static void main (String[] args){

        //Create containers for each type of data
        GenericsContainer<Player> players = new GenericsContainer<>();
        GenericsContainer<Team> teams = new GenericsContainer<>();
        GenericsContainer<Stadium> stadiums = new GenericsContainer<>();

        //Create and add the players to the players container
        Player torres = new Player("Facundo Torres", 10, "Forward");
        Player jannsen = new Player("Robin Jannsen", 6, "Defender");
        Player araujo = new Player("Caesar Araujo", 5, "Midfielder");
        players.add(torres);
        players.add(jannsen);
        players.add(araujo);
        System.out.println(players); //Print out players container contents

        //Create and add the teams to the teams container
        Team orlandoCity = new Team("Orlando City SC", "Lion", 1);
        Team interMiami = new Team("Inter Miami CF", "Heron", 1);
        Team laGalaxy = new Team("LA Galaxy", "Cosmo", 8);
        teams.add(orlandoCity);
        teams.add(interMiami);
        teams.add(laGalaxy);
        System.out.println(teams); //Print out teams container contents

        //Create and add the stadiums to the stadiums container
        Stadium interCo = new Stadium("Inter&Co Stadium", "Orlando, FL", 25500);
        Stadium chase = new Stadium("Chase Stadium", "Fort Lauderdale, FL", 21550);
        Stadium dignityHealth = new Stadium("Dignity Health Sports Park", "Los Angeles, CA", 27000);
        stadiums.add(interCo);
        stadiums.add(chase);
        stadiums.add(dignityHealth);
        System.out.println(stadiums); //Print out stadiums container contents

        players.remove(torres); //Remove a player
        teams.remove(interMiami); //Remove a team
        stadiums.remove(chase); //Remove a stadium

        System.out.println(players); //Print out players container contents
        System.out.println(teams); //Print out teams container contents
        System.out.println(stadiums); //Print out stadiums container contents

        players.retrieve(players, 1);  //Retrieve player at index 1
        teams.retrieve(teams, 0); //Retrieve team at index 0
        stadiums.retrieve(stadiums, 0); //Retrieve status at index 0

        players.size(players); //Get players container size
        teams.size(teams); //Get teams container size
        stadiums.size(stadiums); //Get stadiums container size

        System.out.println("Sorting Players by player name...");
        players.sortByCustomComparator(Player.nameComparator()); //Sort players items by player name
        System.out.println(players); //Print out players container contents

        System.out.println("Sorting Stadiums by capacity, descending...");
        stadiums.sortByReverseOrder(Stadium.capacityComparator()); //Sort stadiums items by capacity descending
        System.out.println(stadiums); //Print out stadiums container contents

        System.out.println("Sorting Teams by team name...");
        teams.sortByCustomComparator(Team.nameComparator()); //Sort teams items by team name
        System.out.println(teams); //Print out teams container contents

    }
}