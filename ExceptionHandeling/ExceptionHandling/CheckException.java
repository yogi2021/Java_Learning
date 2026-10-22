package ExceptionHandling;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckException {
    static void reading() {
    	try {
    		FileReader file = new FileReader ("text.txt");   //direct compiler error without run code, in suggestion
    	}catch(FileNotFoundException e) {
    		System.out.println(e.getMessage());
    	}
    }
    public static void main(String[] args) {
		reading();
	}
}
