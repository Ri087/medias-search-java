package com.jeremymartin.ui.menu;

import com.jeremymartin.api.Api;
import com.jeremymartin.medias.Movie;
import com.jeremymartin.medias.Serie;
import com.jeremymartin.ui.Displayer;
import java.util.Scanner;

public class DisplayDetailsMedia extends ApiOption {

    public DisplayDetailsMedia(Scanner scanner, Displayer displayer, Api api) {
        super("Consulter le détail d'un média", scanner, displayer, api);
    }

    @Override
    public void execute() throws Exception {
        Scanner userResearch = new Scanner(System.in);

        System.out.print("Que voulez vous rechercher [movie/tv]:  ");
        String typeSearch = userResearch.nextLine();

        System.out.print("Entrer l'id de votre recherche:  ");
        String idResearch = userResearch.nextLine();

        String customUrlSearchPerId = "https://api.themoviedb.org/3/"+ typeSearch +"/"+idResearch+"+?api_key=9c08262321f4e984577c6abaa528b6b7";

        if (typeSearch.equals("movie")){
            Movie movie = this.api.getApiMovie(customUrlSearchPerId);
            movie.displayDetails(displayer);
        } else {
            Movie movie = this.api.getApiMovie(customUrlSearchPerId);
            movie.displayDetails(displayer);
        }
    }

    public void executeArg(String id) throws Exception {
        Movie movie = this.api.getApiMovie("https://api.themoviedb.org/3/movie/"+id+"+?api_key=9c08262321f4e984577c6abaa528b6b7");
        movie.displayDetails(displayer);

        Serie serie = this.api.getApiSerie("https://api.themoviedb.org/3/tv/"+id+"+?api_key=9c08262321f4e984577c6abaa528b6b7");
        serie.displayDetails(displayer);
    }
}
