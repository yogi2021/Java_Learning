package OOPS;

public class ThisKeyword4 {
	int a,b;                            //class/instance variable
	ThisKeyword4(int a, int b){
		this.a=a;
		this.b=b;
	}
	
	void display() {
        System.out.println("This Keyword: ");
		System.out.println(a);
		System.out.println(b);
        System.out.println("------------------");
	}
  public static void main(String[] args) {
	  ThisKeyword4 th = new  ThisKeyword4(100, 500);
	  th.display();
}
}
