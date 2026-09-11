package OOPS;

public class StaticVariable5 {
  static int a=10;    //static variable
  int b=20;           // non-static variable
  

  
  public static void main(String[] args) {
    System.out.println("Statis variable: ");
  System.out.println(a);
  System.out.println("--------------");
  System.out.println("Non Static variable: ");
 // m1();
  
  
//  System.out.println(b);       //can not access directly without object
//  System.out.println( m2());
  StaticVariable5 sv = new StaticVariable5();
  System.out.println(sv.b);                   //access using object
  //sv.m2();
	  
  //sv.m();
}
  
  
}
