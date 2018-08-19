package domain;

public class Client {
	
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private Address address;
	
	public Client(String firstName, String lastName, String phoneNumber, Address address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	
	public Address getAddress() {
		return this.address;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public String toString() {
		return "First Name : " + this.firstName + "\n" + "Last Name : " + this.lastName + "\n" + "Phone number : " + this.phoneNumber + "\n" + "~~~~Address~~~~" + "\n" + this.address.toString();
	}

}
