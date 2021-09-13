package Facturacion;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner; //Clase scanner para leer datos del teclado
import javax.swing.JFileChooser;

public class Menu_factura {
    public static void main(String [] args) 
    {
        Operaciones();
    }
    public static void Operaciones() {
            Scanner entrada = new Scanner(System.in); 
            int bandera     = 0; //Variable para manipular el flujo del programa
            int seleccion   = 0; //Variable para seleccion del usuario en el menu
            do {
                do { /*CICLO PARA ITERAR ENTRE OPCIONES DEL MENU */
                    System.out.println("-----------------------------------------");
                    System.out.println("-- Porfavor, seleccione una opcion:    --");
                    System.out.println("--	1. Consultar                   --");
                    System.out.println("--	2. Imprimir                    --");
                    System.out.println("--	3. Anular                      --");
                    System.out.println("--	4. Salir                       --");
                    System.out.println("-----------------------------------------");
                    seleccion = entrada.nextInt(); //Esto recibe la seleccion que el usuario presione 

                    /*CICLO PARA VALIDAR QUE USUARIO INTRODUZCA UN NUMERO VALIDO EN EL MENU */
                    if(seleccion >= 1 && seleccion <=4) {
                            bandera = 1;
                    }else {
                            System.out.println("-------------------------------------------------------");
                            System.out.println("-- Opcion no disponible, vuelva a intentar por favor --");
                            System.out.println("-------------------------------------------------------");
                    }
                }while(bandera == 0);
                /*CICLOS ANIDADOS DEL MENU EN DONDE SE EJECUTA CADA FUNCION */
                switch (seleccion) {
                    case 1:
                        System.out.println("-----------------------------------------");
                        System.out.println("-- Porfavor, Seleccione una factura.   --");
                        System.out.println("-----------------------------------------");
                        consultar_factura();
                    break;
                    case 2:
                        imprimir_factura();
                        System.out.println("--------------------------");
                        System.out.println("-- Factura Generada!!   --");
                        System.out.println("--------------------------");
                    break;
                    case 3:
                        System.out.println("--------------------------");
                        System.out.println("-- Eliminar Factura.    --");
                        System.out.println("--------------------------");
                    break;
                    case 4:
                        System.out.println("-----------------------------");
                        System.out.println("-- Gracias, vuelva pronto. --");
                        System.out.println("-----------------------------");
                        bandera = 2;
                    break;
                }
        }while(bandera != 2);
    }
    public static void consultar_factura() {
        Scanner entrada = null;
        JFileChooser fileChooser = new JFileChooser("/home/yosmel/Escritorio/");
        fileChooser.showOpenDialog(fileChooser);
        try {
            String ruta = fileChooser.getSelectedFile().getAbsolutePath();
            File f  = new File(ruta);
            entrada = new Scanner(f);
            while (entrada.hasNext()) {
                System.out.println(entrada.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("No se ha seleccionado ningún fichero");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (entrada != null) {
                entrada.close();
            }
        }
    }
    public static void imprimir_factura()
    {
        try {
            String code;
            int num         = 0;
            String folder   = "/home/yosmel/Escritorio/";
            File file       = new File(folder);
            
            File[] list     = file.listFiles();
            
            for (int i = 0; i < list.length; i++) {
               num++;
            }
            code = String.format("%03d", num);
            String txt_folder  = "/home/yosmel/Escritorio/Factura "+ code +".txt";
            File txt           = new File(txt_folder);
                 
            if(!file.exists()){
                txt.createNewFile();
            }
            
            FileWriter fw = new FileWriter(txt);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Hola");
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


