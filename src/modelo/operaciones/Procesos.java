package modelo.operaciones;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;

import controlador.Controlador;
import modelo.vo.EstudianteVO;

public class Procesos {
	
	private Controlador miControlador;
	private EstudianteVO miEstudianteVO;

	public double calcularPromedio(double n1,double n2,double n3) {		
		double promedio = (n1 + n2 + n3) / 3;
		
		return promedio;
		
	}

	public String calcularDefinitiva(double promedio) {
		if (promedio < 3.6) {
			return "Reprobado";
		}
		
		return "Aprobado";
	}

	public void imprimirListaEstudiantes() {

	}
	
	public  HashMap<String, EstudianteVO> consultarEstudiantes(){
		return null;
	}

	public EstudianteVO obtenerEstudiante(String doc) {
		EstudianteVO p=null;

		return p;
		
	}

	public void setControlador(Controlador miControlador) {
		this.miControlador = miControlador;
		
	}
	
}
