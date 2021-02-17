import java.util.*;

public class AddressBookSystemMain {
	public static Scanner personContact = new Scanner(System.in);
	Contact contact = new Contact("firstName", "lastName", "address", "city", "state", "email address", 0, 0);
	List<Object> listOfContact = new ArrayList<>();
	
	public void takingOption() {
		System.out.println("Enter your option: ");
		System.out.println("1.Add Contact");
		System.out.println("2.Display Contacts");
		int option = personContact.nextInt();
		switch(option) {
		case 1:
			addingContact();
			break;
		case 2:
			displayContact();
			break;
		default:
			break;
		}
		takingOption();
	}
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
		System.out.println(listOfContact);
	}

	public static void main(String[] args) {
		System.out.println("Welcome to address book system");
		AddressBookSystemMain contactDetails = new AddressBookSystemMain();
		contactDetails.takingOption();
	}

}
