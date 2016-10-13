package robot;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.JEditorPane;
import javax.swing.JTextField;

public class NewBotMenu {

	private JFrame frame;
	private JTextField txtBotName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewBotMenu window = new NewBotMenu();
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
	public NewBotMenu() {
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
		
		JLabel lblPleaseCreateA = new JLabel("Please Create A New Bot");
		lblPleaseCreateA.setHorizontalAlignment(SwingConstants.CENTER);
		lblPleaseCreateA.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblPleaseCreateA.setBounds(98, 12, 231, 15);
		frame.getContentPane().add(lblPleaseCreateA);
		
		JList list = new JList();
		list.setBounds(37, 47, 100, 22);
		frame.getContentPane().add(list);
		
		txtBotName = new JTextField();
		txtBotName.setText("Bot Name");
		txtBotName.setBounds(37, 92, 114, 19);
		frame.getContentPane().add(txtBotName);
		txtBotName.setColumns(10);
	}
}
