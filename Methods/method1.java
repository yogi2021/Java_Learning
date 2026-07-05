
   //Method
    //method is an block of code, which perform specific task,
    //instead code again and again we write code inside the block
    //you write once and call it whenever we needed,
    // why use: for reusability, better code maintane,better debugging
        	
    //types of method
    //inbuilt method: those are given by java:         eg.println(), nextInt(), nextFloat(),next()
   
    //user defined method: those methods are created by user



//   1. method with no return type and no parameter:              eg. void greet ()
//   2. method with return type and no parameter                  eg. int rollNo() {int rollno=20; return rollno;}
//   3.method with no return type but with parameter 		      eg.void getName(string name){}
//   4.method with return type and with parameter             eg. String grtName(String name) { return name; }

//void getName(string name : //parameter) {                      // method declaration
	//method defination => method declaration + code block  }

package method;

public class method1 {
	
	//method with no return type no parameter
	void greet() {
		 System.out.println("Good Morning");
	}
	
	int getRollNo() {
		int roll=20;
		return roll;
	}
        public static void main(String[] args) {
			
        	method1 mm = new method1 ();
        	mm.greet();
        	mm.getRollNo();
        	
        	
        }
}
