package Facturacion;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
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
            String codigo_factura; //Variable para seleccion del usuario en el menu
            do {
                do { /*CICLO PARA ITERAR ENTRE OPCIONES DEL MENU */
                    System.out.println("-----------------------------------------");
                    System.out.println("-- Porfavor, seleccione una opcion:    --");
                    System.out.println("--	1. Consultar                   --");
                    System.out.println("--	2. Imprimir                    --");
                    System.out.println("--	3. Anular                      --");
                    System.out.println("--	4. Regresar                    --");
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
                        System.out.println("--------------------------------------------------");
                        System.out.println("-- Porfavor, Ingrese el código de la factura.   --");
                        System.out.println("--------------------------------------------------");
                        codigo_factura = entrada.next();
                        anular_factura(codigo_factura);
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
            LocalDate date = LocalDate.now();  
            String code;
            String contenido;
            int num         = 0;
            String folder   = "/home/yosmel/Escritorio/Factura";
            File file       = new File(folder);
            
            File[] list     = file.listFiles();
            
            for (int i = 0; i < list.length; i++) {
                num++;
            }
            code = String.format("%03d", num);
            String txt_folder  = "/home/yosmel/Escritorio/Factura/"+ date +'-'+ code +".txt";
            File txt           = new File(txt_folder);
                 
            if(!file.exists()){
                txt.createNewFile();
            }
            
            FileWriter fw     = new FileWriter(txt);
            BufferedWriter bw = new BufferedWriter(fw);
            contenido  = "*************************************************\n";
            contenido += "**             Factura "+code+"                     **\n";
            contenido += "*************************************************\n";
            contenido += "* Fecha: "+date+"                             *\n";
            contenido += "*************************************************\n";
            contenido += "* Nombre:                                       *\n";
            contenido += "* Telefono:                                     *\n";
            contenido += "* Dirección:                                    *\n";
            contenido += "* Status:                                       *\n";
            contenido += "*************************************************\n";
            contenido += "* item:                                         *\n";
            contenido += "* item:                                         *\n";
            contenido += "* item:                                         *\n";
            contenido += "* item:                                         *\n";
            contenido += "* item:                                         *\n";
            contenido += "* item:                                         *\n";
            contenido += "* item:                                         *\n";
            contenido += "* item:                                         *\n";
            contenido += "* item:                                         *\n";
            contenido += "*************************************************\n";
            contenido += "* Total:                                        *\n";
            contenido += "*************************************************\n";
            bw.write(contenido);
            bw.close();
            
            String data         = date+","+code+",1,500,12,";
            String txt_control  = "/home/yosmel/Escritorio/control_factura.txt";
            File control        = new File(txt_control);
                 
            if(!control.exists()){
                txt.createNewFile();
            }
            FileWriter fwr     = new FileWriter(control.getAbsoluteFile(), true);
            BufferedWriter bwr = new BufferedWriter(fwr);
            bwr.write(data);
            bwr.close();
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void anular_factura(String input_codigo )
    {
        try
        {  
            String content;   
            String array_string;   
            String txt_control   = "/home/yosmel/Escritorio/control_factura.txt";
            FileReader fread     = new FileReader(txt_control);            
            BufferedReader bread = new BufferedReader(fread);  
            content = bread.readLine();
            String[] array_content = content.split(","); 
            
            for (int i = 0; i < array_content.length; i++) {
                if(array_content[i].equals(input_codigo)){
                    array_content[i+1] = "0";
                }
            }
            array_string = "";
            for (String txt : array_content) {
                    array_string+= txt+",";
            }
            
            File txt          = new File(txt_control);
            FileWriter fw     = new FileWriter(txt);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(array_string);
            bw.close();

            System.out.println("------------------------------------------");
            System.out.println("-- Factura "+input_codigo+" Anulada!!                --");
            System.out.println("------------------------------------------");
            
        } catch (IOException e) {
            System.out.println("Error en el Exception (linea 47)");
            System.out.println(e.getMessage());
        }
    }
}


