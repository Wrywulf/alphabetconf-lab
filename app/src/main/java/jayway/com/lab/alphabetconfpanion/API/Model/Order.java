
package jayway.com.lab.alphabetconfpanion;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Order {

    @SerializedName("attendees")
    @Expose
    private List<Attendee> attendees = null;
    @SerializedName("company")
    @Expose
    private String company;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("orderStatus")
    @Expose
    private String orderStatus;
    @SerializedName("poNumber")
    @Expose
    private String poNumber;
    @SerializedName("price")
    @Expose
    private Integer price;
    @SerializedName("tenant")
    @Expose
    private String tenant;
    @SerializedName("weekdays")
    @Expose
    private String weekdays;

    public List<Attendee> getAttendees() {
        return attendees;
    }

    public void setAttendees(List<Attendee> attendees) {
        this.attendees = attendees;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getPoNumber() {
        return poNumber;
    }

    public void setPoNumber(String poNumber) {
        this.poNumber = poNumber;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getTenant() {
        return tenant;
    }

    public void setTenant(String tenant) {
        this.tenant = tenant;
    }

    public String getWeekdays() {
        return weekdays;
    }

    public void setWeekdays(String weekdays) {
        this.weekdays = weekdays;
    }

}
