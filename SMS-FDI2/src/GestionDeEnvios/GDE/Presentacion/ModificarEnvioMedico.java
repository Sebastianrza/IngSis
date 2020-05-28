package GestionDeEnvios.GDE.Presentacion;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

import GestionDeEnvios.GDE.Integracion.DaoEnvios;
import GestionDeEnvios.GDE.Negocio.SAEnvios;
import GestionDeEnvios.GDE.Negocio.TransferEnvioMedico;


public class ModificarEnvioMedico extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JComboBox id;

	private DefaultComboBoxModel<String> identificadorModel;
	private JTextField descripcion;
	private JTextField compuesto;
	private JTextField origen;
	private JTextField destinatario;
	private  JTextField cantidad;
	private JPanel contentPane;
	private JComboBox estado;
	private JTextField textField;
	private List<TransferEnvioMedico> EnvioMe = new ArrayList<TransferEnvioMedico>();
	DaoEnvios dao = new DaoEnvios();
	TransferEnvioMedico nuevoPedido = new TransferEnvioMedico();
	
	private SAEnvios sa;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModificarEnvioMedico frame = new ModificarEnvioMedico();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 * @throws FileNotFoundException 
	 */
	public ModificarEnvioMedico() {
		this.identificadorModel = new DefaultComboBoxModel<String>();
		identificadorModel.removeAllElements();
		EnvioMe = dao.BuscarEnviosMedico();
		for ( int i = 0; i<EnvioMe.size(); i++) {
			
			identificadorModel.addElement(EnvioMe.get(i).getID_Envio());
		}
		setTitle("Modificar Envio Medico");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 408);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		JLabel lblModificar = new JLabel("Modificar ");
		lblModificar.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		panel.add(lblModificar);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255,255,153));
		getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		
		JLabel lblIdentificador = new JLabel("Identificador");
		lblIdentificador.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblIdentificador.setBounds(50, 22, 131, 31);
		panel_1.add(lblIdentificador);
		
		id = new JComboBox<String>(identificadorModel);
		id.setBounds(206, 22, 142, 29);
		panel_1.add(id);
		
		JLabel lblProducto = new JLabel("Descripcion");
		lblProducto.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblProducto.setBounds(50, 64, 138, 19);
		panel_1.add(lblProducto);
		
		descripcion = new JTextField();
		descripcion.setEditable(true);
		descripcion.setBounds(206, 63, 142, 20);
		panel_1.add(descripcion);
		descripcion.setColumns(10);
		
		JLabel lblDescripcion = new JLabel("Compuesto");
		lblDescripcion.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblDescripcion.setBounds(50, 170, 131, 14);
		panel_1.add(lblDescripcion);
		
		compuesto = new JTextField();
		compuesto.setEditable(true);
		compuesto.setBounds(206, 169, 142, 20);
		panel_1.add(compuesto);
		compuesto.setColumns(10);
		
		JLabel lblorigen = new JLabel("Origen");
		lblorigen.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblorigen.setBounds(50, 95, 82, 14);
		panel_1.add(lblorigen);
		
		origen = new JTextField();
		origen.setBounds(206, 95, 142, 20);
		panel_1.add(origen);
		origen.setColumns(10);
		
		JLabel lbldestino = new JLabel("Destino");
		lbldestino.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lbldestino.setBounds(50, 133, 82, 14);
		panel_1.add(lbldestino);
		
		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblCantidad.setBounds(50, 220, 97, 14);
		panel_1.add(lblCantidad);
		
		cantidad = new JTextField();
		cantidad.setBounds(206, 217, 142, 24);
		panel_1.add(cantidad);
		
		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblEstado.setBounds(50, 257, 91, 14);
		panel_1.add(lblEstado);
		
	
		estado = new JComboBox<String>();
		estado.addItem("Aceptado");
		estado.addItem("Rechazado");
		estado.addItem("Transito");
		estado.addItem("Entregado");
		estado.setBounds(206, 260, 142, 29);
		panel_1.add(estado);
		
		destinatario = new JTextField();
		destinatario.setEditable(true);
		destinatario.setColumns(10);
		destinatario.setBounds(206, 127, 142, 20);
		panel_1.add(destinatario);
		
		JButton btnConfirmar = new JButton("Guardar");
		btnConfirmar.setBackground(Color.WHITE);
		btnConfirmar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnConfirmar.setBounds(85, 320, 121, 35);
		btnConfirmar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				ControladorEnvio ctrl = new ControladorEnvio();
				TransferEnvioMedico pedido = new TransferEnvioMedico();
				pedido.setID_Envio((String) id.getSelectedItem());
				pedido.setOrigen(origen.getText());
				pedido.setDestinatario(destinatario.getText());
				pedido.setDescripcion(descripcion.getText());
				pedido.setCompuesto(compuesto.getText());
				pedido.setCantidad(cantidad.getText());
				pedido.setSe((String) estado.getSelectedItem());
				ctrl.ModificarEnvioMe(pedido);
				
			}
		});
		panel_1.add(btnConfirmar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnCancelar.setBackground(Color.WHITE);
		btnCancelar.setBounds(253, 320, 121, 35);
		panel_1.add(btnCancelar);
		
		
		
	}
}


