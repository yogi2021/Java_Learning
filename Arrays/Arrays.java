package Arrays;

public class Arrays {

	public static void main(String[] args) {
		int arr[] = new int[5];
		arr[0] = 12;
		arr[1] = 17;
		arr[2] = 19;
		arr[3] = 2;
		arr[4] = 112;

		int size = arr.length;
		System.out.println(size);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
