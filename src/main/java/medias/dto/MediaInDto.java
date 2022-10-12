package medias.dto;

import medias.Media;
import medias.Movie;
import medias.Serie;

import java.util.ArrayList;

public class MediaInDto {
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
    public String title;
    public String name;

    public Media toProduct() {
        if (this.name != null){
            return new Serie(this.id,this.name);
        }else{
            return new Movie(this.id, this.title);
        }
    }


}