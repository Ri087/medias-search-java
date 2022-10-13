package medias;

public class Serie extends Media{

    protected String name;

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";

    public Serie(Integer id, String name, String media_type) {
        super(id, media_type);
        this.name = name;
    }

    @Override
    public String toString() {
        return ANSI_GREEN + media_type + ": " + id + " " +name+ " " + ANSI_RESET;
    }
}