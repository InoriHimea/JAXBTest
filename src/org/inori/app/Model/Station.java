package org.inori.app.Model;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="station")
@XmlType(propOrder = {"temperatures", "humiditys", "usp"})
public class Station {

    private Temperature temperatures;

    private Humidity humiditys;

    private UPS usp;

    public Temperature getTemperatures() {
        return temperatures;
    }

    public void setTemperatures(Temperature temperatures) {
        this.temperatures = temperatures;
    }

    public Humidity getHumiditys() {
        return humiditys;
    }

    public void setHumiditys(Humidity humiditys) {
        this.humiditys = humiditys;
    }

    public UPS getUsp() {
        return usp;
    }

    public void setUsp(UPS usp) {
        this.usp = usp;
    }

    @Override
    public String toString() {
        return "Station{" +
                "temperatures=" + temperatures +
                ", humiditys=" + humiditys +
                ", usp=" + usp +
                '}';
    }
}
