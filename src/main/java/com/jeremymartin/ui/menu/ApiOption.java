package com.jeremymartin.ui.menu;

import com.jeremymartin.api.Api;
import com.jeremymartin.ui.Displayer;
import java.util.Scanner;

public abstract class ApiOption extends MenuOption {

    protected Api api;

    public ApiOption(String name, Scanner scanner, Displayer displayer, Api api) {
        super(name, scanner, displayer);
        this.api = api;
    }

}
