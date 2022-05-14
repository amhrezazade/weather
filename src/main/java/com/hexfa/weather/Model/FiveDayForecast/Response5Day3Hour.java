package com.hexfa.weather.Model.FiveDayForecast;

import com.hexfa.weather.Model.City;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Response5Day3Hour {
    @JsonProperty("city")
    private City city;
    @JsonProperty("list")
    private List<Item5Day3HourForecast> list;

    public City getCity() {
        return city;
    }

    public List<Item5Day3HourForecast> getList() {
        return list;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public void setList(List<Item5Day3HourForecast> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Response5Day3Hour{" +
                "city=" + city +
                ", list=" + list +
                '}';
    }
}