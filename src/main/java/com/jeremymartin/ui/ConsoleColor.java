package com.jeremymartin.ui;

public enum ConsoleColor {

    RESET("\u001B[0m"),
    GREEN("\u001B[32m"),
    RED("\u001B[31m"),
    BLUE("\u001B[34m");

    public final String label;

    private ConsoleColor(String label) {
        this.label = label;
    }

}
