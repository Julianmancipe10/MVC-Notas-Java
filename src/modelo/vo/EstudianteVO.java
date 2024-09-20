package modelo.vo;

import controlador.Controlador;

public class EstudianteVO {

	private String documento;
	private String nombre;
	private double nota1;
	private double nota2;
	private double nota3;	
	private double promedio;
	private Controlador miControlador;
	
	
	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double getPromedio() {
		return promedio;
	}

	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}

	@Override
	public String toString() {
		return "Documento = " + documento + "\n" +
				"Nombre = " + nombre + "\n" +
				"Nota1 = " + nota1 + "\n" +
				"Nota2 = " + nota2 + "\n" +
				"Nota3 = " + nota3 + "\n" +
				"Promedio = " + promedio;
	}

	public void setControlador(Controlador miControlador) {
		this.miControlador = miControlador;
		
	}


}
