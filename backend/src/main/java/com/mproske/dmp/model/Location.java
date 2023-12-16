package com.mproske.dmp.model;

// Spring Boot 3 migrated all Java EE APIs javax.* to their equivalent Jakarta EE variant jakarta.* 
// due to the transition from Oracle to the Eclipse Foundation
// https://mkyong.com/spring-boot/spring-boot-package-javax-persistence-does-not-exist/
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String city;
    private String state;
    private String photo;
    private int availableUnits;
    private boolean wifi;
    private boolean laundry;

    // Parameterized constructor
    public Location(int id, String name, String city, String state, String photo, int availableUnits, boolean wifi, boolean laundry) {
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
    public int getId() {
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
    public void setId(int id) {
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
