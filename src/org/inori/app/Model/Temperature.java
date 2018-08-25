package org.inori.app.Model;

import java.util.List;

public class Temperature {

    private List<EvnModel> temperature;

    public List<EvnModel> getTemperature() {
        return temperature;
    }

    public void setTemperature(List<EvnModel> temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Temperature{" +
                "temperature=" + temperature +
                '}';
    }
}
