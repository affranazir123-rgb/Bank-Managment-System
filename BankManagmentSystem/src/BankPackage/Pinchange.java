package BankPackage;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Pinchange extends JFrame implements ActionListener{
	JButton change,back;
	JPasswordField pinText,repinText;
	String pinnumber;
	Pinchange(String pinnumber){
		this.pinnumber=pinnumber;
		
		this.setLayout(null);
		
		ImageIcon i1=new ImageIcon("src/icons/atm.jpg");
		Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		
		JLabel image=new JLabel(i3);
		image.setBounds(0, 0, 900, 900);
		this.add(image);
		
		JLabel text=new JLabel("CHANGE YOUR PIN");
		text.setForeground(Color.white);
		text.setFont(new Font("Raleway",Font.BOLD,20));
		text.setBounds(250,300,500,30);
		image.add(text);
		
		JLabel pin=new JLabel("New PIN:");
		pin.setForeground(Color.white);
		pin.setFont(new Font("Raleway",Font.BOLD,16));
		pin.setBounds(160,350,100,20);
		image.add(pin);
		
		pinText=new JPasswordField();
		pinText.setBounds(350,350,150,20);
		image.add(pinText);
		
		JLabel rePin=new JLabel("Re-Enter New PIN:");
		rePin.setForeground(Color.white);
		rePin.setFont(new Font("Raleway",Font.BOLD,16));
		rePin.setBounds(160,400,150,20);
		image.add(rePin);
		
		repinText=new JPasswordField();
		repinText.setBounds(350,400,150,20);
		image.add(repinText);
		
		change=new JButton("CHANGE");
		change.setFont(new Font("Raleway",Font.BOLD,20));
		change.setForeground(Color.black);
		change.setBounds(370,490,130,20);
		change.addActionListener(this);
		image.add(change);
		
		back=new JButton("BACK");
		back.setFont(new Font("Raleway",Font.BOLD,20));
		back.setForeground(Color.black);
		back.setBounds(370,520,130,20);
		back.addActionListener(this);
		image.add(back);
		
		this.setSize(900,900);
		this.setLocation(300,0);
		this.setVisible(true);
	
		
		
	}
	

	public static void main(String[] args) {
		new Pinchange("").setVisible(true);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==change) {
			try {
				String newPin=pinText.getText();
				String rePin=repinText.getText();
				if(!newPin.equals(rePin)) {
					JOptionPane.showMessageDialog(null, "Entered PIN doesnot match");
					
				}
				if(newPin.equals("")) {
					JOptionPane.showMessageDialog(null,"Please enter new PIN");
					return;
				}
				if(rePin.equals("")) {
					JOptionPane.showMessageDialog(null, "Please Re-Enter new PIN");
					return;
				}
				
				Conn con=new Conn();
				String query1="update bank set pin= '"+rePin+"' where pin= '"+pinnumber+"'  ";
				String query2="update login set PinNumber= '"+rePin+"' where PinNumber= '"+pinnumber+"'  ";
				String query3="update signupthree set Pin= '"+rePin+"' where Pin= '"+pinnumber+"'  ";

				
				con.s.executeUpdate(query1);
				con.s.executeUpdate(query2);
				con.s.executeUpdate(query3);
				
				JOptionPane.showMessageDialog(null, "PIN changed successfully");
				
				this.setVisible(false);
				new Transactions(rePin).setVisible(true);
				
				
			}
			catch(Exception ae) {
				System.out.println(e);
			    JOptionPane.showMessageDialog(null, "Error: " + ae.getMessage()); // optional visible error

			}
		}
		else {
			this.setVisible(false);
			new Transactions(pinnumber).setVisible(true);
		}
	}

}
