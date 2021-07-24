import java.util.*;

public class addressBook extends contacts {
	/*
	 * Declaring AddressBook Class Here
	 */
	 contacts contact = new contacts();
    Scanner sc = new Scanner(System.in);
    
    
    // Arraylist to store multiple contacts
    ArrayList<contactDetails> contactList = new ArrayList<>();

    /*
     * Declaring Add Method
     */
    public contacts addContact() {
        System.out.println("Enter the details of the contact");{
    	//Using Scanner To Enter The Contact Details
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
        contactList.add(new contacts(firstName, lastName, addressCity, state, zip, phoneNumber, email));

        contact.setFirstName(firstName);
        contact.setLastName(lastName);
        contact.setAddressCity(addressCity);
        contact.setState(state);
        contact.setZip(zip);
        contact.setPhoneNum(phoneNumber);
        contact.setEmail(email);

        return contact;

    }}
        
    /*
     * Declaring editContact Method To Edit The Data
     */
    public void editContact() {
    	System.out.println(" Enter the first name of the contact : ");
        String contactFirstName = sc.next();
      
        if (contactList.isEmpty()) {
            System.out.println(" Contact List is Empty! ");
        } else {
            for (contactDetails contact : contactList) {
                String checkName = contact.getFirstName();

                if (checkName.equalsIgnoreCase(contactFirstName)) {

                    System.out.print("Enter New First Name: ");
                    String firstName = sc.next();

                    System.out.print("Enter New Last Name: ");
                    String lastName = sc.next();

                    System.out.print("Enter New AddressCity: ");
                    String address = sc.next();

                    System.out.print("Enter New State: ");
                    String state = sc.next();

                    System.out.print("Enter New Zip Code of area: ");
                    Long zip = sc.nextLong();

                    System.out.print("Enter New Mobile Number: ");
                    Long phoneNum = sc.nextLong();

                    System.out.print("Enter New Email Id: ");
                    String email = sc.next();

                    contact.setFirstName(firstName);
                    contact.setLastName(lastName);
                    contact.setAddressCity(address);
                    contact.setState(state);
                    contact.setZip(zip);
                    contact.setPhoneNum(phoneNum);
                    contact.setEmail(email);

                    System.out.println("Contact List Updated! ");
                } else {
                    System.out.println(" Name not found. Enter Valid Name");
                }
            }
        }
    }

    /*
     * Declaring editContact Method To Delete The Data
     */    
    public void deleteContact() {
        System.out.println("Enter the name of the contact to be deleted : ");
        String deleteName = sc.next();
        if (contactList.isEmpty()) {
            System.out.println("The AddressBook is Empty....!");
        } else {
            for (int i = 0; i < contactList.size(); i++) {
                String matcher = contactList.get(i).getFirstName();
                if (matcher.equalsIgnoreCase(deleteName)) {
                    contactList.remove(i);
                    System.out.println("Contact Deleted Successfully...");
                } else {
                    System.out.println("Name Not Found");
                }
            }
        }
    }
    /*
     * Declaring Show Contact Method To Show The Data
     */
    public void showContact() {
        System.out.println("Total Number of Contacts : " + contactList.size());
        System.out.println("---------------------------------------------------");
        if (contactList.isEmpty()) {
            System.out.println("There are no contacts in the contact list");
        } else {
            System.out.println(contactList);
            System.out.println("\n---------------------------------------------");
        }
    }

    /*
     * Declaring get Menu Method To Display The Content Of Data
     */
    public void getMenu() {
        boolean exit = false;
        do {
            System.out.println("Choose the valid option \n1. Add Contacts \n2. Edit Contact \n3. Delete Contact \n4. View Contacts \n5. Exit ");
            int option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    addContact();
                    System.out.println("Contact added successfully....");
                    break;
                case 2:
                    editContact();
                    System.out.println("Contact details updated successfully");
                    break;
                case 3:
                    deleteContact();
                    break;
                case 4:
                    showContact();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.print("Enter the valid option!");
                    break;
            }
        } while (!exit);
    }

}
  
            