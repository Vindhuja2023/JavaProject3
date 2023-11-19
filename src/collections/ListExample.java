package collections;
import java.util.*;
public class ListExample {
	public static void main(String[] args) {

		Employee vaishnavi = new Employee(101, "Navi");
		Employee manvir = new Employee(201, "Manvir");
		Employee sandeep = new Employee(301, "Sandy");

		Employee[] employees = { vaishnavi, manvir, sandeep };

		ArrayList<Employee> listOfEmployee = new ArrayList<Employee>();

		listOfEmployee.add(sandeep);
		listOfEmployee.add(manvir);
		listOfEmployee.add(vaishnavi);
		listOfEmployee.add(0, new Employee(401, "Aman"));

		printEmployeeNameWhoWillGetPaid(listOfEmployee);

		hulalala(vaishnavi);

		List<String> students = new ArrayList<>();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the info");

		String nameOfStudent = sc.next();

		students.add(nameOfStudent);

		System.out.println(students.get(0).equals("Manpreet"));

		System.out.println("------------- Linked List -------------------");

		LinkedList<String> linekdListExample = new LinkedList<>();
		linekdListExample.add("Gladiator");
		linekdListExample.add("Saving Private Ryan");
		linekdListExample.add("Schindler List");
		linekdListExample.add("Piano");

		for (String nameoFMovie : linekdListExample) {
			System.out.println(nameoFMovie);
		}
		linekdListExample.addFirst("Inception");
		linekdListExample.addLast("Mission Impossible");
		
		
		linekdListExample.removeFirst();
		
		
		System.out.println("------------- Linked List 2-------------------");
		for (String nameoFMovie : linekdListExample) {
			System.out.println(nameoFMovie);
		}

	}

	public static void printEmployeeNameWhoWillGetPaid(List<Employee> employees) {
		for (int i = 0; i < employees.size(); i++) {
			System.out.println(employees.get(i).getName());
		}
	}

	public static void printEmployeeNameWhoWillGetPaid(Employee[] employees) {
		for (Employee employee : employees) {
			if (employee.getName().equals("Manvir")) {
				employee.issuePayCheck();
			}
		}
	}

	public static void hulalala(Employee employee) {
		System.out.println(employee.getName());
	}
}
