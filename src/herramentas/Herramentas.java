
package herramentas;

import java.io.File;
import java.util.Scanner;

public class Herramentas {

    public static void main(String[] args) {
        System.out.println("escoja un archivo en la siguiente tabla");
        Scanner entra = new Scanner(System.in);     
        Scanner entra2 = new Scanner(System.in);
        System.out.println("1: escritorio");
        System.out.println("2: documentos");
        System.out.println("3: imagenes");
        System.out.println("4: videos");
        System.out.println("5: musica");
        int s = 0,i = 0,n = 0;       
        try {
            s = entra.nextInt();

        } catch (Exception b) {
            System.out.println("Ingrece un número del 1-5 no letras ");
            s= entra2.nextInt();
            
                      
        }
        try{
        switch (s){
            case 0: 
                System.out.println("Ingrece un número mayor a (0)");  
                 s = entra.nextInt();
        }
        }catch (Exception b){
            
        }        
        
                
        
        switch (s) {        
                             
                    
            case 1:
                try {
                    File carpeta = new File("C:\\Users\\SATBOY-DJ\\Desktop");

                    String[] archivos = carpeta.list();
                    for (i = 0; i < archivos.length; i++) {
                        n = i;
                        System.out.println(archivos[i]);

                        System.out.println("total de archivos: " + n);

                    }
                    break;
                } catch (Exception b) {

                }

            case 2:
                try {

                    File carpeta = new File("C:\\Users\\SATBOY-DJ\\Documents");
                    String[] archivos = carpeta.list();
                    for (i = 0; i < archivos.length; i++) {
                        n = i;
                        System.out.println(archivos[i]);

                    }

                    System.out.println("total de archivos: " + n);
                    break;
                } catch (Exception h) {

                }
            case 3:
                try {

                    File carpeta = new File("C:\\Users\\SATBOY-DJ\\Pictures");
                    String[] archivos = carpeta.list();
                    for (i = 0; i < archivos.length; i++) {
                        n = i;
                        System.out.println(archivos[i]);

                    }

                    System.out.println("total de archivos: " + n);
                    break;
                } catch (Exception h) {

                }
            case 4:
                try {

                    File carpeta = new File("C:\\Users\\SATBOY-DJ\\Videos");
                    String[] archivos = carpeta.list();
                    for (i = 0; i < archivos.length; i++) {
                        n = i;
                        System.out.println(archivos[i]);

                    }

                    System.out.println("total de archivos: " + n);
                    break;
                } catch (Exception h) {

                }
            case 5:
                try {

                    File carpeta = new File("C:\\Users\\SATBOY-DJ\\Music");
                    String[] archivos = carpeta.list();
                    for (i = 0; i < archivos.length; i++) {
                        n = i;
                        System.out.println(archivos[i]);

                    }

                    System.out.println("total de archivos: " + n);
                    break;
                } catch (Exception h) {

                } 
}
                }
        }
    
    