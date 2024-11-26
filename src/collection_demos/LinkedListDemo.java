package collection_demos;

import java.util.LinkedList;
import java.util.List;

import java.util.Iterator;

public class LinkedListDemo {
public static void main(String[] args) {
	List<Object> list=new LinkedList<Object>();
	/*list.add("raju");
	list.add("ganesh");
	list.add("ragu");
	list.add("srihan");
	list.add(null);
	list.add(1234);
	System.out.println("list position element is:"+list.get(1));
	
	Iterator<Object> itr = list.iterator();
itr.forEachRemaining(System.out::println);*/
	 list.add("Item 2");//2
     list.add("Item 3");//3
     list.add("Item 4");//4
     list.add("Item 5");//5
     list.add("Item 6");//6
     list.add("Item 7");//7
     list.add(0, "Item 0");
     list.add(1, "Item 1");
     	System.out.println(list);
     	// list.remove("Item 5"); 
     	// System.out.println(list);
     	 list.remove(1);
//     	System.out.print(list);
//     	 list.remove(7);
//     	
     	System.out.print(list);
     	  list.set(0,"Ajay"); //set() will replace the existing value
		  list.set(1,"Vijay"); 
		  list.set(2,"Anand"); 
		  list.set(3,"Aman");
		  list.set(4,"Suresh"); 
		  list.set(5,"Ganesh");
		  list.set(6,"Ramesh");
		  list.forEach(x->System.out.println(x));
}
}
