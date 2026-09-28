package OOPS;


// Abstract Method...USing Interface

interface Shape{
	int Length=10;
	int width = 20;
	
	void circle();   //abstract method
	
	default void square() {
		System.out.println("This is square- default method");
	}
	
	
	static void rectangle() {
		System.out.println("This is rectangle - Static method");
	}
}

//   void square() {   // implemented method are not allowed in interface
//	   }               // only declaration allow

public class AbstractMethod10 implements Shape{
	public void circle() {
		System.out.println("This is circle - Abstract method");
	}
	
	void triangle() {
		System.out.println("This is triangle..");
	}
	
  public static void main(String[] args) {
    // Scenario 1
	AbstractMethod10 obj = new AbstractMethod10();
	obj.circle();   //abstract
	obj.square();   //default
	Shape.rectangle(); //static method..that can directly access from interface
	obj.triangle();
	
	System.out.println();
	//Scenario 2
	Shape sh = new AbstractMethod10();
	
	sh.circle();   //abstract
	sh.square();   // default
	Shape.rectangle(); //static method can directly access from interface
	
	
   // sh.triangle(); // triangle belongs to class not interface
  }
}
