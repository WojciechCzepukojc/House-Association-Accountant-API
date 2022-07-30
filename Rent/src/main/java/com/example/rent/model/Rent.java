package com.example.rent.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;
import java.math.BigDecimal;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity(name = "rents")
public class Rent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Heating value is required")
    @PositiveOrZero
    private BigDecimal heating;

    @NotBlank(message = "Water consumption value is required")
    @PositiveOrZero
    private BigDecimal waterAndSewage;

    @NotBlank(message = "Garbage collection value is required")
    @PositiveOrZero
    private BigDecimal garbage;

    @NotBlank(message = "Garbage collection value is required")
    @Positive
    private BigDecimal renovationFund;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotBlank(message = "Date is required")
    @PastOrPresent
    private LocalDate accrualDate;




}
