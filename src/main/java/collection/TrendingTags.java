/**
 *   File Name: TrendingTags.java<br>
 *
 *   Nepton, Jean-francois<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Aprile 10, 2016
 *   
 */

package collection;

/**
 * TrendingTags A Twitter type software. This software captures popular tags and
 * collects the top ten most popular words.
 * <p>
 * The application contains a String[] array to represent the top words which
 * should be converted to a valid collection type to satisfy user requirements:
 * > Optimal performance while satisfying requirements > The words are entered
 * in insertion order. There CAN BE duplicate words although other logic in
 * application prevents this from happening. Words will be accessed from within
 * the middle of the collection performing a large amount of additions and
 * removals from within the middle of the collection.
 * <p>
 * There are methods to add, remove, and display collection
 * 
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */
public class TrendingTags {

	String[] words = { "Money", "SQA", "Solutions", "Java", "Learn", "Collections" };

	/**
	 * Here is a basic test or application logic that should be performed on the
	 * collection
	 */
	public static void main(String[] gs) {
		// Create Simulation instance
		TrendingTags tags = new TrendingTags();
		// Display Elements
		tags.displayElements();
		// Add and remove few elements to the collection
		tags.addElement("Testing");
		tags.removeElement("Testing");
		// Use a staic method version to view elements
		displayElements(tags);
	}

	/**
	 * A static method to display a TrendingTags's elements
	 * 
	 * @param tags
	 *            TrendingTags instance to work with
	 */
	public static void displayElements(TrendingTags tags) {
		// Provide logic to view elements in collection for TrendingTags
		// instance

	}

	/**
	 * An instance method to display elements
	 */
	private void displayElements() {
		// Provide logic to view elements for instance

	}

	/**
	 * Default Constructor
	 */
	public TrendingTags() {
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
