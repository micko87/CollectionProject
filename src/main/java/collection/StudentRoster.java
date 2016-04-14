/**
 *   File Name: StudentRoster.java<br>
 *
 *   Nepton, Jean-francois<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Aprile 10, 2016
 *
 */

package collection;

import java.util.HashSet;

/**
 * StudentRoster A Student Roster App. This app collects student IDs for a
 * school attendance system.
 * <p>
 * The app contains a String[] array to represent the id names of all the
 * students in a class room. This array should be converted to a valid
 * collection type to satisfy user requirements: > Optimal performance while
 * satisfying requirements > The student roster collection can not have any
 * duplicates as it would not makes sense to allow any two students to share an
 * id. This collection does not have to be kept in any type of order as the main
 * importance is fast access to the elements in the collection.
 * <p>
 * There are methods to add, remove, and display collection
 *
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */
public class StudentRoster {

	/**
	 * A static method to display a elements
	 *
	 * @param sr
	 *            StudentRoaster instance to work with
	 */
	public static void displayElements(StudentRoster sr) {
		// Provide logic to view elements in collection for TrendingTags
		// instance
		System.out.println("\n\n/****************** Students **********************/");
		sr.displayElements();
		System.out.println("/-------------------------------------------------/");

	}

	/**
	 * Here is a basic test or application logic that should be performed on the
	 * collection
	 */
	public static void main(String[] gs) {
		// Create Simulation instance
		StudentRoster sr = new StudentRoster();
		// Display Elements
		sr.displayElements();
		// Add and remove few elements to the collection
		sr.addElement("KATL2943");
		sr.removeElement("KATL2943");
		// Use a staic method version to view elements
		displayElements(sr);
	}

	private HashSet<StudentRoster> studententRoster;

	String[] students = { "JOHND9824", "KIML2794", "LUISM3262", "JENP8319", "JEFFN1092", "DIANER9216" };

	/**
	 * Default constructor
	 */
	public StudentRoster() {
		// Either overload this class or make this default default constructor
		// interactive.

	}

	/**
	 * Method to add an element
	 */
	public void addElement(String... val) {
		// provide logic to add an element

		for (int i = 0; i < this.studententRoster.val; i++) {

		}
	}

	/**
	 * Method to remove an element
	 */
	public void removeElement(String... val) {
		// provide logic to remove an element
		for (String i : val) {
			this.studententRoster.remove(i);
		}
	}

	/**
	 * An instance method to display all elements
	 */
	private void displayElements() {
		// Provide logic to view elements for instance

	}

}
