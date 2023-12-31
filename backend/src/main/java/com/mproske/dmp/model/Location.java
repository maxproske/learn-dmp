package com.mproske.dmp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.gemfire.mapping.annotation.Region;
import org.springframework.data.annotation.PersistenceConstructor;

import java.io.Serializable;

@Region("Locations")
public class Location implements Serializable {
    @Id
    private Integer id;
    private String name;
    private String city;
    private String state;
    private String photo;
    private int availableUnits;
    private boolean wifi;
    private boolean laundry;

    @PersistenceConstructor
    public Location(Integer id, String name, String city, String state, String photo, int availableUnits, boolean wifi, boolean laundry) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.state = state;
        this.photo = photo;
        this.availableUnits = availableUnits;
        this.wifi = wifi;
        this.laundry = laundry;
    }

    // Default constructor
    public Location() {
    }

    // Getters
    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getPhoto() {
        return photo;
    }

    public int getAvailableUnits() {
        return availableUnits;
    }

    public boolean isWifi() {
        return wifi;
    }

    public boolean isLaundry() {
        return laundry;
    }

    // Setters
    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public void setAvailableUnits(int availableUnits) {
        this.availableUnits = availableUnits;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public void setLaundry(boolean laundry) {
        this.laundry = laundry;
    }
}
