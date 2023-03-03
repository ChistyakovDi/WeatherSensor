package ru.chistyakov.WeatherSensor.dto;

import java.util.List;

public class MeasurementsResponse {

    private List<MeasurementDTO> measurement;

    public MeasurementsResponse(List<MeasurementDTO> measurement) {
        this.measurement = measurement;
    }

    public List<MeasurementDTO> getMeasurement() {
        return measurement;
    }

    public void setMeasurement(List<MeasurementDTO> measurement) {
        this.measurement = measurement;
    }
}
