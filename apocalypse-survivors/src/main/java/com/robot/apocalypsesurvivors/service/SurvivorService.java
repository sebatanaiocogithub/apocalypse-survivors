package com.robot.apocalypsesurvivors.service;

import com.robot.apocalypsesurvivors.entity.Survivor;
import com.robot.apocalypsesurvivors.repository.SurvivorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SurvivorService {

    @Autowired
    private SurvivorRepository survivorRepository;

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
