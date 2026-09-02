package Arrays;

public class D2Array1 {
        public static void main(String[] args) {
			  //2, 3
        	 int a[][]= {{2,3,3},{4,5,6}};
        	 
        	 System.out.println("Row =>" + a.length);
        	 System.out.println("Column =>"+ a[0].length);
        	 display(a);
		}
        
        static void display (int[][] a) {
        	
        	for (int i =0; i< a.length; i++) {
        		for(int j=0; j<a[i].length; j++) {
        			System.out.print(a[i][j]+ " ");
        		}
        		System.out.println();
        	}
        }
}
