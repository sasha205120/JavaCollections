package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static <E> void main(String[] args) {

		int[] a = new int[3]; // size is fixed,we need to define size for array

		// dynamic array- ArrayList
		// 1. can contain duplicate values/elements
		// 2.maintains insertion order
		// 3.Synchronized
		// 4.allows random access to fetch the element because it stores the values on
		// the basis of indexes

		ArrayList ar = new ArrayList();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		System.out.println(ar.size());

		ar.add(40);
		ar.add(50);
		ar.add(50); // allow duplicate
		System.out.println(ar.size()); // size of arraylist
		System.out.println(ar.get(4)); // 4.--- to get the value from on index

		// to print all the values from arraylist: for loop

		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

		// non generic vs generic

		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(100);

		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("hello");

		ArrayList<E> ar3 = new ArrayList<E>();

		System.out.println("************");
		// ************
		// Employee class Objects:
		Employee e1 = new Employee("me", 31, "QA");
		Employee e2 = new Employee("you", 26, "Dev");
		Employee e3 = new Employee("him", 24, "Adimn");

		// create arraylist:

		ArrayList<Employee> ar4 = new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);

		// iterator to traverse the values:
		Iterator<Employee> it = ar4.iterator();

		while (it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);

		}
		System.out.println("************");
		// ************

		// add.All();
		ArrayList<String> ar5 = new ArrayList<String>();
		ar5.add("Jack");
		ar5.add("Tom");
		ar5.add("Chirs");

		ArrayList<String> ar6 = new ArrayList<String>();
		ar6.add("Java");
		ar6.add("Ruby");
		ar6.add("Python");

		ar5.addAll(ar6);

		for (int i = 0; i < ar5.size(); i++) {
			System.out.println(ar5.get(i));
		}

		System.out.println("************");
		// ************
		// removeALL():
		ar5.removeAll(ar6);

		for (int i = 0; i < ar5.size(); i++) {
			System.out.println(ar5.get(i));
		}

		System.out.println("************");
		// ************
		// retainAll():
		ArrayList<String> ar7 = new ArrayList<String>();
		ar7.add("Jack");
		ar7.add("Tom");
		ar7.add("Chirs");

		ArrayList<String> ar8 = new ArrayList<String>();
		ar8.add("Tom");
		ar8.add("Ruby");

		ar7.retainAll(ar8);
		for (int i = 0; i < ar7.size(); i++) {
			System.out.println(ar7.get(i));
		}

	}

}
