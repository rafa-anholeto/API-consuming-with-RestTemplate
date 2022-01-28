package com.example.Consuming.APi.with.RestTemplate.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StateInfo {
    @JsonProperty("area_km2")
    private String stateArea;
    @JsonProperty("codigo_ibge")
    private String ibgeStateCode;
    @JsonProperty("nome")
    private String name;

    public String getStateArea() {
        return stateArea;
    }

    public void setStateArea(String stateArea) {
        this.stateArea = stateArea;
    }

    public String getIbgeStateCode() {
        return ibgeStateCode;
    }

    public void setIbgeStateCode(String ibgeStateCode) {
        this.ibgeStateCode = ibgeStateCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StateInfo{" +
                "stateArea='" + stateArea + '\'' +
                ", ibgeStateCode='" + ibgeStateCode + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
