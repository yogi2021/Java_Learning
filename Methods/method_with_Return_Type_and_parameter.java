package Methods;

public class method_with_Return_Type_and_parameter {
	int rollNo(int rollno){
		rollno=rollno+10;
		return rollno;
	}
public static void main(String[] args) {
	method_with_Return_Type_and_parameter m1=new method_with_Return_Type_and_parameter();
	int result = m1.rollNo(10);
	System.out.println("Roll No : "+result);
}
}
