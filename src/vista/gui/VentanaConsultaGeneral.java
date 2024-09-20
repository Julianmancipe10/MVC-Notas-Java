package vista.gui;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import controlador.Controlador;
import modelo.operaciones.Procesos;
import modelo.vo.EstudianteVO;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class VentanaConsultaGeneral extends JFrame {

	private JPanel panelPrincipal;
	private JTextArea areaInformacion;
	private Controlador miControlador;

	
	public VentanaConsultaGeneral() {
		
		setSize(527, 337);
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
		
		JLabel lblTitulo = new JLabel("IMPRIMIR INFORMACION");
		lblTitulo.setBackground(Color.black);
		lblTitulo.setForeground(Color.white);
		lblTitulo.setOpaque(true);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblTitulo.setBounds(0, 0, 499, 50);
		panelPrincipal.add(lblTitulo);
		
		JScrollPane scroll = new JScrollPane();
		scroll.setBounds(10, 60, 489, 230);
		panelPrincipal.add(scroll);
		
		areaInformacion = new JTextArea();
		areaInformacion.setWrapStyleWord(true);
		areaInformacion.setLineWrap(true);
		areaInformacion.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 16));
		scroll.setViewportView(areaInformacion);

	}

	
	public void llenarAreaTexto() {
		areaInformacion.setText(miControlador.consultarEstudiantes().toString());
		
	}

	public void setControlador(Controlador miControlador) {
		this.miControlador = miControlador;
		
	}
}
