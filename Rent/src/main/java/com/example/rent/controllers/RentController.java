package com.example.rent.controllers;

import com.example.commons.dto.FlatDto;
import com.example.commons.dto.RentDto;
import com.example.rent.services.RentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/rent")
public class RentController {

    public final RentService rentService;

    @PostMapping("create")
    @ResponseStatus(HttpStatus.CREATED)
    public void create (@RequestBody RentDto rentDto){
        rentService.create(rentDto);
    }
}
