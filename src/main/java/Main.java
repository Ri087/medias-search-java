import com.google.gson.Gson;
import dto.Media;
import dto.MediasDto;

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

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose from these choices");
        System.out.println("-------------------------\n");
        System.out.println("1 - Rechercher un média par son nom\n");
        System.out.println("2 - Consulter le détail d'un média");

        int choice = scanner.nextInt();

        while (choice < 1 || choice > 2) {
            System.out.print("\nError! Incorrect choice.\n");
            System.out.println(choice);
            choice = scanner.nextInt();
        }

        switch (choice) {
            case 1:
                Scanner myObj = new Scanner(System.in);
                Api searchApi = new Api();

                System.out.println("nom: ");
                String nameSearch = myObj.nextLine();

                List<dto.Media> products = new Api().getApi(nameSearch);
                System.out.println(products);
                break;
            case 2:
                // Perform "encrypt number" case.
                break;
        }

    }

}



