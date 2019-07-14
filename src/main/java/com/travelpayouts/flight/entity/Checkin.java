
package com.travelpayouts.flight.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Checkin {

    @SerializedName("seatOnlineCheckIn")
    @Expose
    private String seatOnlineCheckIn;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("timeBoardingGate")
    @Expose
    private String timeBoardingGate;
    @SerializedName("onlineCheckIn")
    @Expose
    private String onlineCheckIn;
    @SerializedName("airline")
    @Expose
    private String airline;
    @SerializedName("mobileCheckIn")
    @Expose
    private String mobileCheckIn;
    @SerializedName("requirementOnlineCheckIn")
    @Expose
    private String requirementOnlineCheckIn;
    @SerializedName("onlineCheckInwithBag")
    @Expose
    private String onlineCheckInwithBag;
    @SerializedName("airportCheckIn")
    @Expose
    private String airportCheckIn;

    /**
     * 
     * @return
     *     The seatOnlineCheckIn
     */
    public String getSeatOnlineCheckIn() {
        return seatOnlineCheckIn;
    }

    /**
     * 
     * @param seatOnlineCheckIn
     *     The seatOnlineCheckIn
     */
    public void setSeatOnlineCheckIn(String seatOnlineCheckIn) {
        this.seatOnlineCheckIn = seatOnlineCheckIn;
    }

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
     *     The timeBoardingGate
     */
    public String getTimeBoardingGate() {
        return timeBoardingGate;
    }

    /**
     * 
     * @param timeBoardingGate
     *     The timeBoardingGate
     */
    public void setTimeBoardingGate(String timeBoardingGate) {
        this.timeBoardingGate = timeBoardingGate;
    }

    /**
     * 
     * @return
     *     The onlineCheckIn
     */
    public String getOnlineCheckIn() {
        return onlineCheckIn;
    }

    /**
     * 
     * @param onlineCheckIn
     *     The onlineCheckIn
     */
    public void setOnlineCheckIn(String onlineCheckIn) {
        this.onlineCheckIn = onlineCheckIn;
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
     *     The mobileCheckIn
     */
    public String getMobileCheckIn() {
        return mobileCheckIn;
    }

    /**
     * 
     * @param mobileCheckIn
     *     The mobileCheckIn
     */
    public void setMobileCheckIn(String mobileCheckIn) {
        this.mobileCheckIn = mobileCheckIn;
    }

    /**
     * 
     * @return
     *     The requirementOnlineCheckIn
     */
    public String getRequirementOnlineCheckIn() {
        return requirementOnlineCheckIn;
    }

    /**
     * 
     * @param requirementOnlineCheckIn
     *     The requirementOnlineCheckIn
     */
    public void setRequirementOnlineCheckIn(String requirementOnlineCheckIn) {
        this.requirementOnlineCheckIn = requirementOnlineCheckIn;
    }

    /**
     * 
     * @return
     *     The onlineCheckInwithBag
     */
    public String getOnlineCheckInwithBag() {
        return onlineCheckInwithBag;
    }

    /**
     * 
     * @param onlineCheckInwithBag
     *     The onlineCheckInwithBag
     */
    public void setOnlineCheckInwithBag(String onlineCheckInwithBag) {
        this.onlineCheckInwithBag = onlineCheckInwithBag;
    }

    /**
     * 
     * @return
     *     The airportCheckIn
     */
    public String getAirportCheckIn() {
        return airportCheckIn;
    }

    /**
     * 
     * @param airportCheckIn
     *     The airportCheckIn
     */
    public void setAirportCheckIn(String airportCheckIn) {
        this.airportCheckIn = airportCheckIn;
    }
}
