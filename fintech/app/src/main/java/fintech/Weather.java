package fintech;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
public class Weather {
    private Integer id;
    private String regionName;
    @Setter private Double temperature;
    @Setter private Date date;

    public Weather(String regionName, Double temperature, Date date) {
        this.id = Database.putElement(regionName);
        this.regionName = regionName;
        this.temperature = temperature;
        this.date = date;
    }

    final public void setNameRegion(String regionName) {
        this.id = Database.putElement(regionName);
        this.regionName = regionName;
    }

}
