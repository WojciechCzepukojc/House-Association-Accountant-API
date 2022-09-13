package com.example.commons.dto;

import com.example.commons.model.Flat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RentDto {

    private Long id;
    private BigDecimal heating;
    private BigDecimal waterAndSewage;
    private BigDecimal garbage;
    private BigDecimal renovationFund;
    private LocalDate accrualDate;
    private LocalDate dateOfPayment;
    private Long flatId;
}
