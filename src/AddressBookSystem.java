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
        //Calling getMenu Method And Show Contact Method To Show The Content
        address.getMenu();
        address. showContact();
	}
}
