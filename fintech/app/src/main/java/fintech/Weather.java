package fintech;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;

import lombok.Value;

@Value
public class Weather {
    private Integer id;
    private String regionName;
    private Double temperature;
    private LocalDate date;
    private LocalTime time;

    public Weather(String regionName, Double temperature, LocalDate date, LocalTime time) {
        this.id = RegionIdGenerator.putElement(regionName);
        this.regionName = regionName;
        this.temperature = temperature;
        this.date = date;
        this.time = time;
    }
}
