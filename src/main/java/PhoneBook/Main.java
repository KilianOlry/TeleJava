package PhoneBook;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner UserInputScanner = new Scanner(System.in);

        System.out.println("Veuillez entrer votre nom");
        String userLastName = UserInputScanner.nextLine();
        System.out.println(userLastName);

    }
}