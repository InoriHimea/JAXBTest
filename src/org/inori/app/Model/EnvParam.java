package org.inori.app.Model;

import java.util.Arrays;

public class EnvParam {

    private int overNum;

    private int envAverage;

    private EnvPoint[] envPoint;

    private String[] xAis;

    public EnvParam() {

    }

    public EnvParam(int overNum, int envAverage, EnvPoint[] envPoint, String[] xAis) {
        this.overNum = overNum;
        this.envAverage = envAverage;
        this.envPoint = envPoint;
        this.xAis = xAis;
    }

    public int getOverNum() {
        return overNum;
    }

    public void setOverNum(int overNum) {
        this.overNum = overNum;
    }

    public int getEnvAverage() {
        return envAverage;
    }

    public void setEnvAverage(int envAverage) {
        this.envAverage = envAverage;
    }

    public EnvPoint[] getEnvPoint() {
        return envPoint;
    }

    public void setEnvPoint(EnvPoint[] envPoint) {
        this.envPoint = envPoint;
    }

    public String[] getxAis() {
        return xAis;
    }

    public void setxAis(String[] xAis) {
        this.xAis = xAis;
    }

    @Override
    public String toString() {
        return "EnvParam{" +
                "overNum=" + overNum +
                ", envAverage=" + envAverage +
                ", envPoint=" + Arrays.toString(envPoint) +
                ", xAis=" + Arrays.toString(xAis) +
                '}';
    }
}
