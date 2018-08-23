import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.TextField;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI {

	private JFrame frame;
	private JTextField txtUserInputNumber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
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
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 366, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		TextField textField = new TextField();
		frame.getContentPane().add(textField, BorderLayout.CENTER);
		
		txtUserInputNumber = new JTextField();
		txtUserInputNumber.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int userNumber = Integer.parseInt(txtUserInputNumber.getText());
				if (userNumber % 2 == 0) {
					JOptionPane.showMessageDialog(null, "It's even");
				}
				else {
					JOptionPane.showMessageDialog(null, "It's odd");
				}
			
			}
		});
		txtUserInputNumber.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		txtUserInputNumber.setHorizontalAlignment(SwingConstants.CENTER);
		txtUserInputNumber.setBackground(Color.DARK_GRAY);
		txtUserInputNumber.setForeground(Color.WHITE);
		txtUserInputNumber.setBounds(178, 116, 86, 20);
		frame.getContentPane().add(txtUserInputNumber);
		txtUserInputNumber.setColumns(10);
		
		JLabel lblMessage = new JLabel("Put a number -->");
		lblMessage.setForeground(Color.WHITE);
		lblMessage.setBounds(70, 116, 98, 20);
		frame.getContentPane().add(lblMessage);
		
		JButton btnAnswer = new JButton("Answer");
		btnAnswer.setBackground(UIManager.getColor("RadioButtonMenuItem.foreground"));
		btnAnswer.setBounds(124, 168, 89, 23);
		frame.getContentPane().add(btnAnswer);
		
		JLabel lblEvenOrOdd = new JLabel("EVEN OR ODD ");
		lblEvenOrOdd.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEvenOrOdd.setForeground(Color.WHITE);
		lblEvenOrOdd.setBounds(102, 57, 132, 14);
		frame.getContentPane().add(lblEvenOrOdd);
	}
}
