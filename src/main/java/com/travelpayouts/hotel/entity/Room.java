
package com.travelpayouts.hotel.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Room {

    @SerializedName("bookingURL") @Expose private String bookingURL;
    @SerializedName("options") @Expose private Options options;
    @SerializedName("type") @Expose private String type;
    @SerializedName("tax") @Expose private Integer tax;
    @SerializedName("desc") @Expose private String desc;
    @SerializedName("fullBookingURL") @Expose private String fullBookingURL;
    @SerializedName("agencyName") @Expose private String agencyName;
    @SerializedName("agencyId") @Expose private String agencyId;
    @SerializedName("total") @Expose private Integer total;
    @SerializedName("price") @Expose private Integer price;
    @SerializedName("internalTypeId") @Expose private String internalTypeId;

    public String getBookingURL() {
        return bookingURL;
    }
    public void setBookingURL(String bookingURL) {
        this.bookingURL = bookingURL;
    }

    public Options getOptions() {
        return options;
    }
    public void setOptions(Options options) {
        this.options = options;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public Integer getTax() {
        return tax;
    }
    public void setTax(Integer tax) {
        this.tax = tax;
    }

    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getFullBookingURL() {
        return fullBookingURL;
    }
    public void setFullBookingURL(String fullBookingURL) {
        this.fullBookingURL = fullBookingURL;
    }

    public String getAgencyName() {
        return agencyName;
    }
    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public String getAgencyId() {
        return agencyId;
    }
    public void setAgencyId(String agencyId) {
        this.agencyId = agencyId;
    }

    public Integer getTotal() {
        return total;
    }
    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getPrice() {
        return price;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getInternalTypeId() {
        return internalTypeId;
    }
    public void setInternalTypeId(String internalTypeId) {
        this.internalTypeId = internalTypeId;
    }
}
