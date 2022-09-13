package com.example.rent.httpClients;

import com.example.commons.dto.FlatDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "flat-service", url = "http://localhost:8082/api/v1/flat/")
public interface FlatClient {

    @GetMapping("{flatId}")
    FlatDto getById(@PathVariable Long flatId);
}
