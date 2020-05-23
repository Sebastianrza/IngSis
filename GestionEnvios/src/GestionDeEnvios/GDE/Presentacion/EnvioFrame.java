package GestionDeEnvios.GDE.Presentacion;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class EnvioFrame extends JFrame {
	
		private static final long serialVersionUID = 1L;
		private JPanel contentPane;

		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				@Override
				public void run() {
					try {
						EnvioFrame frame = new EnvioFrame();
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
		public EnvioFrame() {
			setTitle("Env\u00EDos");
			setBackground(new Color(255, 255, 153));
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 651, 416);
			contentPane = new JPanel();
			contentPane.setBackground(new Color(255, 255, 153));
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JButton btnNewButton = new JButton("Listado de Env\u00EDos");
			btnNewButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					ListadoEnvio1 verventana = new ListadoEnvio1();
					
					verventana.show();
				}
			});
			btnNewButton.setBackground(new Color(102, 102, 102));
			btnNewButton.setForeground(new Color(255, 255, 255));
			btnNewButton.setBounds(63, 89, 159, 39);
			contentPane.add(btnNewButton);
			
			JButton btnNewButton_1 = new JButton("Pendientes");
			btnNewButton_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ListadoPendiente verventana = new ListadoPendiente();
				
				verventana.show();
			}
		});
			btnNewButton_1.setBackground(new Color(102, 102, 102));
			btnNewButton_1.setForeground(new Color(255, 255, 255));
			btnNewButton_1.setBounds(63, 171, 159, 39);
			contentPane.add(btnNewButton_1);
			
			JLabel lblNewLabel = new JLabel("Env\u00EDos");
			lblNewLabel.setForeground(new Color(102, 102, 102));
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
			lblNewLabel.setBounds(237, 30, 98, 31);
			contentPane.add(lblNewLabel);
			
			JButton btnNewButton_3 = new JButton("Modificar Envio");
			btnNewButton_3.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					ModificarEnvio verventana = new ModificarEnvio();
					
					verventana.show();
				}
			});
			btnNewButton_3.setForeground(new Color(255, 255, 255));
			btnNewButton_3.setBackground(new Color(102, 102, 102));
			btnNewButton_3.setBounds(315, 171, 251, 39);
			contentPane.add(btnNewButton_3);
	        
	    
		}
	}



