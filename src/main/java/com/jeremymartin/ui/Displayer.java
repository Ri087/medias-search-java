package com.jeremymartin.ui;

public class Displayer {

    public void breakLine() {
        write("");
    }

    public void write(String text) {
        System.out.println(text);
    }

    public void writeError(String text) {
        writeWithColor(text, ConsoleColor.RED);
    }

    public void writeWithColor(String text, ConsoleColor color) {write(color.label + text + ConsoleColor.RESET.label);}

}
