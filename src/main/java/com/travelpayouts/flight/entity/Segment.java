
package com.travelpayouts.flight.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Segment {

    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("origin")
    @Expose
    private String origin;
    @SerializedName("destination")
    @Expose
    private String destination;
    @SerializedName("original_origin")
    @Expose
    private String originalOrigin;
    @SerializedName("original_destination")
    @Expose
    private String originalDestination;
    @SerializedName("destination_country")
    @Expose
    private String destinationCountry;
    @SerializedName("origin_country")
    @Expose
    private String originCountry;

    /**
     * 
     * @return
     *     The date
     */
    public String getDate() {
        return date;
    }

    /**
     * 
     * @param date
     *     The date
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * 
     * @return
     *     The origin
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * 
     * @param origin
     *     The origin
     */
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**
     * 
     * @return
     *     The destination
     */
    public String getDestination() {
        return destination;
    }

    /**
     * 
     * @param destination
     *     The destination
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * 
     * @return
     *     The originalOrigin
     */
    public String getOriginalOrigin() {
        return originalOrigin;
    }

    /**
     * 
     * @param originalOrigin
     *     The original_origin
     */
    public void setOriginalOrigin(String originalOrigin) {
        this.originalOrigin = originalOrigin;
    }

    /**
     * 
     * @return
     *     The originalDestination
     */
    public String getOriginalDestination() {
        return originalDestination;
    }

    /**
     * 
     * @param originalDestination
     *     The original_destination
     */
    public void setOriginalDestination(String originalDestination) {
        this.originalDestination = originalDestination;
    }

    /**
     * 
     * @return
     *     The destinationCountry
     */
    public String getDestinationCountry() {
        return destinationCountry;
    }

    /**
     * 
     * @param destinationCountry
     *     The destination_country
     */
    public void setDestinationCountry(String destinationCountry) {
        this.destinationCountry = destinationCountry;
    }

    /**
     * 
     * @return
     *     The originCountry
     */
    public String getOriginCountry() {
        return originCountry;
    }

    /**
     * 
     * @param originCountry
     *     The origin_country
     */
    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }
}
