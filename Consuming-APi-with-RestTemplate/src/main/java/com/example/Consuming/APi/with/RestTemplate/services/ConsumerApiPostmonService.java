package com.example.Consuming.APi.with.RestTemplate.services;

import com.example.Consuming.APi.with.RestTemplate.models.Address;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsumerApiPostmonService {
    @Value("${url.postmon}")
    private String url;

    public Address consumer(String cep){
        String fullUrl = url + cep;
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(fullUrl, Address.class);
    }
}
