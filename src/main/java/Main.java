import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Main {
    String original_title;

    public static void main(String[] args) throws IOException {
        Scanner myObj = new Scanner(System.in);
        Api searchApi = new Api();

        System.out.println("nom: ");
        String nameSearch = myObj.nextLine();

        String response = searchApi.getApi("https://api.themoviedb.org/3/search/multi?api_key=9c08262321f4e984577c6abaa528b6b7&query=" + nameSearch);
        System.out.println(response);
    }
}



