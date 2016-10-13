package robot;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.TextField;
import javax.swing.JList;
import javax.swing.JButton;

public class Menu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
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
	public Menu() {
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
		
		JLabel lblBotMenu = new JLabel("Bot Menu");
		lblBotMenu.setBounds(46, 12, 143, 18);
		lblBotMenu.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblBotMenu.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblBotMenu);
		
		JList list = new JList();
		list.setBounds(196, 12, 226, 248);
		frame.getContentPane().add(list);
		
		JButton btnNewBot = new JButton("New Bot");
		btnNewBot.setBounds(28, 42, 117, 25);
		frame.getContentPane().add(btnNewBot);
		
		JButton btnMoveBot = new JButton("Move Bot");
		btnMoveBot.setBounds(28, 79, 117, 25);
		frame.getContentPane().add(btnMoveBot);
		
		JButton btnBotAction = new JButton("Bot Action");
		btnBotAction.setBounds(28, 127, 117, 25);
		frame.getContentPane().add(btnBotAction);
	}
}
