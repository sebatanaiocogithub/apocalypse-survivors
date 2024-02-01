package com.robot.apocalypsesurvivors.repository;

import com.robot.apocalypsesurvivors.entity.Robot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

// Repository interface
@Repository
public interface RobotRepository extends JpaRepository<Robot, Long> {
    List<Robot> findByCategory(String category);
}
