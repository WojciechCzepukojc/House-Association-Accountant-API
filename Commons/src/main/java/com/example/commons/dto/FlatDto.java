package com.example.commons.dto;

import com.example.commons.enums.StreetName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FlatDto {

    private Long id;
    private StreetName streetName;
    private String flatNumber;
    private BigDecimal area;
    private Integer residentsNumber;


}
