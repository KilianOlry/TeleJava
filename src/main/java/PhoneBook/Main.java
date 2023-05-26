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

        System.out.println(newContact.toString());
    File phoneBookFile = getOrCreatePhoneBookFile("mettre le chemin");




        appendContactToPhoneBook(phoneBookFile, newContact);
    }


        public static String getUserInput(String UserRequest)
        {
            System.out.println(UserRequest);
            return UserInputScanner.nextLine();
        }


        public static File getOrCreatePhoneBookFile(String phoneBookFilePath){
            File phoneBookFile = new File(phoneBookFilePath);

            if(phoneBookFile.exists()){
                return phoneBookFile;
            }
            try {
                phoneBookFile.createNewFile();
                    System.out.println("Le fichier à été créer (" +phoneBookFilePath +")");
                return phoneBookFile;
            } catch (IOException e) {
                    throw new RuntimeException(e);
                }
        }

        public static void appendContactToPhoneBook(File phoneBookFile, Contact newContact){
            try ( BufferedWriter fileWritter = new BufferedWriter(new FileWriter(phoneBookFile, true))){

                fileWritter.append(newContact.toString());
                fileWritter.append('\n');

                System.out.println("Contact ajouté");
            } catch (IOException e){
                e.printStackTrace();
            }
        }
}