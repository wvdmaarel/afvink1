import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextField extends JFrame {
	JTextField textfield;
	JPanel panel;
	JLabel label;
	//ImageIcon img;

	public TextField() {
		setSize(400,200);
	//	setLocationByPlatform(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	//	setResizable(false);
		setTitle("TextField"); 
		setVisible(true);
	//	img = new ImageIcon("/home/wesselvandermaarel/Pictures/Logo_HAN.jpeg");
	//	setIconImage(img);

		panel = new JPanel();
		panel.setBackground(Color.BLUE);
		add(panel);

		label = new JLabel("Input");
		//label.setBounds(0, 0, 0, 0);
		panel.add(label);

		textfield = new JTextField(20);
		textfield.setBounds(0, 0, 100, 20);
		textfield.setForeground(Color.RED);
		panel.add(textfield);
		}

	public static void main(String args[]) {
		JFrame test = new TextField();
	}
}