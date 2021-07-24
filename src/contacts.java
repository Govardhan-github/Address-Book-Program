
public class contacts extends contactDetails {

	
	//variable Declaration
    private String firstName;
    private String lastName;
    private String addressCity;
    private String state;
    private Long zip;
    private Long phoneNum;
    private String email;

    public contacts(String firstName, String lastName, String addressCity, String state, Long zipCode, Long phoneNumber, String email) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.addressCity = addressCity;
        this.state = state;
        this.zip = zipCode;
        this.phoneNum = phoneNum;
        this.email = email;
    }

    public contacts() {

    }
	

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
	