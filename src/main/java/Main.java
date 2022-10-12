import medias.Media;
import medias.request.Api;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;


public class Main {
    String original_title;

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int choice = 0;

        while (choice != 3) {

            System.out.println("\n");
            System.out.println("Choose from these choices");
            System.out.println("-------------------------\n");
            System.out.println("1 - Rechercher un média par son nom\n");
            System.out.println("2 - Consulter le détail d'un média\n");
            System.out.println("3 - Quitter");

            choice = scanner.nextInt();

            if (choice < 1 || choice > 3) {
                System.out.print("\nError! Incorrect choice.\n");
            }

            switch (choice) {
                case 1:
                    Scanner myObj = new Scanner(System.in);

                    System.out.print("Entrer le nom de votre filme/serie: ");
                    String nameSearch = myObj.nextLine();

                    List<Media> media = new Api().getApi(nameSearch);

                    for (Media m : media) {
                        System.out.println(m.toString());
                    }

                    break;
                case 2:
                    // Perform "encrypt number" case.
                    break;
                case 3:
                    return;

            }
        }

    }
}