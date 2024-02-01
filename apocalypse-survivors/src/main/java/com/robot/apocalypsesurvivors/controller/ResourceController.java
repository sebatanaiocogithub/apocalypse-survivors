package com.robot.apocalypsesurvivors.controller;

import com.robot.apocalypsesurvivors.entity.Resource;
import com.robot.apocalypsesurvivors.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/resources")
public class ResourceController {

    @Autowired
    private ResourceService resourceService;

    //Create a new resource
    @PostMapping
    public Resource createResource(@RequestBody Resource resource) {
        return resourceService.createResource(resource);
    }

    //Get all resource
    @GetMapping
    public List<Resource> getAllResources() {
        return resourceService.getAllResource();
    }

    //Get resource by ID
    @GetMapping("/{id}")
    public Optional<Resource> getResourceById(@PathVariable Long id) {
        return resourceService.getResourceById(id);
    }

    //Update resource by ID
    @PutMapping("/{id}")
    public Resource updateResource(@PathVariable Long id, @RequestBody Resource resourceDetails) {
        return resourceService.updateResource(id, resourceDetails);
    }

    //Delete all resources
    @DeleteMapping
    public String deleteAllResources() {
        resourceService.deleteAllResources();
        return "All resources have been deleted successfully.";
    }

    //Delete resource by ID
    @DeleteMapping("/{id}")
    public void deleteResource(@PathVariable Long id) {
        resourceService.deleteResource(id);
    }

}
