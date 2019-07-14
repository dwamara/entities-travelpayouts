
package com.travelpayouts.flight.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class BAX {

    @SerializedName("cases")
    @Expose
    private Cases cases;
    @SerializedName("time_zone")
    @Expose
    private String timeZone;
    @SerializedName("rates")
    @Expose
    private String rates;
    @SerializedName("coordinates")
    @Expose
    private Coordinates coordinates;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("average_rate")
    @Expose
    private String averageRate;
    @SerializedName("name")
    @Expose
    private String name;

    /**
     * 
     * @return
     *     The cases
     */
    public Cases getCases() {
        return cases;
    }

    /**
     * 
     * @param cases
     *     The cases
     */
    public void setCases(Cases cases) {
        this.cases = cases;
    }

    /**
     * 
     * @return
     *     The timeZone
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * 
     * @param timeZone
     *     The time_zone
     */
    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    /**
     * 
     * @return
     *     The rates
     */
    public String getRates() {
        return rates;
    }

    /**
     * 
     * @param rates
     *     The rates
     */
    public void setRates(String rates) {
        this.rates = rates;
    }

    /**
     * 
     * @return
     *     The coordinates
     */
    public Coordinates getCoordinates() {
        return coordinates;
    }

    /**
     * 
     * @param coordinates
     *     The coordinates
     */
    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    /**
     * 
     * @return
     *     The country
     */
    public String getCountry() {
        return country;
    }

    /**
     * 
     * @param country
     *     The country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * 
     * @return
     *     The city
     */
    public String getCity() {
        return city;
    }

    /**
     * 
     * @param city
     *     The city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 
     * @return
     *     The averageRate
     */
    public String getAverageRate() {
        return averageRate;
    }

    /**
     * 
     * @param averageRate
     *     The average_rate
     */
    public void setAverageRate(String averageRate) {
        this.averageRate = averageRate;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

}
