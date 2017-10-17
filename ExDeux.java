import java.util.Scanner;

public class ExDeux {

    public static void main(String[] args) {


        //On choisit le chemin d'accès

        Scanner scan = new Scanner(System.in);
        System.out.println("Veuillez saisir un chemin d'accès :");

        String chemAccess = scan.nextLine();
        System.out.println("Vous avez saisi : " + chemAccess + " comme chemin d'accès.");

        System.out.println("La liste des fichiers est:");


        //Liste tous les fichiers du dossier précédent

        String[] fichiers = new java.io.File(chemAccess).list();
            for (int i=0; i<fichiers.length; i++)
            {
                System.out.println(fichiers[i]);
            }
    }
}