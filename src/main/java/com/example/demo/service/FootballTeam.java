package com.example.demo.service;

import java.util.Comparator;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FootballTeam implements Comparator {

    private int gamesWon;

    @Override
    public int compare(Object o1, Object o2) {
        FootballTeam fb1 = (FootballTeam) o1;
        FootballTeam fb2 = (FootballTeam) o2;
        if (fb1.getGamesWon() > fb2.getGamesWon()) {
            return 1;
        }
        return 0;
    }

    public int compareTo(FootballTeam otherTeam) {
        return gamesWon - otherTeam.getGamesWon();
    }
}
