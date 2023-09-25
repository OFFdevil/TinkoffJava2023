package fintech;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.Map;

public class StreamAPI {
    static private List<Weather> listWeathers = Arrays.asList
        (
            new Weather("Krasnodar", 20.1, LocalDate.of(2001, 12, 1), LocalTime.of(12, 1)),
            new Weather("Krasnodar", 10.9, LocalDate.of(2001, 12, 1), LocalTime.of(12, 1)),
            new Weather("Moscow", 0.0, LocalDate.of(2001, 12, 1), LocalTime.of(12, 1)),
            new Weather("Moscow", 30.0, LocalDate.of(2001, 12, 1), LocalTime.of(12, 1)),
            new Weather("Rostov", 5.0, LocalDate.of(2001, 12, 1), LocalTime.of(12, 1)),
            new Weather("Moscow", 15.0, LocalDate.of(2001, 12, 1), LocalTime.of(12, 1)),
            new Weather("Vladivostok", 15.0, LocalDate.of(2001, 12, 1), LocalTime.of(12, 1))
        );

    // calculate average temperature in all regions
    static public Double averateTemperatureInRegions() {
        return listWeathers.stream().mapToDouble(Weather::getTemperature).average().orElse(0.0);
    }

    // calculate average temperature in every region
    static public Map<String, Double> averageTemperatureInRegion() {
        return listWeathers.stream()
                    .collect(Collectors.groupingBy(Weather::getRegionName, Collectors.averagingDouble(Weather::getTemperature)));
    }

    // search regions which temperature is higher <value>
    static public List<String> regionsWithTemperatureHigherTemperature(Double temperature) {
        return listWeathers.stream()
                .filter(element -> element.getTemperature() > temperature)
                .map(Weather::getRegionName)
                .distinct()
                .collect(Collectors.toList());
    }

    static public Map<Integer, List<Double>> allObservationsForAllRegions(){
        return listWeathers.stream()
                    .collect(Collectors.groupingBy(Weather::getId, Collectors.mapping(Weather::getTemperature, Collectors.toList())));
    }

    static public Map<Double, List<Weather>> allRegionsForAllTemperature(){
        return listWeathers.stream()
                    .collect(Collectors.groupingBy(Weather::getTemperature, Collectors.toList()));
    }
}
