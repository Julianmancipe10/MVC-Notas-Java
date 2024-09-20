package controlador;

import modelo.operaciones.Procesos;
import modelo.vo.EstudianteVO;
import modelo.vo.ModeloDatos;
import vista.gui.VentanaConsulta;
import vista.gui.VentanaConsultaGeneral;
import vista.gui.VentanaConsultaPersonas;
import vista.gui.VentanaOperaciones;

public class Relaciones {
	
	public Relaciones() {
		Controlador miControlador = new Controlador();
		VentanaOperaciones miVentanaOperaciones = new VentanaOperaciones();
		VentanaConsulta miVentanaConsulta = new VentanaConsulta();
		VentanaConsultaGeneral miVentanaConsultaGeneral = new VentanaConsultaGeneral();
		VentanaConsultaPersonas miVentanaConsultaPersonas = new VentanaConsultaPersonas();
		ModeloDatos miModeloDatos = new ModeloDatos();
		Procesos miProcesos = new Procesos();
		
		miVentanaOperaciones.setControlador(miControlador);
		miVentanaConsulta.setControlador(miControlador);
		miVentanaConsultaGeneral.setControlador(miControlador);
		miVentanaConsultaPersonas.setControlador(miControlador);
		miModeloDatos.setControlador(miControlador);
		miProcesos.setControlador(miControlador);
		
		miControlador.setVentanaOperaciones(miVentanaOperaciones);
		miControlador.setVentanaConsulta(miVentanaConsulta);
		miControlador.setVentanaConsultaGeneral(miVentanaConsultaGeneral);
		miControlador.setVentanaConsultaPersonas(miVentanaConsultaPersonas);
		miControlador.setModeloDatos(miModeloDatos);
		miControlador.setProcesos(miProcesos);
		
		miControlador.mostrarVentanaOperaciones();
		
	}

}
