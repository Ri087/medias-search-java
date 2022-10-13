package com.jeremymartin;

import com.jeremymartin.api.Api;
import com.jeremymartin.medias.Media;
import com.jeremymartin.ui.Displayer;
import com.jeremymartin.ui.menu.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(System.in)) {

            Displayer displayer = new Displayer();
            Api api = new Api();
            Menu menu = new Menu();
            menu.addOption(new DisplayMedias(scanner, displayer, api));
            menu.addOption(new DisplayDetailsMedia(scanner, displayer, api));
            menu.addOption(new QuitOption(scanner, displayer));

            try {
                boolean mustContinue = true;

                do {
                    menu.display(displayer);
                    int indexSelected = scanner.nextInt();
                    scanner.nextLine();
                    MenuOption option = menu.getOptionByIndex(indexSelected);
                    option.execute();
                    mustContinue = option.mustContinueAfterRun();
                } while (mustContinue);
            } catch (Exception exception) {
                displayer.writeError("An error occurred:");
                displayer.writeError(exception.getLocalizedMessage());
            }
        }
    }
}