package ar.edu.unju.fi.Notas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Alumno alumno = new Alumno();
	
	Scanner scanner= new Scanner (System.in);
	System.out.println("ingrese el legajo: ");
	Integer legajo = scanner.nextInt();
	System.out.println(legajo);
	System.out.println("ingrese el nombre: ");
	String nombre = scanner.next();
	System.out.println("ingrese el apellido: ");
	String apellido = scanner.next();
alumno.setLegajo(legajo);
alumno.setApellido(apellido);
alumno.setNombre(nombre);
int numMaterias=1;
while(numMaterias<=4){
System.out.println("Ingrese el codigo de la materia");
String codigoMateria=scanner.next();
System.out.println("Ingrese el nombre de la materia");
String nombreMateria=scanner.next();
Materia materia=new Materia(codigoMateria,nombreMateria);
System.out.println("Ingrese el codigo del registro de nota:");
String codigoNota= scanner.next();
System.out.println("ingrese la nota final: ");
float nota=scanner.nextFloat();
RegistroNota registroNota=new RegistroNota(codigoNota,alumno,materia,nota);
System.out.println(registroNota.toString());
numMaterias++;

}
	}

}
