package com.jeremymartin.api;

import com.jeremymartin.medias.Media;
import com.jeremymartin.medias.Movie;
import com.jeremymartin.medias.Serie;


public class MediaInDto {
    private int id;
    protected String media_type;
    private String overview;
    private String type;
    private String title;
    private String name;

    protected Media toProduct() {
        if (this.name != null){
            return new Serie(this.id,this.name, this.media_type, this.type, this.overview);
        }else{
            return new Movie(this.id, this.title, this.media_type, this.type, this.overview);
        }
    }


}