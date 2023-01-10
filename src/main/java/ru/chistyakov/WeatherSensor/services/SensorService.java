package ru.chistyakov.WeatherSensor.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.chistyakov.WeatherSensor.models.Sensor;
import ru.chistyakov.WeatherSensor.repositories.SensorRepository;

import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class SensorService {

    private final SensorRepository sensorRepository;

    public SensorService(SensorRepository sensorRepository) {
        this.sensorRepository = sensorRepository;
    }

    public Optional<Sensor> findByName(String name) {
        return sensorRepository.findByName(name);
    }

    @Transactional
    public void register(Sensor sensor) {
        sensorRepository.save(sensor);
    }
}
