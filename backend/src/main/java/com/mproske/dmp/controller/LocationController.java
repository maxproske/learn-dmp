package com.mproske.dmp.controller;

import com.mproske.dmp.model.Location;
import com.mproske.dmp.repository.LocationRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@EnableAutoConfiguration
public class LocationController {

    private final LocationRepository locationRepository;

    public LocationController(@Autowired LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @GetMapping("/locations")
    public List<Location> getAllLocations() {
        // The findAll() method should return Iterable, so convert it to List if necessary.
        return (List<Location>) locationRepository.findAll();
    }

    @GetMapping("/locations/{id}")
    public ResponseEntity<Location> getLocationById(@PathVariable int id) {
        // findById should be compatible if LocationRepository is correctly set up.
        Optional<Location> location = locationRepository.findById(id);
        
        return location
            .map(ResponseEntity::ok)
            .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
