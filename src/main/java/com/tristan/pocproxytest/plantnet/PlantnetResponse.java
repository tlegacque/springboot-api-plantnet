package com.tristan.pocproxytest.plantnet;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PlantnetResponse implements Serializable {

    private String language;
    private String bestMatch;
    private PlantnetIdentificationResult[] results;
    private Integer remainingIdentificationRequests;

    public PlantnetIdentificationResult[] getResults() {
        return results;
    }

    public void setResults(PlantnetIdentificationResult[] results) {
        this.results = results;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }


    public String getBestMatch() {
        return bestMatch;
    }

    public void setBestMatch(String bestMatch) {
        this.bestMatch = bestMatch;
    }

    public Integer getRemainingIdentificationRequests() {
        return remainingIdentificationRequests;
    }

    public void setRemainingIdentificationRequests(Integer remainingIdentificationRequests) {
        this.remainingIdentificationRequests = remainingIdentificationRequests;
    }

    @Override
    public String toString() {
        return "PlantnetResponse{" +
                "language='" + language + '\'' +
                ", bestMatch='" + bestMatch + '\'' +
                ", results=" + Arrays.toString(results) +
                ", remainingIdentificationRequests=" + remainingIdentificationRequests +
                '}';
    }
}
