package by.lamaka.race.service.impl;

import by.lamaka.race.model.Pair;
import by.lamaka.race.service.InfoRaceService;
import by.lamaka.race.service.RaceManagementService;
import by.lamaka.race.service.UserInputService;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.stereotype.Component;

import java.util.*;

@FieldDefaults(level = AccessLevel.PRIVATE,makeFinal = true)
@Component(BeanDefinition.SCOPE_PROTOTYPE)
public class RaceManagementServiceImpl implements RaceManagementService {
    InfoRaceService infoRaceService;
    UserInputService userInputService;
    List<Pair> pairs;

    @Autowired
    public RaceManagementServiceImpl(InfoRaceService infoRaceService, UserInputService userInputService, List<Pair> pairs) {
        this.infoRaceService = infoRaceService;
        this.userInputService = userInputService;
        this.pairs = pairs;
    }

    @Override
    public void startRace() {
        System.out.println("WELCOME TO THE HORSE RACE");

        infoRaceService.getPairInfo(pairs);
        int userInput = userInputService.getUserInput();

        System.out.println("Start the RACE");
        for (int i = 1; i < 6; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
            System.out.println("Round #" + i);

            Collections.shuffle(pairs);
            infoRaceService.getRaceInfo(pairs);
        }

        infoRaceService.getWinnerInfo(pairs.get(0));

        if (userInput == pairs.get(0).getId()) {
            System.out.println("Your bet has won!!!");
        } else {
            System.out.println("Your bet has lost!!!");
        }

    }
}
