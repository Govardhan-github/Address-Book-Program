import java.util.*;

public class addressBook {
	/*
	 * Declaring AddressBook Class Here
	 */
    Scanner sc = new Scanner(System.in);
    public String name;

    
    // Arraylist to store multiple contacts
    public ArrayList<contact> addressBook = new ArrayList<>();

    
    public addressBook(String name) {
        this.name = name;
    }

    public ArrayList<contact> getAddressBook() {
        return addressBook;
    }
    /*
     * Declaring Add Method
     */
    public void addContact(contact contact) {
        for (contact value : addressBook) {
            if (value.equals(contact)) {
                System.out.println("The person already exists!!!");
            }
        }
        addressBook.add(contact);
        System.out.println("ADDRESS BOOK-----> " + addressBook);
        for (contact contact1 : addressBook) {
            System.out.println("CONTACT LIST------> " + contact1);
        }
    }

        
    /*
     * Declaring editContact Method To Edit The Data
     */
    public void editContactByFirstName(String firstname) {
        String checkName;
        Integer choice;
        for (contact contact : addressBook) {
            checkName = contact.getFirstName();
            if (firstname.equalsIgnoreCase(checkName)) {
                do {

                    System.out.println("1. Edit First name" + "\n" + "2. Edit Last name" + "\n" + "3. Edit addressCity " + "\n" + "4. Edit State" + "\n" + "5. Edit Zipcode " + "\n" + "6. Edit Phone Number" + "\n" + "7. Edit Email" + "0. EXIT" + "\n" + "Enter your choice :");
                    choice = sc.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("Enter new first name:");
                            String newFirstName = sc.next();
                            contact.setFirstName(newFirstName);
                            System.out.println(contact);
                            break;

                        case 2:
                            System.out.println("Enter new last name:");
                            String newLastName = sc.next();
                            contact.setLastName(newLastName);
                            System.out.println(contact);
                            break;

                        case 3:
                            System.out.println("Enter new address:");
                            String newAddress = sc.next();
                            contact.setaddressCity(newAddress);
                            System.out.println(contact);
                            break;

                        case 5:
                            System.out.println("Enter new state:");
                            String newState = sc.next();
                            contact.setState(newState);
                            System.out.println(contact);
                            break;

                        case 6:
                            System.out.println("Enter new zipcode:");
                            String newZipcode = sc.next();
                            contact.setzip(newZip);
                            System.out.println(contact);
                            break;

                        case 7:
                            System.out.println("Enter new phone number :");
                            String newPhone = sc.next();
                            contact.setPhoneNum(newPhone);
                            System.out.println(contact);
                            break;

                        case 8:
                            System.out.println("Enter new email id:");
                            String newEmail = sc.next();
                            contact.setEmail(newEmail);
                            System.out.println(contact);
                            break;
                    }
                } while (!choice.equals(0));
                System.out.println(contact);
            } else {
                System.out.println("There is no contact named  " + firstname + ". Try Again !!");
            }
        }
    }


    /*
     * Declaring editContact Method To Delete The Data
     */    
    // DELETE contact from the address book by the FIRSTNAME
    public void deleteContact(String firstname) {
        String checkName2;
        for (contact contact : addressBook) {
            checkName2 = contact.getFirstName();
            System.out.println(checkName2);
            if (firstname.equalsIgnoreCase(checkName2)) {
                addressBook.remove(contact);
                System.out.println("Contact name " + firstname + "deleted successfully from the contact list");
            } else {
                System.out.println("No any user belongs to this " + firstname + " mail id Try Again !!");
            }
        }
    }
