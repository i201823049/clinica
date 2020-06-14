package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.border.MatteBorder;
import java.awt.Font;

public class Login2 extends JFrame {

	private JPanel contentPane;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JButton button;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login2 frame = new Login2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 795, 413);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(25, 119, 212));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon(Login2.class.getResource("/imag/istockphoto-1047668634-1024x1024.jpg")));
		label.setBounds(0, 0, 467, 381);
		contentPane.add(label);
		
		label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(Login2.class.getResource("/iconLogin/icons8_user_male_circle_filled_34px.png")));
		label_1.setBounds(504, 79, 46, 34);
		contentPane.add(label_1);
		
		label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(Login2.class.getResource("/iconLogin/icons8_private2_filled_34px.png")));
		label_2.setBounds(504, 178, 46, 41);
		contentPane.add(label_2);
		
		button = new JButton("");
		button.setIcon(new ImageIcon(Login2.class.getResource("/iconLogin/icons8_long_arrow_right_34px_1.png")));
		button.setBackground(new Color(255, 255, 255));
		button.setBounds(504, 299, 251, 23);
		contentPane.add(button);
		
		textField = new JTextField();
		textField.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 14));
		textField.setForeground(new Color(255, 250, 250));
		textField.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 250, 250)));
		textField.setOpaque(false);
		textField.setBounds(541, 82, 214, 31);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 14));
		passwordField.setForeground(new Color(255, 250, 250));
		passwordField.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 250, 250)));
		passwordField.setOpaque(false);
		passwordField.setBounds(544, 178, 211, 31);
		contentPane.add(passwordField);
	}
}
