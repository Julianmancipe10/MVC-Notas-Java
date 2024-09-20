package vista.gui;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controlador.Controlador;
import modelo.operaciones.Procesos;
import modelo.vo.EstudianteVO;

public class VentanaConsultaPersonas extends JFrame {

	private JPanel panelPrincipal;
	private JTable tablaPersonas;
	DefaultTableModel modelo;
	private Controlador miControlador;

	public VentanaConsultaPersonas() {
		setSize(507, 343);
		setTitle("CALCULO DE PROMEDIO");
		setLocationRelativeTo(null);
		setResizable(false);
		iniciarComponentes();
		
	}
	
	private void iniciarComponentes(){
		panelPrincipal = new JPanel();
		panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panelPrincipal);
		panelPrincipal.setLayout(null);
		
		JLabel lblTitulo = new JLabel("MOSTRAR PERSONAS");
		lblTitulo.setBackground(Color.black);
		lblTitulo.setForeground(Color.white);
		lblTitulo.setOpaque(true);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblTitulo.setBounds(0, 0, 499, 50);
		panelPrincipal.add(lblTitulo);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 60, 473, 236);
		panelPrincipal.add(scrollPane);
		
		tablaPersonas = new JTable();
		
		modelo = new DefaultTableModel();
		tablaPersonas.setModel(modelo);
		
		modelo.addColumn("Documento");
		modelo.addColumn("Nombre");
		modelo.addColumn("Nota 1");
		modelo.addColumn("Nota 2");
		modelo.addColumn("Nota 3");
		modelo.addColumn("Promedio");
		
		scrollPane.setViewportView(tablaPersonas);

	}
	
	
	public void borrarTabla() {
		int rowCount = modelo.getRowCount();
	    for (int i = rowCount - 1; i >= 0; i--) {
	        modelo.removeRow(i);
	    }
	}
	

	public void llenarTabla() {
		borrarTabla();
		
		ArrayList <EstudianteVO> estudiantesArray = miControlador.consultarEstudiantes();
		
		for (EstudianteVO est : estudiantesArray) {
			Object[] fila = new Object[6];
			fila[0] = est.getDocumento();
			fila[1] = est.getNombre();
			fila[2] = est.getNota1();
			fila[3] = est.getNota2();
			fila[4] = est.getNota3();
			fila[5] = est.getPromedio();
			
			modelo.addRow(fila);
		}
	}
	

	public void setControlador(Controlador miControlador) {
		this.miControlador = miControlador;
		
	}
	

}










