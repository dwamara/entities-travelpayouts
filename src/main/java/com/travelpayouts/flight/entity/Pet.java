
package com.travelpayouts.flight.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Pet {

    @SerializedName("kennel")
    @Expose
    private String kennel;
    @SerializedName("airline")
    @Expose
    private String airline;
    @SerializedName("book")
    @Expose
    private String book;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("cabin")
    @Expose
    private String cabin;
    @SerializedName("method")
    @Expose
    private String method;
    @SerializedName("baggage")
    @Expose
    private String baggage;
    @SerializedName("documentation")
    @Expose
    private String documentation;
    @SerializedName("fee")
    @Expose
    private String fee;
    @SerializedName("cargo")
    @Expose
    private String cargo;
    @SerializedName("restriction")
    @Expose
    private String restriction;

    /**
     * 
     * @return
     *     The kennel
     */
    public String getKennel() {
        return kennel;
    }

    /**
     * 
     * @param kennel
     *     The kennel
     */
    public void setKennel(String kennel) {
        this.kennel = kennel;
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
     *     The book
     */
    public String getBook() {
        return book;
    }

    /**
     * 
     * @param book
     *     The book
     */
    public void setBook(String book) {
        this.book = book;
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
     *     The cabin
     */
    public String getCabin() {
        return cabin;
    }

    /**
     * 
     * @param cabin
     *     The cabin
     */
    public void setCabin(String cabin) {
        this.cabin = cabin;
    }

    /**
     * 
     * @return
     *     The method
     */
    public String getMethod() {
        return method;
    }

    /**
     * 
     * @param method
     *     The method
     */
    public void setMethod(String method) {
        this.method = method;
    }

    /**
     * 
     * @return
     *     The baggage
     */
    public String getBaggage() {
        return baggage;
    }

    /**
     * 
     * @param baggage
     *     The baggage
     */
    public void setBaggage(String baggage) {
        this.baggage = baggage;
    }

    /**
     * 
     * @return
     *     The documentation
     */
    public String getDocumentation() {
        return documentation;
    }

    /**
     * 
     * @param documentation
     *     The documentation
     */
    public void setDocumentation(String documentation) {
        this.documentation = documentation;
    }

    /**
     * 
     * @return
     *     The fee
     */
    public String getFee() {
        return fee;
    }

    /**
     * 
     * @param fee
     *     The fee
     */
    public void setFee(String fee) {
        this.fee = fee;
    }

    /**
     * 
     * @return
     *     The cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * 
     * @param cargo
     *     The cargo
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * 
     * @return
     *     The restriction
     */
    public String getRestriction() {
        return restriction;
    }

    /**
     * 
     * @param restriction
     *     The restriction
     */
    public void setRestriction(String restriction) {
        this.restriction = restriction;
    }

}
