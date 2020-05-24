package GestionDeEnvios.GDE.Presentacion;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class EnviosRechazados extends JFrame {
	protected ControladorEnvio _ctrl;
	private JPanel contentPane;
	private List<EnviosRechazados> er = new ArrayList<EnviosRechazados>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EnviosRechazados frame = new EnviosRechazados();
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
	public EnviosRechazados() {
		setTitle("Envios Rechazados");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 629, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(255, 255, 153));
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 598, 217);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
	
		
		JPanel fabricaView = createViewPanel((new JTable(new EnviosRechazadosTableModel(_ctrl))), "Envios Rechazados");
	
		
		
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


