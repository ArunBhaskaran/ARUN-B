package progr;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import javax.swing.ListSelectionModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class Stdpro1 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	private JTextField tf4;
	private JTextField tf5;
	private JTextField tf6;
	private JTextField tf7;
	private JTextField tf8;
	private JTextField tff3;
	private JTextField tff4;
	private JTextField tff5;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stdpro1 window = new Stdpro1();
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
	public Stdpro1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		String []a= {"C00123CS","C00121B","C00125H","MA00012E","EN001TY"};
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.YELLOW);
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setBounds(100, 100, 949, 583);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblStudentPrograssReport = new JLabel("Student Progress Report-2019");
		lblStudentPrograssReport.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblStudentPrograssReport.setBounds(116, 11, 193, 22);
		frame.getContentPane().add(lblStudentPrograssReport);
		
		JLabel lblName = new JLabel("S-ID");
		lblName.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblName.setBounds(35, 65, 46, 14);
		frame.getContentPane().add(lblName);
		
		textField = new JTextField();
		textField.setBounds(75, 62, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("1st Name");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel.setBounds(20, 108, 61, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(75, 105, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblSurname = new JLabel("SurName");
		lblSurname.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblSurname.setBounds(20, 147, 56, 14);
		frame.getContentPane().add(lblSurname);
		
		textField_2 = new JTextField();
		textField_2.setBounds(75, 144, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JComboBox gg = new JComboBox(a);
		gg.setBounds(75, 181, 86, 20);
		frame.getContentPane().add(gg);
		
		
		
		
		JLabel lblNewLabel_1 = new JLabel("C-Code");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1.setBounds(20, 184, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.YELLOW);
		panel.setBounds(209, 44, 263, 165);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblEng = new JLabel("English");
		lblEng.setBounds(29, 20, 40, 14);
		panel.add(lblEng);
		lblEng.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
		JLabel lblMath = new JLabel("Maths");
		lblMath.setBounds(29, 40, 74, 14);
		panel.add(lblMath);
		lblMath.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
		JLabel lblIt = new JLabel("IT");
		lblIt.setBounds(30, 58, 68, 14);
		panel.add(lblIt);
		lblIt.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
		JLabel lblTamil = new JLabel("Tamil");
		lblTamil.setBounds(27, 75, 74, 14);
		panel.add(lblTamil);
		lblTamil.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
		JLabel lblMalayalam = new JLabel("Malayalam");
		lblMalayalam.setBounds(28, 95, 86, 14);
		panel.add(lblMalayalam);
		lblMalayalam.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
		JLabel lblBiology = new JLabel("Biology");
		lblBiology.setBounds(29, 113, 46, 14);
		panel.add(lblBiology);
		lblBiology.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
		JLabel lblPhysics = new JLabel("Physics");
		lblPhysics.setBounds(29, 132, 46, 14);
		panel.add(lblPhysics);
		lblPhysics.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
		JLabel lblChemistry = new JLabel("Chemistry");
		lblChemistry.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblChemistry.setBounds(29, 151, 58, 14);
		panel.add(lblChemistry);
		
		tf1 = new JTextField();
		tf1.setBounds(97, 21, 46, 14);
		panel.add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setBounds(97, 38, 46, 14);
		panel.add(tf2);
		tf2.setColumns(10);
		
		tf3 = new JTextField();
		tf3.setColumns(10);
		tf3.setBounds(97, 56, 46, 14);
		panel.add(tf3);
		
		tf4 = new JTextField();
		tf4.setColumns(10);
		tf4.setBounds(97, 73, 46, 14);
		panel.add(tf4);
		
		tf5 = new JTextField();
		tf5.setColumns(10);
		tf5.setBounds(97, 92, 46, 14);
		panel.add(tf5);
		
		tf6 = new JTextField();
		tf6.setColumns(10);
		tf6.setBounds(97, 110, 46, 14);
		panel.add(tf6);
		
		tf7 = new JTextField();
		tf7.setColumns(10);
		tf7.setBounds(97, 131, 46, 14);
		panel.add(tf7);
		
		tf8 = new JTextField();
		tf8.setColumns(10);
		tf8.setBounds(97, 148, 46, 14);
		panel.add(tf8);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblTotal.setBounds(20, 237, 46, 14);
		frame.getContentPane().add(lblTotal);
		
		tff3 = new JTextField();
		tff3.setBounds(61, 234, 72, 20);
		frame.getContentPane().add(tff3);
		tff3.setColumns(10);
		
		JLabel lblAverage = new JLabel("Average");
		lblAverage.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblAverage.setBounds(143, 237, 46, 14);
		frame.getContentPane().add(lblAverage);
		
		tff4 = new JTextField();
		tff4.setBounds(189, 234, 66, 20);
		frame.getContentPane().add(tff4);
		tff4.setColumns(10);
		
		JLabel lblRanking = new JLabel("Ranking");
		lblRanking.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblRanking.setBounds(278, 237, 61, 14);
		frame.getContentPane().add(lblRanking);
		
		tff5 = new JTextField();
		tff5.setBounds(335, 234, 72, 20);
		frame.getContentPane().add(tff5);
		tff5.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.YELLOW);
		panel_1.setBounds(482, 23, 325, 228);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnClear.setBounds(112, 205, 89, 23);
		panel_1.add(btnClear);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.YELLOW);
		panel_2.setBounds(10, 299, 923, 173);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		table = new JTable();
		table.setToolTipText("");
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setFont(new Font("Times New Roman", Font.BOLD, 12));
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"S-Id", "C-Name", "English", "Maths", "IT", "Biology", "Tamil", "Malayalam", "Physics", "Chemistry", "Total", "Average", "Ranking"},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(42, 24, 811, 115);
		panel_2.add(table);
		
		JButton btnAddReport = new JButton("Add Report");
		btnAddReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			String	a=tf1.getText();
			float st2=Float.valueOf(a);
			String b=tf2.getText();
			float st1=Float.valueOf(b);
			String c=tf3.getText();
			float st3=Float.valueOf(c);
			String d=tf4.getText();
			float st4=Float.valueOf(d);
			String e=tf5.getText();
			float st5=Float.valueOf(e);
			String f=tf6.getText();
			float st6=Float.valueOf(f);
			String g=tf7.getText();
			float st7=Float.valueOf(g);
			String h=tf8.getText();
			float st8=Float.valueOf(h);
			float aa=st2+st1+st3+st4+st5+st6+st7+st8;
		tff3.setText(String.valueOf(aa));
		   float av=aa/8;
			tff4.setText(String.valueOf(av));
			
			}
			
		});
		btnAddReport.setForeground(new Color(0, 100, 0));
		btnAddReport.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnAddReport.setBounds(189, 497, 112, 23);
		frame.getContentPane().add(btnAddReport);
		
		JButton btnNewButton = new JButton("Delete");
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNewButton.setBounds(307, 497, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton jb = new JButton("Show Report");
		jb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		jb.setForeground(new Color(0, 0, 255));
		jb.setFont(new Font("Times New Roman", Font.BOLD, 13));
		jb.setBounds(401, 497, 101, 23);
		frame.getContentPane().add(jb);
		
		
		JButton btnExit = new JButton("Exit");
		btnExit.setForeground(new Color(255, 69, 0));
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnExit.setBounds(509, 497, 89, 23);
		frame.getContentPane().add(btnExit);
		System.exit(0);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnReset.setForeground(new Color(46, 139, 87));
		btnReset.setBounds(608, 497, 89, 23);
		frame.getContentPane().add(btnReset);
		
	}
}
