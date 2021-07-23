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

        System.out.println("Enter Yes to edit ");
        String ch = sc.nextLine();
        //Here Written Condition To Edit The Data Of Contact
        if(ch.equals("y") || ch.equals("Y")){
            address.editContact();
            System.out.println("You have Entered following data");
            System.out.println(address.person);
        }
    }
}

