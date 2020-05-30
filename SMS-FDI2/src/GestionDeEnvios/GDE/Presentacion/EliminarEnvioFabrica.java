package GestionDeEnvios.GDE.Presentacion;

import java.awt.BorderLayout;
import java.awt.Color;
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
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

import GestionDeEnvios.GDE.Integracion.DaoEnvios;
import GestionDeEnvios.GDE.Negocio.TransferEnvioFabrica;


public class EliminarEnvioFabrica extends JFrame {

	private JPanel contentPane;
	private JComboBox identificador;
	private DefaultComboBoxModel<String> identificadorModel;
	private List<TransferEnvioFabrica> EnvioFa = new ArrayList<TransferEnvioFabrica>();
	DaoEnvios dao = new DaoEnvios();

	TransferEnvioFabrica nuevoPedido = new TransferEnvioFabrica();
	
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EliminarEnvioFabrica frame = new EliminarEnvioFabrica();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});*/
	

	/**
	 * Create the frame.
	 * @throws FileNotFoundException 
	 */
	public EliminarEnvioFabrica()  {
		this.identificadorModel = new DefaultComboBoxModel<String>();
		identificadorModel.removeAllElements();
		EnvioFa = dao.BuscarEnviosFabrica();
		for ( int i = 0; i<EnvioFa.size(); i++) {
			
			identificadorModel.addElement(EnvioFa.get(i).getID_Envio());
		}
	
		setTitle("Eliminar Envio Fabrica");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255,255,153));
		panel.setForeground(Color.BLACK);
		getContentPane().add(panel, BorderLayout.NORTH);
		
		JLabel lblEliminar = new JLabel("Eliminar ");
		lblEliminar.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		panel.add(lblEliminar);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255,255,153));
		panel_1.setBackground(new Color(255,255,153));
		getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		JLabel lblIdentificador = new JLabel("Identificador");
		lblIdentificador.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblIdentificador.setBounds(50, 22, 131, 31);
		panel_1.add(lblIdentificador);
		
		identificador = new JComboBox<String>(identificadorModel);
		identificador.setBounds(234, 11, 114, 29);
		panel_1.add(identificador);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnConfirmar.setBounds(50, 103, 145, 50);
		btnConfirmar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				TransferEnvioFabrica pedido = new TransferEnvioFabrica();
				pedido.setID_Envio((String) identificador.getSelectedItem());
				ControladorEnvio ctrl = new ControladorEnvio();
					ctrl.EliminarEnvioFa(pedido);
			
			}
		});
		panel_1.add(btnConfirmar);
		
		JButton btnConfirmar_1 = new JButton("Cancelar");
		btnConfirmar_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnConfirmar_1.setFont(new Font("Dialog", Font.PLAIN, 20));
		btnConfirmar_1.setBounds(234, 103, 145, 50);
		panel_1.add(btnConfirmar_1);
		
	
	}
}


