package com.example.webclientrickandmortyapi.controller;

import com.example.webclientrickandmortyapi.client.RickAndMortyClient;
import com.example.webclientrickandmortyapi.response.CharacterResponse;
import com.example.webclientrickandmortyapi.response.EpisodesResponse;
import com.example.webclientrickandmortyapi.response.ListOfEpisodesResponse;
import com.example.webclientrickandmortyapi.response.LocationResponse;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@AllArgsConstructor
@RequestMapping("/webclient")
public class RickAndMortyController {

    @Autowired
    RickAndMortyClient rickAndMortyClient;

    @GetMapping("/character/{id}")
    public ResponseEntity<Mono<CharacterResponse>> getCharacterById(@PathVariable String id){
        return new ResponseEntity<>(rickAndMortyClient.findACharacterById(id), HttpStatus.OK);
    }

    @GetMapping("/location/{id}")
    public ResponseEntity<Mono<LocationResponse>> getLocationById(@PathVariable String id){
        return new ResponseEntity<>(rickAndMortyClient.findALocationById(id), HttpStatus.OK);
    }

    @GetMapping("/episode/{id}")
    public ResponseEntity<Mono<EpisodesResponse>> getEpisodeById(@PathVariable String id){
        return new ResponseEntity<>(rickAndMortyClient.findAEpisodeById(id), HttpStatus.OK);
    }

    @GetMapping("/episodes/")
    public ResponseEntity<Flux<ListOfEpisodesResponse>> getAllEpisodes(){
        return new ResponseEntity<>(rickAndMortyClient.getAllEpisodes(), HttpStatus.OK);
    }
}
