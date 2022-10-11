import java.io.IOException;

public class Main {
    String original_title;
    public static void main(String[] args) throws IOException {
        getApi example = new getApi();
        String response = example.run("https://api.themoviedb.org/3/movie/551?api_key=9c08262321f4e984577c6abaa528b6b7");
        System.out.println(response);
    }

}



