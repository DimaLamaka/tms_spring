package by.lamaka.race.service.impl;

import by.lamaka.race.service.UserInputService;

import java.util.Scanner;

public class UserInputServiceImpl implements UserInputService {
    @Override
    public int getUserInput() {
        int result = 0;
        System.out.println("Please enter id pair");
        try (Scanner scanner = new Scanner(System.in)) {
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter id pair");
            }
            result = scanner.nextInt();
        }
        System.out.println("You choosed id = " + result);
        return result;
    }
}
