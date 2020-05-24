package GestionDeEnvios.GDE.Presentacion;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;

import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class ListadoEnvios extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private ControladorEnvio _ctrl;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListadoEnvios frame = new ListadoEnvios();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ListadoEnvios() {
		setBackground(new Color(255,255,153));
		
		setTitle("Listado de Envios");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 840, 648);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setBackground(new Color(255,255,153));
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 598, 617);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
	
		
		JPanel fabricaView = createViewPanel((new JTable(new EnvioFabricaTableModel(_ctrl))), "Envios Fabrica");
		JPanel almacenView = createViewPanel(new JTable(new EnvioAlmacenTableModel(_ctrl)), "Envios Almacen");
		JPanel labView = createViewPanel(new JTable(new EnvioLabTableModel(_ctrl)), "Envios Laboratorio");
		JPanel medView = createViewPanel(new JTable(new EnvioMedicoTableModel(_ctrl)), "Envio Medico");
		
		
		fabricaView.setPreferredSize(new Dimension(500, 150));
		fabricaView.setBackground(new Color(255, 255, 153));
		almacenView.setPreferredSize(new Dimension(500, 150));
		almacenView.setBackground(new Color(255, 255, 153));
		labView.setPreferredSize(new Dimension(500, 150));
		labView.setBackground(new Color(255, 255, 153));
		medView.setPreferredSize(new Dimension(500, 150));
		medView.setBackground(new Color(255, 255, 153));
		
		
		panel.add(fabricaView);
		panel.add(almacenView);
		panel.add(labView);
		panel.add(medView);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(598, 12, 255, 698);
		panel_1.setBackground(new Color(255, 255, 153));
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Modificar");
		btnNewButton.setBounds(69, 28, 99, 25);
		panel_1.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ModificarEnvioFabrica mef;
				try {
					mef = new ModificarEnvioFabrica();
					mef.setVisible(true);
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
			
		});
		
		JButton btnEliminar_3 = new JButton("Eliminar");
		btnEliminar_3.setBounds(69, 65, 99, 25);
		panel_1.add(btnEliminar_3);
		btnEliminar_3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				EliminarEnvioFabrica eef;
				try {
					eef = new EliminarEnvioFabrica();
					eef.setVisible(true);
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
			
		});
		
		JButton btnModificar_2 = new JButton("Modificar");
		btnModificar_2.setBounds(69, 176, 99, 25);
		panel_1.add(btnModificar_2);
		btnModificar_2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ModificarEnvioAlmacen mea;
				try {
					mea = new ModificarEnvioAlmacen();
					mea.setVisible(true);
					
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
			}
			
		});
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(69, 213, 99, 25);
		panel_1.add(btnEliminar);
		btnEliminar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				EliminarEnvioAlmacen eea;
				try {
					eea = new EliminarEnvioAlmacen();
					eea.setVisible(true);
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
			
		});
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBounds(69, 340, 99, 25);
		panel_1.add(btnModificar);
		btnModificar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ModificarEnvioLab melab;
				try {
					melab = new ModificarEnvioLab();
					melab.setVisible(true);
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
			
		});
		JButton btnEliminar_1 = new JButton("Eliminar");
		btnEliminar_1.setBounds(69, 377, 99, 25);
		panel_1.add(btnEliminar_1);
		btnEliminar_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					EliminarEnvioLab eelab = new EliminarEnvioLab();
					eelab.setVisible(true);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
			
		});
		
		JButton btnModificar_1 = new JButton("Modificar");
		btnModificar_1.setBounds(69, 491, 99, 25);
		panel_1.add(btnModificar_1);
		btnModificar_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ModificarEnvioMedico meme;
				try {
					meme = new ModificarEnvioMedico();
					meme.setVisible(true);
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
			
		});
		
		JButton btnEliminar_2 = new JButton("Eliminar");
		btnEliminar_2.setBounds(69, 528, 99, 25);
		panel_1.add(btnEliminar_2);
		btnEliminar_2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					EliminarEnvioMedico eeme = new EliminarEnvioMedico();
					eeme.setVisible(true);
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
			
		});
		
		
		
	}
	
	
	private JPanel createViewPanel(JComponent c, String title) {
		JPanel p = new JPanel( new BorderLayout() );
		
		// TODO add a framed border to p with title
		TitledBorder titlee;
		titlee = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black), title);
		p.setBorder(titlee);
		//
		
		p.add(new JScrollPane(c));
		return p;
	}
}
