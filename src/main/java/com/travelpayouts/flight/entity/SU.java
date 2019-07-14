
package com.travelpayouts.flight.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

@Generated("org.jsonschema2pojo")
public class SU {

    @SerializedName("ageOfPlanes")
    @Expose
    private Double ageOfPlanes;
    @SerializedName("minorsNotTravelAloneTo")
    @Expose
    private String minorsNotTravelAloneTo;
    @SerializedName("freeStandardCarryOn")
    @Expose
    private Integer freeStandardCarryOn;
    @SerializedName("infantsSeatCost")
    @Expose
    private String infantsSeatCost;
    @SerializedName("minorsWithoutAdultFrom")
    @Expose
    private Integer minorsWithoutAdultFrom;
    @SerializedName("checkin")
    @Expose
    private Checkin checkin;
    @SerializedName("freeCheckedBag")
    @Expose
    private Integer freeCheckedBag;
    @SerializedName("economyLegroom")
    @Expose
    private Integer economyLegroom;
    @SerializedName("firstLegroom")
    @Expose
    private Integer firstLegroom;
    @SerializedName("iata")
    @Expose
    private String iata;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("alliance_name")
    @Expose
    private String allianceName;
    @SerializedName("infant")
    @Expose
    private Infant infant;
    @SerializedName("baggage")
    @Expose
    private Baggage baggage;
    @SerializedName("firstSeats")
    @Expose
    private Integer firstSeats;
    @SerializedName("checkedBaggagePrice2nd")
    @Expose
    private String checkedBaggagePrice2nd;
    @SerializedName("lowcost")
    @Expose
    private Boolean lowcost;
    @SerializedName("minorsNotTravelAloneFrom")
    @Expose
    private String minorsNotTravelAloneFrom;
    @SerializedName("infantsLapCost")
    @Expose
    private String infantsLapCost;
    @SerializedName("ref")
    @Expose
    private String ref;
    @SerializedName("rates")
    @Expose
    private String rates;
    @SerializedName("checkedBaggagePrice1st")
    @Expose
    private String checkedBaggagePrice1st;
    @SerializedName("minorsWithoutAdultTo")
    @Expose
    private Integer minorsWithoutAdultTo;
    @SerializedName("carryOnStandard")
    @Expose
    private Integer carryOnStandard;
    @SerializedName("minorsWithoutAdultCost")
    @Expose
    private Integer minorsWithoutAdultCost;
    @SerializedName("pets")
    @Expose
    private String pets;
    @SerializedName("economySeats")
    @Expose
    private Integer economySeats;
    @SerializedName("meals")
    @Expose
    private List<String> meals = new ArrayList<String>();
    @SerializedName("alliance")
    @Expose
    private String alliance;
    @SerializedName("freePersonalCarryOn")
    @Expose
    private Integer freePersonalCarryOn;
    @SerializedName("checkedBaggagePrice3rd")
    @Expose
    private String checkedBaggagePrice3rd;
    @SerializedName("infantsLapFrom")
    @Expose
    private String infantsLapFrom;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("aircrafts")
    @Expose
    private Integer aircrafts;
    @SerializedName("minor")
    @Expose
    private Minor minor;
    @SerializedName("updatedDate")
    @Expose
    private String updatedDate;
    @SerializedName("wifi")
    @Expose
    private String wifi;
    @SerializedName("pet")
    @Expose
    private Pet pet;
    @SerializedName("carryOnPersonal")
    @Expose
    private Integer carryOnPersonal;
    @SerializedName("frequentFlyerPrograms")
    @Expose
    private List<String> frequentFlyerPrograms = new ArrayList<String>();
    @SerializedName("jets")
    @Expose
    private List<Jet> jets = new ArrayList<Jet>();
    @SerializedName("average_rate")
    @Expose
    private String averageRate;
    @SerializedName("infantsLapTo")
    @Expose
    private String infantsLapTo;

    /**
     * 
     * @return
     *     The ageOfPlanes
     */
    public Double getAgeOfPlanes() {
        return ageOfPlanes;
    }

    /**
     * 
     * @param ageOfPlanes
     *     The ageOfPlanes
     */
    public void setAgeOfPlanes(Double ageOfPlanes) {
        this.ageOfPlanes = ageOfPlanes;
    }

    /**
     * 
     * @return
     *     The minorsNotTravelAloneTo
     */
    public String getMinorsNotTravelAloneTo() {
        return minorsNotTravelAloneTo;
    }

    /**
     * 
     * @param minorsNotTravelAloneTo
     *     The minorsNotTravelAloneTo
     */
    public void setMinorsNotTravelAloneTo(String minorsNotTravelAloneTo) {
        this.minorsNotTravelAloneTo = minorsNotTravelAloneTo;
    }

    /**
     * 
     * @return
     *     The freeStandardCarryOn
     */
    public Integer getFreeStandardCarryOn() {
        return freeStandardCarryOn;
    }

    /**
     * 
     * @param freeStandardCarryOn
     *     The freeStandardCarryOn
     */
    public void setFreeStandardCarryOn(Integer freeStandardCarryOn) {
        this.freeStandardCarryOn = freeStandardCarryOn;
    }

    /**
     * 
     * @return
     *     The infantsSeatCost
     */
    public String getInfantsSeatCost() {
        return infantsSeatCost;
    }

    /**
     * 
     * @param infantsSeatCost
     *     The infantsSeatCost
     */
    public void setInfantsSeatCost(String infantsSeatCost) {
        this.infantsSeatCost = infantsSeatCost;
    }

    /**
     * 
     * @return
     *     The minorsWithoutAdultFrom
     */
    public Integer getMinorsWithoutAdultFrom() {
        return minorsWithoutAdultFrom;
    }

    /**
     * 
     * @param minorsWithoutAdultFrom
     *     The minorsWithoutAdultFrom
     */
    public void setMinorsWithoutAdultFrom(Integer minorsWithoutAdultFrom) {
        this.minorsWithoutAdultFrom = minorsWithoutAdultFrom;
    }

    /**
     * 
     * @return
     *     The checkin
     */
    public Checkin getCheckin() {
        return checkin;
    }

    /**
     * 
     * @param checkin
     *     The checkin
     */
    public void setCheckin(Checkin checkin) {
        this.checkin = checkin;
    }

    /**
     * 
     * @return
     *     The freeCheckedBag
     */
    public Integer getFreeCheckedBag() {
        return freeCheckedBag;
    }

    /**
     * 
     * @param freeCheckedBag
     *     The freeCheckedBag
     */
    public void setFreeCheckedBag(Integer freeCheckedBag) {
        this.freeCheckedBag = freeCheckedBag;
    }

    /**
     * 
     * @return
     *     The economyLegroom
     */
    public Integer getEconomyLegroom() {
        return economyLegroom;
    }

    /**
     * 
     * @param economyLegroom
     *     The economyLegroom
     */
    public void setEconomyLegroom(Integer economyLegroom) {
        this.economyLegroom = economyLegroom;
    }

    /**
     * 
     * @return
     *     The firstLegroom
     */
    public Integer getFirstLegroom() {
        return firstLegroom;
    }

    /**
     * 
     * @param firstLegroom
     *     The firstLegroom
     */
    public void setFirstLegroom(Integer firstLegroom) {
        this.firstLegroom = firstLegroom;
    }

    /**
     * 
     * @return
     *     The iata
     */
    public String getIata() {
        return iata;
    }

    /**
     * 
     * @param iata
     *     The iata
     */
    public void setIata(String iata) {
        this.iata = iata;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The allianceName
     */
    public String getAllianceName() {
        return allianceName;
    }

    /**
     * 
     * @param allianceName
     *     The alliance_name
     */
    public void setAllianceName(String allianceName) {
        this.allianceName = allianceName;
    }

    /**
     * 
     * @return
     *     The infant
     */
    public Infant getInfant() {
        return infant;
    }

    /**
     * 
     * @param infant
     *     The infant
     */
    public void setInfant(Infant infant) {
        this.infant = infant;
    }

    /**
     * 
     * @return
     *     The baggage
     */
    public Baggage getBaggage() {
        return baggage;
    }

    /**
     * 
     * @param baggage
     *     The baggage
     */
    public void setBaggage(Baggage baggage) {
        this.baggage = baggage;
    }

    /**
     * 
     * @return
     *     The firstSeats
     */
    public Integer getFirstSeats() {
        return firstSeats;
    }

    /**
     * 
     * @param firstSeats
     *     The firstSeats
     */
    public void setFirstSeats(Integer firstSeats) {
        this.firstSeats = firstSeats;
    }

    /**
     * 
     * @return
     *     The checkedBaggagePrice2nd
     */
    public String getCheckedBaggagePrice2nd() {
        return checkedBaggagePrice2nd;
    }

    /**
     * 
     * @param checkedBaggagePrice2nd
     *     The checkedBaggagePrice2nd
     */
    public void setCheckedBaggagePrice2nd(String checkedBaggagePrice2nd) {
        this.checkedBaggagePrice2nd = checkedBaggagePrice2nd;
    }

    /**
     * 
     * @return
     *     The lowcost
     */
    public Boolean getLowcost() {
        return lowcost;
    }

    /**
     * 
     * @param lowcost
     *     The lowcost
     */
    public void setLowcost(Boolean lowcost) {
        this.lowcost = lowcost;
    }

    /**
     * 
     * @return
     *     The minorsNotTravelAloneFrom
     */
    public String getMinorsNotTravelAloneFrom() {
        return minorsNotTravelAloneFrom;
    }

    /**
     * 
     * @param minorsNotTravelAloneFrom
     *     The minorsNotTravelAloneFrom
     */
    public void setMinorsNotTravelAloneFrom(String minorsNotTravelAloneFrom) {
        this.minorsNotTravelAloneFrom = minorsNotTravelAloneFrom;
    }

    /**
     * 
     * @return
     *     The infantsLapCost
     */
    public String getInfantsLapCost() {
        return infantsLapCost;
    }

    /**
     * 
     * @param infantsLapCost
     *     The infantsLapCost
     */
    public void setInfantsLapCost(String infantsLapCost) {
        this.infantsLapCost = infantsLapCost;
    }

    /**
     * 
     * @return
     *     The ref
     */
    public String getRef() {
        return ref;
    }

    /**
     * 
     * @param ref
     *     The ref
     */
    public void setRef(String ref) {
        this.ref = ref;
    }

    /**
     * 
     * @return
     *     The rates
     */
    public String getRates() {
        return rates;
    }

    /**
     * 
     * @param rates
     *     The rates
     */
    public void setRates(String rates) {
        this.rates = rates;
    }

    /**
     * 
     * @return
     *     The checkedBaggagePrice1st
     */
    public String getCheckedBaggagePrice1st() {
        return checkedBaggagePrice1st;
    }

    /**
     * 
     * @param checkedBaggagePrice1st
     *     The checkedBaggagePrice1st
     */
    public void setCheckedBaggagePrice1st(String checkedBaggagePrice1st) {
        this.checkedBaggagePrice1st = checkedBaggagePrice1st;
    }

    /**
     * 
     * @return
     *     The minorsWithoutAdultTo
     */
    public Integer getMinorsWithoutAdultTo() {
        return minorsWithoutAdultTo;
    }

    /**
     * 
     * @param minorsWithoutAdultTo
     *     The minorsWithoutAdultTo
     */
    public void setMinorsWithoutAdultTo(Integer minorsWithoutAdultTo) {
        this.minorsWithoutAdultTo = minorsWithoutAdultTo;
    }

    /**
     * 
     * @return
     *     The carryOnStandard
     */
    public Integer getCarryOnStandard() {
        return carryOnStandard;
    }

    /**
     * 
     * @param carryOnStandard
     *     The carryOnStandard
     */
    public void setCarryOnStandard(Integer carryOnStandard) {
        this.carryOnStandard = carryOnStandard;
    }

    /**
     * 
     * @return
     *     The minorsWithoutAdultCost
     */
    public Integer getMinorsWithoutAdultCost() {
        return minorsWithoutAdultCost;
    }

    /**
     * 
     * @param minorsWithoutAdultCost
     *     The minorsWithoutAdultCost
     */
    public void setMinorsWithoutAdultCost(Integer minorsWithoutAdultCost) {
        this.minorsWithoutAdultCost = minorsWithoutAdultCost;
    }

    /**
     * 
     * @return
     *     The pets
     */
    public String getPets() {
        return pets;
    }

    /**
     * 
     * @param pets
     *     The pets
     */
    public void setPets(String pets) {
        this.pets = pets;
    }

    /**
     * 
     * @return
     *     The economySeats
     */
    public Integer getEconomySeats() {
        return economySeats;
    }

    /**
     * 
     * @param economySeats
     *     The economySeats
     */
    public void setEconomySeats(Integer economySeats) {
        this.economySeats = economySeats;
    }

    /**
     * 
     * @return
     *     The meals
     */
    public List<String> getMeals() {
        return meals;
    }

    /**
     * 
     * @param meals
     *     The meals
     */
    public void setMeals(List<String> meals) {
        this.meals = meals;
    }

    /**
     * 
     * @return
     *     The alliance
     */
    public String getAlliance() {
        return alliance;
    }

    /**
     * 
     * @param alliance
     *     The alliance
     */
    public void setAlliance(String alliance) {
        this.alliance = alliance;
    }

    /**
     * 
     * @return
     *     The freePersonalCarryOn
     */
    public Integer getFreePersonalCarryOn() {
        return freePersonalCarryOn;
    }

    /**
     * 
     * @param freePersonalCarryOn
     *     The freePersonalCarryOn
     */
    public void setFreePersonalCarryOn(Integer freePersonalCarryOn) {
        this.freePersonalCarryOn = freePersonalCarryOn;
    }

    /**
     * 
     * @return
     *     The checkedBaggagePrice3rd
     */
    public String getCheckedBaggagePrice3rd() {
        return checkedBaggagePrice3rd;
    }

    /**
     * 
     * @param checkedBaggagePrice3rd
     *     The checkedBaggagePrice3rd
     */
    public void setCheckedBaggagePrice3rd(String checkedBaggagePrice3rd) {
        this.checkedBaggagePrice3rd = checkedBaggagePrice3rd;
    }

    /**
     * 
     * @return
     *     The infantsLapFrom
     */
    public String getInfantsLapFrom() {
        return infantsLapFrom;
    }

    /**
     * 
     * @param infantsLapFrom
     *     The infantsLapFrom
     */
    public void setInfantsLapFrom(String infantsLapFrom) {
        this.infantsLapFrom = infantsLapFrom;
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
     *     The aircrafts
     */
    public Integer getAircrafts() {
        return aircrafts;
    }

    /**
     * 
     * @param aircrafts
     *     The aircrafts
     */
    public void setAircrafts(Integer aircrafts) {
        this.aircrafts = aircrafts;
    }

    /**
     * 
     * @return
     *     The minor
     */
    public Minor getMinor() {
        return minor;
    }

    /**
     * 
     * @param minor
     *     The minor
     */
    public void setMinor(Minor minor) {
        this.minor = minor;
    }

    /**
     * 
     * @return
     *     The updatedDate
     */
    public String getUpdatedDate() {
        return updatedDate;
    }

    /**
     * 
     * @param updatedDate
     *     The updatedDate
     */
    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }

    /**
     * 
     * @return
     *     The wifi
     */
    public String getWifi() {
        return wifi;
    }

    /**
     * 
     * @param wifi
     *     The wifi
     */
    public void setWifi(String wifi) {
        this.wifi = wifi;
    }

    /**
     * 
     * @return
     *     The pet
     */
    public Pet getPet() {
        return pet;
    }

    /**
     * 
     * @param pet
     *     The pet
     */
    public void setPet(Pet pet) {
        this.pet = pet;
    }

    /**
     * 
     * @return
     *     The carryOnPersonal
     */
    public Integer getCarryOnPersonal() {
        return carryOnPersonal;
    }

    /**
     * 
     * @param carryOnPersonal
     *     The carryOnPersonal
     */
    public void setCarryOnPersonal(Integer carryOnPersonal) {
        this.carryOnPersonal = carryOnPersonal;
    }

    /**
     * 
     * @return
     *     The frequentFlyerPrograms
     */
    public List<String> getFrequentFlyerPrograms() {
        return frequentFlyerPrograms;
    }

    /**
     * 
     * @param frequentFlyerPrograms
     *     The frequentFlyerPrograms
     */
    public void setFrequentFlyerPrograms(List<String> frequentFlyerPrograms) {
        this.frequentFlyerPrograms = frequentFlyerPrograms;
    }

    /**
     * 
     * @return
     *     The jets
     */
    public List<Jet> getJets() {
        return jets;
    }

    /**
     * 
     * @param jets
     *     The jets
     */
    public void setJets(List<Jet> jets) {
        this.jets = jets;
    }

    /**
     * 
     * @return
     *     The averageRate
     */
    public String getAverageRate() {
        return averageRate;
    }

    /**
     * 
     * @param averageRate
     *     The average_rate
     */
    public void setAverageRate(String averageRate) {
        this.averageRate = averageRate;
    }

    /**
     * 
     * @return
     *     The infantsLapTo
     */
    public String getInfantsLapTo() {
        return infantsLapTo;
    }

    /**
     * 
     * @param infantsLapTo
     *     The infantsLapTo
     */
    public void setInfantsLapTo(String infantsLapTo) {
        this.infantsLapTo = infantsLapTo;
    }
}
