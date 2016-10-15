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
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class Menu {

	private JFrame frame;
	private RoboWorld Futurama;
	private Robot bob;
	//private Robot[] aworld;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		//Robot[] world = new Robot[100];
		//RobotMenu menu = new RobotMenu();
		//menu.world = new Robot[100];
		RoboWorld Futurama = new RoboWorld(); 
		//aworld = new Robot[];
		//Futurama.setWorld(new Robot[100]);
		//Robot bob = new Robot("bob", 1,1,0,1,1);
		
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
		btnNewBot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Something");
				/*String brand = (String)JOptionPane.showInputDialog(
			            Menu,
			            "What brand of computer is it",
			            "brand Dialog", JOptionPane.PLAIN_MESSAGE,
			            null,
			            null,
			            "");*/
				//bob.move(5);
				//System.out.println(bob);
				//Futurama.makeBot();
			}
		});
		btnNewBot.setBounds(28, 42, 117, 25);
		frame.getContentPane().add(btnNewBot);
		
		JButton btnMoveBot = new JButton("Move Bot");
		btnMoveBot.setBounds(28, 120, 117, 25);
		frame.getContentPane().add(btnMoveBot);
		
		JButton btnBotAction = new JButton("Bot Rotate");
		btnBotAction.setBounds(28, 157, 117, 25);
		frame.getContentPane().add(btnBotAction);
		
		JButton btnListBots = new JButton("List Bots");
		btnListBots.setBounds(28, 79, 117, 25);
		frame.getContentPane().add(btnListBots);
		
		JButton btnBotDistance = new JButton("Bot Distance");
		btnBotDistance.setBounds(28, 194, 117, 25);
		frame.getContentPane().add(btnBotDistance);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(76, 46, 6, 21);
		frame.getContentPane().add(textPane);
	}
}
