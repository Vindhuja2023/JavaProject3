package canadaWonderLand;

import java.util.Scanner;

import canadaWonderLand.TicketsAndPasses.TypeOfAdmission;

public class MainPark {

	public static void main(String[] args) {
		
		int age = 0;
		double finalPrice = 0.0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Tickets and passes are available in three category, which one you prefer?");
		System.out.println(TypeOfAdmission.SEASON_PASS.getAdmissionType() + ","
				+ TypeOfAdmission.DAILY_TICKETS.getAdmissionType() + "," + TypeOfAdmission.GROUPS.getAdmissionType());
		String admissionType = sc.next();

		System.out.println("Please select User catogery :  Adult/Child ");
		String userType = sc.next();
		TicketsAndPasses customer = new TicketsAndPasses(userType);
		customer.displayTicketPriceses();
		
		if (userType.equalsIgnoreCase("Child")) {
			System.out.println("Enter the age of Child");
			age = sc.nextInt();
			finalPrice = customer.calculateTicketPrice(userType, age, admissionType);
		}else {
		System.out.println("Are you an employee of Canada's wonderland? Y/N");
		String isEmployee = sc.next();
		
		if (isEmployee.equalsIgnoreCase("N")) {
			System.out.println("You are identifying as a non employee of Canada's wonderland.");
			finalPrice = customer.calculateTicketPrice(userType, admissionType);

		}
		else if (isEmployee.equalsIgnoreCase("Y")) {
			int[] employeeIdList = { 23456, 12345, 90876, 45673, 76854 };
			String[] employeeNameList = { "Aira", "Lucka", "Zoya", "Aadhi", "Kiara" };
			System.out.println("Enter Employee ID : ");
			int employeeId = sc.nextInt();
			System.out.println("Enter Employee Name :");
			String employeeName = sc.next();
			EmployeePortal employee = new EmployeePortal(employeeId, employeeName, false);

			boolean isValidationSucess = employee.employeeLogIn(employeeIdList, employeeNameList);
			if (isValidationSucess == true) {
				System.out.println("Employees can have 10% discount on tickets");
				finalPrice = customer.calculateTicketPrice(admissionType);
			} else {
				System.out.println("Employee log in failed");
			}
		}  
			
		 else {
			System.out.println("Invalid entry for purchasing the admission ticket");
		}}
		System.out.println("Your final bill amount is " + finalPrice);
		String[] ridesAvailable = { "Behemoth", "Black hole", "Blast off" };
		Rides ride = new Rides(ridesAvailable);
		ride.displayRidesAvailable();

		sc.close();
	}

}
