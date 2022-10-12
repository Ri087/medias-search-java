package dto;

import java.util.ArrayList;

public class Media {

    public String backdrop_path;
    public String first_air_date;
    public ArrayList<Integer> genre_ids;
    public int id;
    public String media_type;
    public String name;
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
    public String title;
    public boolean video;

    public Media(String name, String title, Integer id) {
        this.name = name;
        this.title = title;
        this.id = id;
    }





}
