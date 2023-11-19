package hashmapAndList;

import java.util.*;
import java.util.Map.Entry;

public class HashmapExmp {
	public static void main(String[] args) {

//		ArrayList<String> names = new ArrayList<>();
//
//		names.add("Vindhuja");
//		names.add("Vishnu");
//		names.add("Vineeth");
//		names.add("Vindhya");
//
//		ArrayList<String> fruits = new ArrayList<>();
//
//		fruits.add("Apple");
//		fruits.add("Orange");
//		fruits.add("Grape");
//		fruits.add("Plum");
//
//		HashMap<Integer, ArrayList<String>> hm = new HashMap<>();
//
//		hm.put(201, names);
//		hm.put(301, fruits);
//
//		for (Map.Entry<Integer, ArrayList<String>> entry : hm.entrySet()) {
//
//			if (entry.getKey() == 301) {
//				for (String fruit : fruits) {
//					System.out.println(fruit);
//				}
//			}
////			keyType key = entry.getKey();
////			valType val = entry.getValue();
//
//		}

		Employee a = new Employee(1, "A");
		Employee b = new Employee(2, "B");
		Employee c = new Employee(3, "C");
		Employee d = new Employee(4, "D");

		Manager m1 = new Manager(11, "M1", "Health");
		Manager m2 = new Manager(22, "M2", "IT");

		ArrayList<Employee> emp1 = new ArrayList<Employee>();
		emp1.add(a);
		emp1.add(b);
		ArrayList<Employee> emp2 = new ArrayList<Employee>();
		emp2.add(c);
		emp2.add(d);

		HashMap<Manager, ArrayList<Employee>> hm = new HashMap<>();
		hm.put(m1, emp1);
		hm.put(m2, emp2);

		for (Entry<Manager, ArrayList<Employee>> connect : hm.entrySet()) {

			if (connect.getKey().getName().equals("M2")) {
				List<Employee> employee = connect.getValue();
				for (int i = 0; i < employee.size(); i++) {
					System.out.println(employee.get(i).getName());
				}

			}
//			Manager key = connect.getKey();
//			ArrayList<Employee> val = connect.getValue();

		}

	}

}
