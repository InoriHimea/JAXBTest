package org.inori.app.Model;

public class EnvPoint {

    public static final String NORMAL_COLOR = "#66ccff";
    public static final String ERROR_COLOR = "#ff0000";

    private int tempValue;

    private String color;

    public EnvPoint() {

    }

    public EnvPoint(int tempValue, String color) {
        this.tempValue = tempValue;
        this.color = color;
    }

    public int getTempValue() {
        return tempValue;
    }

    public void setTempValue(int tempValue) {
        this.tempValue = tempValue;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "EnvPoint{" +
                "tempValue=" + tempValue +
                ", color='" + color + '\'' +
                '}';
    }
}
