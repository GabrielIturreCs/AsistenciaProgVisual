package ar.edu.unju.fi.model;

import java.time.LocalDate;

public class Persona {
private String nombre;
private String apellido;
private LocalDate fechadenacimiento;
private float peso;
private String correo;
private String dni;
public Persona() {
System.out.println("se ha creado el objeto");
}
public Persona(String nombre,String apellido) {
this.nombre=nombre;
this.apellido=apellido;

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


}
  