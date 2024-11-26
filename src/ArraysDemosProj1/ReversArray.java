package ArraysDemosProj1;

import java.util.Arrays;

public class ReversArray {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
//		int temp = 0;
//		for (int i = arr.length-1; i >= 0; i--) {
//		arr[i]=temp;
//		}
//       System.out.println(Arrays.toString(arr));
		int n=arr.length;
		for(int i=0;i<=n/2;i++) {
			int temp=arr[i];
			arr[i]=arr[n-i-1];
			arr[n-i-1]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}

}
