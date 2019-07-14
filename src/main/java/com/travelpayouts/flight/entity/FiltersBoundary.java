
package com.travelpayouts.flight.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class FiltersBoundary {

    @SerializedName("airports")
    @Expose
    private Airports_ airports;
    @SerializedName("departure_time_1")
    @Expose
    private DepartureTime departureTime1;
    @SerializedName("departure_minutes_0")
    @Expose
    private DepartureMinutes departureMinutes;
    @SerializedName("arrival_datetime_1")
    @Expose
    private ArrivalDatetime arrivalDatetime1;
    @SerializedName("stops_count")
    @Expose
    private StopsCount stopsCount;
    @SerializedName("arrival_time_1")
    @Expose
    private ArrivalTime arrivalTime1;
    @SerializedName("arrival_time_0")
    @Expose
    private ArrivalTime arrivalTime;
    @SerializedName("price")
    @Expose
    private Price price;
    @SerializedName("flights_duration")
    @Expose
    private FlightsDuration flightsDuration;
    @SerializedName("departure_time_0")
    @Expose
    private DepartureTime departureTime;
    @SerializedName("departure_minutes_1")
    @Expose
    private DepartureMinutes departureMinutes1;
    @SerializedName("arrival_datetime_0")
    @Expose
    private ArrivalDatetime arrivalDatetime;

    /**
     * 
     * @return
     *     The airports
     */
    public Airports_ getAirports() {
        return airports;
    }

    /**
     * 
     * @param airports
     *     The airports
     */
    public void setAirports(Airports_ airports) {
        this.airports = airports;
    }

    /**
     * 
     * @return
     *     The departureTime1
     */
    public DepartureTime getDepartureTime1() {
        return departureTime1;
    }

    /**
     * 
     * @param departureTime1
     *     The departure_time_1
     */
    public void setDepartureTime1(DepartureTime departureTime1) {
        this.departureTime1 = departureTime1;
    }

    /**
     * 
     * @return
     *     The departureMinutes
     */
    public DepartureMinutes getDepartureMinutes() {
        return departureMinutes;
    }

    /**
     * 
     * @param departureMinutes
     *     The departure_minutes_0
     */
    public void setDepartureMinutes(DepartureMinutes departureMinutes) {
        this.departureMinutes = departureMinutes;
    }

    /**
     * 
     * @return
     *     The arrivalDatetime1
     */
    public ArrivalDatetime getArrivalDatetime1() {
        return arrivalDatetime1;
    }

    /**
     * 
     * @param arrivalDatetime1
     *     The arrival_datetime_1
     */
    public void setArrivalDatetime1(ArrivalDatetime arrivalDatetime1) {
        this.arrivalDatetime1 = arrivalDatetime1;
    }

    /**
     * 
     * @return
     *     The stopsCount
     */
    public StopsCount getStopsCount() {
        return stopsCount;
    }

    /**
     * 
     * @param stopsCount
     *     The stops_count
     */
    public void setStopsCount(StopsCount stopsCount) {
        this.stopsCount = stopsCount;
    }

    /**
     * 
     * @return
     *     The arrivalTime1
     */
    public ArrivalTime getArrivalTime1() {
        return arrivalTime1;
    }

    /**
     * 
     * @param arrivalTime1
     *     The arrival_time_1
     */
    public void setArrivalTime1(ArrivalTime arrivalTime1) {
        this.arrivalTime1 = arrivalTime1;
    }

    /**
     * 
     * @return
     *     The arrivalTime
     */
    public ArrivalTime getArrivalTime() {
        return arrivalTime;
    }

    /**
     * 
     * @param arrivalTime
     *     The arrival_time_0
     */
    public void setArrivalTime(ArrivalTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    /**
     * 
     * @return
     *     The price
     */
    public Price getPrice() {
        return price;
    }

    /**
     * 
     * @param price
     *     The price
     */
    public void setPrice(Price price) {
        this.price = price;
    }

    /**
     * 
     * @return
     *     The flightsDuration
     */
    public FlightsDuration getFlightsDuration() {
        return flightsDuration;
    }

    /**
     * 
     * @param flightsDuration
     *     The flights_duration
     */
    public void setFlightsDuration(FlightsDuration flightsDuration) {
        this.flightsDuration = flightsDuration;
    }

    /**
     * 
     * @return
     *     The departureTime
     */
    public DepartureTime getDepartureTime() {
        return departureTime;
    }

    /**
     * 
     * @param departureTime
     *     The departure_time_0
     */
    public void setDepartureTime(DepartureTime departureTime) {
        this.departureTime = departureTime;
    }

    /**
     * 
     * @return
     *     The departureMinutes1
     */
    public DepartureMinutes getDepartureMinutes1() {
        return departureMinutes1;
    }

    /**
     * 
     * @param departureMinutes1
     *     The departure_minutes_1
     */
    public void setDepartureMinutes1(DepartureMinutes departureMinutes1) {
        this.departureMinutes1 = departureMinutes1;
    }

    /**
     * 
     * @return
     *     The arrivalDatetime
     */
    public ArrivalDatetime getArrivalDatetime() {
        return arrivalDatetime;
    }

    /**
     * 
     * @param arrivalDatetime
     *     The arrival_datetime_0
     */
    public void setArrivalDatetime(ArrivalDatetime arrivalDatetime) {
        this.arrivalDatetime = arrivalDatetime;
    }

}
