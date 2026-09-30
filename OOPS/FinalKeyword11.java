package OOPS;

class Test{
	int x=100;     // simple varible we can change it
	final int y=500; 
}

public class FinalKeyword11 {
  public static void main(String[] args) {
	 Test t =new Test();
	 
	 System.out.println(t.x+10);   
	 
	 //t.y=200;           - cant be change value is fixed
	 System.out.println(t.y);  
}
}
