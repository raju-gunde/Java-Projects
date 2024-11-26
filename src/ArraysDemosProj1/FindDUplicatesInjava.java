package ArraysDemosProj1;

import java.util.Arrays;

public class FindDUplicatesInjava {
	public static void main(String[] args) {
//		int arr[]= {1,2,3,2,3};
//		int i,j;
//		int count =0;
//		int a[]=new int[5];
//		for(i=0;i<arr.length;i++) {
//			for(j=0;j<arr.length;j++) {
//				
//				if(arr[i]==arr[j]) {
//					
//					count++;
//				}
//				else {
//					break;
//				}
//			}
//			i=j-1;
//			if(count>1) {
//			System.out.println(arr[i]);
//			}
//		}
		int[] array = { 2, 3, 5, 4, 3, 1, 3, 2, 1, };
	      
	      //sorting an array
	      Arrays.sort(array);
	      
	      //declaring the variables
	      int i,j,frequency;
	      System.out.println("These elements are repeated along with its frequency-");
	      
	      //loop for logic implementation
	      for(i=0; i<array.length; i++){
	         frequency = 1;
	         for(j=i+1; j<array.length; j++){
	            if(array[j] == array[i]){
	               frequency++;
	            } else {
	               break;
	            }
	         }
	         i=j-1;
	         if(frequency > 1){
	         
	            //printing the output
	            System.out.println(array[i] );
	         }
	      }
	}
}
