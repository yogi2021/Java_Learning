package method;

public class method_With_Parameter {
	void myName(String name) {
		System.out.println("name =>" + name);
	}

	// Wap which take side as a parameter and display area of square
	void calcArea(int side) {
		int area = side * side;
		System.out.println(area);
	}

	// Wap which take start and end number as parameter of range and display even
	// numbers between that range

	public static void main(String[] args) {
		method_With_Parameter obj = new method_With_Parameter();
		String name = "Yogii";
		obj.myName(name);

		int side = 12;
		obj.calcArea(side);

	}

}