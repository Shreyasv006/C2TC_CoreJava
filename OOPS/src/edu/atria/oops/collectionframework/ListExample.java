package edu.atria.oops.collectionframework;
import java.util.*;

public class ListExample {

	public static void main(String[] args) {
		// Can't instance the list
		//List lst=new List();
		List list=new ArrayList();
		list.add(0,1);
		list.add(1, "Shreyas");
		list.add(2, 'M');
		list.add(3, 98.9f);
		list.add(4, 9535252488l);
		System.out.println(list); 
		System.out.println(list.get(1));
		//System.out.println(list.get(7));
		//Exception will be the output
		
		System.out.println(list.contains("Shreyas"));
		System.out.println(list.size());
		list.add(5, "Shreyas");
		System.out.println(list);
		list.add(6, null);
		System.out.println(list);
		list.clear();
		System.out.println(list);
		

	}

}
