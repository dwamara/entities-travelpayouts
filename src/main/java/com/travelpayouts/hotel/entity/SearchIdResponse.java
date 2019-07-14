package com.travelpayouts.hotel.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SearchIdResponse {
    @SerializedName("searchId") @Expose private String searchId;
    @SerializedName("status") @Expose private String status;

    public String getSearchId() {
        return searchId;
    }
    public void setSearchId(String searchId) {
        this.searchId = searchId;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}