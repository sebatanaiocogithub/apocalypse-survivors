package com.robot.apocalypsesurvivors.controller;

import com.robot.apocalypsesurvivors.entity.Survivor;
import com.robot.apocalypsesurvivors.service.SurvivorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/survivors")
public class SurvivorController {

    @Autowired
    private SurvivorService survivorService;

    @PutMapping("/{survivorId}/location")
    public ResponseEntity<Survivor> updateLastLocation(
            @PathVariable Long survivorId,
            @RequestParam Double latitude,
            @RequestParam Double longitude) {
        Survivor updatedSurvivor = survivorService.updateLastLocation(survivorId, latitude, longitude);
        return ResponseEntity.ok(updatedSurvivor);
    }

    @PutMapping("/{survivorId}/report-contamination")
    public ResponseEntity<Void> reportContamination(@PathVariable Long survivorId) {
        survivorService.reportContamination(survivorId);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/infected")
    public ResponseEntity<List<Survivor>> getInfectedSurvivors() {
        List<Survivor> infectedSurvivors = survivorService.getInfectedSurvivors();
        return ResponseEntity.ok(infectedSurvivors);
    }

    @GetMapping("/nonInfected")
    public ResponseEntity<List<Survivor>> getNonInfectedSurvivors() {
        List<Survivor> nonInfectedSurvivors = survivorService.getNonInfectedSurvivors();
        return ResponseEntity.ok(nonInfectedSurvivors);
    }

    //Create a new survivor
    @PostMapping
    public Survivor createSurvivor(@RequestBody Survivor survivor) {
        return survivorService.createSurvivor(survivor);
    }

    //Get all survivors
    @GetMapping
    public List<Survivor> getAllSurvivors() {
        return survivorService.getAllSurvivors();
    }

    //Get survivor by ID
    @GetMapping("/{id}")
    public Optional<Survivor> getSurvivorById(@PathVariable Long id) {
        return survivorService.getSurvivorById(id);
    }

    //Update survivor by ID
    @PutMapping("/{id}")
    public Survivor updateSurvivor(@PathVariable Long id, @RequestBody Survivor survivorDetails) {
        return survivorService.updateSurvivor(id, survivorDetails);
    }

    //Delete all members
    @DeleteMapping
    public String deleteAllSurvivors() {
        survivorService.deleteAllSurvivors();
        return "All survivors have been deleted successfully.";
    }

    //Delete member by ID
    @DeleteMapping("/{id}")
    public void deleteSurvivor(@PathVariable Long id) {
        survivorService.deleteSurvivor(id);
    }

}
