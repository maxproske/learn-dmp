package com.mproske.dmp;

import com.mproske.dmp.model.Location;
import com.mproske.dmp.repository.LocationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class DatabaseSeeder {

    @Bean
    CommandLineRunner initDatabase(LocationRepository repository) {
        return args -> {
            List<Location> locations = Arrays.asList(
                new Location(0, "Acme Fresh Start Housing", "Chicago", "IL", 
                    "https://angular.io/assets/images/tutorials/faa/bernard-hermant-CLKGGwIBTaY-unsplash.jpg", 4, true, true),
                new Location(1, "A113 Transitional Housing", "Santa Monica", "CA", 
                    "https://angular.io/assets/images/tutorials/faa/brandon-griggs-wR11KBaB86U-unsplash.jpg", 0, false, true),
                new Location(2, "Capital Safe Towns", "Portland", "OR", 
                    "https://angular.io/assets/images/tutorials/faa/webaliser-_TPTXZd9mOo-unsplash.jpg", 6, true, true)
            );

            repository.saveAll(locations);
        };
    }
}
