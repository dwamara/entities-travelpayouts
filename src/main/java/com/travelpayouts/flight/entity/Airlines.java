
package com.travelpayouts.flight.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Airlines {

    @SerializedName("SU")
    @Expose
    private com.travelpayouts.flight.entity.SU SU;

    /**
     * 
     * @return
     *     The SU
     */
    public com.travelpayouts.flight.entity.SU getSU() {
        return SU;
    }

    /**
     * 
     * @param SU
     *     The SU
     */
    public void setSU(com.travelpayouts.flight.entity.SU SU) {
        this.SU = SU;
    }

}
