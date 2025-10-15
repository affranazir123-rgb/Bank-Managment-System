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
import javax.swing.JPanel;

public class Transactions extends JFrame implements ActionListener{
	JButton deposit,cash_withdrawl,fastCash,miniStatemnt,pinChange,balanceEnquiry,exit;
	String pinnumber;
	Transactions(String pinnumber){
		
		this.pinnumber=pinnumber;
		
		ImageIcon atmImage=new ImageIcon("src/icons/atm.jpg");
		Image image=atmImage.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
		ImageIcon scaledicon=new ImageIcon(image);
		JLabel image_label=new JLabel(scaledicon);
		image_label.setBounds(0, 0, 900, 900);
		this.add(image_label);
		
		JLabel text=new JLabel("Please select your transaction");
		text.setBounds(215, 250, 700, 30);
		text.setForeground(Color.white);
		text.setFont(new Font("Raleway",Font.BOLD,16));
		image_label.add(text);
		
		deposit=new JButton("Deposit");
		deposit.setFont(new Font("Raleway",Font.BOLD,16));
		deposit.setBounds(170,340,150,20);
		deposit.addActionListener(this);
		image_label.add(deposit);
		
		cash_withdrawl=new JButton("Cash Withdrawl");
		cash_withdrawl.setFont(new Font("Raleway",Font.BOLD,16));
		cash_withdrawl.setBounds(330,340,160,20);
		cash_withdrawl.addActionListener(this);
		image_label.add(cash_withdrawl);
		
		fastCash=new JButton("Fast Cash");
		fastCash.setFont(new Font("Raleway",Font.BOLD,16));
		fastCash.setBounds(170,380,150,20);
		fastCash.addActionListener(this);
		image_label.add(fastCash);
		
		miniStatemnt=new JButton("Mini Statement");
		miniStatemnt.setFont(new Font("Raleway",Font.BOLD,16));
		miniStatemnt.setBounds(330,380,160,20);
		miniStatemnt.addActionListener(this);
		image_label.add(miniStatemnt);
		
		pinChange=new JButton("Pin Change");
		pinChange.setFont(new Font("Raleway",Font.BOLD,16));
		pinChange.setBounds(170,420,150,20);
		pinChange.addActionListener(this);
		image_label.add(pinChange);
		
		balanceEnquiry=new JButton("Balance Enquiry");
		balanceEnquiry.setFont(new Font("Raleway",Font.BOLD,16));
		balanceEnquiry.setBounds(330,420,160,20);
		balanceEnquiry.addActionListener(this);
		image_label.add(balanceEnquiry);
		
		exit=new JButton("Exit");
		exit.setFont(new Font("Raleway",Font.BOLD,16));
		exit.setBounds(390,455,100,20);
		exit.addActionListener(this);
		image_label.add(exit);
		
		
		
		this.setSize(900,900);
		this.setLocation(300, 0);
		//this.setUndecorated(true);
		this.setVisible(true);
	}
	
	
	
	

	public static void main(String[] args) {
		new Transactions("");

	}





	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==exit) {
			System.exit(0);
		}
		else if(e.getSource()==deposit) {
			this.setVisible(false);
			new Deposit(pinnumber).setVisible(true);
			
		}
		else if(e.getSource()==cash_withdrawl) {
			this.setVisible(false);
			new Withdrawl(pinnumber).setVisible(true);
		}
		else if(e.getSource()==fastCash) {
			this.setVisible(false);
			new Fastcash(pinnumber).setVisible(true);
		}
		else if(e.getSource()==pinChange) {
			this.setVisible(false);
			new Pinchange(pinnumber).setVisible(true);
		}
		else if (e.getSource()==balanceEnquiry) {
			this.setVisible(false);
			new BalanceEnquiry(pinnumber).setVisible(true);
		}
		else if(e.getSource()==miniStatemnt) {
			new MiniStatement(pinnumber).setVisible(true);
		}
	}

}
