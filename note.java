package sampleswing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;

public class note {
Float height;
	private JFrame frame;
	private JPanel panel;
	private JTextField t3;
	private JTextField t2;
	private JTextField tt;
	private JTextField txtUnderweight;
	private JTextField textField;
	private JTextField txtNormalWei;
	private JTextField txtto;
	private JTextField txtOverWei;
	private JTextField txtto_1;
	private JTextField textField_1;
	private JTextField txtObses;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					note window = new note();
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
	public note() {
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
		
		panel = new JPanel();
		panel.setBounds(0, 0, 434, 46);
		panel.setBackground(Color.GREEN);
		panel.setForeground(Color.RED);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblBodyMassIndex = new JLabel("      BODY MASS INDEX");
		lblBodyMassIndex.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblBodyMassIndex.setForeground(Color.RED);
		lblBodyMassIndex.setBounds(89, 0, 249, 35);
		panel.add(lblBodyMassIndex);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.textHighlight);
		panel_1.setBounds(0, 50, 434, 141);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		t3 = new JTextField();
		t3.setBounds(203, 11, 86, 20);
		panel_1.add(t3);
		t3.setColumns(10);
		
		t2 = new JTextField();
		t2.setBounds(203, 53, 86, 20);
		panel_1.add(t2);
		t2.setColumns(10);
		
		JLabel l1 = new JLabel("Hight(M):");
		l1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		l1.setBounds(98, 17, 62, 14);
		panel_1.add(l1);
		
		JLabel l2 = new JLabel("Weight(Kg):");
		l2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		l2.setForeground(Color.BLACK);
		l2.setBounds(87, 56, 73, 14);
		panel_1.add(l2);
		
		JLabel l3 = new JLabel("BMI");
		l3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		l3.setBounds(94, 96, 46, 14);
		panel_1.add(l3);
		JLabel ll = new JLabel("");
		ll.setBounds(302, 96, 122, 14);
		panel_1.add(ll);
		
		JButton c1 = new JButton("calculate");
		c1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=t3.getText();
				float height=Float.valueOf(a);
				String f=t2.getText();
				float weight=Float.valueOf(f);
				float c=(height*height);
				float k=(weight/c);
				
				String b=String.valueOf(k);
				tt.setText(b);
				if(k>=18.5&&k<=25)
				{
					ll.setText("Normal Weight");
				}
				 if(k<18)
				{
					ll.setText("under weight");
				}
				 if(k>25&&k<29.9)
				 {
					 ll.setText("over weight");
				 }
				 if(k>30)
				 {
					 ll.setText("obses");
				 }
					
				}
			
		});
		c1.setBounds(203, 118, 86, 23);
		panel_1.add(c1);
		
		JButton c2 = new JButton("clear");
		c2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t3.setText("");
				t2.setText("");
				tt.setText("");
				ll.setText("");
				
			}
		});
		c2.setBounds(291, 118, 73, 23);
		panel_1.add(c2);
		
		JButton c3 = new JButton("exit");
		c3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		c3.setBounds(365, 118, 59, 23);
		panel_1.add(c3);
		
	
		
		tt = new JTextField();
		tt.setBounds(203, 94, 86, 20);
		panel_1.add(tt);
		tt.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.MAGENTA);
		panel_2.setBounds(0, 197, 434, 65);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		txtUnderweight = new JTextField();
		txtUnderweight.setForeground(Color.RED);
		txtUnderweight.setText("Underweight");
		txtUnderweight.setBounds(109, 11, 74, 25);
		panel_2.add(txtUnderweight);
		txtUnderweight.setColumns(10);
		
		textField = new JTextField();
		textField.setForeground(Color.RED);
		textField.setText("       <18");
		textField.setBounds(109, 34, 74, 20);
		panel_2.add(textField);
		textField.setColumns(10);
		
		txtNormalWei = new JTextField();
		txtNormalWei.setForeground(Color.RED);
		txtNormalWei.setText("Normal Weight");
		txtNormalWei.setBounds(183, 11, 86, 25);
		panel_2.add(txtNormalWei);
		txtNormalWei.setColumns(10);
		
		txtto = new JTextField();
		txtto.setForeground(Color.RED);
		txtto.setText("       18.5to25");
		txtto.setBounds(183, 34, 86, 20);
		panel_2.add(txtto);
		txtto.setColumns(10);
		
		txtOverWei = new JTextField();
		txtOverWei.setForeground(Color.RED);
		txtOverWei.setText("   over weight");
		txtOverWei.setBounds(266, 11, 86, 25);
		panel_2.add(txtOverWei);
		txtOverWei.setColumns(10);
		
		txtto_1 = new JTextField();
		txtto_1.setForeground(Color.RED);
		txtto_1.setText("           25to29");
		txtto_1.setBounds(266, 34, 86, 20);
		panel_2.add(txtto_1);
		txtto_1.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText("       30");
		textField_1.setForeground(Color.RED);
		textField_1.setBounds(352, 34, 76, 20);
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		txtObses = new JTextField();
		txtObses.setForeground(Color.RED);
		txtObses.setText("    Obses");
		txtObses.setBounds(352, 11, 76, 25);
		panel_2.add(txtObses);
		txtObses.setColumns(10);
	}
	public JPanel getPanel() {
		return panel;
	}
}
