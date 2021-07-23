
public class contactDetails {

	    //declaring contact details variables
	    private String firstName;
	    private String lastName;
	    private String addressCity;
	    private String state;
	    private long zip;
	    private long phoneNum;
	    private String email;

	    // access private fields using getters and setters

	    public String getFirstName() {
	        return firstName;
	    }

	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }

	    public String getLastName() {
	        return lastName;
	    }

	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }

	    public String getAddressCity() {
	        return addressCity;
	    }

	    public void setAddressCity(String address) {
	        this.addressCity = addressCity;
	    }
	    public String getState() {
	        return state;
	    }

	    public void setState(String state) {
	        this.state = state;
	    }

	    public long getZip() {
	        return zip;
	    }

	    public void setZip(long zip) {
	        this.zip = zip;
	    }

	    public long getPhoneNum() {
	        return phoneNum;
	    }

	    public void setPhoneNum(long phoneNum) {
	        this.phoneNum = phoneNum;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String s) {
	        this.email =email;
	    }

	    //Overridden Java toString method

	    @Override
	    public String toString() {
	        return "ContactDetails{" +
	                "firstName='" + firstName + '\'' +
	                ", lastName='" + lastName + '\'' +
	                ", addressCity='" + addressCity + '\'' +
	                ", state='" + state + '\'' +
	                ", zip=" + zip +
	                ", phoneNum='" + phoneNum + '\'' +
	                ", email='" + email + '\'' +
	                '}';
	    }
	}