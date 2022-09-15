package com.example.commons.model;

import com.example.commons.enums.StreetName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
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
    @NotNull
    private StreetName streetName;

    @NotNull
    private String flatNumber;

    @NotNull
    @Positive
    private BigDecimal area;

    //    @NotBlank(message = "Number of residents is required")
    @PositiveOrZero
    private Integer residentsNumber;


}
