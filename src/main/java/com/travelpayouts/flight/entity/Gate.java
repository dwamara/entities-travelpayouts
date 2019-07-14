
package com.travelpayouts.flight.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Gate {

    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("good_count")
    @Expose
    private Integer goodCount;
    @SerializedName("duration")
    @Expose
    private Double duration;
    @SerializedName("id")
    @Expose
    private Integer id;

    /**
     * 
     * @return
     *     The count
     */
    public Integer getCount() {
        return count;
    }

    /**
     * 
     * @param count
     *     The count
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * 
     * @return
     *     The goodCount
     */
    public Integer getGoodCount() {
        return goodCount;
    }

    /**
     * 
     * @param goodCount
     *     The good_count
     */
    public void setGoodCount(Integer goodCount) {
        this.goodCount = goodCount;
    }

    /**
     * 
     * @return
     *     The duration
     */
    public Double getDuration() {
        return duration;
    }

    /**
     * 
     * @param duration
     *     The duration
     */
    public void setDuration(Double duration) {
        this.duration = duration;
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

}
