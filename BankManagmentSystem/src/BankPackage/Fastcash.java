package BankPackage;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Fastcash extends JFrame implements ActionListener{
	JButton amount1,amount2,amount3,amount4,amount5,amount6,back;
	String pinnumber;
	Fastcash(String pinnumber){
		
		this.pinnumber=pinnumber;
		
		ImageIcon atmImage=new ImageIcon("src/icons/atm.jpg");
		Image image=atmImage.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
		ImageIcon scaledicon=new ImageIcon(image);
		JLabel image_label=new JLabel(scaledicon);
		image_label.setBounds(0, 0, 900, 900);
		this.add(image_label);
		
		JLabel text=new JLabel("SELECT WITHDRAWL AMOUNT");
		text.setBounds(185, 250, 700, 30);
		text.setForeground(Color.white);
		text.setFont(new Font("Raleway",Font.BOLD,20));
		image_label.add(text);
		
		amount1=new JButton("RS. 100");
		amount1.setFont(new Font("Raleway",Font.BOLD,16));
		amount1.setBounds(170,340,150,20);
		amount1.addActionListener(this);
		image_label.add(amount1);
		
		amount2=new JButton("RS. 500");
		amount2.setFont(new Font("Raleway",Font.BOLD,16));
		amount2.setBounds(330,340,160,20);
		amount2.addActionListener(this);
		image_label.add(amount2);
		
		amount3=new JButton("RS. 1000");
		amount3.setFont(new Font("Raleway",Font.BOLD,16));
		amount3.setBounds(170,380,150,20);
		amount3.addActionListener(this);
		image_label.add(amount3);
		
		amount4=new JButton("RS. 2000");
		amount4.setFont(new Font("Raleway",Font.BOLD,16));
		amount4.setBounds(330,380,160,20);
		amount4.addActionListener(this);
		image_label.add(amount4);
		
		amount5=new JButton("RS. 5000");
		amount5.setFont(new Font("Raleway",Font.BOLD,16));
		amount5.setBounds(170,420,150,20);
		amount5.addActionListener(this);
		image_label.add(amount5);
		
		amount6=new JButton("RS. 10000");
		amount6.setFont(new Font("Raleway",Font.BOLD,16));
		amount6.setBounds(330,420,160,20);
		amount6.addActionListener(this);
		image_label.add(amount6);
		
		back=new JButton("BACK");
		back.setFont(new Font("Raleway",Font.BOLD,16));
		back.setBounds(390,455,100,20);
		back.addActionListener(this);
		image_label.add(back);
		
		
		
		this.setSize(900,900);
		this.setLocation(300, 0);
		//this.setUndecorated(true);
		this.setVisible(true);
	}
	
	
	
	

	public static void main(String[] args) {
		new Fastcash("");

	}
	
	@Override
	  public void actionPerformed(ActionEvent e) {
		if(e.getSource()==back) {
			this.setVisible(false);
			new Transactions(pinnumber).setVisible(true);
		}
		else  {
			String amount=((JButton)e.getSource()).getText().substring(4);
			try {
				Conn con=new Conn();
				ResultSet rs=con.s.executeQuery("Select * from bank where pin = '"+pinnumber+"'  ");
				int balance=0;
				while(rs.next()) {
					if(rs.getString("type").equals("Deposit")) {
						balance += Integer.parseInt(rs.getString("amount"));
					}
					else {
						balance -= Integer.parseInt(rs.getString("amount"));
					}
				}
				
				if(e.getSource()!=back && balance<Integer.parseInt(amount)) {
					JOptionPane.showMessageDialog(null, "Insufficient Balance");
					return;
				}
				
				Date date=new Date();
				
				String query="Insert into bank values('"+pinnumber+"' , '"+date+"' , 'withdrawl' ,'"+amount+"')";
				con.s.executeUpdate(query);
				JOptionPane.showMessageDialog(null, "Rs. "+amount+ " Debited Successfully");
				
				this.setVisible(false);
				new Transactions(pinnumber).setVisible(true);
				
				
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
			
		}
		
	}

}
