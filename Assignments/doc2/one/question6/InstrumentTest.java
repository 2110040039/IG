package doc2.one.question6;

public class InstrumentTest {
	    public static void main(String[] args) {
	        // Create an array of 10 Instruments
	        Instrument[] instruments = new Instrument[10];

	        // Fill the array with different instruments
	        instruments[0] = new Piano();
	        instruments[1] = new Flute();
	        instruments[2] = new Guitar();
	        instruments[3] = new Piano();
	        instruments[4] = new Flute();
	        instruments[5] = new Guitar();
	        instruments[6] = new Piano();
	        instruments[7] = new Flute();
	        instruments[8] = new Guitar();
	        instruments[9] = new Piano();

	        // Demonstrate polymorphism by calling play() method on each instrument in the array
	        for (int i = 0; i < instruments.length; i++) {
	            instruments[i].play(); // Polymorphism in action
	        }

	        // Use instanceof operator to print the type of object at each index
	        for (int i = 0; i < instruments.length; i++) {
	            if (instruments[i] instanceof Piano) {
	                System.out.println("Index " + i + ": Piano");
	            } else if (instruments[i] instanceof Flute) {
	                System.out.println("Index " + i + ": Flute");
	            } else if (instruments[i] instanceof Guitar) {
	                System.out.println("Index " + i + ": Guitar");
	            }
	        }
	    }
	}


//Piano is playing tan tan tan tan
//Flute is playing toot toot toot toot
//Guitar is playing tin tin tin
//Piano is playing tan tan tan tan
//Flute is playing toot toot toot toot
//Guitar is playing tin tin tin
//Piano is playing tan tan tan tan
//Flute is playing toot toot toot toot
//Guitar is playing tin tin tin
//Piano is playing tan tan tan tan
//
//Index 0: Piano
//Index 1: Flute
//Index 2: Guitar
//Index 3: Piano
//Index 4: Flute
//Index 5: Guitar
//Index 6: Piano
//Index 7: Flute
//Index 8: Guitar
//Index 9: Piano



