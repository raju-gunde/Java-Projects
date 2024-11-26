package ArraysDemosProj1;

import java.util.Arrays;

public class Demo1 {
	public static void main(String[] args) {
//		int[] a= {1,2,3,4};
//		int b[]=Arrays.copyOf(a, a.length);
//		System.out.println(a.length);
//		System.out.println(Arrays.toString(b));
//		int arr[]= {1,4,2,5,7};
//		int temp=0;
//		for (int i = 0; i < arr.length; i++) {
//	        for (int j = i + 1; j < arr.length; j++) {
//	            int tmp = 0;
//	            if (arr[i] < arr[j]) {
//	                tmp = arr[i];
//	                arr[i] = arr[j];
//	                arr[j] = tmp;
//	            }
//	        }
//		
//		
//	}
//		System.out.println(Arrays.toString(arr));
		//inding the second larjest number of array.....
		
		int arr[]= {1,2,5,4,8};
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
				
			}
			
		}
		System.out.println(max);
//		 int max = arr[0];  
//	        //Loop through the array  
//	        for (int i = 0; i < arr.length; i++) {  
//	            //Compare elements of array with max  
//	           if(arr[i] > max)  
//	               max = arr[i];  
//	        }  
//	        System.out.println("Largest element present in given array: " + max);  
//	    }  
		
}}
