package modelo.vo;

import java.util.HashMap;
import controlador.Controlador;

public class ModeloDatos {

	private Controlador miControlador;
	private HashMap<String, EstudianteVO> estudiantesMap;
	
	public ModeloDatos() {
		estudiantesMap = new HashMap<String, EstudianteVO>();
	}
	
	public String registrarEstudiante(EstudianteVO miEstudianteVO) {
		if (estudiantesMap.containsKey(miEstudianteVO.getDocumento())) {
			return "Error, la persona ya se encuentra registrada";
		}		
		estudiantesMap.put(miEstudianteVO.getDocumento(), miEstudianteVO);
		return "El registro ha sido exitoso";
	}
	
	public EstudianteVO consultarEstudiante(String documento) {
		return estudiantesMap.get(documento);
	}
	
	public HashMap<String, EstudianteVO> consultarEstudiantes() {
		return estudiantesMap;
	}
	
	public String actualizarEstudiante(String documento, EstudianteVO estudianteActualizado) {
		if (estudiantesMap.containsKey(documento)) {
			estudiantesMap.put(documento, estudianteActualizado);
			return "El estudiante ha sido actualizado correctamente";
		}
		return "El estudiante no se encuentra en la base de datos";
	}
	
	public String eliminarEstudiante(String documento) {
		if (estudiantesMap.containsKey(documento)) {
			estudiantesMap.remove(documento);
			return "El estudiante ha sido eliminado correctamente";
		}
		return "El estudiante no se encuentra en la base de datos";
	}

	public void setControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}

}

