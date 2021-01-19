package com.retailproduct.service;

import com.retailproduct.model.WaterDto;

import java.util.UUID;

public interface WaterService {
     WaterDto getWaterById(UUID waterId);
}
