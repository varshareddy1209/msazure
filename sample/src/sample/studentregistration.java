package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class studentregistration {

	private JFrame frame;
	private JTextField tb1;
	private JTextField tb2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					studentregistration window = new studentregistration();
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
	public studentregistration() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(192, 192, 192));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STUDENT REGISTRATION FORM");
		lblNewLabel.setBounds(119, 11, 237, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("RollNo");
		lblNewLabel_1.setBounds(20, 50, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setBounds(20, 81, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Branch");
		lblNewLabel_3.setBounds(20, 118, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Gender");
		lblNewLabel_4.setBounds(20, 153, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Prog Langs");
		lblNewLabel_5.setBounds(20, 191, 103, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		tb1 = new JTextField();
		tb1.setBounds(119, 47, 141, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		tb2 = new JTextField();
		tb2.setBounds(119, 78, 141, 20);
		frame.getContentPane().add(tb2);
		tb2.setColumns(10);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT ", "CSE", "CS", "AIML", "DS", "IT", "ECE", "MECH"}));
		cb1.setToolTipText("");
		cb1.setMaximumRowCount(6);
		cb1.setBounds(119, 114, 141, 22);
		frame.getContentPane().add(cb1);
		
		JRadioButton r1 = new JRadioButton("Male");
		r1.setBounds(119, 149, 109, 23);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("Female");
		r2.setBounds(230, 149, 109, 23);
		frame.getContentPane().add(r2);
		
		JCheckBox c1 = new JCheckBox("C");
		c1.setBackground(new Color(255, 255, 255));
		c1.setBounds(120, 187, 70, 23);
		frame.getContentPane().add(c1);
		
		JCheckBox c2 = new JCheckBox("JAVA");
		c2.setBounds(219, 187, 70, 23);
		frame.getContentPane().add(c2);
		
		JCheckBox c3 = new JCheckBox("PYTHON");
		c3.setBounds(319, 187, 70, 23);
		frame.getContentPane().add(c3);
		
		ButtonGroup bg= new ButtonGroup();
		bg.add(r1);
		bg.add(r2);  
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						String roll=tb1.getText();
						String name=tb2.getText();
				        String branch=(String) cb1.getSelectedItem();
						String gender= " ";
						String langs=" ";
						if(r1.isSelected())
						{
							gender="male";
						}
						if(r2.isSelected())
						{
							gender="female";
						}
						if(c1.isSelected())
						{
							langs=langs+"C";
						}
						if(c2.isSelected())
						{
							langs=langs+" JAVA";
						}
						if(c3.isSelected())
						{
							langs=langs+" PYTHON";
						}
						JOptionPane.showMessageDialog(btnNewButton, "Rollno:"+roll+
								"\n Name :"+name+"\n Branch :"+branch+"\n Gender :"+gender+"\n Prog Langs :"+langs);
						
					}
				});
		
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(148, 227, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\online lab\\Pictures\\sr2.jpg"));
		lblNewLabel_6.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(lblNewLabel_6);
	
		
	}
}
