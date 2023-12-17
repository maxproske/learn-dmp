package com.mproske.dmp.repository;

import com.mproske.dmp.model.Location;
import org.springframework.data.repository.CrudRepository;

public interface LocationRepository extends CrudRepository<Location, Integer> {
    // The CrudRepository typically provides the necessary CRUD methods.
    // If needed, define custom query methods here.
}
