package com.retailproduct.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WaterDto {

    private UUID id;
    private String waterName;
    private String waterSpec;
    private Long upc;

}
