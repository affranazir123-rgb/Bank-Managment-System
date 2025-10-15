package BankPackage;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;


public class SignUpTwo extends JFrame implements ActionListener {
	JTextField pinCodetexttextfield,pantextfield,cnictexttextfield;
	JButton next;
	JRadioButton Senior_citizen,not_Senior_citizen,existing_account,no_existing_account;
	JComboBox religion,category,occupation,education,income;
	String formno;
	SignUpTwo(String formno){
		this.formno=formno;
		this.setLayout(null);
		
		this.setTitle("NEW ACCOUNT APPLICATION FORM-PAGE 2");		
		
		JLabel AdditionalDetails=new JLabel("Page 2: Additional Details");
		AdditionalDetails.setFont(new Font("Raleway",Font.BOLD,28));
		AdditionalDetails.setBounds(250, 80, 500, 50);
		this.add(AdditionalDetails);
		
		JLabel religion_name=new JLabel("Religion:");
		religion_name.setFont(new Font("Raleway",Font.BOLD,20));
		religion_name.setBounds(100,170, 100, 30);
		this.add(religion_name);
		
		String reg_value[]= {"Muslim","Hindu","Christian","Sikh","Other"};
		religion=new JComboBox(reg_value);
		religion.setBounds(300, 170, 300, 30);
		religion.setBackground(Color.white);
		this.add(religion);
		
		
		JLabel catgory_label=new JLabel("Category:");
		catgory_label.setFont(new Font("Raleway",Font.BOLD,20));
		catgory_label.setBounds(100,220, 150, 30);
		this.add(catgory_label);
		
		String catg_val[]= {"General","OBC","SC","ST","Other"};
		category=new JComboBox(catg_val);
		category.setBackground(Color.white);
		category.setBounds(300, 220, 300, 30);
		this.add(category);
		
		JLabel income_label=new JLabel("Income:");
		income_label.setFont(new Font("Raleway",Font.BOLD,20));
		income_label.setBounds(100,270, 150, 30);
		this.add(income_label);
		
		String income_val[]= {"Null","< 1,50,000","< 2,50,000","< 5,00,000","UPTO 10,00,000"};
		income=new JComboBox(income_val);
		income.setBackground(Color.white);
		income.setBounds(300, 270, 300, 30);
		this.add(income);
		
		JLabel education_label=new JLabel("Educational");
		education_label.setFont(new Font("Raleway",Font.BOLD,20));
		education_label.setBounds(100,320, 150, 30);
		this.add(education_label);
		
		JLabel qualification_label=new JLabel("Qualification:");
		qualification_label.setFont(new Font("Raleway",Font.BOLD,20));
		qualification_label.setBounds(100,345 , 150, 30);
		this.add(qualification_label);
		
		String educational_val[]= {"Non-Graduate","Graduate","Post-Graduate","Doctrate","Other"};
		education=new JComboBox(educational_val);
		education.setBackground(Color.white);
		education.setBounds(300, 330, 300, 30);
		this.add(education);
		
		
		JLabel occupation_label=new JLabel("Occupation:");
		occupation_label.setFont(new Font("Raleway",Font.BOLD,20));
		occupation_label.setBounds(100,420 , 150, 30);
		this.add(occupation_label);
		
		
		String ocupation_val[]= {"Salaried","Self-Employed","Bussiness","Student","Retired","Other"};
		occupation=new JComboBox(ocupation_val);
		occupation.setBackground(Color.white);
		occupation.setBounds(300, 420, 300, 30);
		this.add(occupation);
		
		
		
		next=new JButton("Next");
		next.setBackground(Color.black);
		next.setForeground(Color.white);
		next.setFont(new Font("Raleway",Font.BOLD,14));
		next.setBounds(520, 668, 80, 30);
		this.add(next);
		next.addActionListener(this);
		
		
		JLabel pan_label=new JLabel("PAN Number:");
		pan_label.setFont(new Font("Raleway",Font.BOLD,20));
		pan_label.setBounds(100,470 , 150, 30);
		this.add(pan_label);
		
		pantextfield=new JTextField();
		pantextfield.setFont(new Font("Raleway",Font.BOLD,14));
		pantextfield.setBounds(300, 470, 300, 30);
		this.add(pantextfield);
		
		JLabel cnic_label=new JLabel("CNIC :");
		cnic_label.setFont(new Font("Raleway",Font.BOLD,20));
		cnic_label.setBounds(100,520 , 150, 30);
		this.add(cnic_label);
		
		cnictexttextfield=new JTextField();
		cnictexttextfield.setFont(new Font("Raleway",Font.BOLD,14));
		cnictexttextfield.setBounds(300, 520, 300, 30);
		this.add(cnictexttextfield);
		
		
		JLabel citizen_label=new JLabel("Senior Citizen:");
		citizen_label.setFont(new Font("Raleway",Font.BOLD,20));
		citizen_label.setBounds(100,570 , 150, 30);
		this.add(citizen_label);
		
		Senior_citizen=new JRadioButton("Yes");
		Senior_citizen.setBounds(300, 570, 100, 30);
		Senior_citizen.setBackground(Color.white);
		this.add(Senior_citizen);
		
		not_Senior_citizen=new JRadioButton("No");
		not_Senior_citizen.setBounds(400, 570, 150, 30);
		not_Senior_citizen.setBackground(Color.white);
		this.add(not_Senior_citizen);
		
		ButtonGroup citizengroup=new ButtonGroup();
		citizengroup.add(Senior_citizen);
		citizengroup.add(not_Senior_citizen);
		
		
		JLabel account_label=new JLabel("Existing Account:");
		account_label.setFont(new Font("Raleway",Font.BOLD,20));
		account_label.setBounds(100,620 , 170, 30);
		this.add(account_label);
		
		existing_account=new JRadioButton("Yes");
		existing_account.setBounds(300, 620, 100, 30);
		existing_account.setBackground(Color.white);
		this.add(existing_account);
		
		no_existing_account=new JRadioButton("No");
		no_existing_account.setBounds(400, 620, 150, 30);
		no_existing_account.setBackground(Color.white);
		this.add(no_existing_account);
		
		ButtonGroup existing_account_group=new ButtonGroup();
		existing_account_group.add(existing_account);
		existing_account_group.add(no_existing_account);
		
		
		getContentPane().setBackground(Color.white);
		this.setSize(850,1200);
		this.setLocation(350,1);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String RELIGION=(String)religion.getSelectedItem();
		String CATEGORY=(String)category.getSelectedItem();
		String INCOME=(String)income.getSelectedItem();
		String EDUCATION=(String)education.getSelectedItem();
		String OCCUPATION=(String)occupation.getSelectedItem();
		String senior_citizen=null;
		if(Senior_citizen.isSelected()) {
			senior_citizen="Yes";
		}
		else if(not_Senior_citizen.isSelected()) {
			senior_citizen="No";
		}
		
		String existingAccount=null;
		if(existing_account.isSelected()) {
			existingAccount="Yes";
		}
		else if(no_existing_account.isSelected()) 
		{
			existingAccount="No";
		}
		String PAN=pantextfield.getText();
		String CNIC=cnictexttextfield.getText();
		if(PAN.length()!=10){
			JOptionPane.showMessageDialog(null, "PAN must contain 10 Digits");
		}
		else if(CNIC.length()!=13) {
			JOptionPane.showMessageDialog(null, "CNIC must contain 13 digits");
		}
		try {
			Conn c=new Conn();
			
				String query="Insert into signuptwo values('"+formno+"',"
						+ "'"+RELIGION+"',"
								+ "'"+CATEGORY+"',"
										+ "'"+INCOME+"',"
												+ "'"+EDUCATION+"',"
														+ "'"+OCCUPATION+"',"
																+ "'"+PAN+"',"
																		+ "'"+CNIC+"',"
																				+ "'"+senior_citizen+"',"
																						+ "'"+existingAccount+"')";
																		
																						
				
				
				int rows = c.s.executeUpdate(query);
				System.out.println(rows + " row(s) inserted successfully.");
				System.out.println("SQL -> " + query);

			    // Signupthree object
				this.setVisible(false);
				new SignUpThree(formno).setVisible(true);;
		
		}
		catch(Exception ae) {
			System.out.println(ae);
		}
		
		
		
	}



       public static void main(String[] args) {
    	   
    	   SignUpTwo signuptwo=new SignUpTwo("");
	
	
}
}
