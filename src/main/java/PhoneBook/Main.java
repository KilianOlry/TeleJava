package PhoneBook;

import javax.imageio.IIOException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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



        File phoneBookFile = new File("C:\\Users\\Kilian\\Desktop\\DEV\\Projet\\Java\\TeleJava\\info.txt");

        if(phoneBookFile.exists()){
            System.out.println("le fichier existe");
        }else {
            System.out.println("le fichier n'existe pas");
            try {
                phoneBookFile.createNewFile();
                System.out.println("Le fichier à été créer");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        try {
            BufferedWriter fileWritter = new BufferedWriter(new FileWriter(phoneBookFile, true));
            fileWritter.append(newContact.toString());
            fileWritter.append('\n');
            System.out.println("Contact ajouté");
            fileWritter.close();
        } catch (IOException e){
            e.printStackTrace();
        }


        System.out.println(newContact.toString());
    }



        public static String getUserInput(String UserRequest)
        {
            System.out.println(UserRequest);
            return UserInputScanner.nextLine();
        }

}