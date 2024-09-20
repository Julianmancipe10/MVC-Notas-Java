package controlador;

import java.util.ArrayList;
import java.util.HashMap;

import modelo.operaciones.Procesos;
import modelo.vo.EstudianteVO;
import modelo.vo.ModeloDatos;
import vista.gui.VentanaConsulta;
import vista.gui.VentanaConsultaGeneral;
import vista.gui.VentanaConsultaPersonas;
import vista.gui.VentanaOperaciones;

public class Controlador {

	private VentanaOperaciones miVentanaOperaciones;
	private VentanaConsulta miVentanaConsulta;
	private VentanaConsultaGeneral miVentanaConsultaGeneral;
	private VentanaConsultaPersonas miVentanaConsultaPersonas;
	private ModeloDatos miModeloDatos;
	private Procesos miProcesos;

	public void setVentanaOperaciones(VentanaOperaciones miVentanaOperaciones) {
		this.miVentanaOperaciones = miVentanaOperaciones;
		
	}

	public void setVentanaConsulta(VentanaConsulta miVentanaConsulta) {
		this.miVentanaConsulta = miVentanaConsulta;
		
	}

	public void setVentanaConsultaGeneral(VentanaConsultaGeneral miVentanaConsultaGeneral) {
		this.miVentanaConsultaGeneral = miVentanaConsultaGeneral;
		
	}

	public void setVentanaConsultaPersonas(VentanaConsultaPersonas miVentanaConsultaPersonas) {
		this.miVentanaConsultaPersonas = miVentanaConsultaPersonas;
		
	}


	public void setModeloDatos(ModeloDatos miModeloDatos) {
		this.miModeloDatos = miModeloDatos;
		
	}

	public void setProcesos(Procesos miProcesos) {
		this.miProcesos = miProcesos;
		
	}
	
	public void mostrarVentanaOperaciones() {
		miVentanaOperaciones.setVisible(true);
		
	}
	
	public void mostrarVentanaConsulta() {
		miVentanaConsulta.setVisible(true);
		
	}
	
	public void mostrarVentanaConsultaGeneral() {
		miVentanaConsultaGeneral.setVisible(true);
		
	}
	
	public void mostrarVentanaConsultaPersonas() {
		miVentanaConsultaPersonas.setVisible(true);
		
	}
		
	
	public double calcularPromedio(double n1,double n2,double n3) {
		return miProcesos.calcularPromedio(n1, n2, n3);
		
	}
	
	public String registrarEstudiante(EstudianteVO miEstudianteVO) {
		return miModeloDatos.registrarEstudiante(miEstudianteVO);
		
	}
	
	public EstudianteVO consultarEstudiante(String documento) {
		return miModeloDatos.consultarEstudiante(documento);
		
	}
	
	public HashMap<String, EstudianteVO> consultarEstudiantes() {
		return miModeloDatos.consultarEstudiantes();
		
	}

	public String calcularDefinitiva(double promedio) {
		return miProcesos.calcularDefinitiva(promedio);
		
	}
	
	public void llenarAreaTexto() {
		miVentanaConsultaGeneral.llenarAreaTexto();
		
	}

	public String actualizarEstudiante(String documento, EstudianteVO miEstudianteVO2) {
		return	miModeloDatos.actualizarEstudiante(documento, miEstudianteVO2);
	}

	public String eliminarEstudiante(String documento) {
		return miModeloDatos.eliminarEstudiante(documento);
		
	}
	
	public void llenarTabla() {
		miVentanaConsultaPersonas.llenarTabla();
	}

}
