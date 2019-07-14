
package com.travelpayouts.flight.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class _203 {

    @SerializedName("unified_price")
    @Expose
    private Integer unifiedPrice;
    @SerializedName("url")
    @Expose
    private Integer url;
    @SerializedName("price")
    @Expose
    private Integer price;
    @SerializedName("currency")
    @Expose
    private String currency;

    /**
     * 
     * @return
     *     The unifiedPrice
     */
    public Integer getUnifiedPrice() {
        return unifiedPrice;
    }

    /**
     * 
     * @param unifiedPrice
     *     The unified_price
     */
    public void setUnifiedPrice(Integer unifiedPrice) {
        this.unifiedPrice = unifiedPrice;
    }

    /**
     * 
     * @return
     *     The url
     */
    public Integer getUrl() {
        return url;
    }

    /**
     * 
     * @param url
     *     The url
     */
    public void setUrl(Integer url) {
        this.url = url;
    }

    /**
     * 
     * @return
     *     The price
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * 
     * @param price
     *     The price
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * 
     * @return
     *     The currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * 
     * @param currency
     *     The currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

}
