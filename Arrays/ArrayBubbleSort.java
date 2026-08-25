package Arrays;

public class ArrayBubbleSort {
 
	public static void main(String[] args) {
		int arr[] = {5,4,2,1,3};
		
		displayarr(arr);
		sort1(arr);
		System.out.println("After sort : ");
		displayarr(arr);
}
	static void displayarr(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	static void sort1(int arr[]) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp =arr[j];
					arr[j]= arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
	}
} 