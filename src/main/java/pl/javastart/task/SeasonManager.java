package pl.javastart.task;

import java.util.Arrays;
import java.util.Scanner;

public class SeasonManager {

    // uzupełnij metodę - do wczytywania danych użyj przekazany Scanner
    public void run(Scanner scanner) {
        System.out.println("Podaj porę roku:");
        Season[] seasons = Season.values();
        for (Season season : seasons) {
            System.out.println(season.getTranslatePl());
        }
        String seasonInput = scanner.nextLine();

        for (Season season : seasons) {
            if (seasonInput.equalsIgnoreCase(season.getTranslatePl())) {
                String[] months = season.getMonths();
                System.out.println("W tej porze roku są następujące miesiące:");
                System.out.println(Arrays.toString(months));
            }
        }
    }
}