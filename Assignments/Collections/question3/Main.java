package Collections.question3;
import java.util.*;
public class Main {
	    public static void main(String[] args) {
	        // Create a list of movies
	        List<Movie> movieList = createMovieSet();

	        // Sort by Language using Comparable
	        sortByLanguage(movieList);
	        System.out.println("Movies sorted by language:");
	        for (Movie movie : movieList) {
	            System.out.println(movie);
	        }

	        // Sort by Director using Comparator
	        sortByDirector(movieList);
	        System.out.println("\nMovies sorted by director:");
	        for (Movie movie : movieList) {
	            System.out.println(movie);
	        }

	        // Sort by Duration
	        sortByDuration(movieList);
	        System.out.println("\nMovies sorted by duration:");
	        for (Movie movie : movieList) {
	            System.out.println(movie);
	        }
	    }

	    // Method to create a list of movies
	    public static List<Movie> createMovieSet() {
	        List<Movie> movieList = new ArrayList<>();
	        
	        // Sample movies
	        movieList.add(new Movie("Inception", "English", new GregorianCalendar(2010, Calendar.JULY, 16).getTime(), "Christopher Nolan", "Emma Thomas", 148));
	        movieList.add(new Movie("Parasite", "Korean", new GregorianCalendar(2019, Calendar.MAY, 30).getTime(), "Bong Joon-ho", "Bong Joon-ho", 132));
	        movieList.add(new Movie("Amélie", "French", new GregorianCalendar(2001, Calendar.APRIL, 25).getTime(), "Jean-Pierre Jeunet", "Pierre Grise", 122));
	        movieList.add(new Movie("The Dark Knight", "English", new GregorianCalendar(2008, Calendar.JULY, 18).getTime(), "Christopher Nolan", "Charles Roven", 152));
	        movieList.add(new Movie("Spirited Away", "Japanese", new GregorianCalendar(2001, Calendar.JULY, 20).getTime(), "Hayao Miyazaki", "Toshio Miyahara", 125));

	        return movieList;
	    }

	    // Method to sort by language using Comparable
	    public static void sortByLanguage(List<Movie> movieList) {
	        Collections.sort(movieList);
	    }

	    // Method to sort by director using Comparator
	    public static void sortByDirector(List<Movie> movieList) {
	        Collections.sort(movieList, Movie.sortByDirector);
	    }

	    // Method to sort by duration
	    public static void sortByDuration(List<Movie> movieList) {
	        movieList.sort(Comparator.comparingInt(Movie::getDuration));
	    }
	}

//Movies sorted by language:
//Amélie{name='Amélie', language='French', director='Jean-Pierre Jeunet', duration=122}
//Inception{name='Inception', language='English', director='Christopher Nolan', duration=148}
//The Dark Knight{name='The Dark Knight', language='English', director='Christopher Nolan', duration=152}
//Parasite{name='Parasite', language='Korean', director='Bong Joon-ho', duration=132}
//Spirited Away{name='Spirited Away', language='Japanese', director='Hayao Miyazaki', duration=125}
//
//Movies sorted by director:
//Parasite{name='Parasite', language='Korean', director='Bong Joon-ho', duration=132}
//Inception{name='Inception', language='English', director='Christopher Nolan', duration=148}
//The Dark Knight{name='The Dark Knight', language='English', director='Christopher Nolan', duration=152}
//Spirited Away{name='Spirited Away', language='Japanese', director='Hayao Miyazaki', duration=125}
//Amélie{name='Amélie', language='French', director='Jean-Pierre Jeunet', duration=122}
//
//Movies sorted by duration:
//Amélie{name='Amélie', language='French', director='Jean-Pierre Jeunet', duration=122}
//Spirited Away{name='Spirited Away', language='Japanese', director='Hayao Miyazaki', duration=125}
//Parasite{name='Parasite', language='Korean', director='Bong Joon-ho', duration=132}
//Inception{name='Inception', language='English', director='Christopher Nolan', duration=148}
//The Dark Knight{name='The Dark Knight', language='English', director='Christopher Nolan', duration=152}


