package phonebook;

public class Person {
	private String firstName;
	private String middleName;
	private String lastName;
	private long phoneNumber;
	private String email;
	private Address address;
	
	public Person() {
		
	}

	public Person(String firstName,String middleName, String lastName, long phoneNumber, String email) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	
	public void addAddress(int streetNum, String streetName, String city, String state, int zipCode) {
		Address temp = new Address(streetNum, streetName, city, state, zipCode);
		address = temp;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getMiddleName() {
		return middleName;
	}
	
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getFullName() {
		return firstName + middleName + lastName;
	}
	
	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void printPerson() {
		System.out.println("\nFirst Name: " + firstName + "\nMiddle Name: " + middleName + "\nLast Name: " + lastName + "\nPhone Number: " + phoneNumber + 
				"\nEmail: " + email);
		System.out.println("------------------------------");
	}

}
