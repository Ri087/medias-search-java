package com.jeremymartin.ui.menu;

import com.jeremymartin.api.Api;
import com.jeremymartin.medias.Media;
import com.jeremymartin.ui.Displayer;
import java.util.List;
import java.util.Scanner;

public class DisplayMedias extends ApiOption {

    public DisplayMedias(Scanner scanner, Displayer displayer, Api api) {
        super("Rechercher un média par son nom", scanner, displayer, api);
    }

    @Override
    public void execute() throws Exception {
        Scanner myObj = new Scanner(System.in);

        System.out.print("Entrer le nom de votre filme/serie: ");
        String nameSearch = myObj.nextLine();

        List<Media> media = this.api.getApi(nameSearch);

        for (Media m : media) {
            m.display(displayer);
        }
    }
}
