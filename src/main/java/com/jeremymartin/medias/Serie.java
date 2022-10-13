package com.jeremymartin.medias;

import com.jeremymartin.ui.ConsoleColor;

public class Serie extends Media {

    private String name;

    public Serie(Integer id, String name, String media_type, String type, String overview) {
        super(id, media_type, type, overview);
        this.name = name;
    }

    @Override
    protected ConsoleColor getColor() {
        return ConsoleColor.GREEN;
    }

    @Override
    public String toString() {
        return media_type + ": " + id + " " +name+ " ";
    }

    @Override
    protected String toStringDetails(){
        return "Serie: \n Id: " + this.id + " \n Name: " + this.name + "\n Type: "+ this.type + "\n Description: "+ this.overview + " \n Votes moyens: " + this.vote_average + " \n Nombre de votes: " + this.vote_count;
    }

}