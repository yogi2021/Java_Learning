package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet2 {
	// Declaration
	public static void main(String[] args) {

		// Set myset = new HashSet();

		HashSet myset = new HashSet();

		// Add
		myset.add(100);
		myset.add(150);
		myset.add(100);
		myset.add(10.10);
		myset.add("Yogii");
		myset.add(true);
		myset.add(null);
		myset.add(null);

		// Printing hashset
		System.out.println(myset);

		// Removing element
		myset.remove(150); // delete direct value index not supported
		System.out.println("After Removing: " + myset);

		// size of hashset
		System.out.println("Size of hashset: " + myset.size());

		// insertion is not possible bcz hashset does not support index
		// access specific element - not possible
		// simple for loop also not possible

		// Convert Hashset --> Arraylist
		ArrayList al = new ArrayList(myset);
		System.out.println("ArrayList: " + al); // convert into arraylist then access
		System.out.println(al.get(3));

		// read all the elements using for each..
		for (Object c : myset) {
			System.out.println(c);
		}

		// using Iterator
		Iterator<Object> it = myset.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// clearing all element
		myset.clear();
		System.out.println(myset);

		System.out.println(myset.isEmpty());

	}
}