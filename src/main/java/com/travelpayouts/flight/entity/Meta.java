
package com.travelpayouts.flight.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

@Generated("org.jsonschema2pojo")
public class Meta {

    @SerializedName("gates")
    @Expose
    private List<Gate> gates = new ArrayList<Gate>();
    @SerializedName("uuid")
    @Expose
    private String uuid;

    /**
     * 
     * @return
     *     The gates
     */
    public List<Gate> getGates() {
        return gates;
    }

    /**
     * 
     * @param gates
     *     The gates
     */
    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    /**
     * 
     * @return
     *     The uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * 
     * @param uuid
     *     The uuid
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

}
