package com.tristan.pocproxytest.controller;

import com.tristan.pocproxytest.plantnet.PlantnetIdentificationResult;
import com.tristan.pocproxytest.plantnet.PlantnetResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.StandardCharsets;

@RestController
@RequestMapping("/api/v1/plants")
public class PlantnetController {

    @Value("${plantnet.apikey}")
    private String apikey;

    @GetMapping("/infos")
    public PlantnetResponse getInfos(@RequestParam String path) {

        return this.callPlanetGetApi(path);
    }

    private PlantnetResponse callPlanetGetApi(String path) {
        String encoded = new String(path.getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8);
        RestTemplate rt = new RestTemplate();
        ResponseEntity<PlantnetResponse> response = rt.getForEntity(
                String.format("https://my-api.plantnet.org/v2/identify/all?api-key=%s&images=%s",
                        this.apikey,
                        encoded
                ),
                PlantnetResponse.class
        );

        System.out.println(response.getBody());

        return response.getBody();
    }

}
