
package com.travelpayouts.flight.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Baggage {

    @SerializedName("carryOn")
    @Expose
    private String carryOn;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("airline")
    @Expose
    private String airline;
    @SerializedName("sportMusical")
    @Expose
    private String sportMusical;
    @SerializedName("excess")
    @Expose
    private String excess;
    @SerializedName("checked")
    @Expose
    private String checked;

    /**
     * 
     * @return
     *     The carryOn
     */
    public String getCarryOn() {
        return carryOn;
    }

    /**
     * 
     * @param carryOn
     *     The carryOn
     */
    public void setCarryOn(String carryOn) {
        this.carryOn = carryOn;
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
     *     The sportMusical
     */
    public String getSportMusical() {
        return sportMusical;
    }

    /**
     * 
     * @param sportMusical
     *     The sportMusical
     */
    public void setSportMusical(String sportMusical) {
        this.sportMusical = sportMusical;
    }

    /**
     * 
     * @return
     *     The excess
     */
    public String getExcess() {
        return excess;
    }

    /**
     * 
     * @param excess
     *     The excess
     */
    public void setExcess(String excess) {
        this.excess = excess;
    }

    /**
     * 
     * @return
     *     The checked
     */
    public String getChecked() {
        return checked;
    }

    /**
     * 
     * @param checked
     *     The checked
     */
    public void setChecked(String checked) {
        this.checked = checked;
    }

}
