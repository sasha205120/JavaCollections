package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();
		// add:
		ll.add("Test");
		ll.add("selenium");
		ll.add("qtp");
		ll.add("batman");
		ll.add("superman");

		// print:
		System.out.println("contend of linkedlist-->" + ll);
		
		//add first and last element
		ll.addFirst("Jack");
		ll.addLast("Tom");
		System.out.println("contend of linkedlist-->" + ll);
 
		//get:
		System.out.println(ll.get(0));
		System.out.println(ll.get(1));
  
		//set:
		ll.set(6, "Tommy");
		System.out.println("contend of linkedlist-->" + ll);

		//remove first and last element
		ll.removeFirst();
		ll.removeLast();
		System.out.println("contend of linkedlist-->" + ll);
		
		ll.remove(2);
		System.out.println("contend of linkedlist-->" + ll);

		
		//how to print all the values of linkedlist:
		//for loop
		for(int i=0;i<ll.size();i++) {
			System.out.println(ll.get(i));
		}
				System.out.println("************");
				
		//advanced for loop
		for(String str:ll) {
			System.out.println(str);
		}
		System.out.println("************");
		
		//iterator
		System.out.println("using iterator:");
		Iterator<String> it=ll.iterator();
				while(it.hasNext()) {
					System.out.println(it.next());
				}
				System.out.println("************");
				
		//while loop
		int num=0;
		while(ll.size()>num) {
			System.out.println(ll.get(num));
			num++;
		}
		
		
		
		
		
		

	}

}
