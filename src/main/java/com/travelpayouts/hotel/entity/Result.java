
package com.travelpayouts.hotel.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Result {
    @SerializedName("fullUrl") @Expose private String fullUrl;
    @SerializedName("maxPricePerNight") @Expose private Integer maxPricePerNight;
    @SerializedName("maxPrice") @Expose private Integer maxPrice;
    @SerializedName("photoCount") @Expose private Integer photoCount;
    @SerializedName("guestScore") @Expose private Integer guestScore;
    @SerializedName("address") @Expose private String address;
    @SerializedName("minPriceTotal") @Expose private Integer minPriceTotal;
    @SerializedName("id") @Expose private Integer id;
    @SerializedName("price") @Expose private Integer price;
    @SerializedName("name") @Expose private String name;
    @SerializedName("url") @Expose private String url;
    @SerializedName("popularity") @Expose private Integer popularity;
    @SerializedName("location") @Expose private Location location;
    @SerializedName("stars") @Expose private Integer stars;
    @SerializedName("distance") @Expose private Double distance;
    @SerializedName("amenities") @Expose private List<Object> amenities = null;
    @SerializedName("rooms") @Expose private List<Room> rooms = null;
    @SerializedName("rating") @Expose private Integer rating;

    public String getFullUrl() {
        return fullUrl;
    }
    public void setFullUrl(String fullUrl) {
        this.fullUrl = fullUrl;
    }

    public Integer getMaxPricePerNight() {
        return maxPricePerNight;
    }
    public void setMaxPricePerNight(Integer maxPricePerNight) {
        this.maxPricePerNight = maxPricePerNight;
    }

    public Integer getMaxPrice() {
        return maxPrice;
    }
    public void setMaxPrice(Integer maxPrice) {
        this.maxPrice = maxPrice;
    }

    public Integer getPhotoCount() {
        return photoCount;
    }
    public void setPhotoCount(Integer photoCount) {
        this.photoCount = photoCount;
    }

    public Integer getGuestScore() {
        return guestScore;
    }
    public void setGuestScore(Integer guestScore) {
        this.guestScore = guestScore;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getMinPriceTotal() {
        return minPriceTotal;
    }
    public void setMinPriceTotal(Integer minPriceTotal) {
        this.minPriceTotal = minPriceTotal;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPrice() {
        return price;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getPopularity() {
        return popularity;
    }
    public void setPopularity(Integer popularity) {
        this.popularity = popularity;
    }

    public Location getLocation() {
        return location;
    }
    public void setLocation(Location location) {
        this.location = location;
    }

    public Integer getStars() {
        return stars;
    }
    public void setStars(Integer stars) {
        this.stars = stars;
    }

    public Double getDistance() {
        return distance;
    }
    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public List<Object> getAmenities() {
        return amenities;
    }
    public void setAmenities(List<Object> amenities) {
        this.amenities = amenities;
    }

    public List<Room> getRooms() {
        return rooms;
    }
    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public Integer getRating() {
        return rating;
    }
    public void setRating(Integer rating) {
        this.rating = rating;
    }
}