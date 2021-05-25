import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Calculator {

	private JFrame frame;
	private JTextField textField_Number1;
	private JButton btnMinus;
	private JTextField textField_Answer;
	private JTextField textField_Number2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.PINK);
		frame.setBounds(100, 100, 501, 431);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField_Number1 = new JTextField();
		textField_Number1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textField_Number1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		textField_Number1.setForeground(Color.RED);
		textField_Number1.setBounds(22, 34, 192, 67);
		frame.getContentPane().add(textField_Number1);
		textField_Number1.setColumns(10);
		
		JButton btnAddition = new JButton("ADD (+)");
		btnAddition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					int num1, num2, ans;
					 num1 = Integer.parseInt(textField_Number1.getText());
					 num2 = Integer.parseInt(textField_Number2.getText());
					 
					 ans = num1 + num2;
					 textField_Answer.setText(Integer.toString(ans));
				}
				catch(Exception e1) {
					
					JOptionPane.showMessageDialog(null, "Enter Valid Number");
				}
			}
		});
		btnAddition.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnAddition.setForeground(Color.RED);
		btnAddition.setBounds(22, 145, 192, 53);
		frame.getContentPane().add(btnAddition);
		
		btnMinus = new JButton("MINUS (-)");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					int num1, num2, ans;
					 num1 = Integer.parseInt(textField_Number1.getText());
					 num2 = Integer.parseInt(textField_Number2.getText());
					 
					 ans = num1 - num2;
					 textField_Answer.setText(Integer.toString(ans));
				}
				catch(Exception e1) {
					
					JOptionPane.showMessageDialog(null, "Enter Number");
				}
			}
		});
		btnMinus.setForeground(Color.RED);
		btnMinus.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnMinus.setBounds(255, 145, 173, 53);
		frame.getContentPane().add(btnMinus);
		
		JLabel lblAnswer = new JLabel("ANSWER:");
		lblAnswer.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblAnswer.setBounds(58, 281, 126, 53);
		frame.getContentPane().add(lblAnswer);
		
		textField_Answer = new JTextField();
		textField_Answer.setForeground(Color.RED);
		textField_Answer.setFont(new Font("Times New Roman", Font.BOLD, 25));
		textField_Answer.setBounds(231, 280, 163, 53);
		frame.getContentPane().add(textField_Answer);
		textField_Answer.setColumns(10);
		
		textField_Number2 = new JTextField();
		textField_Number2.setForeground(Color.RED);
		textField_Number2.setFont(new Font("Times New Roman", Font.BOLD, 25));
		textField_Number2.setColumns(10);
		textField_Number2.setBounds(255, 34, 173, 67);
		frame.getContentPane().add(textField_Number2);
	}
}
