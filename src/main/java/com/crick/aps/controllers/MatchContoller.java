package com.crick.aps.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.crick.aps.entities.Match;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@RestController
@RequestMapping("/match")
@CrossOrigin("*")
public class MatchContoller {

    // get live matches
    private com.crick.aps.services.MatchService MatchService;

    public MatchContoller(com.crick.aps.services.MatchService matchService) {
        MatchService = matchService;
    }

    @GetMapping("/live")
    public ResponseEntity<List<Match>> getLiveMatchs() {
        return new ResponseEntity<>(this.MatchService.getLiveMatchs(), HttpStatus.OK);

    }

    // geAllmatches

    @GetMapping
    public ResponseEntity<List<Match>> getAllMatchs() {
        return new ResponseEntity<>(this.MatchService.getAllMatches(), HttpStatus.OK);
    }

}
