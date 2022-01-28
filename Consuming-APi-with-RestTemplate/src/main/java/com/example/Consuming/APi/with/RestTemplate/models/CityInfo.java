package com.example.Consuming.APi.with.RestTemplate.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CityInfo {

    @JsonProperty("area_km2")
    private String area;
    @JsonProperty("codigo_ibge")
    private String ibgeCode;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getIbgeCode() {
        return ibgeCode;
    }

    public void setIbgeCode(String ibgeCode) {
        this.ibgeCode = ibgeCode;
    }

    @Override
    public String toString() {
        return "CityInfo{" +
                "area='" + area + '\'' +
                ", ibgeCode='" + ibgeCode + '\'' +
                '}';
    }
}
