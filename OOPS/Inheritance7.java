package OOPS;



//Single Inheritance

class A{
	int a=100;
	void display() {
		System.out.println(a);
	}
}

class B extends A{
	int b=200;
	void show() {
	System.out.println(b);
	}
}


public class Inheritance7 {
   public static void main(String[] args) {
      B obj = new  B();
      System.out.println(obj.a );
      System.out.println(obj.b );
}
}
