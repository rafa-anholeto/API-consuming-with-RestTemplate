package com.example.webclientrickandmortyapi.response;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.Date;
import java.util.List;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class EpisodesResponse {

    private String id;
    private String name;
    private String air_date;
    private String episode;
    private List<String> characters;
    private String url;
    private Date created;

}
