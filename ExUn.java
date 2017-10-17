import java.util.Scanner;
import java.io.File;



public class ExUn {


    //Choix du chemin d'accès

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Veuillez saisir un chemin d'accès :");
        String chemAccess = scan.nextLine();
        System.out.println("Vous avez saisi : " + chemAccess + " comme chemin d'accès.");


        //Traitement du chemin d'accès

        File f = new File(chemAccess);

        System.out.println("Chemin absolu du fichier : " + f.getAbsolutePath());
        System.out.println("Nom du fichier : " + f.getName());
        System.out.println("Est-ce qu'il existe ? " + f.exists());
        System.out.println("Est-ce un répertoire ? " + f.isDirectory());
        System.out.println("Est-ce un fichier ? " + f.isFile());
    }
}
