package com.robot.apocalypsesurvivors.controller;

import com.robot.apocalypsesurvivors.entity.Robot;
import com.robot.apocalypsesurvivors.service.RobotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/robots")
public class RobotController {

    @Autowired
    private RobotService robotService;

    //Post a new robot
    @PostMapping
    public Robot createRobot(@RequestBody Robot robot) {
        return robotService.createRobot(robot);
    }

    //Get all robots
    @GetMapping
    public List<Robot> getAllRobots() {
        return robotService.getAllRobot();
    }

    //Get robot by ID
    //@GetMapping("/{id}")
    //public Optional<Robot> getRobotById(@PathVariable Long id) {
     //return robotService.getRobotById(id);
    //}

    //Update robot by ID
    //@PutMapping("/{id}")
    //public Robot updateRobot(@PathVariable Long id, @RequestBody Robot robotDetails) {
    //   return robotService.updateRobot(id, robotDetails);
    //}

    //Delete all members
    @DeleteMapping
    public String deleteAllRobots() {
        robotService.deleteAllRobots();
            return "All survivors have been deleted successfully.";
    }

    //Delete member by ID
    @DeleteMapping("/{id}")
    public void deleteRobot(@PathVariable Long id) {
        robotService.deleteRobot(id);
    }

    @GetMapping("/category/{category}")
    public Object getRobotsByCategory(@PathVariable String category) {
        List<Robot> robots = robotService.getRobotsByCategory(category);
        if (robots.isEmpty()) {
            return robotService.getRobotsByCategory(category);
//            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(robots);
    }

}

