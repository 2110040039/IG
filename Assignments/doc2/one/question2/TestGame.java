package doc2.one.question2;


public class TestGame {
    public static void main(String[] args) {
        // Declare an array of Game references with size 5
        Game[] games = new Game[5];

        // Populate the array with objects of Cricket, Football, and Tennis
        games[0] = new Cricket();
        games[1] = new Football();
        games[2] = new Tennis();
        games[3] = new Cricket();
        games[4] = new Football();

        // Loop through the array and invoke the displayInfo method polymorphically
        for (Game game : games) {
            game.displayInfo(); // The appropriate method is called based on the actual object type
        }
    }

}


//Cricket is a bat-and-ball game played between two teams of eleven players each.
//Football is a team sport played with a spherical ball between two teams of eleven players.
//Tennis is a racket sport played either individually or in pairs, where players hit a ball over a net.
//Cricket is a bat-and-ball game played between two teams of eleven players each.
//Football is a team sport played with a spherical ball between two teams of eleven players.
