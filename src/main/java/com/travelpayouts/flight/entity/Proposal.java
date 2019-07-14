
package com.travelpayouts.flight.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

@Generated("org.jsonschema2pojo")
public class Proposal {

    @SerializedName("stops_airports")
    @Expose
    private List<Object> stopsAirports = new ArrayList<Object>();
    @SerializedName("max_stops")
    @Expose
    private Integer maxStops;
    @SerializedName("is_direct")
    @Expose
    private Boolean isDirect;
    @SerializedName("segments_airports")
    @Expose
    private List<List<String>> segmentsAirports = new ArrayList<List<String>>();
    @SerializedName("min_stop_duration")
    @Expose
    private Object minStopDuration;
    @SerializedName("total_duration")
    @Expose
    private Integer totalDuration;
    @SerializedName("sign")
    @Expose
    private String sign;
    @SerializedName("carriers")
    @Expose
    private List<String> carriers = new ArrayList<String>();
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("terms")
    @Expose
    private Terms terms;
    @SerializedName("max_stop_duration")
    @Expose
    private Integer maxStopDuration;
    @SerializedName("xterms")
    @Expose
    private Xterms xterms;
    @SerializedName("segment_durations")
    @Expose
    private List<Integer> segmentDurations = new ArrayList<Integer>();
    @SerializedName("validating_carrier")
    @Expose
    private String validatingCarrier;
    @SerializedName("segment")
    @Expose
    private List<Segment_> segment = new ArrayList<Segment_>();
    @SerializedName("segments_time")
    @Expose
    private List<List<Integer>> segmentsTime = new ArrayList<List<Integer>>();

    /**
     * 
     * @return
     *     The stopsAirports
     */
    public List<Object> getStopsAirports() {
        return stopsAirports;
    }

    /**
     * 
     * @param stopsAirports
     *     The stops_airports
     */
    public void setStopsAirports(List<Object> stopsAirports) {
        this.stopsAirports = stopsAirports;
    }

    /**
     * 
     * @return
     *     The maxStops
     */
    public Integer getMaxStops() {
        return maxStops;
    }

    /**
     * 
     * @param maxStops
     *     The max_stops
     */
    public void setMaxStops(Integer maxStops) {
        this.maxStops = maxStops;
    }

    /**
     * 
     * @return
     *     The isDirect
     */
    public Boolean getIsDirect() {
        return isDirect;
    }

    /**
     * 
     * @param isDirect
     *     The is_direct
     */
    public void setIsDirect(Boolean isDirect) {
        this.isDirect = isDirect;
    }

    /**
     * 
     * @return
     *     The segmentsAirports
     */
    public List<List<String>> getSegmentsAirports() {
        return segmentsAirports;
    }

    /**
     * 
     * @param segmentsAirports
     *     The segments_airports
     */
    public void setSegmentsAirports(List<List<String>> segmentsAirports) {
        this.segmentsAirports = segmentsAirports;
    }

    /**
     * 
     * @return
     *     The minStopDuration
     */
    public Object getMinStopDuration() {
        return minStopDuration;
    }

    /**
     * 
     * @param minStopDuration
     *     The min_stop_duration
     */
    public void setMinStopDuration(Object minStopDuration) {
        this.minStopDuration = minStopDuration;
    }

    /**
     * 
     * @return
     *     The totalDuration
     */
    public Integer getTotalDuration() {
        return totalDuration;
    }

    /**
     * 
     * @param totalDuration
     *     The total_duration
     */
    public void setTotalDuration(Integer totalDuration) {
        this.totalDuration = totalDuration;
    }

    /**
     * 
     * @return
     *     The sign
     */
    public String getSign() {
        return sign;
    }

    /**
     * 
     * @param sign
     *     The sign
     */
    public void setSign(String sign) {
        this.sign = sign;
    }

    /**
     * 
     * @return
     *     The carriers
     */
    public List<String> getCarriers() {
        return carriers;
    }

    /**
     * 
     * @param carriers
     *     The carriers
     */
    public void setCarriers(List<String> carriers) {
        this.carriers = carriers;
    }

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The terms
     */
    public Terms getTerms() {
        return terms;
    }

    /**
     * 
     * @param terms
     *     The terms
     */
    public void setTerms(Terms terms) {
        this.terms = terms;
    }

    /**
     * 
     * @return
     *     The maxStopDuration
     */
    public Integer getMaxStopDuration() {
        return maxStopDuration;
    }

    /**
     * 
     * @param maxStopDuration
     *     The max_stop_duration
     */
    public void setMaxStopDuration(Integer maxStopDuration) {
        this.maxStopDuration = maxStopDuration;
    }

    /**
     * 
     * @return
     *     The xterms
     */
    public Xterms getXterms() {
        return xterms;
    }

    /**
     * 
     * @param xterms
     *     The xterms
     */
    public void setXterms(Xterms xterms) {
        this.xterms = xterms;
    }

    /**
     * 
     * @return
     *     The segmentDurations
     */
    public List<Integer> getSegmentDurations() {
        return segmentDurations;
    }

    /**
     * 
     * @param segmentDurations
     *     The segment_durations
     */
    public void setSegmentDurations(List<Integer> segmentDurations) {
        this.segmentDurations = segmentDurations;
    }

    /**
     * 
     * @return
     *     The validatingCarrier
     */
    public String getValidatingCarrier() {
        return validatingCarrier;
    }

    /**
     * 
     * @param validatingCarrier
     *     The validating_carrier
     */
    public void setValidatingCarrier(String validatingCarrier) {
        this.validatingCarrier = validatingCarrier;
    }

    /**
     * 
     * @return
     *     The segment
     */
    public List<Segment_> getSegment() {
        return segment;
    }

    /**
     * 
     * @param segment
     *     The segment
     */
    public void setSegment(List<Segment_> segment) {
        this.segment = segment;
    }

    /**
     * 
     * @return
     *     The segmentsTime
     */
    public List<List<Integer>> getSegmentsTime() {
        return segmentsTime;
    }

    /**
     * 
     * @param segmentsTime
     *     The segments_time
     */
    public void setSegmentsTime(List<List<Integer>> segmentsTime) {
        this.segmentsTime = segmentsTime;
    }
}
