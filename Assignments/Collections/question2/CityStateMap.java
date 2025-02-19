package Collections.question2;
import java.io.*;
import java.util.*;
public class CityStateMap {
	    // HashMap to store city-state pairs
	    private HashMap<String, String> cityStateMap;

	    // Constructor
	    public CityStateMap() {
	        cityStateMap = new HashMap<>();
	    }

	    // Add a new city-state pair
	    public void addCityState(String city, String state) {
	        cityStateMap.put(city, state);
	    }

	    // Get all cities
	    public Set<String> getAllCities() {
	        return cityStateMap.keySet();
	    }

	    // Get all states
	    public Set<String> getAllStates() {
	        return new HashSet<>(cityStateMap.values());
	    }

	    // Get cities for a specific state
	    public List<String> getCitiesForState(String state) {
	        List<String> citiesForState = new ArrayList<>();
	        for (Map.Entry<String, String> entry : cityStateMap.entrySet()) {
	            if (entry.getValue().equals(state)) {
	                citiesForState.add(entry.getKey());
	            }
	        }
	        return citiesForState;
	    }

	    // Delete all cities for a given state
	    public void deleteCitiesForState(String state) {
	        cityStateMap.entrySet().removeIf(entry -> entry.getValue().equals(state));
	    }

	    // Method to load city-state pairs from a file
	    public void loadFromFile(String filename) throws IOException {
	        BufferedReader br = new BufferedReader(new FileReader(filename));
	        String line;
	        while ((line = br.readLine()) != null) {
	            String[] parts = line.split(","); // Assuming the format is "City,State"
	            if (parts.length == 2) {
	                addCityState(parts[0].trim(), parts[1].trim());
	            }
	        }
	        br.close();
	    }


}
