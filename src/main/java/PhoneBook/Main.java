package PhoneBook;

import java.util.Scanner;

public class Main {

    public static Scanner UserInputScanner;

    public static void main(String[] args)
    {
        UserInputScanner  = new Scanner(System.in);

        String userLastName = getUserInput("Veuillez entrer votre Nom :");
        String userFirstName = getUserInput("Veuillez entrer votre Prénom :");
        String userPhoneNumber = getUserInput("Veuillez entrer votre Numéro :");

        Contact newContact = new Contact(userLastName, userFirstName, userPhoneNumber);


        System.out.println(userLastName);
        System.out.println(userFirstName);
        System.out.println(userPhoneNumber);
        System.out.println(newContact.toString());
    }



        public static String getUserInput(String UserRequest)
        {
            System.out.println(UserRequest);
            return UserInputScanner.nextLine();

        }

}