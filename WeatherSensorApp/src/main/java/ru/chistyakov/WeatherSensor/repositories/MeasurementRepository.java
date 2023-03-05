package ru.chistyakov.WeatherSensor.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.chistyakov.WeatherSensor.models.Measurement;


@Repository
public interface MeasurementRepository extends JpaRepository<Measurement, Integer> {
}
