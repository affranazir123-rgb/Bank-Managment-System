package BankPackage;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Deposit extends JFrame implements ActionListener{
	JButton deposit,back;
	JTextField amount;
	String pinnumber;
	Deposit(String pinnumber){
		this.pinnumber=pinnumber;
		this.setLayout(null);
		
		ImageIcon i1=new ImageIcon("src/icons/atm.jpg");
		Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image=new JLabel(i3);
		image.setBounds(0,0,900,900);
		this.add(image);
		
		JLabel label=new JLabel("Enter the amount you want to deposit");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Raleway",Font.BOLD,16));
		label.setBounds(195,300,600,30);
		image.add(label);
		
		amount=new JTextField();
		amount.setBounds(195,345,295,30);
		image.add(amount);
		
		deposit=new JButton("Deposit");
		deposit.setFont(new Font("Raleway",Font.BOLD,16));
		deposit.setBounds(350,480,150,30);
		deposit.addActionListener(this);
		image.add(deposit);
		
		back= new JButton("Back");
		back.setFont(new Font("Raleway",Font.BOLD,16));
		back.setBounds(350,520,150,30);
		back.addActionListener(this);
		image.add(back);
		
		this.setSize(900,900);
		this.setLocation(300,0);
		this.setVisible(true);
	}
	

	public static void main(String[] args) {
		new Deposit("");

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==deposit) {
			String amountEntered=amount.getText();
			String type="Deposit";
			Date date=new Date();
			if(amountEntered.equals("")) {
				JOptionPane.showMessageDialog(null, "Please enter the amount you want to deposit");
				
			}
			else {
				try {
					Conn con=new Conn();
					String query="insert into bank values('"+pinnumber+"','"+date+"','"+type+"','"+amountEntered+"')";
					con.s.executeUpdate(query);
					JOptionPane.showMessageDialog(null, "Rs "+amountEntered+ " Deposited Successfully");
					
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
			}
			
			
		}
		else if(e.getSource()==back){
			this.setVisible(false);
			new Transactions(pinnumber).setVisible(true);
		}
	}

}
