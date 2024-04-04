package com.crick.aps.services;

import java.util.List;

import java.util.Map;

import com.crick.aps.entities.Match;

public interface MatchService {

    // get all matches
    // get live matches
    // get point table
    List<Match> getAllMatches();

    List<Match> getLiveMatchs();

    List<Map<String, String>> getPointTable();

}
