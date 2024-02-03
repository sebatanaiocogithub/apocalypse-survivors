package com.robot.apocalypsesurvivors.service;

import com.robot.apocalypsesurvivors.entity.Survivor;
import com.robot.apocalypsesurvivors.repository.SurvivorRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SurvivorService {

    @Autowired
    private SurvivorRepository survivorRepository;

    public void reportContamination(Long survivorId) {
        Survivor survivor = survivorRepository.findById(survivorId)
                .orElseThrow(() -> new EntityNotFoundException("Survivor not found"));

        // Increment the contamination reports
        survivor.setContaminationReports(survivor.getContaminationReports() + 1);

        // Check if the survivor should be marked as infected
        if (survivor.getContaminationReports() >= 3) {
            survivor.setInfected(true);
        }

        survivorRepository.save(survivor);
    }

    public List<Survivor> getInfectedSurvivors() {
        return survivorRepository.findByInfectedTrue();
    }

    public List<Survivor> getNonInfectedSurvivors() {
        return survivorRepository.findByInfectedFalse();
    }

    //Create new survivor
    public Survivor createSurvivor(Survivor survivor) {
        return survivorRepository.save(survivor);
    }


    //Get all survivors
    public List<Survivor> getAllSurvivors() {
        return survivorRepository.findAll();
    }

    //Get survivor by ID
    public Optional<Survivor> getSurvivorById(Long id) {
        return survivorRepository.findById(id);
    }

    //Update survivor
    public Survivor updateSurvivor(Long id, Survivor survivorDetails) {
        Optional<Survivor> survivor = survivorRepository.findById(id);
        if(survivor.isPresent()) {
            Survivor existingSurvivor = survivor.get();
            existingSurvivor.setName(survivorDetails.getName());
            existingSurvivor.setLocation(survivorDetails.getLocation());

        }
        return null;
    }

    //Delete all survivors
    public void deleteAllSurvivors() {
        survivorRepository.deleteAll();
    }

    //Delete survivor by ID
    public void deleteSurvivor(Long id) {
        survivorRepository.deleteById(id);
    }

}
