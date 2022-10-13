package com.jeremymartin.ui.menu;

import com.jeremymartin.ui.Displayable;
import com.jeremymartin.ui.Displayer;

import java.util.Scanner;

public abstract class MenuOption implements Displayable {

    private int index;
    private String name;

    protected Scanner scanner;
    protected Displayer displayer;

    public MenuOption(String name, Scanner scanner, Displayer displayer) {
        this.name = name;
        this.scanner = scanner;
        this.displayer = displayer;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public void display(Displayer displayer) {
        displayer.write(index + " - " + name);
    }

    public boolean mustContinueAfterRun() {
        //  Always continue after run by default
        return true;
    }

    public abstract void execute() throws Exception;

}
