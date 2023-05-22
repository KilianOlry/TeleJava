package PhoneBook;

import java.util.Scanner;

public class Main {

    public static Scanner UserInputScanner;

    public static void main(String[] args)
    {
        UserInputScanner  = new Scanner(System.in);

        String userLastName = getUserInput("Veuillez entrer votre Nom");
        String userFirstName = getUserInput("Veuillez entrer votre Prénom");
        String userPhoneNumber = getUserInput("Veuillez entrer votre Numéro");

    }
        public static String getUserInput(String UserRequest)
        {
            System.out.println(UserRequest);
            return UserInputScanner.nextLine();

        }

}