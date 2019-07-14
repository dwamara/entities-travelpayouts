
package com.travelpayouts.flight.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Flight {

    @SerializedName("duration")
    @Expose
    private Integer duration;
    @SerializedName("departure_date")
    @Expose
    private String departureDate;
    @SerializedName("dtime")
    @Expose
    private Integer dtime;
    @SerializedName("arrival_time")
    @Expose
    private String arrivalTime;
    @SerializedName("local_arrival_timestamp")
    @Expose
    private Integer localArrivalTimestamp;
    @SerializedName("arrival_date")
    @Expose
    private String arrivalDate;
    @SerializedName("departure_timestamp")
    @Expose
    private Integer departureTimestamp;
    @SerializedName("arrival")
    @Expose
    private String arrival;
    @SerializedName("operating_carrier")
    @Expose
    private String operatingCarrier;
    @SerializedName("number")
    @Expose
    private Integer number;
    @SerializedName("arrival_timestamp")
    @Expose
    private Integer arrivalTimestamp;
    @SerializedName("atime")
    @Expose
    private Integer atime;
    @SerializedName("local_departure_timestamp")
    @Expose
    private Integer localDepartureTimestamp;
    @SerializedName("delay")
    @Expose
    private Integer delay;
    @SerializedName("departure_time")
    @Expose
    private String departureTime;
    @SerializedName("departure")
    @Expose
    private String departure;

    /**
     * 
     * @return
     *     The duration
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * 
     * @param duration
     *     The duration
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * 
     * @return
     *     The departureDate
     */
    public String getDepartureDate() {
        return departureDate;
    }

    /**
     * 
     * @param departureDate
     *     The departure_date
     */
    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    /**
     * 
     * @return
     *     The dtime
     */
    public Integer getDtime() {
        return dtime;
    }

    /**
     * 
     * @param dtime
     *     The dtime
     */
    public void setDtime(Integer dtime) {
        this.dtime = dtime;
    }

    /**
     * 
     * @return
     *     The arrivalTime
     */
    public String getArrivalTime() {
        return arrivalTime;
    }

    /**
     * 
     * @param arrivalTime
     *     The arrival_time
     */
    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    /**
     * 
     * @return
     *     The localArrivalTimestamp
     */
    public Integer getLocalArrivalTimestamp() {
        return localArrivalTimestamp;
    }

    /**
     * 
     * @param localArrivalTimestamp
     *     The local_arrival_timestamp
     */
    public void setLocalArrivalTimestamp(Integer localArrivalTimestamp) {
        this.localArrivalTimestamp = localArrivalTimestamp;
    }

    /**
     * 
     * @return
     *     The arrivalDate
     */
    public String getArrivalDate() {
        return arrivalDate;
    }

    /**
     * 
     * @param arrivalDate
     *     The arrival_date
     */
    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    /**
     * 
     * @return
     *     The departureTimestamp
     */
    public Integer getDepartureTimestamp() {
        return departureTimestamp;
    }

    /**
     * 
     * @param departureTimestamp
     *     The departure_timestamp
     */
    public void setDepartureTimestamp(Integer departureTimestamp) {
        this.departureTimestamp = departureTimestamp;
    }

    /**
     * 
     * @return
     *     The arrival
     */
    public String getArrival() {
        return arrival;
    }

    /**
     * 
     * @param arrival
     *     The arrival
     */
    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    /**
     * 
     * @return
     *     The operatingCarrier
     */
    public String getOperatingCarrier() {
        return operatingCarrier;
    }

    /**
     * 
     * @param operatingCarrier
     *     The operating_carrier
     */
    public void setOperatingCarrier(String operatingCarrier) {
        this.operatingCarrier = operatingCarrier;
    }

    /**
     * 
     * @return
     *     The number
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * 
     * @param number
     *     The number
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * 
     * @return
     *     The arrivalTimestamp
     */
    public Integer getArrivalTimestamp() {
        return arrivalTimestamp;
    }

    /**
     * 
     * @param arrivalTimestamp
     *     The arrival_timestamp
     */
    public void setArrivalTimestamp(Integer arrivalTimestamp) {
        this.arrivalTimestamp = arrivalTimestamp;
    }

    /**
     * 
     * @return
     *     The atime
     */
    public Integer getAtime() {
        return atime;
    }

    /**
     * 
     * @param atime
     *     The atime
     */
    public void setAtime(Integer atime) {
        this.atime = atime;
    }

    /**
     * 
     * @return
     *     The localDepartureTimestamp
     */
    public Integer getLocalDepartureTimestamp() {
        return localDepartureTimestamp;
    }

    /**
     * 
     * @param localDepartureTimestamp
     *     The local_departure_timestamp
     */
    public void setLocalDepartureTimestamp(Integer localDepartureTimestamp) {
        this.localDepartureTimestamp = localDepartureTimestamp;
    }

    /**
     * 
     * @return
     *     The delay
     */
    public Integer getDelay() {
        return delay;
    }

    /**
     * 
     * @param delay
     *     The delay
     */
    public void setDelay(Integer delay) {
        this.delay = delay;
    }

    /**
     * 
     * @return
     *     The departureTime
     */
    public String getDepartureTime() {
        return departureTime;
    }

    /**
     * 
     * @param departureTime
     *     The departure_time
     */
    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    /**
     * 
     * @return
     *     The departure
     */
    public String getDeparture() {
        return departure;
    }

    /**
     * 
     * @param departure
     *     The departure
     */
    public void setDeparture(String departure) {
        this.departure = departure;
    }

}
