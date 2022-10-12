package medias;

public class Movie extends Media{

    protected String title;

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";

    public Movie(Integer id, String title) {
        super(id);
        this.title = title;
    }

    @Override
    public String toString() {
        return ANSI_BLUE + "Movie: " + id + " " + title + ANSI_RESET;
    }
}