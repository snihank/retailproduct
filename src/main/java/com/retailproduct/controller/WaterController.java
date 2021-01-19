package com.retailproduct.controller;

import com.retailproduct.model.WaterDto;
import com.retailproduct.service.WaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/water")
public class WaterController {

    private final WaterService waterService;

    public WaterController(WaterService waterService) {
        this.waterService = waterService;
    }

    @GetMapping("/{waterId}")
    public ResponseEntity<WaterDto> getwater(@PathVariable UUID waterId) {
        return new ResponseEntity<>(waterService.getWaterById(waterId), HttpStatus.OK);
    }
}
