package org.inori.app.Model;

import org.inori.app.XmlFieldName;

public class UPSParam {

    @XmlFieldName("upsOutputVoltage")
    private String outputVoltage;

    @XmlFieldName("upsOutputCurrent")
    private String outputCurrent;

    @XmlFieldName("upsOutputLoadFactor")
    private String outputLoadFactor;

    @XmlFieldName("upsOutputActivePower")
    private String outputActivePower;

    @XmlFieldName("upsBatteryState")
    private String batteryState;

    @XmlFieldName("upsWorkingState")
    private String workingState;

    @XmlFieldName("upsInputVoltage")
    private String inputVoltage;

    @XmlFieldName("upsInputCurrent")
    private String inputCurrent;

    public UPSParam() {

    }

    public UPSParam(String outputVoltage, String outputCurrent, String outputLoadFactor, String outputActivePower, String batteryState, String workingState, String inputVoltage, String inputCurrent) {
        this.outputVoltage = outputVoltage;
        this.outputCurrent = outputCurrent;
        this.outputLoadFactor = outputLoadFactor;
        this.outputActivePower = outputActivePower;
        this.batteryState = batteryState;
        this.workingState = workingState;
        this.inputVoltage = inputVoltage;
        this.inputCurrent = inputCurrent;
    }

    public String getOutputVoltage() {
        return outputVoltage;
    }

    public void setOutputVoltage(String outputVoltage) {
        this.outputVoltage = outputVoltage;
    }

    public String getOutputCurrent() {
        return outputCurrent;
    }

    public void setOutputCurrent(String outputCurrent) {
        this.outputCurrent = outputCurrent;
    }

    public String getOutputLoadFactor() {
        return outputLoadFactor;
    }

    public void setOutputLoadFactor(String outputLoadFactor) {
        this.outputLoadFactor = outputLoadFactor;
    }

    public String getOutputActivePower() {
        return outputActivePower;
    }

    public void setOutputActivePower(String outputActivePower) {
        this.outputActivePower = outputActivePower;
    }

    public String getBatteryState() {
        return batteryState;
    }

    public void setBatteryState(String batteryState) {
        this.batteryState = batteryState;
    }

    public String getWorkingState() {
        return workingState;
    }

    public void setWorkingState(String workingState) {
        this.workingState = workingState;
    }

    public String getInputVoltage() {
        return inputVoltage;
    }

    public void setInputVoltage(String inputVoltage) {
        this.inputVoltage = inputVoltage;
    }

    public String getInputCurrent() {
        return inputCurrent;
    }

    public void setInputCurrent(String inputCurrent) {
        this.inputCurrent = inputCurrent;
    }

    @Override
    public String toString() {
        return "UPSParam{" +
                "outputVoltage='" + outputVoltage + '\'' +
                ", outputCurrent='" + outputCurrent + '\'' +
                ", outputLoadFactor='" + outputLoadFactor + '\'' +
                ", outputActivePower='" + outputActivePower + '\'' +
                ", batteryState='" + batteryState + '\'' +
                ", workingState='" + workingState + '\'' +
                ", inputVoltage='" + inputVoltage + '\'' +
                ", inputCurrent='" + inputCurrent + '\'' +
                '}';
    }
}
