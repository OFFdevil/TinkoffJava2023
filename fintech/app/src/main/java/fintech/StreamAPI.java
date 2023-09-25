package fintech;

import java.sql.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.Map;

public class StreamAPI {
    static private List<Weather> test = Arrays.asList
        (
            new Weather("Krasnodar", 20.1, new Date(2000000)),
            new Weather("Krasnodar", 10.9, new Date(2000011)),
            new Weather("Moscow", 0.0, new Date(345345)),
            new Weather("Moscow", 30.0, new Date(3039494)),
            new Weather("Rostov", 5.0, new Date(2000011)),
            new Weather("Moscow", 15.0, new Date(3039495)),
            new Weather("Vladivostok", 15.0, new Date(3039495))
        );

    // calculate average temperature in all regions
    static public Double averateTemperatureInRegions() {
        return test.stream().mapToDouble(Weather::getTemperature).average().orElse(0.0);
    }

    // calculate average temperature in every region
    static public Map<String, Double> averageTemperatureInRegion() {
        return test.stream()
                    .collect(Collectors.groupingBy(Weather::getRegionName, Collectors.averagingDouble(Weather::getTemperature)));
    }

    // search regions which temperature is higher <value>
    static public List<String> regionsWithTemperatureHigherTemperature(Double temperature) {
        return test.stream()
                .filter(element -> element.getTemperature() > temperature)
                .map(Weather::getRegionName)
                .distinct()
                .collect(Collectors.toList());
    }

    static public Map<Integer, List<Double>> allObservationsForAllRegions(){
        return test.stream()
                    .collect(Collectors.groupingBy(Weather::getId, Collectors.mapping(Weather::getTemperature, Collectors.toList())));
    }

    static public Map<Double, List<Weather>> allRegionsForAllTemperature(){
        return test.stream()
                    .collect(Collectors.groupingBy(Weather::getTemperature, Collectors.toList()));
    }
}
