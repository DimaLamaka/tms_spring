package by.lamaka.race.service;


import by.lamaka.race.model.Pair;

import java.util.List;

public interface InfoRaceService {
    void getPairInfo(List<Pair> pairs);

    void getRaceInfo(List<Pair> pairs);

    void getWinnerInfo(Pair pair);
}
