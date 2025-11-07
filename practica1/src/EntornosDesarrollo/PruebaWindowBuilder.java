package EntornosDesarrollo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PruebaWindowBuilder {

	private JFrame frame;
	private JTextField sumando1;
	private JTextField sumando2;
	private JTextField resultado;
	private JTextField suma1Window;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PruebaWindowBuilder window = new PruebaWindowBuilder();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PruebaWindowBuilder() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		sumando1 = new JTextField();
		sumando1.setText("Sumando1");
		sumando1.setBounds(10, 25, 96, 18);
		frame.getContentPane().add(sumando1);
		sumando1.setColumns(10);
		
		sumando2 = new JTextField();
		sumando2.setText("Sumando2");
		sumando2.setColumns(10);
		sumando2.setBounds(10, 53, 96, 18);
		frame.getContentPane().add(sumando2);
		
		resultado = new JTextField();
		resultado.setText("Resultado");
		resultado.setColumns(10);
		resultado.setBounds(10, 87, 96, 18);
		frame.getContentPane().add(resultado);
		
		suma1Window = new JTextField();
		suma1Window.setBounds(148, 25, 96, 18);
		frame.getContentPane().add(suma1Window);
		suma1Window.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(148, 53, 96, 18);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(148, 87, 96, 18);
		frame.getContentPane().add(textField_2);
		
		JButton suma = new JButton("SUMA");
		suma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int Sumando1= Integer.parseInt(sumando1.getText());
				int Sumando2= Integer.parseInt(sumando2.getText());
				
				int Resultado=Sumando1+Sumando2;
				 String texto= String.valueOf(Resultado);
				 textField_2.setText(texto);
	
			}
		});
		suma.setBounds(160, 130, 84, 20);
		frame.getContentPane().add(suma);
	}

}
