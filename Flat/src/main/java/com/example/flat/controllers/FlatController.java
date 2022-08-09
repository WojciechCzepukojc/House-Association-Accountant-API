package com.example.flat.controllers;

import com.example.commons.dto.PageDTO;
import com.example.commons.utils.PageReqUtils;
import com.example.flat.services.FlatService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.example.commons.dto.FlatDto;

import static com.example.commons.utils.PageReqUtils.*;

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

    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public FlatDto getById(Long id){
        return flatService.getById(id);
    }

    @GetMapping
    @ApiOperation(value = "Fetch flats list",
            notes = "Method is used to fetch flats page. Page is sortable depend on specified params.")
    public PageDTO<FlatDto> getFlatsPage(
            @RequestParam(defaultValue = PAGE_ZERO, required = false) int page,
            @RequestParam(defaultValue = DEFAULT_SIZE, required = false) int pageSize,
            @RequestParam(defaultValue = DEFAULT_SORT_BY, required = false) String sortBy,
            @RequestParam(defaultValue = DESC_FALSE, required = false)
            @ApiParam(value = "Sort direction descending ?") boolean isDesc) {
        PageRequest pageRequest = PageReqUtils.getPageRequest(page, pageSize, sortBy, isDesc);
        return flatService.getPage(pageRequest);
    }

    @PutMapping("update/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public void  update(@PathVariable Long id,
                        @RequestBody FlatDto flatDto){
        flatService.updateById(id, flatDto);
    }


}
