package com.example.flat.model;

import com.example.flat.enums.StreetName;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;
import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity(name = "flats")
public class Flat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @NotBlank(message = "Street is required. Select from: KATEDRALNA, RATUSZOWA, ZAMKOWA")
    private StreetName streetName;

    @NotBlank(message = "Flat number is required")
    private String FlatNumber;

    @NotBlank(message = "Flat area is required")
    @Positive
    private BigDecimal area;

    @NotBlank(message = "Number of residents are required")
    @PositiveOrZero
    private Integer residentsNumber;




}
