import medias.Media;
import medias.request.Api;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;


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

                System.out.print("nom: ");
                String nameSearch = myObj.nextLine();

                List<Media> media = new Api().getApi(nameSearch);

                for (Media m : media){
                    System.out.println(m.toString());
                }

                break;
            case 2:
                // Perform "encrypt number" case.
                break;
        }

    }

}
