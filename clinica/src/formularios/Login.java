package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.border.MatteBorder;

import bd.DatosLogin;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame implements MouseMotionListener, ActionListener {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JButton btnEntrar;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JTextField txtUser;
	private JPasswordField txtPass;
	private JLabel lblLogin;
	private JLabel lblMensaje;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 813, 708);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/imag/imgMenu.png")));
		lblNewLabel.setBounds(0, 0, 372, 682);
		contentPane.add(lblNewLabel);
		
		btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(this);
		btnEntrar.setForeground(new Color(255, 255, 255));
		btnEntrar.setBackground(new Color(31, 37, 55));
		btnEntrar.setBounds(416, 581, 324, 35);
		contentPane.add(btnEntrar);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon(Login.class.getResource("/iconLogin/icons8_Male_User_34px_1.png")));
		label.setBounds(440, 203, 46, 35);
		contentPane.add(label);
		
		label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(Login.class.getResource("/iconLogin/icons8_Sign_in_Form_Password_34px_4.png")));
		label_2.setBounds(440, 292, 46, 35);
		contentPane.add(label_2);
		
		txtUser = new JTextField();
		txtUser.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		txtUser.setForeground(new Color(31, 37, 55));
		txtUser.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(31, 37, 55)));
		txtUser.setBounds(479, 203, 255, 35);
		contentPane.add(txtUser);
		txtUser.setColumns(10);
		
		txtPass = new JPasswordField();
		txtPass.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		txtPass.setForeground(new Color(31, 37, 55));
		txtPass.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(31, 37, 55)));
		txtPass.setBounds(479, 292, 255, 29);
		contentPane.add(txtPass);
		
		lblLogin = new JLabel("LOGIN");
		lblLogin.setForeground(new Color(31, 37, 55));
		lblLogin.setFont(new Font("Yu Gothic UI", Font.BOLD, 18));
		lblLogin.setBounds(529, 101, 109, 35);
		contentPane.add(lblLogin);
		
		lblMensaje = new JLabel("");
		lblMensaje.setForeground(new Color(220, 20, 60));
		lblMensaje.setFont(new Font("Yu Gothic UI", Font.PLAIN, 12));
		lblMensaje.setBounds(451, 378, 279, 14);
		contentPane.add(lblMensaje);
		
		
	}
	public void mouseDragged(MouseEvent arg0) {
	}
	public void mouseMoved(MouseEvent arg0) {
	}
	public void mouseClicked(MouseEvent arg0) {
	}
	
	public void mousePressed(MouseEvent arg0) {
	}
	public void mouseReleased(MouseEvent arg0) {
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnEntrar) {
			actionPerformedBtnEntrar(arg0);
		}
	}
	protected void actionPerformedBtnEntrar(ActionEvent arg0) {
		String user=txtUser.getText();
			String pass=txtPass.getText();
		try {
			if (DatosLogin.nombreAdmin.equals(user) && DatosLogin.paswordAdmin.equals(pass) ){
				MenuSuperAdmin obj=new MenuSuperAdmin();
				obj.setVisible(true);
				Login log=new Login();
				log.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			}else{
				lblMensaje.setText("Incorrecto");
			}
				
			
		} catch (Exception e) {
			// TODO: handle exception
			lblMensaje.setText("No ingreso el nombre o el usuario");
		}
		
			
		
	}
}
