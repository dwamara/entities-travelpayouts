
package com.travelpayouts.flight.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Cases {

    @SerializedName("pr")
    @Expose
    private String pr;
    @SerializedName("ro")
    @Expose
    private String ro;
    @SerializedName("vi")
    @Expose
    private String vi;

    /**
     * 
     * @return
     *     The pr
     */
    public String getPr() {
        return pr;
    }

    /**
     * 
     * @param pr
     *     The pr
     */
    public void setPr(String pr) {
        this.pr = pr;
    }

    /**
     * 
     * @return
     *     The ro
     */
    public String getRo() {
        return ro;
    }

    /**
     * 
     * @param ro
     *     The ro
     */
    public void setRo(String ro) {
        this.ro = ro;
    }

    /**
     * 
     * @return
     *     The vi
     */
    public String getVi() {
        return vi;
    }

    /**
     * 
     * @param vi
     *     The vi
     */
    public void setVi(String vi) {
        this.vi = vi;
    }

}
