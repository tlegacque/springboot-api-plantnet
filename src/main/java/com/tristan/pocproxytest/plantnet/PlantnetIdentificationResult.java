package com.tristan.pocproxytest.plantnet;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Arrays;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PlantnetIdentificationResult {

    private Float score;

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "PlantnetIdentificationResult{" +
                "score=" + score +
                '}';
    }
}
