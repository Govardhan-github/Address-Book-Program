import java.util.Scanner;

public class addressBook {
	/*
	 * Declaring AddressBook Class Here
	 */
	contactDetails person;
    Scanner sc = new Scanner(System.in);
    
    /*
     * Declaring Add Method
     */
    public void add(){
    	//Using Scanner To Enter The Contact Details
        person = new contactDetails();

        System.out.println("Enter First Name: ");
        String firstName = sc.nextLine();
        System.out.println("Enter last Name: ");
        String lastName = sc.nextLine();
        System.out.println("Enter your addressCity: ");
        String addressCity = sc.nextLine();
        System.out.println("Enter your state: ");
        String state = sc.nextLine();
        System.out.println("Enter zip code : ");
        Long zip = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter phone number: ");
        Long phoneNumber = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter your EMail ID: ");
        String email = sc.nextLine();

        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setAddressCity(addressCity);
        person.setState(state);
        person.setZip(zip);
        person.setPhoneNum(phoneNumber);
        person.setEmail(email);

        System.out.println(person);
    }
}


