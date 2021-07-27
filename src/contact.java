
public class contact {

	  //Declaring Contact Variables
    private String firstName;
    private String lastName;
    private String addressCity;
    private String state;
    private long zip;
    private long phoneNum;
    private String email;
    
    contact(String firstName, String lastName, String addressCity, String state, long zip, long phoneNum, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.addressCity = addressCity;
        this.state = state;
        this.zip = zip;
        this.phoneNum = phoneNum;
        this.email = email;
    }

    //  Using getters and setters

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

    public void setAddressCity(String addressCity) {
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

    public void setPhoneNum(long newPhone) {
        this.phoneNum = newPhone;
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

	public boolean equalsIgnoreCase(String string) {
		// TODO Auto-generated method stub
		return false;
	}
}

