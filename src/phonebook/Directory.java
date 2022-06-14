package phonebook;

import java.util.Arrays;

public class Directory {
	
	Person[] book = new Person[0];
	
	public void addPerson(Person newPerson) {
		Person[] temp = new Person[book.length + 1];
		
		for (int i = 0; i < book.length; i++) {
			temp[i] = book[i];
		}
		
		temp[temp.length - 1] = newPerson;
		
		book = temp;
		
	}
	
	public Person[] deletePerson(int index) {

		if (book == null || index < 0) {
			return book;
		}
		
		Person [] temp = new Person[book.length - 1];
		
		for (int i = 0, k = 0; i < book.length; i++) {
			
			
			if (i == index) {
				continue;
			}
			temp[k++] = book[i];
		}
		
		return temp;
		
	}
	
	public Person[] getPerson()	{
		return book;
	}
	
	public void printDirectory() {
		for (int i = 0; i < book.length; i++) {
			book[i].printPerson();
		}
	}
	
	public void searchFirstName(String name) {
		boolean nameFound = false;
		for (int i = 0; i < book.length; i++) {
			if (book[i].getFirstName().equals(name)) {
				book[i].printPerson();
				nameFound = true;
			} 
			
		}
		if (!nameFound) {
			System.out.println("Name not found");
		}
	}
	
	public void searchLastName(String name) {
		boolean nameFound = false;
		for (int i = 0; i < book.length; i++) {
			if (book[i].getLastName().equals(name)) {
				book[i].printPerson();
				nameFound = true;
			}
		}
		if (!nameFound) {
			System.out.println("Name not found");
		}
	}
	
	public void searchFullName(String first, String middle, String last) {
		boolean nameFound = false;
		String fullName = first + middle + last;
		for (int i = 0; i < book.length; i++) {
			if (book[i].getFullName().equals(fullName)) {
				book[i].printPerson();
				nameFound = true;
			}
		}
		if (!nameFound) {
			System.out.println("Name not found");
		}
	}
	
	public int searchPhone(long phoneNumber) {
		boolean phoneFound = false;
		for (int i = 0; i < book.length; i++) {
			if (book[i].getPhoneNumber() == phoneNumber) {
				book[i].printPerson();
				phoneFound = true;
				return i;
			}
		}
		if (!phoneFound) {
			System.out.println("Phone number not found");
		}
		return 0;
	}
	
	public void searchCity(String city) {
		boolean cityFound = false;
		for (int i = 0; i < book.length; i++) {
			if (book[i].getAddress().getCity().equals(city)) {
				book[i].printPerson();
				cityFound = true;
			}
		}
		if (!cityFound) {
			System.out.println("City not found");
		}
	}
	
	public void searchState(String state) {
		boolean stateFound = false;
		for (int i = 0; i < book.length; i++) {
			if (book[i].getAddress().getState().equals(state)) {
				book[i].printPerson();
				stateFound = true;
			}
		}
		if (!stateFound) {
			System.out.println("State not found");
		}
	}
	
	public void printAlphabetArray(Person[] list) {
		String[] alphabet = new String[list.length];
		// populate temp array
		for (int i = 0; i < list.length; i++) {
			alphabet[i] = list[i].getLastName();
		}
		
		// sorts them alphabetically
		Arrays.sort(alphabet);
		
		//print each person in the new array
		for (int i = 0; i < alphabet.length; i++) {
			for (int j = 0; j < book.length; j++) {
				if (alphabet[i] == book[j].getLastName()) {
					book[j].printPerson();
				}
			}
		}
	}
	
}
