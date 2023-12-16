package com.mproske.dmp.repository;

import com.mproske.dmp.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Integer> {
    // Custom query methods can be defined here
}
