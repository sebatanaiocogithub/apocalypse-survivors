package com.robot.apocalypsesurvivors.controller;

import com.robot.apocalypsesurvivors.entity.Robot;
import com.robot.apocalypsesurvivors.service.RobotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/robots")
public class RobotController {

    @Autowired
    private RobotService robotService;

    //Get robots by "land" category
    @GetMapping("/land")
    public ResponseEntity<List<Robot>> getRobotsByLandCategory() {
        List<Robot> landRobots = robotService.getRobotsByLandCategory();
        return ResponseEntity.ok(landRobots);
    }

    //Get robots by "flying" category
    @GetMapping("/flying")
    public ResponseEntity<List<Robot>> getRobotsByFlyingCategory() {
        List<Robot> flyingRobots = robotService.getRobotsByFlyingCategory();
        return ResponseEntity.ok(flyingRobots);
    }


    //Get robot by model
    @GetMapping("/{model}")
    public ResponseEntity<Robot> getRobotByModel(@PathVariable String model) {
        Robot robot = robotService.getRobotByModel(model);
        if (robot != null) {
            return ResponseEntity.ok(robot);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    //Get robot by serialNumber
    @GetMapping("/serial/{serialNumber}")
    public ResponseEntity<Robot> getRobotBySerialNumber(@PathVariable String serialNumber) {
        Robot robot = robotService.getRobotBySerialNumber(serialNumber);
        if (robot != null) {
            return ResponseEntity.ok(robot);
        } else {
            return ResponseEntity.notFound().build();
        }
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

