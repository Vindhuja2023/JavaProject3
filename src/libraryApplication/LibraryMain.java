package libraryApplication;
import java.util.*;
public class LibraryMain {

	public static void main(String[] args) {
		LibraryOnline torontoPublic = new LibraryOnline();
		Scanner sc = new Scanner(System.in);
		String libraryFunction;
		String performAction = "Y";
		boolean logout = false;

		System.out.println("Welcome to Online Library!");
		boolean loginValidation = torontoPublic.validateLoginCredentials();
		System.out.println("-------------------------------------------------------------------------------");
		if (loginValidation == true) {

			while (performAction.equalsIgnoreCase("Y")) {
				System.out.println("Please choose your preffered function from the list below:");
				System.out.println("To view our available books categorised by genere:" + " Press 1");
				System.out.println("To get details regarding a book: " + " Press 2");
				System.out.println("To view borrowed books in hand:"+" Press 3");
				System.out.println("To Borrow a book: " + " Press 4");
				System.out.println("To return a book:" + " Press 5");
				System.out.println("Logout:" + " Press 6");
				libraryFunction = sc.next();
				switch (libraryFunction) {
				case "1":
					torontoPublic.displayBooksAsPerGenere();
					break;
				case "2":
					torontoPublic.bookDetails();
					break;
				case "3":
					torontoPublic.viewBooksBorrowed();
					break;
				case "4":
					torontoPublic.borrowBook();
					break;
				case "5":
					torontoPublic.returnBook();
					break;
				case "6":
					torontoPublic.logoutApplication();
					logout = true;
					break;
				default:
					System.out.println("Enter a valid Library function");
					break;
				}
				if (logout == true) {
					break;
				} else if (logout == false) {
					System.out.println("Do you want to perform another Library function? Press Y to continue...");
					performAction = sc.next();
				//	while()
					if (performAction.equalsIgnoreCase("N")) {
						System.out.println("Exiting the library application...");
					}
					if (!performAction.equalsIgnoreCase("Y") && (!performAction.equalsIgnoreCase("N"))) {
						System.out.println(performAction+" is an invalid selection.Exiting the library application...");
					}
				}
				System.out.println("-------------------------------------------------------------------------------");
			}
		} else {
			System.out.println("You can't borrow or return any book without logging in..." + "\n"
					+ "But you can just view the books available in our library.");
			System.out.println("Do you want to view the books available categorised by genere?(Y/N)");
			performAction = sc.next();
			while (performAction.equalsIgnoreCase("Y")) {
				torontoPublic.displayBooksAsPerGenere();
				System.out.println("Do you want to view the books available categorised by genere?(Y/N)");
				performAction = sc.next();
			}
			if (performAction.equalsIgnoreCase("N")) {
				System.out.println("Exiting from the library application.");
			}
			if (!performAction.equalsIgnoreCase("Y") && !performAction.equalsIgnoreCase("N")) {
				System.out.println(performAction + " is an Invalid selection.");
				System.out.println("Exiting from the library application." + "\n"
						+ "Please login again to perform library functions.");
			}
		}
	}


	}


