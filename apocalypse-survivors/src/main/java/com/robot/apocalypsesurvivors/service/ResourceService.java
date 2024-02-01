package com.robot.apocalypsesurvivors.service;

import com.robot.apocalypsesurvivors.entity.Resource;
import com.robot.apocalypsesurvivors.repository.ResourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ResourceService {

    @Autowired
    private ResourceRepository resourceRepository;

    //Create new resource
    public Resource createResource(Resource resource) {
        return resourceRepository.save(resource);
    }

    //Get all resources
    public List<Resource> getAllResource() {
        return resourceRepository.findAll();
    }

    //Get resource by ID
    public Optional<Resource> getResourceById(Long id) {
        return resourceRepository.findById(id);
    }

    //Update resource
    public Resource updateResource(Long id, Resource resourceDetails) {
        Optional<Resource> resource = resourceRepository.findById(id);
        if(resource.isPresent()) {
            Resource existingResource = resource.get();
            existingResource.setAmmunition(resourceDetails.getAmmunition());
            existingResource.setFood(resourceDetails.getFood());
            existingResource.setMedication(resourceDetails.getMedication());
            existingResource.setWater(resourceDetails.getWater());

        }
        return null;
    }

    //Delete all resource
    public void deleteAllResources() {
        resourceRepository.deleteAll();
    }

    //Delete resource by ID
    public void deleteResource(Long id) {
        resourceRepository.deleteById(id);
    }

}
