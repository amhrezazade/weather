package com.hexfa.weather.Model.FiveDayForecast;

import com.hexfa.weather.Model.WeatherItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.hexfa.weather.Model.Main;

import java.util.List;

public class Item5Day3HourForecast {

	@JsonProperty("weather")
	private List<WeatherItem> weather;
	@JsonProperty("main")
	private Main main;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("id")
	private int id;
	@JsonProperty("name")
	private String name;

	public List<WeatherItem> getWeather(){
		return weather;
	}

	public Main getMain(){
		return main;
	}

	public void setWeather(List<WeatherItem> weather) {
		this.weather = weather;
	}

	public void setMain(Main main) {
		this.main = main;
	}

	@Override
	public String toString() {
		return "ListItem{" +
				"weather=" + weather +
				", main=" + main +
				'}';
	}
}