package domain;

public class Address {

	private String city;
	private String street;
	private int number;
	private int apartment;
	
	public Address(String city, String street, int number, int apartment) {
		this.city = city;
		this.street = street;
		this.number = number;
		this.apartment = apartment;
	}
	
	public String getCity() {
		return this.city;
	}
	
	public String getStreet() {
		return this.street;
	}
	
	public int getNumber() {
		return this.number;
	}
	
	public int getApartment() {
		return this.apartment;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public void setApartment(int apartment) {
		this.apartment = apartment;
	}
	
	public String toString() {
		return "City : " + this.city + " , " + "Street : " + this.street + " , " + "Number : " + this.number + " , " + "Apartment : " + this.apartment + "\n";
	}
}
