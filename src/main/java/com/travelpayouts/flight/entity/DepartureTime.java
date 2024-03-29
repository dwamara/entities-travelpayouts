
package com.travelpayouts.flight.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class DepartureTime {

    @SerializedName("max")
    @Expose
    private String max;
    @SerializedName("min")
    @Expose
    private String min;

    /**
     * 
     * @return
     *     The max
     */
    public String getMax() {
        return max;
    }

    /**
     * 
     * @param max
     *     The max
     */
    public void setMax(String max) {
        this.max = max;
    }

    /**
     * 
     * @return
     *     The min
     */
    public String getMin() {
        return min;
    }

    /**
     * 
     * @param min
     *     The min
     */
    public void setMin(String min) {
        this.min = min;
    }

}
