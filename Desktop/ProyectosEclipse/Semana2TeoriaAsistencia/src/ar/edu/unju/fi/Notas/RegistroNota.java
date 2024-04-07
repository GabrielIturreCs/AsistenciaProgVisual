package ar.edu.unju.fi.Notas;

public class RegistroNota {
private String codigo;
private Alumno alumno;
private Materia materia;
private float notalFinal;


public RegistroNota() {
	
	
}


public RegistroNota(String codigo, Alumno alumno, Materia materia, float notalFinal) {
	super();
	this.codigo = codigo;
	this.alumno = alumno;
	this.materia = materia;
	this.notalFinal = notalFinal;
}


@Override
public String toString() {
	return "RegistroNota [codigo=" + codigo + ", alumno=" + alumno + ", materia=" + materia + ", notalFinal="
			+ notalFinal + "]";
}


public String getCodigo() {
	return codigo;
}


public void setCodigo(String codigo) {
	this.codigo = codigo;
}


public Alumno getAlumno() {
	return alumno;
}


public void setAlumno(Alumno alumno) {
	this.alumno = alumno;
}


public Materia getMateria() {
	return materia;
}


public void setMateria(Materia materia) {
	this.materia = materia;
}


public float getNotalFinal() {
	return notalFinal;
}


public void setNotalFinal(float notalFinal) {
	this.notalFinal = notalFinal;
}
}
