package ListConcept;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {

	public static void main(String[] args) {
		// it is similar to hashmap,but it is synchronised
		// stores the value on the basis of key-val
		// key--> Object--HashCode-->value

		Hashtable h1 = new Hashtable();
		h1.put(1, "Tom");
		h1.put(2, "Jack");
		h1.put(3, "Chris");

		// create a clone copy/shallow copy
		Hashtable h2 = new Hashtable();

		h2 = (Hashtable) h1.clone();

		System.out.println("the values from h1 " + h1);
		System.out.println("the values from h2 " + h2);

		h1.clear();
		System.out.println("the values from h1 " + h1);
		System.out.println("the values from h2 " + h2);

		// contains value:
		Hashtable st = new Hashtable();
		st.put("A", "Naveen");
		st.put("B", "Manager");
		st.put("C", "Selenium");

		if (st.containsValue("Naveen"))
			System.out.println("value is found");
		System.out.println("************");
		// print all the values from hastable using--Enumeration--elements()
		Enumeration e = st.elements();
		System.out.println("print values from st using enumeration");
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

		// get all the values from hashtable using--entrySet() --set of hashtable
		// values:
		System.out.println("print values from st using entry set");

		Set s = st.entrySet();
		System.out.println(s);

		Hashtable st1 = new Hashtable();
		st1.put("A", "Naveen");
		st1.put("B", "Manager");
		st1.put("C", "Selenium");
		st1.put("C", "Selenium"); // it contains unique element only,this one will not be printed,already have
									// no null key and null values---->null pointer exception (Hashmap is allowed)

		System.out.println("values from st1:");
		System.out.println(st1);

		// check both the hashtables are euqal or not
		if (st.equals(st1))
			System.out.println("both are equal");

		// get the value from a key
		System.out.println(st1.get("A"));

		// get the hashcode of hashtable object:
		System.out.println("the hash code value of st1 : " + st1.hashCode());

		// generics:
		Hashtable<String, String> st3 = new Hashtable<String, String>();

	}

}
