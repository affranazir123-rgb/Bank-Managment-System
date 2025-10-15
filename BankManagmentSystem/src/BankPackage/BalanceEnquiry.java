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

public class BalanceEnquiry extends JFrame implements ActionListener{
	String pinnumber;
	JButton back;
	BalanceEnquiry(String pinnumber){
		this.pinnumber=pinnumber;
		
		this.setLayout(null);
		
		ImageIcon i1=new ImageIcon("src/icons/atm.jpg");
		Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image=new JLabel(i3);
		image.setBounds(0,0,900,900);
		this.add(image);
				
		back=new JButton("Back");
		back.setBounds(390,440,100,30);
		back.setFont(new Font("Raleway",Font.BOLD,20));
		back.setForeground(Color.black);
		back.addActionListener(this);
		image.add(back);
		
		int balance=0;
		try {
			Conn con =new Conn();
			ResultSet rs=con.s.executeQuery("select * from bank where pin= '"+pinnumber+"'  ");
			
			while(rs.next()) {
				if(rs.getString("type").equals("Deposit")){
					balance += Integer.parseInt(rs.getString("amount"));
				}
				else {
					balance -= Integer.parseInt(rs.getString("amount"));
				}
			}
			
			
			
			
		} catch (SQLException e) {
			System.out.println(e);
			e.printStackTrace();
		}
		
		
		
		JLabel text=new JLabel("Your current account balance is RS: "+balance);
		text.setForeground(Color.white);
		text.setFont(new Font("Raleway",Font.BOLD,16));
		text.setBounds(170,220,600,20);
		image.add(text);
		
		this.setSize(900,900);
		this.setLocation(300,0);
		this.setVisible(true);
		
	}

	public static void main(String[] args) {
		
		new BalanceEnquiry("").setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		this.setVisible(false);
		new Transactions(pinnumber).setVisible(true);
	}

}
