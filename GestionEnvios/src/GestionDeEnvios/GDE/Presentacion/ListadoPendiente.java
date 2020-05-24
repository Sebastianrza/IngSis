package GestionDeEnvios.GDE.Presentacion;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class ListadoPendiente extends JFrame {

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
					ListadoPendiente frame = new ListadoPendiente();
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
	public ListadoPendiente() {
		setBackground(new Color(255,255,153));
		setTitle("Envios Pendientes");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 700, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setBackground(new Color(255,255,153));
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 598, 217);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
	
		
		JPanel fabricaView = createViewPanel((new JTable(new EnviosPendientesTableModel(_ctrl))), "Envios Pendientes");
	
		
		
		fabricaView.setPreferredSize(new Dimension(150, 150));
		fabricaView.setBackground(new Color(255, 255, 153));
		
	
		
		
		panel.add(fabricaView);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(598, 12, 255, 398);
		panel_1.setBackground(new Color(255, 255, 153));
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		
		
		
		
	}
	
	
	private JPanel createViewPanel(JComponent c, String title) {
		JPanel p = new JPanel( );
		p.setSize(598, 200);
		
		// TODO add a framed border to p with title
		TitledBorder titlee;
		titlee = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black), title);
		p.setBorder(titlee);
		p.setLayout(null);
		//
		
		JScrollPane scrollPane = new JScrollPane(c);
		scrollPane.setBounds(5, 17, 588, 174);
		p.add(scrollPane);
		return p;
	}
}


