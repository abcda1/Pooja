import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;


public class LoginTest extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField t1;
	private JPasswordField t2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginTest frame = new LoginTest();
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
	public LoginTest() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username :");
		lblUsername.setBounds(30, 51, 94, 15);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setBounds(30, 97, 94, 15);
		contentPane.add(lblPassword);
		
		final JLabel lbl = new JLabel("Invalid Username or Password");
		lbl.setBounds(40, 124, 215, 15);
		contentPane.add(lbl);
		lbl.setVisible(false);
		
		t1 = new JTextField();
		t1.setBounds(152, 49, 114, 19);
		contentPane.add(t1);
		t1.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				if(t1.getText().toString().equals("abc") && t2.getText().toString().equals("abc"))
				{
					LoginTest2 lt2 = new LoginTest2();
					lt2.setVisible(true);
					dispose();
				}
				else
				{
					t1.setText("");
					t2.setText("");
					lbl.setVisible(true);
				}
			}
		});
		btnLogin.setBounds(50, 168, 117, 25);
		contentPane.add(btnLogin);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText("");
				t2.setText("");
			}
		});
		btnReset.setBounds(199, 168, 117, 25);
		contentPane.add(btnReset);
		
		t2 = new JPasswordField();
		t2.setBounds(152, 95, 114, 19);
		contentPane.add(t2);
		
		
	}
}
