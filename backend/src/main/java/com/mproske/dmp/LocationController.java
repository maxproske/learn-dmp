package com.mproske.dmp.controller;

import com.mproske.dmp.model.Location;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class LocationController {

    private final List<Location> locations = Arrays.asList(
        new Location(0, "Acme Fresh Start Housing", "Chicago", "IL", 
            "https://angular.io/assets/images/tutorials/faa/bernard-hermant-CLKGGwIBTaY-unsplash.jpg", 4, true, true),
        new Location(1, "A113 Transitional Housing", "Santa Monica", "CA", 
            "https://angular.io/assets/images/tutorials/faa/brandon-griggs-wR11KBaB86U-unsplash.jpg", 0, false, true),
        new Location(2, "Capital Safe Towns", "Portland", "OR", 
            "https://angular.io/assets/images/tutorials/faa/webaliser-_TPTXZd9mOo-unsplash.jpg", 6, true, true)
    );

    @GetMapping("/locations")
    public List<Location> getAllLocations() {
        return locations;
    }

    @GetMapping("/locations/{id}")
    public ResponseEntity<Location> getLocationById(@PathVariable int id) {
        Optional<Location> location = locations.stream()
            .filter(l -> l.getId() == id)
            .findFirst();
        
        return location
            .map(ResponseEntity::ok)
            .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
