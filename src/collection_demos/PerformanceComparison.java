package collection_demos;

import java.util.ArrayList;
import java.util.Vector;

public class PerformanceComparison {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis(); //
		ArrayList<Integer> it = new ArrayList<>();
		for(int i=0;i<1000000;i++) {
			it.add(i);
			
		}
		long endTime=System.currentTimeMillis();
		System.out.println("Total time taken by ArrayList class :"+(endTime - startTime)+ " ms");
		 startTime = System.currentTimeMillis();  
		 Vector<Integer> vc=new Vector<>();
		for(int i=0;i<1000000;i++) {
			it.add(i);
		}
		endTime = System.currentTimeMillis();
		System.out.println("Total time taken by Vector class :"+(endTime - startTime)+ " ms");
		
		
	}

}
