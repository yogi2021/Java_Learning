package OOPS;

public class ClassOBJ1{
	//variables
	int eid;
	String ename;
	String job;
	int sal;
	
	//Methods
	void display(){
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(job);
		System.out.println(sal);
	}
	
  public static void main(String[] args) {
	   ClassOBJ1 Co1= new ClassOBJ1 ();
	   Co1.eid=101;
	   Co1.ename="Yogii";
	   Co1.job="Software Devloper";
	   Co1.sal=100000;
	   
	   Co1.display();
	   
	   
}
}
