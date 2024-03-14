package UNC_Projects;
import bridges.base.Array1D;
import bridges.connect.Bridges; // this will work if jar file was installed correctly

public class Test {

	public static void main(String[] args) throws Exception {

		//create the Bridges object, set credentials
		Bridges bridges = new Bridges(0, "NickFinch07","1298921040394");   
// The ‘0’ value above is the assignment number. This is just a test, 
// so we call it assignment 0.
// Remember that you must change the other two  above values 
// to your actual Bridges user id and actual API key (See step 6. b.)

		// title, description
		bridges.setTitle("One-Dimensional Array Example");
		bridges.setDescription("One dimensional  array with visual attributes");

		//  set array dimensions, allocate array of elements
		int arraySize = 10;

		Array1D<Integer> arr = new Array1D<Integer> (arraySize);

		// populate the array, with squares of indices
		// use the values to label the elements
		for (int k = 0; k < arr.getSize(); k++) {
			arr.getElement(k).setValue(k * k);
			arr.getElement(k).setLabel(String.valueOf(arr.getElement(k).getValue()));
		}

		// color the array elements
		arr.getElement(0).setColor("red");
		arr.getElement(1).setColor("green");
		arr.getElement(2).setColor("blue");
		arr.getElement(3).setColor("cyan");
		arr.getElement(4).setColor("magenta");
		arr.getElement(5).setColor("yellow");
		arr.getElement(6).setColor("red");
		arr.getElement(7).setColor("green");
		arr.getElement(8).setColor("blue");
		arr.getElement(9).setColor("black");

		// tell Bridges what datastructure to visualize
		bridges.setDataStructure(arr);

		// visualize the list
		bridges.visualize();
	}
}
