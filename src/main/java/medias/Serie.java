package medias;

public class Serie extends Media{

    protected String name;

    public Serie(Integer id, String name) {
        super(id);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Serie: " + id + " " +name;
    }
}