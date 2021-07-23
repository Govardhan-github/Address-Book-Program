import java.util.*;

public class AddressBookSystem {
	public static void main(String[] args){
        System.out.println("Welcome To Address Book System");
        contactDetails person = new contactDetails();

        person.setFirstName("Govardhan Reddy");
        person.setLastName("Bajjuri");
        person.setAddressCity("Hyderabad");
        person.setState("Telangana");
        person.setZip(508204);
        person.setPhoneNumber("9666110767");
        person.setEmail("gopi@gmail.com");

        System.out.println(person);
    }
}

