package com.jeremymartin.medias;

import com.jeremymartin.ui.ConsoleColor;
import com.jeremymartin.ui.Displayable;
import com.jeremymartin.ui.Displayer;

public class Movie extends Media {

    protected String title;

    public Movie(int id,String title,String media_type) {
        super(id, media_type);
        this.title = title;
    }

    @Override
    public ConsoleColor getColor() {
        return ConsoleColor.BLUE;
    }

    @Override
    public String toString() {
        return media_type + ": " + id + " " + title + " ";
    }

}