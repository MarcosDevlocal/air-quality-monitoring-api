package com.marcos.airquality.repository;

import com.marcos.airquality.model.AirMeasurement;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface AirMeasurementRepository extends JpaRepository<AirMeasurement, Long> {

    List<AirMeasurement> findTop100ByOrderByMeasuredAtDesc();

   
}
