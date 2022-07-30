package com.example.commons.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.*;
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

    @JsonIgnore
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToOne(fetch = FetchType.LAZY)
    @NotNull(message = "Flat is required.")
    private Flat flat;




}
