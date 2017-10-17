import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ExQuatre {


    public static void main(String[] args) {


        //Création de l'objet File
        File f = new File("./test.txt");

        //création du scanner pour la saisie
        Scanner scan = new Scanner(System.in);

        //pour savoir où est le fichier que l'on créé
        String path = f.getAbsolutePath();
        System.out.println(path); // ca aussi

        //Ca
        while (scan.hasNextLine()) {
            System.out.println("Texte inséré :");
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }


            System.out.println(input); // affiche à l'écran mais pas dans le fichier
            //création d'un FileWriter
            try(FileWriter fileWriter = new FileWriter(f,true)){ // true pour ajouter le texte a la suite sans écraser la saisie précédente
                fileWriter.write(input); // écriture du string input dans le fichier grace a la fonction .write()
            }


            catch(IOException e){ // traitement d'exception
                e.printStackTrace();
            }
        }
    }
}