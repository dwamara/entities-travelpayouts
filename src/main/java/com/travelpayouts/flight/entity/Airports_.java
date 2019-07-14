
package com.travelpayouts.flight.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

@Generated("org.jsonschema2pojo")
public class Airports_ {

    @SerializedName("departure")
    @Expose
    private List<String> departure = new ArrayList<String>();
    @SerializedName("arrival")
    @Expose
    private List<String> arrival = new ArrayList<String>();

    /**
     * 
     * @return
     *     The departure
     */
    public List<String> getDeparture() {
        return departure;
    }

    /**
     * 
     * @param departure
     *     The departure
     */
    public void setDeparture(List<String> departure) {
        this.departure = departure;
    }

    /**
     * 
     * @return
     *     The arrival
     */
    public List<String> getArrival() {
        return arrival;
    }

    /**
     * 
     * @param arrival
     *     The arrival
     */
    public void setArrival(List<String> arrival) {
        this.arrival = arrival;
    }

}
