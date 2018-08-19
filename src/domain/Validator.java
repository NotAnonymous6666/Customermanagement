package domain;

public class Validator {
	
	public void validate(Client client) {
		
		String errors = "";
		
		if(client.getFirstName().isEmpty()) {
			errors += "First Name cannot be empty!" + "\n";
		}
		
		if(client.getLastName().isEmpty()) {
			errors += "Last Name cannot be empty!" + "\n";
		}
		
		String phoneNumber = client.getPhoneNumber();
		
		for(int i = 0; i < phoneNumber.length(); i++) {
			if(!Character.isDigit(phoneNumber.charAt(i))) {
				errors += "Phone number is invalid!" + "\n";
				break;
			}
		}
		
		if(phoneNumber.length() != 10) errors += "Phone number must have exactly 10 digits!" + "\n";
		
		if(errors.length() > 0) throw new Error(errors);
		
	}

}
