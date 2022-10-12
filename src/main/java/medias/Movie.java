package medias;

public class Movie extends Media{

    protected String title;

    public Movie(Integer id, String title) {
        super(id);
        this.title = title;
    }

    @Override
    public String toString() {
        return "Movie: " + id + " " + title;
    }
}