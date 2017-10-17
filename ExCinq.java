import java.util.*;
import java.io.*;

public class ExCinq {


    private static FileInputStream input = null;
    private static FileOutputStream output = null;

    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);

        System.out.println("Veuillez saisir le chemin d'accès complet de fichier ainsi que son nom: ");
        String fichierCopie = scan.nextLine();

        System.out.println("Veuillez saisir l'extention du fichier");
        String ext = scan.nextLine();


        try{
            
            File f = new File ("./fichierColle"+ ext);
            // Création des IO
            FileInputStream input = new FileInputStream(new File(fichierCopie));
            FileOutputStream output = new FileOutputStream(f);

            System.out.println("le fichier à été copié à cette url: " + f.getAbsolutePath());



            byte[] buf = new byte[8];
            int i = 0;


            while ((i = input.read(buf)) >= 0) {
                // En copiant le contenu du buffeur dans notre fichier de sortie
                output.write(buf);
                // On réinitialise le buffeur
                buf = new byte[8];
            }
            System.out.println("Copie effectuée");
        }

        catch(IOException e){
            e.printStackTrace();
        }
        finally { // On ferme nos IO
            try {
                if (input != null) {
                    input.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (output != null) {
                    output.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}

