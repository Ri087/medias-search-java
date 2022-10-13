package medias;

public class Movie extends Media{

    protected String title;

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public Movie(int id,String title,String media_type) {
        super(id, media_type);
        this.title = title;
    }

    @Override
    public String toString() {
        return ANSI_BLUE + media_type + ": " + id + " " + title + " " + ANSI_RESET;
    }
}