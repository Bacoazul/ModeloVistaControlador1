package modelo;

public class Persona {
  
  private String nombre;
  private String apellido ;
  private int edad;
  private double cedula;

  public Persona(String nombre, String apellido, int edad, double cedula){
  
    this.nombre = nombre;
    this.apellido = apellido;
    this.edad = edad;
    this.cedula = cedula;

  }
    
    public String getNombre() {
      return nombre;
    }
  
    public String getApellido() {
      return apellido;
    }
  
    public int getEdad() {
      return edad;
    }
  
    public double getCedula() {
      return cedula;
    }
  
    public void setNombre(String nombre) {
          this.nombre = nombre;
      }
  
    public void setApellido(String apellido) {
          this.apellido = apellido;
      }
  
    public void setEdad(int edad) {
          this.edad = edad;
      }
  
    public void setCedula(double cedula) {
          this.cedula = cedula;
      }
  
}
