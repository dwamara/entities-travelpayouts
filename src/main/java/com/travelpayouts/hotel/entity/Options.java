
package com.travelpayouts.hotel.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Options {
    @SerializedName("available") @Expose private Integer available;
    @SerializedName("deposit") @Expose private Boolean deposit;
    @SerializedName("refundable") @Expose private Boolean refundable;
    @SerializedName("breakfast") @Expose private Boolean breakfast;

    public Integer getAvailable() {
        return available;
    }
    public void setAvailable(Integer available) {
        this.available = available;
    }

    public Boolean getDeposit() {
        return deposit;
    }
    public void setDeposit(Boolean deposit) {
        this.deposit = deposit;
    }

    public Boolean getRefundable() {
        return refundable;
    }
    public void setRefundable(Boolean refundable) {
        this.refundable = refundable;
    }

    public Boolean getBreakfast() {
        return breakfast;
    }
    public void setBreakfast(Boolean breakfast) {
        this.breakfast = breakfast;
    }
}
