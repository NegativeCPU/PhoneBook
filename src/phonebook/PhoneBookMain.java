package phonebook;

import java.util.Scanner;

public class PhoneBookMain {

	public static void main(String[] args) {
		int mainMenuChoice = 0;
		String firstName = "";
		String middleName = "";
		String lastName = "";
		long phoneNumber = 0;
		String city = "";
		String state = "";

		Person p1 = new Person("Joyce", "J", "Byers", 16185550001L, "joyce.j.byers@hawkinslab.net");
		p1.addAddress(11, "CrazyABC'Ln", "Hawkins", "IN", 62025);

		Person p2 = new Person("Jim", "J", "Hopper", 16185550002L, "jim.j.hopper@hawkinslab.net");
		p2.addAddress(12, "MiddleO'Woods", "Hawkins", "IN", 62025);

		Directory d1 = new Directory();
		d1.addPerson(p1);
		d1.addPerson(p2);

		d1.printAlphabetArray(d1.book);

		while (mainMenuChoice != 11) {

			try {
				Scanner in = new Scanner(System.in);
				mainMenu();
				System.out.print("Enter choice: ");
				mainMenuChoice = in.nextInt();
				
				if (mainMenuChoice < 0 || mainMenuChoice > 11) {
					System.out.println("\nPlease enter a choice between 1 - 11\n");
				}

				switch (mainMenuChoice) {
				case 1:
					d1.printAlphabetArray(d1.book);
					break;

				case 2:
					System.out.print("Enter First Name: ");
					String newFirst = in.next();
					System.out.print("Enter Middle Name: ");
					String newMiddle = in.next();
					System.out.print("Enter Last Name: ");
					String newLast = in.next();
					System.out.print("Enter Phone Number: ");
					long newPhone = in.nextLong();
					System.out.print("Enter Email: ");
					String newEmail = in.next();
					System.out.print("Enter Street Number: ");
					int newStreetNum = in.nextInt();
					System.out.print("Enter Street Name: ");
					String newStreetName = in.next();
					System.out.print("Enter City: ");
					String newCity = in.next();
					System.out.print("Enter State: ");
					String newState = in.next();
					System.out.print("Enter Zip Code: ");
					int newZip = in.nextInt();

					Person p3 = new Person(newFirst, newMiddle, newLast, newPhone, newEmail);
					p3.addAddress(newStreetNum, newStreetName, newCity, newState, newZip);

					d1.addPerson(p3);

					break;

				case 3:
					d1.printAlphabetArray(d1.book);
					System.out.print("Enter a Phone Number to Edit Record: ");
					phoneNumber = in.nextLong();
					int editChoice = d1.searchPhone(phoneNumber);

					System.out.print("Enter First Name: ");
					newFirst = in.next();
					System.out.print("Enter Middle Name: ");
					newMiddle = in.next();
					System.out.print("Enter Last Name: ");
					newLast = in.next();
					System.out.print("Enter Phone Number: ");
					newPhone = in.nextLong();
					System.out.print("Enter Email: ");
					newEmail = in.next();
					System.out.print("Enter Street Number: ");
					newStreetNum = in.nextInt();
					System.out.print("Enter Street Name: ");
					newStreetName = in.next();
					System.out.print("Enter City: ");
					newCity = in.next();
					System.out.print("Enter State: ");
					newState = in.next();
					System.out.print("Enter Zip Code: ");
					newZip = in.nextInt();

					Person p4 = new Person(newFirst, newMiddle, newLast, newPhone, newEmail);
					p4.addAddress(newStreetNum, newStreetName, newCity, newState, newZip);

					d1.book[editChoice] = p4;

					break;

				case 4:
					d1.printAlphabetArray(d1.book);

					System.out.print("Enter a Phone Number to Delete Record: ");
					phoneNumber = in.nextLong();
					int deleteChoice = d1.searchPhone(phoneNumber);
					d1.book = d1.deletePerson(deleteChoice);

					break;

				case 5:
					System.out.print("Enter First Name: ");
					firstName = in.next();

					d1.searchFirstName(firstName);

					break;
				case 6:
					System.out.print("Enter Last Name: ");
					lastName = in.next();

					d1.searchLastName(lastName);

					break;
				case 7:
					System.out.print("Enter First Name: ");
					firstName = in.next();
					System.out.print("Enter Middle Name: ");
					middleName = in.next();
					System.out.print("Enter Last Name: ");
					lastName = in.next();

					d1.searchFullName(firstName, middleName, lastName);

					break;
				case 8:
					System.out.print("Enter phone number (x-xxx-xxx-xxxx): ");
					phoneNumber = in.nextLong();

					d1.searchPhone(phoneNumber);

					break;
				case 9:
					System.out.print("Enter City: ");
					city = in.next();

					d1.searchCity(city);

					break;
				case 10:
					System.out.print("Enter State: ");
					state = in.next();

					d1.searchState(state);

					break;

				default:
					break;

				}

			} catch (Exception e) {
				System.out.println("\nInvalid entry\n");
			}
		}

	}

	public static void mainMenu() {
		System.out.println("1. Print Directory");
		System.out.println("2. Add new entry");
		System.out.println("3. Edit entry");
		System.out.println("4. Delete entry");
		System.out.println("5. Search by First Name");
		System.out.println("6. Search by Last Name");
		System.out.println("7. Search by Full Name");
		System.out.println("8. Search by Telephone Number");
		System.out.println("9. Search by City");
		System.out.println("10. Search by State");
		System.out.println("11. Exit Program");
	}

}
