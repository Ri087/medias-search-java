package com.jeremymartin.medias;

import com.jeremymartin.ui.ConsoleColor;
import com.jeremymartin.ui.Displayable;
import com.jeremymartin.ui.Displayer;

public class Serie extends Media {

    protected String name;

    public Serie(Integer id, String name, String media_type) {
        super(id, media_type);
        this.name = name;
    }

    @Override
    public ConsoleColor getColor() {
        return ConsoleColor.GREEN;
    }

    @Override
    public String toString() {
        return media_type + ": " + id + " " +name+ " ";
    }
}