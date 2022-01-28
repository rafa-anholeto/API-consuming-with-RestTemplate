package com.example.Consuming.APi.with.RestTemplate.services;

import com.example.Consuming.APi.with.RestTemplate.models.Address;
import com.example.Consuming.APi.with.RestTemplate.models.CityInfo;
import com.example.Consuming.APi.with.RestTemplate.models.StateInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ConsumerApiPostmonServiceTest {

    @Autowired
    private ConsumerApiPostmonService consumerApiPostmonService;

    @Test
    void consumerTest() {
        Address address = consumerApiPostmonService.consumer("14784462");

        CityInfo cityInfo = address.getCityInfo();
        StateInfo stateInfo = address.getStateInfo();

        assertEquals("Jardim Universitário", address.getNeighborhood());
        assertEquals("Barretos", address.getCity());

        assertEquals("248.221,996",stateInfo.getStateArea());
        assertEquals("35", stateInfo.getIbgeStateCode());
        assertEquals("São Paulo", stateInfo.getName());

        assertEquals(	"14784462", address.getPostalCode());
        assertEquals("1566,161", cityInfo.getArea());
        assertEquals("3505500", cityInfo.getIbgeCode());
        assertEquals(	"SP", address.getState());

        System.out.println(address);
    }


}