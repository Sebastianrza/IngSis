package GestionDeEnvios.GDE.Presentacion;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class ListadoEnvio1 extends JFrame {

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
			@Override
			public void run() {
				try {
					ListadoEnvio1 frame = new ListadoEnvio1();
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
	public ListadoEnvio1() {
		
	
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setBackground(new Color(255, 255, 153));
		setContentPane(contentPane);
		
		
	
		
		JPanel mainPanel = new JPanel(new BorderLayout());
		this.setContentPane(mainPanel);
		setSize(800, 492);
		
	
		JPanel viewsPanel = new JPanel();
		mainPanel.add(viewsPanel, BorderLayout.CENTER);
		
		JPanel tablesPanel = new JPanel();
		tablesPanel.setLayout(new BoxLayout(tablesPanel, BoxLayout.Y_AXIS));
		viewsPanel.add(tablesPanel);
		
		// tables
		JPanel fabricaView = createViewPanel((new JTable(new EnvioFabricaTableModel(_ctrl))), "Envios Fabrica");
		JPanel almacenView = createViewPanel(new JTable(new EnvioAlmacenTableModel(_ctrl)), "Envios Almacen");
		JPanel labView = createViewPanel(new JTable(new EnvioLabTableModel(_ctrl)), "Envios Laboratorio");
		JPanel medView = createViewPanel(new JTable(new EnvioMedicoTableModel(_ctrl)), "Envio Medico");
		
		fabricaView.setPreferredSize(new Dimension(500, 200));
		almacenView.setPreferredSize(new Dimension(500, 200));
		labView.setPreferredSize(new Dimension(500, 200));
		medView.setPreferredSize(new Dimension(500, 200));
		
		tablesPanel.add(fabricaView);
		tablesPanel.add(almacenView);
		tablesPanel.add(labView);
		tablesPanel.add(medView);
		// TODO add other tables
		// ...
		
		this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		this.pack();
		this.setVisible(true);
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
