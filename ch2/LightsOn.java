package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Turn Lights on, if it is raining
 * AND car is running(>100) OR it is dark.
 */

public class LightsOn {

    public static void main(String[] args) {
        final int MAX_CAR_SPEED = 100;
        Scanner scanner = new Scanner(System.in);
        boolean isRaining = false;
        boolean isDark = false;
        boolean isCarRunning = false;
        boolean areLightsOn = false;
        int carSpeed = 0;

        System.out.println("Is it raining? ");
        isRaining = scanner.nextBoolean();

        System.out.println("Is it Dark? ");
        isRaining = scanner.nextBoolean();

        System.out.println("Car speed? ");
        carSpeed = scanner.nextInt();

        isCarRunning = carSpeed > MAX_CAR_SPEED;
        areLightsOn = (isRaining && isDark) || isCarRunning;
        // areLightsOn = isRaining && (isDark || isCArRunning);

        System.out.println("Lights on: " + areLightsOn);
    }
}
