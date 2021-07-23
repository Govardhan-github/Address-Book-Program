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

    }
    /*
     * Declaring editContact Method To Edit The Data
     */
    public void editContact() {
        System.out.println("Enter the firstName of person");
        String editName = sc.nextLine();
        if (editName.equalsIgnoreCase(person.getFirstName())) {
            add();
        } else {
            System.out.println("The name does not match the AddressBook");
            System.out.println("Please enter valid First Name");
            editContact();
        }
 }
      //method To Delete The contact
        public void delete() {
            System.out.println("Enter firstName of the person");
            String editName = sc.nextLine();
            if (editName.equals(person.getFirstName())) {
                System.out.println("Deleted " + person.getFirstName() + " details");
                person = null;
            }
     }
}