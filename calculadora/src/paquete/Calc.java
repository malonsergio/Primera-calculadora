package paquete;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calc {

	private JFrame frame;
	JLabel lblSuma, lblResta, lblDiv, lblMult, lblResto;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc window = new Calc();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Calc() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnSuma = new JButton("Suma");
		btnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String numStr1;
				String numStr2;
				
				try {
					numStr1 = JOptionPane.showInputDialog("Introduce número 1: ");
					if(numStr1 != null && !numStr1.isEmpty())
					{
						numStr2 = JOptionPane.showInputDialog("Introduce número 2: ");
						if(numStr2 != null && !numStr2.isEmpty())
						{
							int a = Integer.parseInt(numStr1);
							int b = Integer.parseInt(numStr2);
							lblSuma.setText("La suma es: " + (a+b));
						}
					}

				} catch(Exception ex) {
					JOptionPane.showMessageDialog(null, "Syntax error");
				}
			
			}
		});
		btnSuma.setBounds(34, 20, 85, 21);
		frame.getContentPane().add(btnSuma);
		
		lblSuma = new JLabel("");
		lblSuma.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblSuma.setBounds(143, 20, 170, 21);
		frame.getContentPane().add(lblSuma);
		
		lblResta = new JLabel("");
		lblResta.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblResta.setBounds(143, 54, 170, 21);
		frame.getContentPane().add(lblResta);
		
		JButton btnResta = new JButton("Resta");
		btnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int a = Integer.parseInt(JOptionPane.showInputDialog("Introduce número 1: "));		
					int b = Integer.parseInt(JOptionPane.showInputDialog("Introduce número 2: "));
					lblResta.setText("La resta es: " + (a-b));
				} catch(Exception ex) {
					JOptionPane.showMessageDialog(null, "Syntax error");
				}	
			}
		});
		btnResta.setBounds(34, 54, 85, 21);
		frame.getContentPane().add(btnResta);
		
		lblMult = new JLabel("");
		lblMult.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblMult.setBounds(143, 85, 170, 21);
		frame.getContentPane().add(lblMult);
		
		JButton btnMult = new JButton("Multiplicación");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int a = Integer.parseInt(JOptionPane.showInputDialog("Introduce número 1: "));		
					int b = Integer.parseInt(JOptionPane.showInputDialog("Introduce número 2: "));
					lblMult.setText("La multiplicación es: " + (a*b));
				} catch(Exception ex) {
					JOptionPane.showMessageDialog(null, "Syntax error");
				}
			}
		});
		btnMult.setBounds(34, 85, 85, 21);
		frame.getContentPane().add(btnMult);
		
		lblDiv = new JLabel("");
		lblDiv.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblDiv.setBounds(143, 116, 170, 21);
		frame.getContentPane().add(lblDiv);
		
		JButton btnDiv = new JButton("División");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int a = Integer.parseInt(JOptionPane.showInputDialog("Introduce número 1: "));		
					int b = Integer.parseInt(JOptionPane.showInputDialog("Introduce número 2: "));
					lblDiv.setText("La división es: " + (a/b));
				} catch(Exception ex) {
					JOptionPane.showMessageDialog(null, "Syntax error");
				}
			}
		});
		btnDiv.setBounds(34, 116, 85, 21);
		frame.getContentPane().add(btnDiv);
		
		lblResto = new JLabel("");
		lblResto.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblResto.setBounds(143, 147, 170, 21);
		frame.getContentPane().add(lblResto);
		
		JButton btnResto = new JButton("Resto");
		btnResto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int a = Integer.parseInt(JOptionPane.showInputDialog("Introduce número 1: "));		
					int b = Integer.parseInt(JOptionPane.showInputDialog("Introduce número 2: "));
					lblResto.setText("El resto de esa división es: " + (a%b));
				} catch(Exception ex) {
					JOptionPane.showMessageDialog(null, "Syntax error");
				}
			}
		});
		btnResto.setBounds(34, 147, 85, 21);
		frame.getContentPane().add(btnResto);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblSuma.setText(null); 
				lblResta.setText(null); 
				lblDiv.setText(null);
				lblMult.setText(null); 
				lblResto.setText(null);
			}
		});
		btnBorrar.setBounds(158, 196, 115, 37);
		frame.getContentPane().add(btnBorrar);
	}
}
