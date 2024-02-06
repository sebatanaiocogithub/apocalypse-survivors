package com.robot.apocalypsesurvivors.controller;

import com.robot.apocalypsesurvivors.entity.LastLocation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class LastLocationController {

    @PostMapping("/lastLocation")
    public ResponseEntity<String> saveLastLocation(@RequestBody LastLocation lastLocation) {
        // Process the received last location data
        float latitude = lastLocation.getLatitude();
        float longitude = lastLocation.getLongitude();

        // Handle the last location data as needed
        // For example, save it to the database

        return ResponseEntity.ok("Last location saved successfully");
    }

}
