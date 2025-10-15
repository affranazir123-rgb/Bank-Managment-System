package BankPackage;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class SignUpThree extends JFrame implements ActionListener{
	
	JRadioButton saving_account,fixedDeposit_account,current_account,recurringDeposit_account;
	JCheckBox atm,interntBanking,mobileBanking,emailalert,chequeBook,eStatement,declaration;
	JButton submit,cancel;
	String formno;
	SignUpThree(String formno){
		this.formno=formno;
		this.setLayout(null);
		
		JLabel account_label=new JLabel("Page 3: Account Details");
		account_label.setFont(new Font("Raleway",Font.BOLD,22));
		account_label.setBounds(280,40,400,40);
		this.add(account_label);
		
		JLabel account_type=new JLabel("Account Type");
		account_type.setFont(new Font("Raleway",Font.BOLD,20));
		account_type.setBounds(70,140,200,30);
		this.add(account_type);
		
		saving_account=new JRadioButton("Saving Account");
		saving_account.setFont(new Font("Raleway",Font.BOLD,16));
		saving_account.setBackground(Color.white);
		saving_account.setBounds(70,200,150,20);
		this.add(saving_account);
		
		fixedDeposit_account=new JRadioButton("Fixed Deposit Account");
		fixedDeposit_account.setFont(new Font("Raleway",Font.BOLD,16));
		fixedDeposit_account.setBackground(Color.white);
		fixedDeposit_account.setBounds(300,200,200,20);
		this.add(fixedDeposit_account);
		
		current_account=new JRadioButton("Current Account");
		current_account.setFont(new Font("Raleway",Font.BOLD,16));
		current_account.setBackground(Color.white);
		current_account.setBounds(70,250,155,20);
		this.add(current_account);
		
		recurringDeposit_account=new JRadioButton("Recurring Deposit Account");
		recurringDeposit_account.setFont(new Font("Raleway",Font.BOLD,16));
		recurringDeposit_account.setBackground(Color.white);
		recurringDeposit_account.setBounds(300,250,235,20);
		this.add(recurringDeposit_account);
		
		ButtonGroup account_group=new ButtonGroup();
		account_group.add(saving_account);
		account_group.add(fixedDeposit_account);
		account_group.add(current_account);
		account_group.add(recurringDeposit_account);
		
		
		JLabel card_label=new JLabel("Card Number");
		card_label.setFont(new Font("Raleway",Font.BOLD,20));
		card_label.setBounds(70,350,200,20);
		this.add(card_label);
		
		JLabel card_number=new JLabel("XXXX-XXXX-XXXX-4184");
		card_number.setFont(new Font("Raleway",Font.BOLD,20));
		card_number.setBounds(300,350,230,25);
		this.add(card_number);
		
		JLabel card_detail=new JLabel("Your 16 digit card number");
		card_detail.setFont(new Font("Raleway",Font.BOLD,10));
		card_detail.setBounds(70,365,150,20);
		this.add(card_detail);
		
		JLabel pin_label=new JLabel("PIN");
		pin_label.setFont(new Font("Raleway",Font.BOLD,20));
		pin_label.setBounds(70,400,200,20);
		this.add(pin_label);
		
		JLabel pin_number=new JLabel("XXXX");
		pin_number.setFont(new Font("Raleway",Font.BOLD,20));
		pin_number.setBounds(300,400,200,20);
		this.add(pin_number);
		
		JLabel pin_detail=new JLabel("Your 4 digit pin");
		pin_detail.setFont(new Font("Raleway",Font.BOLD,10));
		pin_detail.setBounds(70,415,150,20);
		this.add(pin_detail);
		
		JLabel services_required=new JLabel("Services Required");
		services_required.setFont(new Font("Raleway",Font.BOLD,20));
		services_required.setBounds(70,450,200,20);
		this.add(services_required);
		
		atm=new JCheckBox("ATM Card");
		atm.setBackground(Color.white);
		atm.setFont(new Font("Raleway",Font.BOLD,16));
		atm.setBounds(70,500,150,20);
		this.add(atm);
		
		interntBanking=new JCheckBox("Internet Banking");
		interntBanking.setBackground(Color.white);
		interntBanking.setFont(new Font("Raleway",Font.BOLD,16));
		interntBanking.setBounds(300,500,160,20);
		this.add(interntBanking);
		
		mobileBanking=new JCheckBox("Mobile Banking");
		mobileBanking.setBackground(Color.WHITE);
		mobileBanking.setFont(new Font("Raleway",Font.BOLD,16));
		mobileBanking.setBounds(530,500,150,20);
		this.add(mobileBanking);
		
		emailalert=new JCheckBox("Email & SMS Alert");
		emailalert.setBackground(Color.WHITE);
		emailalert.setFont(new Font("Raleway",Font.BOLD,16));
		emailalert.setBounds(70,550,200,20);
		this.add(emailalert);
		
		chequeBook=new JCheckBox("ChequeBook");
		chequeBook.setBackground(Color.WHITE);
		chequeBook.setFont(new Font("Raleway",Font.BOLD,16));
		chequeBook.setBounds(300, 550, 130, 20);
		this.add(chequeBook);
		
		eStatement=new JCheckBox("E-Statement");
		eStatement.setBackground(Color.WHITE);
		eStatement.setFont(new Font("Raleway",Font.BOLD,16));
		eStatement.setBounds(530, 550, 150, 20);
		this.add(eStatement);
		
		declaration=new JCheckBox("I hereby declares that the above entered details are correct to the best of my Knowlegde");
		declaration.setBackground(Color.WHITE);
		declaration.setFont(new Font("Raleway",Font.BOLD,16));
		declaration.setBounds(70, 600, 690, 20);
		this.add(declaration);
		
		submit=new JButton("Submit");
		submit.setBackground(Color.black);
		submit.setForeground(Color.WHITE);
		submit.setFont(new Font("Raleway",Font.BOLD,20));
		submit.setBounds(530, 660, 100, 20);
		submit.addActionListener(this);
		this.add(submit);
		
		cancel=new JButton("Cancel");
		cancel.setBackground(Color.black);
		cancel.setForeground(Color.WHITE);
		cancel.setFont(new Font("Raleway",Font.BOLD,20));
		cancel.setBounds(665, 660, 100, 20);
		cancel.addActionListener(this);
		this.add(cancel);

		this.getContentPane().setBackground(Color.white);
		
		this.setSize(850,820);
		this.setLocation(350,0);
		this.setVisible(true);
		
	}
	
	
	
	

	public static void main(String[] args) {
		new SignUpThree("");

	}




//	current_account,recurringDeposit_account;

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==submit) {
			String account_type="";
			if(saving_account.isSelected()) {
				account_type="Saving Account";
			}
			else if(fixedDeposit_account.isSelected()) {
				account_type="Fixed Deposit Account";
			}
			else if(current_account.isSelected()) {
				account_type="Current Account";
			}
			else if(recurringDeposit_account.isSelected()) {
				account_type="Recurring Deposit Account";
			}
			//	chequeBook,eStatement,declaration;

			
			Random random=new Random();
			String cardnumber=""+ Math.abs((random.nextLong()% 90000000)+5040936000000000L);
			
			String pinnumber=""+ (Math.abs(random.nextLong()%9000L)+1000L);	
			
			String facility="";
			if(atm.isSelected()) {
				facility=facility+"  ATM Card ";
			}
			if(interntBanking.isSelected()) {
				facility=facility+" , Internet Banking ";

			}
			if(mobileBanking.isSelected()) {
				facility=facility+" , Mobile Banking ";

			}
			if(emailalert.isSelected()) {
				facility=facility+" , Email & SMS Alert ";

			}
			if(chequeBook.isSelected()) {
				facility=facility+" , ChequeBook ";

			}
			if(eStatement.isSelected()) {
				facility=facility+" , E-Statment ";

			}
			
			try {
				if(account_type.equals("") ) {
					JOptionPane.showMessageDialog(null, "Account type is required");
					return;
				
				}
				else {
					Conn con=new Conn();
					String query1="Insert into signupthree values('"+formno+"','"+account_type+ "','"+cardnumber+ "','"+pinnumber+ "','"+facility+ "')";
					String query2="Insert into login values('"+formno+"','"+cardnumber+ "','"+pinnumber+ "')";

				
					con.s.executeUpdate(query1);
					con.s.executeUpdate(query2);
					
					JOptionPane.showMessageDialog(null,"Card Number: " + cardnumber + "\n Pin :" + pinnumber  );
				
				
					this.setVisible(false);
					new Deposit(pinnumber).setVisible(false);
				}
			}
			catch(Exception ex) {
				System.out.println(ex);
			}
		
		
		
		}
		    
		
		
		   
		else if(e.getSource()==cancel) {
			this.setVisible(false);
			new Login().setVisible(true);
		}
		
	}

}
