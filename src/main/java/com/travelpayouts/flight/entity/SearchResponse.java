
package com.travelpayouts.flight.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

@Generated("org.jsonschema2pojo")
public class SearchResponse {

    @SerializedName("segments")
    @Expose
    private List<Segment> segments = new ArrayList<Segment>();
    @SerializedName("airports")
    @Expose
    private Airports airports;
    @SerializedName("flight_numbers")
    @Expose
    private List<List<String>> flightNumbers = new ArrayList<List<String>>();
    @SerializedName("affiliate_has_sales")
    @Expose
    private Boolean affiliateHasSales;
    @SerializedName("proposals")
    @Expose
    private List<Proposal> proposals = new ArrayList<Proposal>();
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("airlines")
    @Expose
    private Airlines airlines;
    @SerializedName("travelpayouts_api_request")
    @Expose
    private Boolean travelpayoutsApiRequest;
    @SerializedName("market")
    @Expose
    private Object market;
    @SerializedName("signature")
    @Expose
    private String signature;
    @SerializedName("gates_info")
    @Expose
    private GatesInfo gatesInfo;
    @SerializedName("open_jaw")
    @Expose
    private Boolean openJaw;
    @SerializedName("partner")
    @Expose
    private String partner;
    @SerializedName("meta")
    @Expose
    private Meta meta;
    @SerializedName("internal")
    @Expose
    private Boolean internal;
    @SerializedName("jr_ota_waterfall")
    @Expose
    private Boolean jrOtaWaterfall;
    @SerializedName("search_id")
    @Expose
    private String searchId;
    @SerializedName("_ga")
    @Expose
    private Object Ga;
    @SerializedName("filters_boundary")
    @Expose
    private FiltersBoundary filtersBoundary;

    /**
     * 
     * @return
     *     The segments
     */
    public List<Segment> getSegments() {
        return segments;
    }

    /**
     * 
     * @param segments
     *     The segments
     */
    public void setSegments(List<Segment> segments) {
        this.segments = segments;
    }

    /**
     * 
     * @return
     *     The airports
     */
    public Airports getAirports() {
        return airports;
    }

    /**
     * 
     * @param airports
     *     The airports
     */
    public void setAirports(Airports airports) {
        this.airports = airports;
    }

    /**
     * 
     * @return
     *     The flightNumbers
     */
    public List<List<String>> getFlightNumbers() {
        return flightNumbers;
    }

    /**
     * 
     * @param flightNumbers
     *     The flight_numbers
     */
    public void setFlightNumbers(List<List<String>> flightNumbers) {
        this.flightNumbers = flightNumbers;
    }

    /**
     * 
     * @return
     *     The affiliateHasSales
     */
    public Boolean getAffiliateHasSales() {
        return affiliateHasSales;
    }

    /**
     * 
     * @param affiliateHasSales
     *     The affiliate_has_sales
     */
    public void setAffiliateHasSales(Boolean affiliateHasSales) {
        this.affiliateHasSales = affiliateHasSales;
    }

    /**
     * 
     * @return
     *     The proposals
     */
    public List<Proposal> getProposals() {
        return proposals;
    }

    /**
     * 
     * @param proposals
     *     The proposals
     */
    public void setProposals(List<Proposal> proposals) {
        this.proposals = proposals;
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

    /**
     * 
     * @return
     *     The airlines
     */
    public Airlines getAirlines() {
        return airlines;
    }

    /**
     * 
     * @param airlines
     *     The airlines
     */
    public void setAirlines(Airlines airlines) {
        this.airlines = airlines;
    }

    /**
     * 
     * @return
     *     The travelpayoutsApiRequest
     */
    public Boolean getTravelpayoutsApiRequest() {
        return travelpayoutsApiRequest;
    }

    /**
     * 
     * @param travelpayoutsApiRequest
     *     The travelpayouts_api_request
     */
    public void setTravelpayoutsApiRequest(Boolean travelpayoutsApiRequest) {
        this.travelpayoutsApiRequest = travelpayoutsApiRequest;
    }

    /**
     * 
     * @return
     *     The market
     */
    public Object getMarket() {
        return market;
    }

    /**
     * 
     * @param market
     *     The market
     */
    public void setMarket(Object market) {
        this.market = market;
    }

    /**
     * 
     * @return
     *     The signature
     */
    public String getSignature() {
        return signature;
    }

    /**
     * 
     * @param signature
     *     The signature
     */
    public void setSignature(String signature) {
        this.signature = signature;
    }

    /**
     * 
     * @return
     *     The gatesInfo
     */
    public GatesInfo getGatesInfo() {
        return gatesInfo;
    }

    /**
     * 
     * @param gatesInfo
     *     The gates_info
     */
    public void setGatesInfo(GatesInfo gatesInfo) {
        this.gatesInfo = gatesInfo;
    }

    /**
     * 
     * @return
     *     The openJaw
     */
    public Boolean getOpenJaw() {
        return openJaw;
    }

    /**
     * 
     * @param openJaw
     *     The open_jaw
     */
    public void setOpenJaw(Boolean openJaw) {
        this.openJaw = openJaw;
    }

    /**
     * 
     * @return
     *     The partner
     */
    public String getPartner() {
        return partner;
    }

    /**
     * 
     * @param partner
     *     The partner
     */
    public void setPartner(String partner) {
        this.partner = partner;
    }

    /**
     * 
     * @return
     *     The meta
     */
    public Meta getMeta() {
        return meta;
    }

    /**
     * 
     * @param meta
     *     The meta
     */
    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    /**
     * 
     * @return
     *     The internal
     */
    public Boolean getInternal() {
        return internal;
    }

    /**
     * 
     * @param internal
     *     The internal
     */
    public void setInternal(Boolean internal) {
        this.internal = internal;
    }

    /**
     * 
     * @return
     *     The jrOtaWaterfall
     */
    public Boolean getJrOtaWaterfall() {
        return jrOtaWaterfall;
    }

    /**
     * 
     * @param jrOtaWaterfall
     *     The jr_ota_waterfall
     */
    public void setJrOtaWaterfall(Boolean jrOtaWaterfall) {
        this.jrOtaWaterfall = jrOtaWaterfall;
    }

    /**
     * 
     * @return
     *     The searchId
     */
    public String getSearchId() {
        return searchId;
    }

    /**
     * 
     * @param searchId
     *     The search_id
     */
    public void setSearchId(String searchId) {
        this.searchId = searchId;
    }

    /**
     * 
     * @return
     *     The Ga
     */
    public Object getGa() {
        return Ga;
    }

    /**
     * 
     * @param Ga
     *     The _ga
     */
    public void setGa(Object Ga) {
        this.Ga = Ga;
    }

    /**
     * 
     * @return
     *     The filtersBoundary
     */
    public FiltersBoundary getFiltersBoundary() {
        return filtersBoundary;
    }

    /**
     * 
     * @param filtersBoundary
     *     The filters_boundary
     */
    public void setFiltersBoundary(FiltersBoundary filtersBoundary) {
        this.filtersBoundary = filtersBoundary;
    }

}
