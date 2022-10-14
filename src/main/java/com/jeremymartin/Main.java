package com.jeremymartin;

import com.jeremymartin.api.Api;
import com.jeremymartin.ui.Displayer;
import com.jeremymartin.ui.menu.*;
import org.apache.commons.cli.*;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException, IOException{

        Options options = new Options();
        options.addOption(null,"search", true, "research media per name");
        options.addOption(null,"detail", true, "media detail per id");
        CommandLineParser parser = new DefaultParser();
        CommandLine cmd = parser.parse( options, args);

        try (Scanner scanner = new Scanner(System.in)) {



            Displayer displayer = new Displayer();
            Api api = new Api();
            Menu menu = new Menu();

            menu.addOption(new DisplayMedias(scanner, displayer, api));
            menu.addOption(new DisplayDetailsMedia(scanner, displayer, api));
            menu.addOption(new QuitOption(scanner, displayer));

            try {
                boolean mustContinue = true;

                if(cmd.hasOption("search")) {
                    new DisplayMedias(scanner, displayer, api).executeArgs(cmd.getOptionValue("search"));
                } else if (cmd.hasOption("detail")) {
                    new DisplayDetailsMedia(scanner, displayer, api).executeArg(cmd.getOptionValue("detail"));
                }

                do {
                    menu.display(displayer);
                    int indexSelected = scanner.nextInt();
                    scanner.nextLine();
                    MenuOption option = menu.getOptionByIndex(indexSelected);

                    if (option != null) {
                        option.execute();
                        mustContinue = option.mustContinueAfterRun();
                    } else {
                        displayer.writeError("error: index entry ("+indexSelected + ") unknown");
                        mustContinue = true;
                    }
                } while (mustContinue);
            } catch (Exception exception) {
                displayer.writeError("An error occurred:");
                displayer.writeError(exception.getLocalizedMessage());

            }
        }
    }
}