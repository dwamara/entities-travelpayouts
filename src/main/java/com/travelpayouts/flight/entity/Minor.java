
package com.travelpayouts.flight.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Minor {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("flightRestriction")
    @Expose
    private String flightRestriction;
    @SerializedName("age")
    @Expose
    private String age;
    @SerializedName("airline")
    @Expose
    private String airline;
    @SerializedName("aboutService")
    @Expose
    private String aboutService;
    @SerializedName("fee")
    @Expose
    private String fee;
    @SerializedName("booking")
    @Expose
    private String booking;

    /**
     * 
     * @return
     *     The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The flightRestriction
     */
    public String getFlightRestriction() {
        return flightRestriction;
    }

    /**
     * 
     * @param flightRestriction
     *     The flightRestriction
     */
    public void setFlightRestriction(String flightRestriction) {
        this.flightRestriction = flightRestriction;
    }

    /**
     * 
     * @return
     *     The age
     */
    public String getAge() {
        return age;
    }

    /**
     * 
     * @param age
     *     The age
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * 
     * @return
     *     The airline
     */
    public String getAirline() {
        return airline;
    }

    /**
     * 
     * @param airline
     *     The airline
     */
    public void setAirline(String airline) {
        this.airline = airline;
    }

    /**
     * 
     * @return
     *     The aboutService
     */
    public String getAboutService() {
        return aboutService;
    }

    /**
     * 
     * @param aboutService
     *     The aboutService
     */
    public void setAboutService(String aboutService) {
        this.aboutService = aboutService;
    }

    /**
     * 
     * @return
     *     The fee
     */
    public String getFee() {
        return fee;
    }

    /**
     * 
     * @param fee
     *     The fee
     */
    public void setFee(String fee) {
        this.fee = fee;
    }

    /**
     * 
     * @return
     *     The booking
     */
    public String getBooking() {
        return booking;
    }

    /**
     * 
     * @param booking
     *     The booking
     */
    public void setBooking(String booking) {
        this.booking = booking;
    }
}
