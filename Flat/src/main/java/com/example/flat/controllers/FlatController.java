package com.example.flat.controllers;

import com.example.flat.services.FlatService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.example.commons.dto.FlatDto;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/flat")
public class FlatController {

    private final FlatService flatService;

    @PostMapping("create")
    @ResponseStatus(HttpStatus.CREATED)
    public void create (@RequestBody FlatDto flatDto){
        flatService.create(flatDto);
    }


}
