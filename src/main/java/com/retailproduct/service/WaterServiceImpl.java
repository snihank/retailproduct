package com.retailproduct.service;

import com.retailproduct.model.WaterDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class WaterServiceImpl implements WaterService{
    @Override
    public WaterDto getWaterById(UUID waterId) {
        return WaterDto.builder()
                .id(UUID.randomUUID())
                .waterName("ACME")
                .waterSpec("500 ml")
                .build();
    }
}
