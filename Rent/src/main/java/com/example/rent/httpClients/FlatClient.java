package com.example.rent.httpClients;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "flat-service", url = "http://localhost:8082/api/v1/flat")
public interface FlatClient {
}
