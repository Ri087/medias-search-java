package com.jeremymartin.ui.menu;

import com.jeremymartin.api.Api;
import com.jeremymartin.ui.Displayer;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DisplayDetailsMedia extends ApiOption {

    public DisplayDetailsMedia(Scanner scanner, Displayer displayer, Api api) {
        super("Consulter le détail d'un média", scanner, displayer, api);
    }

    @Override
    public void execute() throws Exception {

    }
}
