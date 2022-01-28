package com.example.Consuming.APi.with.RestTemplate.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Address {
    @JsonProperty("bairro")
    private String neighborhood;
    @JsonProperty("cidade")
    private String city;
    @JsonProperty("estado_info")
    private StateInfo stateInfo;
    @JsonProperty("cep")
    private String postalCode;
    @JsonProperty("cidade_info")
    private CityInfo cityInfo;
    @JsonProperty("estado")
    private String state;

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public StateInfo getStateInfo() {
        return stateInfo;
    }

    public void setStateInfo(StateInfo stateInfo) {
        this.stateInfo = stateInfo;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public CityInfo getCityInfo() {
        return cityInfo;
    }

    public void setCityInfo(CityInfo cityInfo) {
        this.cityInfo = cityInfo;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "neighborhood='" + neighborhood + '\'' +
                ", city='" + city + '\'' +
                ", stateInfo=" + stateInfo +
                ", postalCode='" + postalCode + '\'' +
                ", cityInfo=" + cityInfo +
                ", state='" + state + '\'' +
                '}';
    }
}
