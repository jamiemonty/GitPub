package ie.atu.interface1;
import java.sql.SQLOutput;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("\n\nHello and welcome to GitPub!\n\nPlease enter 1 if you're a Customer or 2 if you're a Publican: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Welcome! Please select what area you would like to visit\n");
                System.out.println("1. Eyre Square\t 2. Shop Street\t 3. Other\nArea: ");
                int area = scanner.nextInt();
                switch (area){
                    case 1:
                        System.out.println("Eyre Square\n");
                        //calls for pubSelect then populates the page with the pubs, the user then enters what pub they'd like
                        //then the pub prices for drinks is shown along with a review.
                        break;
                    case 2:
                        System.out.println("Shop Street\n");
                        break;

                    case 3:
                        System.out.println("Other\n");
                        break;
                }
                break;
            case 2://Prompts the user for a username and password, then asked to select what command they want to complete.
                Admin.authenticate();
                break;
            default:
                System.out.println("Invalid choice.");


        }
    }
}