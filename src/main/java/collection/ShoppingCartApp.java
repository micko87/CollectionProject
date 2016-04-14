/**
 *   File Name: ShoppingCartApp.java<br>
 *
 *   Nepton, Jean-francois<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Aprile 10, 2016
 *   
 */

package collection;

/**
 * ShoppingCartApp A Shopping Cart type app. This app collects items while you
 * are browsing an online store to be later checked out for processing.
 * <p>
 * The application contains a String[] array to represent the SCU of all the
 * items the user wants to purchase. This array should be converted to a valid
 * collection type to satisfy user requirements: > Optimal performance while
 * satisfying requirements > The SCUs are entered in insertion order as the user
 * browses the site and adds items to their cart. User can add more than one of
 * the same item. There are minimal additions to the center of the collection
 * however it is common to iterate through all the items as well as add new
 * items to the end of the collection.
 * <p>
 * There are methods to add, remove, and display collection
 * 
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */
public class ShoppingCartApp {

	String[] items = { "LAPTOP0217", "LAMPO3982", "CANDY3984", "JAVA9083", "SQASOL9845", "VACAT9845" };

	/**
	 * Here is a basic test or application logic that should be performed on the
	 * collection
	 */
	public static void main(String[] gs) {
		// Create Simulation instance
		ShoppingCartApp cart = new ShoppingCartApp();
		// Display Elements
		cart.displayElements();
		// Add and remove few elements to the collection
		cart.addElement("MEDIC2541");
		cart.removeElement("MEDIC2541");
		// Use a staic method version to view elements
		displayElements(cart);
	}

	/**
	 * A static method to display a elements
	 * 
	 * @param cart
	 *            ShoppingCart instance to work with
	 */
	public static void displayElements(ShoppingCartApp cart) {
		// Provide logic to view elements in collection for TrendingTags
		// instance

	}

	/**
	 * An instance method to display all elements
	 */
	private void displayElements() {
		// Provide logic to view elements for instance

	}

	/**
	 * Default constructor
	 */
	public ShoppingCartApp() {
		// Either overload this class or make this default default constructor
		// interactive.
	}

	/**
	 * Method to add an element
	 */
	public void addElement(String... val) {
		// provide logic to add an element
	}

	/**
	 * Method to remove an element
	 */
	public void removeElement(String... val) {
		// provide logic to remove an element
	}

}
