package canadaWonderLand;

public class EmployeePortal {

	private int employeeId;
	private String nameOfTheEmployee;
	private boolean isEmployeeLogInSuccessfull;

	public EmployeePortal(int employeeId, String nameOfTheEmployee, boolean isEmployeeLogInSuccessfull) {
		super();
		this.employeeId = employeeId;
		this.nameOfTheEmployee = nameOfTheEmployee;
		this.isEmployeeLogInSuccessfull = isEmployeeLogInSuccessfull;
	}

	boolean employeeLogIn(int[] employeeIdList, String[] employeeNameList) {
		for (int i = 0; i < employeeIdList.length; i++) {

			if (employeeId == employeeIdList[i] && nameOfTheEmployee.equalsIgnoreCase(employeeNameList[i])) {
				isEmployeeLogInSuccessfull = true;

			} else {
				isEmployeeLogInSuccessfull = false;
			}

		}
		return isEmployeeLogInSuccessfull;
	}
}