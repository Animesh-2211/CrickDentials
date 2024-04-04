package com.crick.aps.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crick.aps.entities.Match;

import java.util.Optional;

public interface MatchRepo extends JpaRepository<Match, Integer> {
    // fetch match by providing team name

    Optional<Match> findByteamHeading(String teamHeading);
}
