package BankPackage;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener{
	
	JButton signin,clear,signup;
	JTextField cardtext;
	JPasswordField pintext;
	
	Login(){
		this.setTitle("Automated Teller Machine");
		this.setLayout(null);
		
		ImageIcon icon=new ImageIcon("src/icons/logo.jpg");
		Image image=icon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		ImageIcon icon2=new ImageIcon(image);
		JLabel label=new JLabel(icon2);
		label.setBounds(70, 10, 100, 100);
		
		JLabel text=new JLabel("Welcome to ATM");
		text.setFont(new Font("Osward",Font.BOLD,38));
		text.setBounds(200, 40, 400, 40);
		this.add(text);
		
		JLabel cardno=new JLabel("Card No");
		cardno.setFont(new Font("Raleway",Font.BOLD,28));
		cardno.setBounds(120, 150, 400, 30);
		this.add(cardno);
		
		cardtext=new JTextField();
		cardtext.setBounds(300, 150,230, 30);
		cardtext.setFont(new Font("Arial",Font.BOLD,14));
		this.add(cardtext);
		
		
		JLabel pin=new JLabel("PIN");
		pin.setFont(new Font("Raleway",Font.BOLD,28));
		pin.setBounds(120, 220, 400, 30);
		this.add(pin);
		
		pintext=new JPasswordField();
		pintext.setBounds(300, 220,230, 30);
		pintext.setFont(new Font("Arial",Font.BOLD,14));
		this.add(pintext);
		
		signin=new JButton("SIGN IN");
		signin.setBounds(300, 300, 100, 30);
		signin.setBackground(Color.black);
		signin.setForeground(Color.white);
		signin.addActionListener(this);
		this.add(signin);
		
		clear=new JButton("CLEAR");
		clear.setBounds(430, 300, 100, 30);
		clear.setBackground(Color.black);
		clear.setForeground(Color.white);
		clear.addActionListener(this);
		this.add(clear);
		
		signup=new JButton("SIGN UP");
		signup.setBounds(300, 350, 230, 30);
		signup.setBackground(Color.black);
		signup.setForeground(Color.white);
		signup.addActionListener(this);
		this.add(signup);
		
		getContentPane().setBackground(Color.white);
		
		this.add(label);
		this.setSize(800,480);
		this.setLocation(350,100);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==clear) {
			cardtext.setText("");
			pintext.setText("");
		}
		else if(e.getSource()==signin) {
			try {
				Conn con=new Conn();
				String cardnumber=cardtext.getText();
				String pinnumber=pintext.getText();
				String query="select * from login where CardNumber = '"+cardnumber+"' and PinNumber = '"+pinnumber+"'";
				
				ResultSet rs=con.s.executeQuery(query);
				if(rs.next()) {
					this.setVisible(false);
					new Transactions(pinnumber).setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "Incorect CardNumber or Pin");
				}
				
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
		}
		else if(e.getSource()==signup) {
		this.setVisible(false);
		new SignUpOne().setVisible(true);
		}
	}

}
