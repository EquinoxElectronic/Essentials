package com.equinox.equinox_essentials.source;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import java.lang.reflect.Type;

import static java.lang.Boolean.parseBoolean;

public class Convert {
    public int toInt(String input) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("Input cannot be null or empty");
        }

        String cleanedInput = input.replaceAll("[^0-9]", "");

        if (cleanedInput.isEmpty()) {
            throw new IllegalArgumentException("Input must contain at least one digit");
        }

        try {
            return Integer.parseInt(cleanedInput);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Failed to convert to integer", e);
        }
    }


    public double toDouble(String input) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("Input cannot be null or empty");
        }
        try {
            return Double.parseDouble(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Failed to convert to double", e);
        }
    }

    public boolean toBoolean(String input) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("Input cannot be null or empty");
        }
        return parseBoolean(input.toLowerCase());
    }

    public <T> T fromJson(String json, Class<T> classOf) {
        try {
            return new Gson().fromJson(json, classOf);
        } catch (JsonSyntaxException e) {
            throw new IllegalArgumentException("Failed to convert JSON to object", e);
        }
    }

    public <T> T fromJson(String json, Type typeOf) {
        try {
            return new Gson().fromJson(json, typeOf);
        } catch (JsonSyntaxException e) {
            throw new IllegalArgumentException("Failed to convert JSON to object", e);
        }
    }

    public String toJson(Object obj) {
        return new Gson().toJson(obj);
    }

    // Temperature conversions
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    // Length conversions
    public double metersToFeet(double meters) {
        return meters * 3.28084;
    }

    public double feetToMeters(double feet) {
        return feet / 3.28084;
    }

    // Weight conversions
    public double kilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    public double poundsToKilograms(double pounds) {
        return pounds / 2.20462;
    }
}
