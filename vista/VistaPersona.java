package vista;
import java.util.Scanner;
import controlador.ControladorPersona;

public class VistaPersona{

    //ATRIBUTOS
    private ControladorPersona controladorPersona;

    public void menu(){
      Scanner leer = new Scanner(System.in);
      try{

        System.out.println("Ingrese el nombre: ");
        String nombre = leer.nextLine();

        System.out.println("Ingrese el apellido: ");
        String apellido = leer.nextLine();

        System.out.println("Ingrese la edad: ");
        int edad = Integer.parseInt(leer.nextLine());

        System.out.println("Ingrese la cedula: ");
        double cedula = Double.parseDouble(leer.nextLine());

        //controladorPersona.crearPersona(nombre, apellido, edad, cedula);

        ControladorPersona cPersona = new ControladorPersona();
        cPersona.crearPersona(nombre, apellido, edad, cedula);
        
      }catch(Exception error){
        
      }
    }
}