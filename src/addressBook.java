import java.util.*;
/*
 * Declaring AddressBook Class Here
 */
public class addressBook {
	
    Scanner sc = new Scanner(System.in);
    public String name;

    
    // Arraylist to store multiple contacts
    
   public ArrayList<contact> addressBook = new ArrayList<>();

    //Here Declaring Constructor To Initialize The Name
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
        System.out.println("ADDRESS BOOK---> " + addressBook);
        for (contact contact1 : addressBook) {
            System.out.println("CONTACT LIST---> " + contact1);
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
                            contact.setAddressCity(newAddress);
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
                            long newZipcode = sc.nextLong();
                            contact.setZip(newZipcode);
                            System.out.println(contact);
                            break;

                        case 7:
                            System.out.println("Enter new phone number :");
                            long newPhone = sc.nextLong();
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

    // DELETE contact from the address book by the FIRSTNAME
    public void deleteContact(String firstname) {
    	 Iterator i = addressBook.iterator();
    	 while(i.hasNext()) 
    	 {
    		 String AddressBook = "";
			if(i.equals(AddressBook))
    		 {
    			 i.remove();
    			 System.out.println(i);
    		 }
    	 }   
    }
}
         