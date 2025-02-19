package Collections.question2;
import java.io.*;
public class Main {
	public static void main(String[] args) {
        CityStateMap cityStateMap = new CityStateMap();

        // Load data from file (e.g., "city_state.txt")
        try {
            cityStateMap.loadFromFile("city_state.txt");
        } catch (IOException e) {
            System.out.println("Error loading city-state data from file: " + e.getMessage());
        }

        // Add new city-state pair
        cityStateMap.addCityState("New York", "New York");

        // Get all cities
        System.out.println("All Cities: " + cityStateMap.getAllCities());

        // Get all states
        System.out.println("All States: " + cityStateMap.getAllStates());

        // Get cities for a specific state
        System.out.println("Cities for New York: " + cityStateMap.getCitiesForState("New York"));

        // Delete all cities for a given state
        cityStateMap.deleteCitiesForState("California");
        System.out.println("Cities after deletion of California: " + cityStateMap.getAllCities());
    }

}

//Los Angeles, California
//San Francisco, California
//New York, New York
//Chicago, Illinois
//Dallas, Texas

