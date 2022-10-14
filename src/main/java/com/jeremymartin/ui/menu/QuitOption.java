package com.jeremymartin.ui.menu;

import com.jeremymartin.ui.Displayer;
import java.util.Scanner;

public class QuitOption extends MenuOption {

    public QuitOption(Scanner scanner, Displayer displayer) {super("Quit", scanner, displayer);}

    @Override
    public void execute() throws Exception { }

    @Override
    public boolean mustContinueAfterRun() {return false;}

}
