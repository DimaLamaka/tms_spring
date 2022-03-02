package by.lamaka.race.service.impl;

import by.lamaka.race.model.Pair;
import by.lamaka.race.service.InfoRaceService;

import java.util.List;


public class InfoRaceServiceImpl implements InfoRaceService {
    @Override
    public void getPairInfo(List<Pair> pairs) {
        System.out.println("Information about all pairs");
        pairs.forEach(System.out::println);
    }

    @Override
    public void getRaceInfo(List<Pair> pairs) {
        for (int i = 1; i <= pairs.size(); i++) {
            System.out.println("#" + i + " -> " + pairs.get(i - 1));
        }
    }


    @Override
    public void getWinnerInfo(Pair pair) {
        System.out.println(pair + " IS WINNERS !!!");
    }
}
