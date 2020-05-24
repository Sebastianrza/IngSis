package GestionDeEnvios.GDE.Presentacion;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.EmptyBorder;

import GestionDeEnvios.GDE.Integracion.DaoEnvios;
import GestionDeEnvios.GDE.Negocio.TransferEnvioMedico;

public class ModificarEnvioMedico extends JFrame {
	private JComboBox id;

	private DefaultComboBoxModel<String> identificadorModel;
	private JTextField producto;
	private JTextField compuesto;
	private JTextField origen;
	private JTextField destinatario;
	private JSpinner cantidad;
	private JPanel contentPane;
	private JComboBox estado;
	private JTextField textField;
	private List<TransferEnvioMedico> EnvioMe = new ArrayList<TransferEnvioMedico>();
	DaoEnvios dao = new DaoEnvios();
	
	TransferEnvioMedico nuevoPedido = new TransferEnvioMedico();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
	}

	/**
	 * Create the frame.
	 * @throws FileNotFoundException 
	 */
	public ModificarEnvioMedico() throws FileNotFoundException {
		this.identificadorModel = new DefaultComboBoxModel<String>();
		identificadorModel.removeAllElements();
		EnvioMe = dao.addPedidoMedico(nuevoPedido);
		for ( int i = 0; i<EnvioMe.size(); i++) {
			
			identificadorModel.addElement(EnvioMe.get(i).getID_Envio());
		}
		setTitle("Modificar Envio Medico");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
		
		JLabel lblProducto = new JLabel("Producto");
		lblProducto.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblProducto.setBounds(50, 64, 82, 14);
		panel_1.add(lblProducto);
		
		producto = new JTextField();
		producto.setEditable(false);
		producto.setBounds(206, 89, 142, 20);
		panel_1.add(producto);
		producto.setColumns(10);
		
		JLabel lblDescripcion = new JLabel("Compuesto");
		lblDescripcion.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblDescripcion.setBounds(46, 170, 131, 14);
		panel_1.add(lblDescripcion);
		
		compuesto = new JTextField();
		compuesto.setBounds(206, 169, 142, 20);
		panel_1.add(compuesto);
		compuesto.setColumns(10);
		
		JLabel lblorigen = new JLabel("Origen");
		lblorigen.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblorigen.setBounds(46, 90, 82, 14);
		panel_1.add(lblorigen);
		
		origen = new JTextField();
		origen.setEditable(false);
		origen.setBounds(206, 132, 142, 20);
		panel_1.add(origen);
		origen.setColumns(10);
		
		JLabel lbldestino = new JLabel("Destino");
		lbldestino.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lbldestino.setBounds(50, 133, 82, 14);
		panel_1.add(lbldestino);
		
		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblCantidad.setBounds(46, 220, 97, 14);
		panel_1.add(lblCantidad);
		
		cantidad = new JSpinner();
		cantidad.setModel(new SpinnerNumberModel(1, 1, 100, 1));
		cantidad.setBounds(206, 217, 142, 24);
		panel_1.add(cantidad);
		
		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblEstado.setBounds(52, 275, 91, 14);
		panel_1.add(lblEstado);
		
		//estadoModel = new DefaultComboBoxModel<String>();
		//estado = new JComboBox<String>(estadoModel);
		/*estado.setBounds(206, 260, 142, 29);
		panel_1.add(estado);*/
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(206, 63, 142, 20);
		panel_1.add(textField);
		
		JButton btnConfirmar = new JButton("Guardar");
		btnConfirmar.setBackground(Color.WHITE);
		btnConfirmar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnConfirmar.setBounds(85, 320, 121, 35);
		btnConfirmar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			/*	TransferPedidoImp nuevoPedido = new TransferPedidoImp();
				
				nuevoPedido.setType(type);
				nuevoPedido.setIdPedido((String) identificador.getSelectedItem());
				nuevoPedido.setUsuario("Gestor Fabrica");
				nuevoPedido.setNombre(descripcion.getText());
				nuevoPedido.setCompuesto("null");
				nuevoPedido.setProducto(producto.getText());
				nuevoPedido.setCantidad((int) cantidad.getValue());
				nuevoPedido.setEstadoPedido((String) estado.getSelectedItem());
				
				controlador.modificaPedido(nuevoPedido);
				
				VistaModificaPedido.this.dispose();*/
			}
		});
		panel_1.add(btnConfirmar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnCancelar.setBackground(Color.WHITE);
		btnCancelar.setBounds(253, 320, 121, 35);
		panel_1.add(btnCancelar);
		btnCancelar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
	}
}


