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

    @GetMapping("/category/{category}")
    public Object getRobotsByCategory(@PathVariable String category) {
        List<Robot> robots = robotService.getRobotsByCategory(category);
        if (robots.isEmpty()) {
            return robotService.getRobotsByCategory(category);
        }
        return ResponseEntity.ok(robots);
    }

    @GetMapping("/land")
    public ResponseEntity<List<Robot>> getRobotsByLandCategory() {
        List<Robot> landRobots = robotService.getRobotsByLandCategory();
        return ResponseEntity.ok(landRobots);
    }

    @GetMapping("/flying")
    public ResponseEntity<List<Robot>> getRobotsByFlyingCategory() {
        List<Robot> flyingRobots = robotService.getRobotsByFlyingCategory();
        return ResponseEntity.ok(flyingRobots);
    }

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

    //Delete all robots
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

}

