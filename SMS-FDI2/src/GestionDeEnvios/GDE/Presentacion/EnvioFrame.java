package GestionDeEnvios.GDE.Presentacion;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class EnvioFrame extends JFrame {
	
		private static final long serialVersionUID = 1L;
		private JPanel contentPane;
		private ControladorEnvio ctrl;
		public void setCtrl(ControladorEnvio ctrl) {
			this.ctrl = ctrl;
		}
		
	
		public void main() {
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
					ListadoEnvios verventana = new ListadoEnvios();
					
					verventana.show();
				}
			});
			btnNewButton.setBackground(new Color(102, 102, 102));
			btnNewButton.setForeground(new Color(255, 255, 255));
			btnNewButton.setBounds(238, 81, 159, 39);
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
			btnNewButton_1.setBounds(68, 171, 159, 39);
			contentPane.add(btnNewButton_1);
			
			JLabel lblNewLabel = new JLabel("Env\u00EDos");
			lblNewLabel.setForeground(new Color(102, 102, 102));
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
			lblNewLabel.setBounds(265, 12, 98, 31);
			contentPane.add(lblNewLabel);
			
			
			JLabel lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setBounds(238, 139, 165, 157);
			lblNewLabel_1.setIcon(new ImageIcon("src/ImagenGDE.jpg"));
			contentPane.add(lblNewLabel_1);
			
			JButton btnNewButton_2 = new JButton("Pedidos Rechazados");
			btnNewButton_2.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					EnviosRechazados verventana = new EnviosRechazados();
					verventana.show();
				}
				
			});
			btnNewButton_2.setForeground(Color.WHITE);
			btnNewButton_2.setBackground(new Color(102, 102, 102));
			btnNewButton_2.setBounds(407, 171, 159, 39);
			
		
			contentPane.add(btnNewButton_2);
			
		}
	}



