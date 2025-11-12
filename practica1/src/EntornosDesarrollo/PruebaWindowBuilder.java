package EntornosDesarrollo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PruebaWindowBuilder {

	private JFrame frame;
	private JTextField numero1;
	private JTextField numero2;
	private JTextField resultado;
	private JTextField suma1Window;
	private JTextField suma2Window;
	private JTextField resultadoWindow;

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
		
		numero1 = new JTextField();
		numero1.setText("Sumando1");
		numero1.setBounds(10, 25, 96, 18);
		frame.getContentPane().add(numero1);
		numero1.setColumns(10);
		
		numero2 = new JTextField();
		numero2.setText("Sumando2");
		numero2.setColumns(10);
		numero2.setBounds(10, 53, 96, 18);
		frame.getContentPane().add(numero2);
		
		resultado = new JTextField();
		resultado.setText("Resultado");
		resultado.setColumns(10);
		resultado.setBounds(10, 87, 96, 18);
		frame.getContentPane().add(resultado);
		
		suma1Window = new JTextField();
		suma1Window.setBounds(148, 25, 96, 18);
		frame.getContentPane().add(suma1Window);
		suma1Window.setColumns(10);
		
		suma2Window = new JTextField();
		suma2Window.setColumns(10);
		suma2Window.setBounds(148, 53, 96, 18);
		frame.getContentPane().add(suma2Window);
		
		resultadoWindow = new JTextField();
		resultadoWindow.setColumns(10);
		resultadoWindow.setBounds(148, 87, 96, 18);
		frame.getContentPane().add(resultadoWindow);
		
		JButton suma = new JButton("SUMA");
		suma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int sumando1= Integer.parseInt(suma1Window.getText());
				int sumando2= Integer.parseInt(suma2Window.getText());
				
				int resultado=sumando1+sumando2;
				 String texto= String.valueOf(resultado);
				 resultadoWindow.setText(texto);
	
			}
		});
		suma.setBounds(160, 130, 84, 20);
		frame.getContentPane().add(suma);
	}

}
