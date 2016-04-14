/**
 *   File Name: VideoGameApp.java<br>
 *
 *   Nepton, Jean-francois<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Aprile 10, 2016
 *   
 */

package collection;

import java.util.Map;
import java.util.TreeMap;

/**
 * VideoGameApp A video game with basic functions. The video game contains
 * enemies which are created stronger based on their expPoints value.
 * <p>
 * The application contains two arrays, one for int[] ids and one for long[]
 * expPoints which should be converted to a valid collection type to satisfy
 * user requirements: > Optimal performance while satisfying requirements >
 * There CAN NOT be more than one enemy with the same int id > All enemies do
 * not need to remain in any type of order but should be able to be accessed
 * very quickly.
 * <p>
 * There are methods you should implement to add, remove, and display collection
 * 
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */
public class VideoGameApp {

	private Map<Integer, Long> enemies;

	/**
	 * Here is a basic test or application logic that should be performed on the
	 * collection
	 */
	public static void main(String[] gs) {
		// Create Simulation instance and setup some enemies
		VideoGameApp vidGame = new VideoGameApp();
		// Add and remove few elements to the collection
		vidGame.addElement(38, 963456L);
		// Display Elements
		vidGame.displayElements();
		vidGame.removeElement(38, 58);
		// Use a static method version to view elements
		displayElements(vidGame);
	}

	/**
	 * A static method to display a StockSimulation's elements
	 * 
	 * @param vidGame
	 *            VideoGameApp instance to work with
	 */
	public static void displayElements(VideoGameApp vidGame) {
		// Provide logic to view elements in collection for StockSimilation
		// instance
		System.out.println("\n\n/****************** ENEMIES **********************/");
		vidGame.displayElements();
		System.out.println("/-------------------------------------------------/");
	}

	/**
	 * An instance method to display a elements
	 */
	private void displayElements() {
		// Provide logic to view elements for instance

		for (Integer i : enemies.keySet()) {
			System.out.println("The enemy with an id " + i + " has " + enemies.get(i) + " experience points.");
		}

	}

	/**
	 * Default Constructor
	 */
	public VideoGameApp() {
		// Either overload this class or make this default default constructor
		// interactive.
		enemies = new TreeMap<Integer, Long>();

		// Previouds code:
		// enemies.put(10, 346572L);
		// enemies.put(58, 23864234L);
		// enemies.put(19, 546546L);
		// enemies.put(48, 123L);
		// enemies.put(8, (long) 785764);
		// enemies.put(95, Long.valueOf(126764));

		// Create a variable to hold ids in an array for enemies
		int[] ids = new int[] { 10, 58, 19, 48, 8, 95 };
		// Create a variable to hold expPoints in an array for enemies'
		// experience points
		long[] expPoints = new long[] { 346572L, 23864234L, 546546L, 123L, 785764L, 126764L };

		// Add a group of elements - ids and expPoints
		addElements(ids, expPoints);
		// Add an individual element
		addElement(34, 32875L);
	}

	/**
	 * Method to add an element
	 */
	public void addElement(int id, long expPoints) {
		// provide logic to add an element
		enemies.put(id, expPoints);
	}

	/**
	 * Method to add elements
	 */
	public void addElements(int[] ids, long[] expPoints) {
		// provide logic to add an element
		for (int i = 0; i < ids.length; i++) {
			enemies.put(ids[i], expPoints[i]);
		}

	}

	/**
	 * Method to remove an element
	 */
	public void removeElement(int... values) {
		// provide logic to remove an element
		for (int i : values) {
			enemies.remove(i);
		}
	}

}
