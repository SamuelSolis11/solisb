import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Fibonacci extends JFrame {

	private JPanel contentPane;
	private JTextField txtPrimero;
	private JTextField txtSegundo;
	private JTextField txtiteracion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fibonacci frame = new Fibonacci();
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
	public Fibonacci() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbPrimero = new JLabel("Primer Numero");
		lbPrimero.setBounds(10, 30, 95, 14);
		contentPane.add(lbPrimero);
		
		JLabel lblSegundo = new JLabel("Segundo Numero");
		lblSegundo.setBounds(10, 86, 114, 14);
		contentPane.add(lblSegundo);
		
		JLabel lbliteraciones = new JLabel("iteraciones");
		lbliteraciones.setBounds(21, 150, 68, 14);
		contentPane.add(lbliteraciones);
		
		txtPrimero = new JTextField();
		txtPrimero.setBounds(134, 27, 86, 20);
		contentPane.add(txtPrimero);
		txtPrimero.setColumns(10);
		
		txtSegundo = new JTextField();
		txtSegundo.setBounds(134, 83, 86, 20);
		contentPane.add(txtSegundo);
		txtSegundo.setColumns(10);
		
		txtiteracion = new JTextField();
		txtiteracion.setBounds(103, 147, 86, 20);
		contentPane.add(txtiteracion);
		txtiteracion.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(287, 96, 68, 22);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("Salir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setBounds(164, 206, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Generar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int intAux , i = 1;
				int n1 = Integer.parseInt(txtPrimero.getText());
				int n2 = Integer.parseInt(txtSegundo.getText());
				int iteraciones = Integer.parseInt(txtiteracion.getText());
				comboBox.removeAllItems();
				do{
					i = i+1;
		            intAux= n2 +n1;
					comboBox.addItem(Integer.toString(intAux));
		            n1=n2;
		            n2 = intAux;
		        }while(i<iteraciones);
			}
		});
		btnNewButton_1.setBounds(31, 206, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Numeros");
		lblNewLabel.setBounds(287, 59, 46, 14);
		contentPane.add(lblNewLabel);
	}

}
