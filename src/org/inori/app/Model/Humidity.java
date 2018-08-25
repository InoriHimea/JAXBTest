package org.inori.app.Model;

import java.util.List;

public class Humidity {

    private List<EvnModel> humidity;

    public List<EvnModel> getHumidity() {
        return humidity;
    }

    public void setHumidity(List<EvnModel> humidity) {
        this.humidity = humidity;
    }

    @Override
    public String toString() {
        return "Humidity{" +
                "humidity=" + humidity +
                '}';
    }
}
