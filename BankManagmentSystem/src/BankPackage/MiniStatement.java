package BankPackage;

import java.awt.Color;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MiniStatement extends JFrame {
	String pinnumber;
	
	MiniStatement(String pinnumber){
		
		this.setTitle("Mini Statement");
		this.pinnumber=pinnumber;
		this.setLayout(null);
		
		JLabel mini=new JLabel();
		this.add(mini);
		
		JLabel bank=new JLabel("National Bank");
		bank.setBounds(150,20,100,20);
		this.add(bank);
		
		JLabel card=new JLabel();
		card.setBounds(20,80,300,20);
		this.add(card);
		
		JLabel balance=new JLabel();
		balance.setBounds(20,400,300,20);
		this.add(balance);
		
		try {
			
			Conn con=new Conn();
			ResultSet rs=con.s.executeQuery("select * from login where PinNumber= '"+pinnumber+"' ");
			while(rs.next()) {
				card.setText("Card Number: " + rs.getString("CardNumber").substring(0,4) + "xxxxxxxx"+ rs.getString("CardNumber").substring(12) );
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		try {
			Conn con=new Conn();
			int bal=0;
			ResultSet rs=con.s.executeQuery("select * from bank where pin=  '"+pinnumber+"'  ");
			while(rs.next()) {
				
				mini.setText(mini.getText()+ "<html>" +rs.getString("date") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" +rs.getString("amount") + "<br><br><html>");
			
				
				if(rs.getString("type").equals("Deposit")) {
					bal += Integer.parseInt(rs.getString("amount"));
				}
				else {
					bal -= Integer.parseInt(rs.getString("amount"));
				}
			}
			
			
			balance.setText("Your current account balance is RS "+bal);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		mini.setBounds(20,140,400,200);
		
		this.setSize(400,600);
		this.setLocation(20,20);
		this.getContentPane().setBackground(Color.white);
		this.setVisible(true);
		
	}

	public static void main(String[] args) {
		new MiniStatement("");
	}

}
