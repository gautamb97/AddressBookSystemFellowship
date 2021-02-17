import java.util.*;
public class AddressBookSystemMain {
	public static Scanner personContact = new Scanner(System.in);
	Contact contact = new Contact("firstName","lastName","address","city","state","email address",0,0);
	List<Object> listOfContact = new ArrayList<>();
	
	public void addingContact() {
		contact.creatingContact();
		contact.getFirstName();
		contact.getLastName();
		contact.getAddress();
		contact.getCity();
		contact.getState();
		contact.getEmail();
		contact.getZipCode();
		contact.getPhoneNumber();
		listOfContact.add(contact);
	}
	
	public void displayContact() {
		addingContact();
		System.out.println(listOfContact);
	}

	public static void main(String[] args) {
		System.out.println("Welcome to address book system");
		AddressBookSystemMain contactDetails = new AddressBookSystemMain();
		contactDetails.displayContact();
	}

}
