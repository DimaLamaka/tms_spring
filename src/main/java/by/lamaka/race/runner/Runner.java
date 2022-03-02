package by.lamaka.race.runner;

import by.lamaka.race.service.RaceManagementService;
import by.lamaka.race.service.impl.RaceManagementServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml")) {
            RaceManagementService raceManagementService = context.getBean("raceManagementService", RaceManagementServiceImpl.class);

            raceManagementService.startRace();
        }

    }
}
