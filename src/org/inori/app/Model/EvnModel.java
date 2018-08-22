package org.inori.app.Model;

import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = {"name", "ip", "ch", "value", "unit"})
public class EvnModel {

    private String name;
    private String ip;
    private String ch;
    private String value;
    private String unit;

    public EvnModel() {

    }

    public EvnModel(String name, String ip, String ch, String value, String unit) {
        this.name = name;
        this.ip = ip;
        this.ch = ch;
        this.value = value;
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getCh() {
        return ch;
    }

    public void setCh(String ch) {
        this.ch = ch;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "EvnModel{" +
                "name='" + name + '\'' +
                ", ip='" + ip + '\'' +
                ", ch='" + ch + '\'' +
                ", value='" + value + '\'' +
                ", unit='" + unit + '\'' +
                '}';
    }
}
