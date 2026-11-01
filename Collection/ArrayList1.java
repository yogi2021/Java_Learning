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

    }
}