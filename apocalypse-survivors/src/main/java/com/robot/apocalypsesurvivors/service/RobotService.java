package com.robot.apocalypsesurvivors.service;

import com.robot.apocalypsesurvivors.entity.Robot;
import com.robot.apocalypsesurvivors.repository.RobotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// Service class
@Service
public class RobotService {

    @Autowired
    private RobotRepository robotRepository;

    //Post new robot
    public Robot createRobot(Robot robot) {
        return robotRepository.save(robot);
    }

    //Get all robots
    public List<Robot> getAllRobot() {
        return robotRepository.findAll();
    }

    //Delete all robots
    public void deleteAllRobots() {
        robotRepository.deleteAll();
    }

    //Delete robot by ID
    public void deleteRobot(Long id) {
        robotRepository.deleteById(id);
    }

    //Get by category
    public List<Robot> getRobotsByCategory(String category) {
        return robotRepository.findByCategory(category);
        }

}
