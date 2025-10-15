package BankPackage;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;


public class SignUpOne extends JFrame implements ActionListener {
	int random4digit;
	JTextField nametextfield,fnametextfield,emailtexttextfield,addresstexttextfield,citytexttextfield,statetexttextfield,pinCodetexttextfield;
	JButton next;
	JRadioButton male,female,married,unmarried,other;
	JDateChooser datechooser;
	
	SignUpOne(){
		
		this.setLayout(null);
		Random ran=new Random();
		//long random=(Math.abs(ran.nextLong() % 9000L) +1000L);
		random4digit=ran.nextInt(9000)+1000;
				
		
		JLabel formno=new JLabel("APPLICATION FORM NO. "+random4digit);
		formno.setFont(new Font("Raleway",Font.BOLD,38));
		formno.setBounds(150,30, 600, 30);
		this.add(formno);
		
		JLabel personalDetails=new JLabel("Page 1: Personal Details");
		personalDetails.setFont(new Font("Raleway",Font.BOLD,28));
		personalDetails.setBounds(250, 80, 500, 50);
		this.add(personalDetails);
		
		JLabel name=new JLabel("Name:");
		name.setFont(new Font("Raleway",Font.BOLD,20));
		name.setBounds(100,170, 100, 30);
		this.add(name);
		
		nametextfield=new JTextField();
		nametextfield.setFont(new Font("Raleway",Font.BOLD,14));
		nametextfield.setBounds(300, 170, 300, 30);
		this.add(nametextfield);
		
		JLabel fname=new JLabel("Father's Name:");
		fname.setFont(new Font("Raleway",Font.BOLD,20));
		fname.setBounds(100,220, 150, 30);
		this.add(fname);
		
		fnametextfield=new JTextField();
		fnametextfield.setFont(new Font("Raleway",Font.BOLD,14));
		fnametextfield.setBounds(300, 220, 300, 30);
		this.add(fnametextfield);
		
		JLabel dob=new JLabel("Date of Birth:");
		dob.setFont(new Font("Raleway",Font.BOLD,20));
		dob.setBounds(100,270, 150, 30);
		this.add(dob);
		
		datechooser=new JDateChooser();
		datechooser.setBounds(300, 270, 300, 30);
		datechooser.setForeground(new Color(250,120,102));
		this.add(datechooser);
		
		JLabel gender=new JLabel("Gender:");
		gender.setFont(new Font("Raleway",Font.BOLD,20));
		gender.setBounds(100,320, 150, 30);
		this.add(gender);
		
		female=new JRadioButton("Female");
		female.setBounds(300, 320, 100, 30);
		female.setBackground(Color.white);
		this.add(female);
		
		male=new JRadioButton("Male");
		male.setBounds(450, 320, 100, 30);
		male.setBackground(Color.white);
		this.add(male);
		
		ButtonGroup gendergroup=new ButtonGroup();
		gendergroup.add(male);
		gendergroup.add(female);
		
		
		JLabel email=new JLabel("Email Address:");
		email.setFont(new Font("Raleway",Font.BOLD,20));
		email.setBounds(100,370 , 150, 30);
		this.add(email);
		
		emailtexttextfield=new JTextField();
		emailtexttextfield.setFont(new Font("Raleway",Font.BOLD,14));
		emailtexttextfield.setBounds(300, 370, 300, 30);
		this.add(emailtexttextfield);
		
		JLabel maritalStatus=new JLabel("Marital Status:");
		maritalStatus.setFont(new Font("Raleway",Font.BOLD,20));
		maritalStatus.setBounds(100,420 , 150, 30);
		this.add(maritalStatus);
		
		married=new JRadioButton("Married");
		married.setBounds(295, 420, 90, 30);
		married.setBackground(Color.white);
		this.add(married);
		
		unmarried=new JRadioButton("UnMarried");
		unmarried.setBounds(390, 420, 90, 30);
		unmarried.setBackground(Color.white);
		this.add(unmarried);
		
		other=new JRadioButton("Other");
		other.setBounds(490, 420, 90, 30);
		other.setBackground(Color.white);
		this.add(other);
		
		next=new JButton("Next");
		next.setBackground(Color.black);
		next.setForeground(Color.white);
		next.setFont(new Font("Raleway",Font.BOLD,14));
		next.setBounds(520, 668, 80, 30);
		this.add(next);
		next.addActionListener(this);
		
		ButtonGroup maritalgroup=new ButtonGroup();
		maritalgroup.add(married);
		maritalgroup.add(unmarried);
		maritalgroup.add(other);
		
		
		JLabel address=new JLabel("Address:");
		address.setFont(new Font("Raleway",Font.BOLD,20));
		address.setBounds(100,470 , 150, 30);
		this.add(address);
		
		addresstexttextfield=new JTextField();
		addresstexttextfield.setFont(new Font("Raleway",Font.BOLD,14));
		addresstexttextfield.setBounds(300, 470, 300, 30);
		this.add(addresstexttextfield);
		
		JLabel city=new JLabel("City:");
		city.setFont(new Font("Raleway",Font.BOLD,20));
		city.setBounds(100,520 , 150, 30);
		this.add(city);
		
		citytexttextfield=new JTextField();
		citytexttextfield.setFont(new Font("Raleway",Font.BOLD,14));
		citytexttextfield.setBounds(300, 520, 300, 30);
		this.add(citytexttextfield);
		
		JLabel state=new JLabel("State:");
		state.setFont(new Font("Raleway",Font.BOLD,20));
		state.setBounds(100,570 , 150, 30);
		this.add(state);
		
		statetexttextfield=new JTextField();
		statetexttextfield.setFont(new Font("Raleway",Font.BOLD,14));
		statetexttextfield.setBounds(300, 570, 300, 30);
		this.add(statetexttextfield);
		
		JLabel pinCode=new JLabel("Pin Code:");
		pinCode.setFont(new Font("Raleway",Font.BOLD,20));
		pinCode.setBounds(100,620 , 150, 30);
		this.add(pinCode);
		
		pinCodetexttextfield=new JTextField();
		pinCodetexttextfield.setFont(new Font("Raleway",Font.BOLD,14));
		pinCodetexttextfield.setBounds(300, 620, 300, 30);
		this.add(pinCodetexttextfield);
		
		
		getContentPane().setBackground(Color.white);
		this.setSize(850,1200);
		this.setLocation(350,1);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String formno=" "+random4digit; //it will convert int to string
		String name=nametextfield.getText();
		String fname=fnametextfield.getText();
		String dob=((JTextField) datechooser.getDateEditor().getUiComponent()).getText();
		String gender=null;
		if(female.isSelected()) {
			gender="Female";
		}
		else if(male.isSelected()) {
			gender="Male";
		}
		
		String email=emailtexttextfield.getText();
		String marital=null;
		if(married.isSelected()) {
			marital="Married";
		}
		else if(unmarried.isSelected()) 
		{
			marital="UnMarried";
		}
		else if(other.isSelected()) {
			marital="Other";
		}
		
		String address=addresstexttextfield.getText();
		String city=citytexttextfield.getText();
		String state=statetexttextfield.getText();
		String pin=pinCodetexttextfield.getText();
		
		try {
			if(name.equals("")) {
				JOptionPane.showMessageDialog(null, "Name is required");
			}
			else {
				Conn c=new Conn();
				String query="Insert into signup values('"+formno+"',"
						+ "'"+name+"',"
								+ "'"+fname+"',"
										+ "'"+dob+"',"
												+ "'"+gender+"',"
														+ "'"+email+"',"
																+ "'"+marital+"',"
																		+ "'"+address+"',"
																				+ "'"+city+"',"
																						+ "'"+pin+"',"
																		
																						+ "'"+state+"')";
				
				int rows = c.s.executeUpdate(query);
				System.out.println(rows + " row(s) inserted successfully.");
				System.out.println("SQL -> " + query);

				this.setVisible(false);
			    new SignUpTwo(formno).setVisible(true);
			
			}
		}
		catch(Exception ae) {
			System.out.println(ae);
		}
		
		
		
	}

}
