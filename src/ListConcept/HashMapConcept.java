package ListConcept;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {

		// HashMaps is a class implement Map Interface
		// extends AbstractMap
		// it contains only unique elements
		// stores the values -key--value
		// it may have one null key and multiple null values
		// it maintains no order
		// hashmap is non-synchronized---not thread safe
		// concurrent modification exception--Fail Fast condition

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Selenium");
		hm.put(2, "QTP");
		hm.put(3, "TestComplete");
		hm.put(4, "RFT");

		System.out.println(hm.get(1));
		System.out.println(hm.get(4));

		for (Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		System.out.println(hm);
		hm.remove(3);
		System.out.println(hm);
		System.out.println("*****************");

		HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();
		Employee e1 = new Employee("Tom", 25, "admin");
		Employee e2 = new Employee("Jack", 30, "QA");
		Employee e3 = new Employee("Billy", 29, "Dev");

		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);

		// traverse the hashmap
		for (Entry<Integer, Employee> m : emp.entrySet()) {
			int key = m.getKey();
			Employee e = m.getValue();
			System.out.println("Employee " + key + " Info ");
			System.out.println(e.name + " " + e.age + " " + e.dept);
		}

	}

}
