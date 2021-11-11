import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Frame1 {

	private JFrame frame;
	private JTextField textField1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
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
	public Frame1() {
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
		
		textField1 = new JTextField();
		textField1.setBounds(129, 101, 223, 40);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		JButton btnNewButton = new JButton("Encryption ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				int Plaintext;
				double Ciphertext;
				RSA R1 = new RSA();
				try{
					Plaintext = Integer.parseInt(textField1.getText());
					Ciphertext = R1.Encryption(Plaintext);
					JOptionPane.showMessageDialog(null, "Message after Encryption : " + Ciphertext);
				}
				catch(Exception x)
				{
					JOptionPane.showMessageDialog(null, "Please Enter valid number");
				}
			}
		});
		btnNewButton.setBounds(95, 208, 117, 29);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Decryption ");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				int Ciphertext;
				double Plaintext;
				RSA R2 = new RSA();
				try{
					Ciphertext = Integer.parseInt(textField1.getText());
					Plaintext = R2.Decryption(Ciphertext);
					JOptionPane.showMessageDialog(null, "Message after Decryption : " + Plaintext);
				}
				catch(Exception x)
				{
					JOptionPane.showMessageDialog(null, "Please Enter valid number");
				}
			}
		});
		btnNewButton_1.setBounds(249, 208, 117, 29);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Message");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, ١٤));
		lblNewLabel.setBounds(60, 106, 183, 28);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter the following :");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, ١٨));
		lblNewLabel_1.setBounds(29, 35, 183, 29);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
