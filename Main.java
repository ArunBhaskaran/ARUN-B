package sampleswing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
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
	public Main() {
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
		
		JLabel lblUser = new JLabel("user:-");
		lblUser.setBounds(48, 85, 62, 14);
		frame.getContentPane().add(lblUser);
		
		JLabel lblPassword = new JLabel("password:-");
		lblPassword.setBounds(48, 129, 84, 14);
		frame.getContentPane().add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(158, 82, 86, 20);
		frame.getContentPane().add(textField);
		
		textField.setColumns(10);
		
		textField_1 = new JPasswordField();
		textField_1.setBounds(158, 126, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		JLabel label = new JLabel("");
		label.setBounds(130, 228, 138, 23);
		frame.getContentPane().add(label);

		JButton btnLogin = new JButton("Login...");
		btnLogin.addActionListener(new ActionListener() {
			
			
			
			
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("chekku")&&textField_1.getText().equals("1234"))
					label.setText("login Sucessfully");
				else
					label.setText("login failed");
			}
		});
		btnLogin.setBounds(278, 185, 89, 23);
		frame.getContentPane().add(btnLogin);
		
			}
}
