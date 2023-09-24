package fintech;

import java.sql.Date;

public class Weather {
    private Integer id;
    private String regionName;
    private Double temperature;
    private Date date;
    
    public Weather(String regionName, Double temperature, Date date) {
        this.id = Database.putElement(regionName);
        this.regionName = regionName;
        this.temperature = temperature;
        this.date = date;
    }

    final public Integer getID() {
        return this.id;
    }

    // TODO
    final public void setID() {
        // for what?
    }

    final public String getRegionName() {
        return this.regionName;
    }

    final public void setNameRegion(String regionName) {
        this.id = Database.putElement(regionName);
        this.regionName = regionName;
    }
    
    final public Double getTemperature() {
        return this.temperature;
    }

    final public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Date getTimestamp() {
        return this.date;
    }

    public void setTimestamp(Date date) {
        this.date = date;
    }
}
