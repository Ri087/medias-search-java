package com.jeremymartin.medias;

import com.jeremymartin.ui.ConsoleColor;
import com.jeremymartin.ui.Displayable;
import com.jeremymartin.ui.Displayer;

import java.util.ArrayList;

public abstract class Media implements Displayable {

    public String backdrop_path;
    public String first_air_date;
    public ArrayList<Integer> genre_ids;
    public int id;
    public String media_type;
    public ArrayList<String> origin_country;
    public String original_language;
    public String original_name;
    public String overview;
    public double popularity;
    public String poster_path;
    public double vote_average;
    public int vote_count;
    public boolean adult;
    public String original_title;
    public String release_date;
    public boolean video;

    public Media(int id, String media_type ) {
        this.id = id;
        this.media_type = media_type;
    }

    public abstract ConsoleColor getColor();

    @Override
    public void display(Displayer displayer) {
        displayer.writeWithColor(toString(), getColor());
    }
}