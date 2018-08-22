package org.inori.app.Model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="station")
public class Station {

    private UPS usp;

    public UPS getUsp() {
        return usp;
    }

    public void setUsp(UPS usp) {
        this.usp = usp;
    }

    @Override
    public String toString() {
        return "Station{" +
                "usp=" + usp +
                '}';
    }
}
