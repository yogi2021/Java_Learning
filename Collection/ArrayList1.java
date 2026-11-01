package Collection;

import java.util.ArrayList;
// import java.util.Iterator;

public class ArrayList1 {
    public static void main(String[] args) {

        // Declaration
        // ArrayList mylist = new ArrayList(); //1
        // List mylist = new ArrayList(); //2
        // ArrayList <Integer> mylist = new ArrayList<Integer>();
        // store only Integer

        // Adding data into arraylist

        ArrayList mylist = new ArrayList();

        mylist.add(100);
        mylist.add(20.10); // add the value end of the list
        mylist.add("Yogii");
        mylist.add(null);
        mylist.add(true);
        mylist.add(null);

        // print data from arraylist
        System.out.println("Arraylist: " + mylist);

        // size of arrayList
        System.out.println("Size of arraylist: " + mylist.size());

        // Remove
        mylist.remove(1); // index
        System.out.println("After Removing: " + mylist);

        // Insert
        mylist.add(2, 'A'); // insert value at you want
        System.out.println("After Insertion: " + mylist);

        // modify element
        mylist.set(2, "Python");
        System.out.println(mylist);

        // Access specifi element
        System.out.println(mylist.get(3));

        System.out.println();

        // reading all the elements

        // 1. using for loop
        for (int i = 0; i <= mylist.size() - 1; i++) {
            System.out.println(mylist.get(i));
        }

        // 2. using for loop
        for (Object x : mylist) {
            System.out.println(x);
        }

        System.out.println()

    }
}