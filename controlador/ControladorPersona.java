package controlador;
import modelo.Persona;

public class ControladorPersona{
  //ATRIBUTOS
  private Persona[] personas;

  //CONTRUCTOR
  public ControladorPersona(){
    personas = new Persona[10];
  }

  public Persona getPersona(int pos){
    return personas[pos];
  }

  public int lenghtPersona(){
    return personas.length;
  }

  public void setPersona(Persona persona, int pos){
    this.personas[pos] = persona;
  }

  public void crearPersona(String nombre, String apellido, int edad, double cedula){
    Persona persona = new Persona(nombre, apellido, edad, cedula);
    System.out.println("La persona es: "+persona);
    setPersona(persona, 0);
    System.out.println("La persona es: "+persona);
    String str = personas.toString();
    System.out.println(str);
  }

  
  
}