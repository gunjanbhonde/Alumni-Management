import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class Entry_frame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField text_input_password;
	private JTextField text_input_username;
	JButton Reset_button;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Entry_frame frame = new Entry_frame();
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
	public Entry_frame() {
		setTitle("Alumni managment");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 860, 606);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username :");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		lblNewLabel.setBounds(145, 136, 156, 57);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password :");
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		lblNewLabel_1.setBounds(145, 227, 156, 57);
		contentPane.add(lblNewLabel_1);
		
		JButton Submit_Button = new JButton("Submit");
		Submit_Button.setBackground(new Color(192, 192, 192));
		Submit_Button.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
	
		
		Submit_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		}
		);
		Submit_Button.setBounds(652, 407, 99, 44);
		contentPane.add(Submit_Button);
		
		text_input_password = new JTextField();
		text_input_password.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		text_input_password.setColumns(10);
		text_input_password.setBounds(250, 243, 278, 35);
		contentPane.add(text_input_password);
		
		text_input_username = new JTextField();
		text_input_username.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		text_input_username.setColumns(10);
		text_input_username.setBounds(250, 147, 278, 35);
		contentPane.add(text_input_username);
		
	     Reset_button = new JButton("Reset");
	     Reset_button.addActionListener(new ActionListener() {
	     	public void actionPerformed(ActionEvent e) {
	     		 text_input_username.setText(null);
	               text_input_password.setText(null);
	     	}
	     });
		Reset_button.setBackground(new Color(192, 192, 192));
		Reset_button.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		Reset_button.setBounds(509, 407, 99, 44);
		contentPane.add(Reset_button);
	}
}
