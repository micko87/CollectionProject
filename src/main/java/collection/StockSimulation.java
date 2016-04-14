/**
 *   File Name: StockSimulation.java<br>
 *
 *   Nepton, Jean-francois<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *  Created: Aprile 10, 2016
 *
 */

package collection;

import java.util.TreeMap;

/**
 * StockSimulation A Stock Simulation software. This software shows securities
 * for a stock simulation where securities are trading amongst traders. A
 * Security represents an element which has a value that changes during the
 * simulation.
 * <p>
 * The application contains two String[] fields which should be converted to a
 * valid collection type to satisfy user requirements: > Optimal performance
 * while satisfying requirements > There CAN NOT be more than one Security with
 * the same name > All securities should remain in natural order based on their
 * security name.
 * <p>
 * There are methods you should implement to add, remove, and display collection
 *
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */
public class StockSimulation {

	static String[] securityNames = { "Gold", "Silver", "Iron", "Lead", "Copper", "Iron" };

	static double[] securityValues = { 89.6, 48.39, 124.9, 12.1, 4.0, 24.9 };

	/**
	 * A static method to display a StockSimulation's elements
	 *
	 * @param sim
	 *            StockSimulation instance to work with
	 */
	public static void displayElements(StockSimulation sim) {
		// Provide logic to view elements in collection for StockSimilation
		// instance
		sim.displayElements();
	}

	/**
	 * Here is a basic test or application logic that should be performed on the
	 * collection
	 */
	public static void main(String[] gs) {
		// Create Simulation instance
		StockSimulation sim = new StockSimulation();
		sim.addElements(securityNames, securityValues);

		// Display Elements
		sim.displayElements();
		// Add and remove few elements to the collection
		sim.addElement("Ore", 30.7);
		// Display Elements
		sim.displayElements();
		sim.removeElement("Ore");
		// Use a staic method version to view elements
		displayElements(sim);
		sim.addElements("Magnesium:35.89", "Steel:100.5", "Selenium:37.2");
		displayElements(sim);
		sim.removeElement("Gold", "Copper");
		displayElements(sim);
	}

	private TreeMap<String, Double> stockItems;

	/**
	 * Default Constructor
	 */
	public StockSimulation() {
		this.stockItems = new TreeMap<String, Double>();
	}

	/**
	 * Method to add an element
	 */
	public void addElement(String key, Double value) {
		this.stockItems.put(key, value);
	}

	/**
	 * Method to add an element
	 */
	public void addElements(String... val) {
		// provide logic to add an element
		// stockItems.put()
		String[] keys = new String[val.length];
		double[] values = new double[val.length];
		for (int i = 0; i < val.length; i++) {
			keys[i] = val[i].split(":")[0];
			values[i] = Double.parseDouble(val[i].split(":")[1]);
		}

		addElements(keys, values);

	}

	/**
	 * Method to remove an element
	 */
	public void removeElement(String... val) {
		// provide logic to remove an element
		// stockItems.remove(key)
		for (String key : val) {
			this.stockItems.remove(key);
		}
	}

	/**
	 * Method to remove an element
	 */
	public void removeElement(String key) {
		// provide logic to remove an element
		// stockItems.remove(key)
		this.stockItems.remove(key);
	}

	/**
	 * @param securityNames2
	 * @param securityValues2
	 */
	private void addElements(String[] securityNames, double[] securityValues) {
		if (securityNames.length == securityValues.length) {
			for (int i = 0; i < securityNames.length; i++) {
				this.stockItems.put(securityNames[i], securityValues[i]);
			}
		} else {
			try {
				throw new InvalidCollectiontSizeException();
			} catch (InvalidCollectiontSizeException e) {
				System.out.println("Can not add stock items, parameter sizes for supplied"
						+ " arrays do not match for key and values.");

			}
		}
	}

	/**
	 * An instance method to display a elements
	 */
	private void displayElements() {
		System.out.println(this.stockItems);

	}

}