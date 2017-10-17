import java.io.File;
import java.util.Scanner;
import java.io.FilenameFilter;


public class ExTrois {


    public static void main(String[] args) {

        //implantation du scanner

        Scanner scan = new Scanner(System.in);


        //choix du chmein d'accès

        System.out.println("Veuillez saisir un chemin d'accès :");
        String chemAccess = scan.nextLine();


        //Choix de l'extention

        System.out.println("Veuillez saisir l'extention souhaitée :");
        String ext = scan.nextLine();

        System.out.println("Vous avez saisi : " + chemAccess + " comme chemin d'accès et " + ext + " comme extention." + "\n\n");

        System.out.println("La liste des fichiers est:" + listExt(chemAccess, ext));

    }



    static String listExt(String chemAccess, String ext) {

        File fichier = new File(chemAccess);


        if (!fichier.exists() || !fichier.isDirectory()) {
            return ("Le dossier n'existe pas.");

        } else {
            FilenameFilter filter = new FilenameFilter() {

                public boolean accept(File dir, String name) {
                    if (name.toLowerCase().endsWith(ext)) {
                        return true;
                    } else {
                        return false;
                    }
                }
            };
            String list =  fichier.getAbsolutePath()  + "\n\n";
            for (String element : fichier.list(filter)){

                list += (element + "\n");
            }
            return list;
        }
    }
}
