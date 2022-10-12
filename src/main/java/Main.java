import java.io.IOException;
import java.util.Scanner;


public class Main {
    String original_title;
    public static void main(String[] args) throws IOException {
        Scanner myObj = new Scanner(System.in);
        Api example = new Api();

        System.out.println("nom: ");
        String entryName = myObj.nextLine();

        String response = example.run("https://api.themoviedb.org/3/search/multi?api_key=9c08262321f4e984577c6abaa528b6b7&language=en-US&query="+ entryName +"&page=1&include_adult=true");
        System.out.println(response);
    }

}



