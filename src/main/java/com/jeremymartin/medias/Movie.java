package com.jeremymartin.medias;

import com.jeremymartin.ui.ConsoleColor;


public class Movie extends Media {

    private String title;

    public Movie(int id,String title,String media_type, String type, String overview) {
        super(id, media_type, type, overview);
        this.title = title;
    }

    @Override
    protected ConsoleColor getColor() {
        return ConsoleColor.BLUE;
    }

    @Override
    public String toString() {
        return media_type + ": " + id + " " + title + " ";
    }

    @Override
    protected String toStringDetails(){
        return "Serie: \n Id: " + this.id + " \n Name: " + this.title + "\n Type: "+ this.type + "\n Description: "+ this.overview + " \n Votes moyens: " + this.vote_average + " \n Nombre de votes: " + this.vote_count;
    }

}