import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;
import java.awt.Toolkit;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField input;
	private double answer, number;         //ozumuz yazdiq
	int operation;                   //+++

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	//ekrana 0'a basanda 0 cixmagi ucun umumi funksiya yaziriq
	
	public void addInput(String str) {
		input.setText(input.getText() + str);   //+++
	}
	public void calculate() {
		switch (operation) {
		case 1:
			answer = number + Double.parseDouble(input.getText()); //++++
			input.setText(Double.toString(answer));
			break;
		case 2:
			answer = number - Double.parseDouble(input.getText()); 
			input.setText(Double.toString(answer));
			break;
		case 3:
			answer = number * Double.parseDouble(input.getText()); 
			input.setText(Double.toString(answer));
			break;
		case 4:
			answer = number / Double.parseDouble(input.getText()); 
			input.setText(Double.toString(answer));
			break;
			
		}
	}
	
	/**
	 * Create the frame.
	 */
	public Calculator() {
		setForeground(Color.WHITE);
		setBackground(Color.WHITE);
		setType(Type.UTILITY);
		setTitle("Calculator");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 319, 371);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel screen = new JPanel();
		screen.setBorder(new EmptyBorder(0, 0, 0, 0));
		screen.setBackground(Color.BLACK);
		screen.setBounds(10, 11, 283, 58);
		contentPane.add(screen);
		screen.setLayout(null);
		
		input = new JTextField();
		input.setForeground(Color.GREEN);
		input.setBackground(Color.BLACK);
		input.setEditable(false);
		input.setHorizontalAlignment(SwingConstants.RIGHT);
		input.setFont(new Font("Tahoma", Font.BOLD, 23));
		input.setBounds(0, 11, 283, 47);
		screen.add(input);
		input.setColumns(10);
		
		JLabel lbl = new JLabel("");
		lbl.setForeground(Color.WHITE);
		lbl.setBackground(Color.BLACK);
		lbl.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbl.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl.setBounds(0, 0, 283, 14);
		screen.add(lbl);
		
		JPanel control = new JPanel();
		control.setBackground(Color.DARK_GRAY);
		control.setBounds(10, 80, 283, 241);
		contentPane.add(control);
		control.setLayout(new GridLayout(4, 4, 20, 20));
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setForeground(Color.GREEN);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operation = 1;   //toplama case 1 de idi
				input.setText("");
				lbl.setText(number + e.getActionCommand());				
			}
		});
		
		JButton btnNewButton_1 = new JButton("7");
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setForeground(Color.GREEN);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("8");
		btnNewButton_2.setBackground(Color.BLACK);
		btnNewButton_2.setForeground(Color.GREEN);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("9");
		btnNewButton_3.setBackground(Color.BLACK);
		btnNewButton_3.setForeground(Color.GREEN);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btnNewButton_3);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btnNewButton);
		
		JButton btnNewButton_4 = new JButton("4");
		btnNewButton_4.setBackground(Color.BLACK);
		btnNewButton_4.setForeground(Color.GREEN);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btnNewButton_4);
		
		JButton btnNewButton_6 = new JButton("5");
		btnNewButton_6.setBackground(Color.BLACK);
		btnNewButton_6.setForeground(Color.GREEN);
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btnNewButton_6);
		
		JButton btnNewButton_5 = new JButton("6");
		btnNewButton_5.setBackground(Color.BLACK);
		btnNewButton_5.setForeground(Color.GREEN);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btnNewButton_5);
		
		JButton btnNewButton_9 = new JButton("-");
		btnNewButton_9.setBackground(Color.BLACK);
		btnNewButton_9.setForeground(Color.GREEN);
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operation = 2;   //cixartma case 2 de idi
				input.setText("");
				lbl.setText(number + e.getActionCommand());		
			}
		});
		btnNewButton_9.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btnNewButton_9);
		
		JButton btnNewButton_12 = new JButton("1");
		btnNewButton_12.setBackground(Color.BLACK);
		btnNewButton_12.setForeground(Color.GREEN);
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_12.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btnNewButton_12);
		
		JButton btnNewButton_8 = new JButton("2");
		btnNewButton_8.setBackground(Color.BLACK);
		btnNewButton_8.setForeground(Color.GREEN);
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btnNewButton_8);
		
		JButton btnNewButton_7 = new JButton("3");
		btnNewButton_7.setBackground(Color.BLACK);
		btnNewButton_7.setForeground(Color.GREEN);
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btnNewButton_7);
		
		JButton btnNewButton_10 = new JButton("*");
		btnNewButton_10.setBackground(Color.BLACK);
		btnNewButton_10.setForeground(Color.GREEN);
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operation = 3;   //vurma case 3 de idi
				input.setText("");
				lbl.setText(number + e.getActionCommand());		
			}
		});
		btnNewButton_10.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("0");
		btnNewButton_11.setBackground(Color.BLACK);
		btnNewButton_11.setForeground(Color.GREEN);
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_11.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btnNewButton_11);
		
		JButton btnNewButton_13 = new JButton("=");
		btnNewButton_13.setBackground(Color.BLACK);
		btnNewButton_13.setForeground(Color.GREEN);
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate();
				lbl.setText("");
			}
		});
		btnNewButton_13.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btnNewButton_13);
		
		JButton btnC = new JButton("C");
		btnC.setBackground(Color.BLACK);
		btnC.setForeground(Color.GREEN);
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText("");
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btnC);
		
		JButton btnNewButton_15 = new JButton("/");
		btnNewButton_15.setBackground(Color.BLACK);
		btnNewButton_15.setForeground(Color.GREEN);
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operation = 4;   //bolme case 4 de idi
				input.setText("");
				lbl.setText(number + e.getActionCommand());		
			}
		});
		btnNewButton_15.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btnNewButton_15);
	}
}
