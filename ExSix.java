import java.io.IOException;
import java.io.*;
import java.util.*;
import java.net.*;

public class ExSix {

        private static Scanner scan = new Scanner(System.in);
        private static FileInputStream input = null;
        private static FileOutputStream output = null;



        public static void main(String[] args) {


            try{


                System.out.println("Rentrez une url :");

                URL url = new URL(scan.nextLine());

                URLConnection urlC = url.openConnection();
                urlC.connect();

                System.out.println("Veuillez saisir l'extention du fichier");
                String ext = scan.nextLine();


                 // Création des IO
                 InputStream input = urlC.getInputStream();
                 FileOutputStream output = new FileOutputStream(new File("./img" + ext));

                File f = new File ("./img"+ ext);
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



