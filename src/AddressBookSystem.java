import java.util.*;

public class AddressBookSystem {
	/*
	 * Declaring Main Method
	 * Calling The addressBook Method
	 */
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome To Address Book System");
        addressBook address = new addressBook();
        address.add();

        System.out.println("Address Book data:");
        System.out.println(address.person);

        System.out.println("Enter the choice \n 1. Edit \n 2. Delete");
        int op = sc.nextInt();

        switch (op){
            case 1:
                address.editContact();
                System.out.println("You have Entered following data");
                System.out.println(address.person);
                System.out.println("Thank you for Using the Address book");
                break;
            case 2:
                address.delete();
                System.out.println("Addess Book details :"+address.person);
                break;
        }
    }
}

