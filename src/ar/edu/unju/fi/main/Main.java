package ar.edu.unju.fi.main;

import ar.edu.unju.fi.model.Persona;

public class Main {

	public static void main(String[] args) {
System.out.println("Hola Mundo Java");

int numeroAleatorio=1;
Persona persona2 = new Persona();
Persona persona1 = new Persona("Cristian","iturre");
System.out.println("El nombre de la pesrsona es: "+persona1.getNombre()+" y su apellido es "+persona1.getApellido());
persona2.setNombre("Gabriel");
persona2.setApellido("Sandoval");
System.out.println("El nombre de la pesrsona es: "+persona2.getNombre()+" y su apellido es "+persona2.getApellido());	


int i=03;

int enumeracion = 20;

for(int j = 10; i< 8; j+=10) {
enumeracion+= j;
System.out.println("Enumeración "+(i+1)+ " = "+ enumeracion);
i++;

	}

}}
