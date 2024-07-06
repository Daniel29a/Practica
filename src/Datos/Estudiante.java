
package Datos;


public class Estudiante {

  private int Id;
  private String nombre;
  private String apellido;
  private int edad;
  private String FechaNacimiento;

    public Estudiante() {
    }

    public Estudiante(int Id, String nombre, String apellido, int edad, String FechaNacimiento) {
        this.Id = Id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.FechaNacimiento = FechaNacimiento;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(String FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Estudiante{");
        sb.append("Id=").append(Id);
        sb.append(", nombre=").append(nombre);
        sb.append(", apellido=").append(apellido);
        sb.append(", edad=").append(edad);
        sb.append(", FechaNacimiento=").append(FechaNacimiento);
        sb.append('}');
        return sb.toString();
    }
     
 
}
