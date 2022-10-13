package com.jeremymartin.medias;

import com.jeremymartin.ui.ConsoleColor;
import com.jeremymartin.ui.Displayable;
import com.jeremymartin.ui.Displayer;


public abstract class Media implements Displayable {
    protected int id;
    protected String media_type;
    protected String overview;
    protected double vote_average;
    protected int vote_count;
    protected String type;

    public Media(int id, String media_type, String type, String overview) {
        this.id = id;
        this.media_type = media_type;
        this.type = type;
        this.overview = overview;
    }

    protected abstract ConsoleColor getColor();

    @Override
    public void display(Displayer displayer) {
        displayer.writeWithColor(toString(), getColor());
    }

    public void displayDetails(Displayer displayer) {
        displayer.writeWithColor(toStringDetails(), getColor());
    }

    protected abstract String toStringDetails();
}