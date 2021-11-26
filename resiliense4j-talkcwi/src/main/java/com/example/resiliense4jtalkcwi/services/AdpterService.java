package com.example.resiliense4jtalkcwi.services;

import com.example.resiliense4jtalkcwi.models.AppResponse;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class AdpterService {

    private final RestTemplate restTemplate;

    private final String SERVICO_B = "servicoB";

    @CircuitBreaker(name = SERVICO_B, fallbackMethod = "fallbackServicoB")
    public AppResponse buscarItemServicoB() {
        String item = restTemplate.getForObject("http://localhost:8081/servico-b/item", String.class);
        return new AppResponse(SERVICO_B, item);
    }

    public AppResponse fallbackServicoB(Exception e) {
        return new AppResponse(SERVICO_B, "O serviço B não pode responder a chamada");
    }

}
