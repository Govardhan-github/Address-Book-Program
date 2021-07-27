import java.util.*;

public class AddressBookSystem {
	  public static Map<String, addressBook> addressBookHashMap = new HashMap<>();
	    Scanner scanner = new Scanner(System.in);
	   /*
	    * Declaring addDataToAddressBook Method  Calling The addressBook Method
	    */
   public void addDataToAddressBook() {
        String chooseContact, chooseAddressBook;

        do {
            System.out.println("Enter the name for  AddressBook");
            String AddressBookForMap = scanner.nextLine();//
            addressBook address = new addressBook(AddressBookForMap);
            for (Map.Entry<String, addressBook> entry : addressBookHashMap.entrySet()) {
                if (entry.getKey().equals(AddressBookForMap)) {
                    address = entry.getValue();
                }
            }
            addressBookHashMap.put(AddressBookForMap, address);
            do {
                System.out.println("Enter first name:");
                String firstName = scanner.nextLine();

                System.out.println("Enter last name:");
                String lastName = scanner.nextLine();

                System.out.println("Enter address name:");
                String addressCity = scanner.nextLine();

                System.out.println("Enter state name:");
                String state = scanner.nextLine();

                System.out.println("Enter zip code:");
                long zipcode = scanner.nextInt();

                System.out.println("Enter phone number:");
               long phoneNumber = scanner.nextInt();

                System.out.println("Enter email:");
                String email = scanner.nextLine();
                
                contact contact = new contact(firstName, lastName, addressCity, state, zipcode, phoneNumber, email);

                System.out.println("Contact added successfully!!");

                for (Map.Entry<String, addressBook> entry : addressBookHashMap.entrySet()) {
                    if (entry.getKey().equalsIgnoreCase(AddressBookForMap)) {
                        entry.getValue().addContact(contact);
                    }
                }
                System.out.println("Do you want to add contact again? Yes|No");
                chooseContact = scanner.nextLine();
            } while (chooseContact.equals("yes"));
            System.out.println("Do you want to add another AddressBook Yes|No");
            chooseAddressBook = scanner.nextLine();
        } while (chooseAddressBook.equals("yes"));

        System.out.println("ADDRESS BOOK :->" + addressBookHashMap);
    }
   	/*
   	 *Declaring Main Method
   	 *Declaring Hash Map Here 
   	 */
    public static void main(String[] args) {
        System.out.println("  Welcome To AddressBook System");
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Add new contact" + "\n" + "2. Edit contact details" + "\n" + "3. Delete contact details" + "\n" +  "4. Show Contacts " + "\n" + "5. Exit" + "\n" + "Enter your choice:");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    new AddressBookSystem().addDataToAddressBook(); //Add Contact Details
                    break;
                case 2:
                    System.out.println("Enter the address book name ( AddressBook)");
                    String AddressBook = scanner.next();

                    System.out.println("Enter First Name of the contact you want to edit");
                    String checkName1 = scanner.next();

                    for (Map.Entry<String,addressBook> entry : addressBookHashMap.entrySet()) {
                        if(entry.getKey().equalsIgnoreCase(AddressBook)) {
                            entry.getValue().editContactByFirstName(checkName1);
                        }else {
                            System.out.println("The"+ AddressBook +" address book does not present.");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Enter the address book name ( AddressBook)");
                     AddressBook = scanner.next();

                    System.out.println("Enter First Name of the contact you want to delete");
                    String checkName2 = scanner.next();

                    for (Map.Entry<String,addressBook> entry : addressBookHashMap.entrySet()) {
                        if(entry.getKey().equalsIgnoreCase(AddressBook)) {
                            entry.getValue().deleteContact(checkName2);
                        }else {
                            System.out.println("The"+ AddressBook +" address book does not exist.");
                        }
                    }
                    break;
                case 4:
                    System.out.println(Collections.singletonList(addressBookHashMap)); 
                    System.out.println(Collections.singletonList(addressBookHashMap)); 
                    for (Map.Entry<String,addressBook> entry : addressBookHashMap.entrySet()) {
                        System.out.println(entry.getKey() + "\t" + entry.getValue().getAddressBook()); }
                    break;
            }
        } while(choice != 5);
    }
}
