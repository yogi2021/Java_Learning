package Collection;

import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Hashmap2 {
   public static void main(String[] args) {
	   
	   Map m = new HashMap();     //1
	
	   HashMap<Integer,String> hm =new HashMap<Integer,String>(); //2
	   
	   // Adding hashmap pairs
	   hm.put(101, "Yogii");
	   hm.put(102, "Nikhil");
	   hm.put(103, "Ritesh");
	   hm.put(104, "Yogii");       // same value allow
	   hm.put(105, "Savan");
	   hm.put(101, "Takku");       // same key are not allow
	   
	   System.out.println(hm);
	   
	   //remove pair
	   hm.remove(103);
	   System.out.println("After Remove"+ hm);
	   
	   // access value
	  System.out.println( hm.get(102));         // nikhil
	  
	   //  get all the keys from hashmap
	  System.out.println(hm.keySet());        // only keys
	  
	  // get all only values
	  System.out.println(hm.values());       // only values
	  
	  System.out.println(hm.entrySet());   //keys & values
	  
	  //Reading data from hashmap
	    
	    // 1. using for..each
	    for(int k:hm.keySet()) {
	    	System.out.println(k+"  "+hm.get(k));
	    }
	    
	  // using iterator  
	    
	    Iterator<Entry<Integer, String>> it =hm.entrySet().iterator();
         
	    while(it.hasNext()) {
	    	Entry<Integer, String> entry=it.next();
	    	System.out.println(entry.getKey()+"  "+ entry.getValue());	
	    }
     
	     hm.clear();
	     System.out.println(hm);
	     
	     System.out.println(hm.isEmpty());
   
   
   
   }
}
