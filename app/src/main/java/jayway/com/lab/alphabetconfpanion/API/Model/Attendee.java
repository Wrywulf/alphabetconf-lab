
package jayway.com.lab.alphabetconfpanion;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Attendee {

    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("fullAddress")
    @Expose
    private String fullAddress;
    @SerializedName("fullName")
    @Expose
    private String fullName;
    @SerializedName("phoneNumber")
    @Expose
    private String phoneNumber;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullAddress() {
        return fullAddress;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
