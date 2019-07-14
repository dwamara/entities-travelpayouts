
package com.travelpayouts.flight.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

@Generated("org.jsonschema2pojo")
public class Segment_ {

    @SerializedName("flight") @Expose private List<Flight> flight = new ArrayList<Flight>();

    public List<Flight> getFlight() {
        return flight;
    }
    public void setFlight(List<Flight> flight) {
        this.flight = flight;
    }

}
