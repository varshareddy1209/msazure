package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bookstoreapp { 
	int items=0;
	int total=0;

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
					Bookstoreapp window = new Bookstoreapp();
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
	public Bookstoreapp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 601, 403);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BOOK STORE APPLICATION");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(149, 11, 287, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items=items+1;
				total=total+420;
				tb1.setText(""+items);
				tb2.setText(""+total);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\online lab\\Pictures\\b8.jpg"));
		btnNewButton_1.setBounds(190, 86, 180, 218);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items=items+1;
				total=total+500;
				tb1.setText(""+items);
				tb2.setText(""+total);
			}
		});
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\online lab\\Pictures\\b7.jpg"));
		btnNewButton_2.setBounds(419, 86, 156, 218);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items=items+1;
				total=total+375;
				tb1.setText(""+items);
				tb2.setText(""+total);
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\online lab\\Pictures\\b3.jpg"));
		btnNewButton.setBounds(10, 86, 148, 218);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("ITEMS");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(296, 36, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("TOTAL");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(296, 61, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		tb1 = new JTextField();
		tb1.setBounds(378, 33, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		tb2 = new JTextField();
		tb2.setBounds(378, 58, 86, 20);
		frame.getContentPane().add(tb2);
		tb2.setColumns(10);
		
		JTextArea txtrRs = new JTextArea();
		txtrRs.setFont(new Font("Monospaced", Font.BOLD, 15));
		txtrRs.setText("Rs 375");
		txtrRs.setBounds(53, 301, 66, 22);
		frame.getContentPane().add(txtrRs);
		
		JTextArea txtrRs_1 = new JTextArea();
		txtrRs_1.setFont(new Font("Monospaced", Font.BOLD, 15));
		txtrRs_1.setText("Rs 420");
		txtrRs_1.setBounds(250, 301, 66, 22);
		frame.getContentPane().add(txtrRs_1);
		
		JTextArea txtrRs_2 = new JTextArea();
		txtrRs_2.setFont(new Font("Monospaced", Font.BOLD, 15));
		txtrRs_2.setText("Rs 500");
		txtrRs_2.setToolTipText("");
		txtrRs_2.setBounds(474, 301, 66, 22);
		frame.getContentPane().add(txtrRs_2);
		
		JButton btnNewButton_3 = new JButton("Remove");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items=items-1;
				total=total-375;
				tb1.setText(""+items);
				tb2.setText(""+total);
			}
		});
		btnNewButton_3.setBounds(40, 334, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Remove");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items=items-1;
				total=total-420;
				tb1.setText(""+items);
				tb2.setText(""+total);
			}
		});
		btnNewButton_4.setBounds(239, 334, 89, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Remove");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items=items-1;
				total=total-500;
				tb1.setText(""+items);
				tb2.setText(""+total);
			}
		});
		btnNewButton_5.setBounds(455, 334, 89, 23);
		frame.getContentPane().add(btnNewButton_5);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\online lab\\Pictures\\istockphoto-840303454-612x612.jpg"));
		lblNewLabel_3.setBounds(0, 0, 575, 364);
		frame.getContentPane().add(lblNewLabel_3);
	}
}
