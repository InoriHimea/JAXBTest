package org.inori.app.Model;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"upsOutputVoltage", "upsOutputCurrent", "upsOutputLoadFactor", "upsOutputActivePower",
                                           "upsBatteryState", "upsWorkingState", "upsInputVoltage", "upsInputCurrent"})
public class UPS {

    @XmlElementWrapper(name="upsoutputvoltage")
    @XmlElement(name="outputvoltage")
    private List<EvnModel> upsOutputVoltage;

    @XmlElementWrapper(name="upsoutputcurrent")
    @XmlElement(name="outputcurrent")
    private List<EvnModel> upsOutputCurrent;

    @XmlElementWrapper(name="upsoutputloadingfactor")
    @XmlElement(name="outputloadingfactor")
    private List<EvnModel> upsOutputLoadFactor;

    @XmlElementWrapper(name="upsoutoutactivepower")
    @XmlElement(name="outputactivepower")
    private List<EvnModel> upsOutputActivePower;

    @XmlElementWrapper(name="upsbatterystate")
    @XmlElement(name="batterystate")
    private List<EvnModel> upsBatteryState;

    @XmlElementWrapper(name="upsworkingstate")
    @XmlElement(name="workingstate")
    private List<EvnModel> upsWorkingState;

    @XmlElementWrapper(name="upsinputvoltage")
    @XmlElement(name="inputvoltage")
    private List<EvnModel> upsInputVoltage;

    @XmlElementWrapper(name="upinputcurrent")
    @XmlElement(name="inputcurrent")
    private List<EvnModel> upsInputCurrent;

    public UPS() {

    }

    public UPS(List<EvnModel> upsOutputVoltage, List<EvnModel> upsOutputCurrent, List<EvnModel> upsOutputLoadFactor, List<EvnModel> upsOutputActivePower, List<EvnModel> upsBatteryState, List<EvnModel> upsWorkingState, List<EvnModel> upsInputVoltage, List<EvnModel> upsInputCurrent) {
        this.upsOutputVoltage = upsOutputVoltage;
        this.upsOutputCurrent = upsOutputCurrent;
        this.upsOutputLoadFactor = upsOutputLoadFactor;
        this.upsOutputActivePower = upsOutputActivePower;
        this.upsBatteryState = upsBatteryState;
        this.upsWorkingState = upsWorkingState;
        this.upsInputVoltage = upsInputVoltage;
        this.upsInputCurrent = upsInputCurrent;
    }

    public List<EvnModel> getUpsOutputVoltage() {
        return upsOutputVoltage;
    }

    public void setUpsOutputVoltage(List<EvnModel> upsOutputVoltage) {
        this.upsOutputVoltage = upsOutputVoltage;
    }

    public List<EvnModel> getUpsOutputCurrent() {
        return upsOutputCurrent;
    }

    public void setUpsOutputCurrent(List<EvnModel> upsOutputCurrent) {
        this.upsOutputCurrent = upsOutputCurrent;
    }

    public List<EvnModel> getUpsOutputLoadFactor() {
        return upsOutputLoadFactor;
    }

    public void setUpsOutputLoadFactor(List<EvnModel> upsOutputLoadFactor) {
        this.upsOutputLoadFactor = upsOutputLoadFactor;
    }

    public List<EvnModel> getUpsOutputActivePower() {
        return upsOutputActivePower;
    }

    public void setUpsOutputActivePower(List<EvnModel> upsOutputActivePower) {
        this.upsOutputActivePower = upsOutputActivePower;
    }

    public List<EvnModel> getUpsBatteryState() {
        return upsBatteryState;
    }

    public void setUpsBatteryState(List<EvnModel> upsBatteryState) {
        this.upsBatteryState = upsBatteryState;
    }

    public List<EvnModel> getUpsWorkingState() {
        return upsWorkingState;
    }

    public void setUpsWorkingState(List<EvnModel> upsWorkingState) {
        this.upsWorkingState = upsWorkingState;
    }

    public List<EvnModel> getUpsInputVoltage() {
        return upsInputVoltage;
    }

    public void setUpsInputVoltage(List<EvnModel> upsInputVoltage) {
        this.upsInputVoltage = upsInputVoltage;
    }

    public List<EvnModel> getUpsInputCurrent() {
        return upsInputCurrent;
    }

    public void setUpsInputCurrent(List<EvnModel> upsInputCurrent) {
        this.upsInputCurrent = upsInputCurrent;
    }

    @Override
    public String toString() {
        return "UPS{" +
                "upsOutputVoltage=" + upsOutputVoltage +
                ", upsOutputCurrent=" + upsOutputCurrent +
                ", upsOutputLoadFactor=" + upsOutputLoadFactor +
                ", upsOutputActivePower=" + upsOutputActivePower +
                ", upsBatteryState=" + upsBatteryState +
                ", upsWorkingState=" + upsWorkingState +
                ", upsInputVoltage=" + upsInputVoltage +
                ", upsInputCurrent=" + upsInputCurrent +
                '}';
    }
}
