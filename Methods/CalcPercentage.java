package Methods;
import java.util.Scanner;
public class CalcPercentage {
	//Calculate percentage
	float calc_percentage(float percent, float total) {
		float result = (total*percent)/100;
		return result;
	}
public static void main(String[] args) {
	CalcPercentage  m1 = new CalcPercentage ();
	Scanner sc = new Scanner (System.in);
	System.out.println("Enetr value to calculate percentage:");
	float total = sc.nextFloat();
	System.out.println("Enter percentage:");
	float percent= sc.nextFloat();
	
	float result = m1.calc_percentage(percent,total);
	System.out.println(result);
	sc.close();
}
}
