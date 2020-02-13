package app_ATM;

import java.awt.EventQueue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JRadioButton;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class ATM_sys {

	private JFrame frame;
	private JTextField jlblDisplay;
	private JTextField jtxtEnter;
	private JTextField jxtnumberofyears;
	private JTextField jtxtEnterloanamount;
	private JTextField jlblmonthlypayment;
	private JTextField jlbltotalpayment;
	
	private JTextArea jtxtReceipt;
	
	private JButton btnExit;
	private JButton btnReset;
	private JButton btnLoan;
	private JButton btnReceipt;
	
	private JButton jbtnloan, jbtnBalance, jbtnWithdrawal, jbtnDeposit;
	//private JButton jbtn1, jbtn2, jbtn3, jbtn4, jbtn5, jbtn6, jbtn7, jbtn8, jbtn9, jbtn0;
	
	//private Jpanels
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ATM_sys window = new ATM_sys();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ATM_sys() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent arg0) {
				
				
			}
			public void windowOpened(WindowEvent arg0) {
				
				
			}
		});
		frame.setBounds(20, 20, 1250, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(39, 30, 142, 167);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton jbtnBalance = new JButton("-->");
		jbtnBalance.setEnabled(false);
		jbtnBalance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		jbtnBalance.setBounds(24, 11, 89, 50);
		panel.add(jbtnBalance);
		
		JButton jbtnWithdrawal_1 = new JButton("-->");
		jbtnWithdrawal_1.setBounds(24, 106, 89, 50);
		panel.add(jbtnWithdrawal_1);
		jbtnWithdrawal_1.setEnabled(false);
		jbtnWithdrawal_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(152, 251, 152));
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(191, 30, 214, 167);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel jlblBalance = new JLabel("Balance");
		jlblBalance.setFont(new Font("Tahoma", Font.BOLD, 14));
		jlblBalance.setBounds(22, 22, 62, 25);
		panel_1.add(jlblBalance);
		
		JLabel jlblLoan = new JLabel("Loan");
		jlblLoan.setFont(new Font("Tahoma", Font.BOLD, 14));
		jlblLoan.setBounds(142, 22, 50, 25);
		panel_1.add(jlblLoan);
		
		JLabel jlblDeposit = new JLabel("Deposit");
		jlblDeposit.setFont(new Font("Tahoma", Font.BOLD, 14));
		jlblDeposit.setBounds(142, 118, 62, 25);
		panel_1.add(jlblDeposit);
		
		JLabel jlblWithdrawal = new JLabel("Withdrawal");
		jlblWithdrawal.setFont(new Font("Tahoma", Font.BOLD, 14));
		jlblWithdrawal.setBounds(22, 118, 82, 25);
		panel_1.add(jlblWithdrawal);
		
		jlblDisplay = new JTextField(); 
		jlblDisplay.setHorizontalAlignment(SwingConstants.CENTER);
		jlblDisplay.setBackground(new Color(152, 251, 152));
		jlblDisplay.setBounds(33, 76, 145, 20);
		panel_1.add(jlblDisplay);
		jlblDisplay.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(420, 30, 137, 167);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JButton jbtnLoan = new JButton("<--");
		jbtnLoan.setEnabled(false);
		jbtnLoan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnExit.setEnabled(true);
				btnReset.setEnabled(true);
				btnLoan.setEnabled(true);
				btnReceipt.setEnabled(true);
			}
		});
		jbtnLoan.setBounds(23, 11, 90, 51);
		panel_2.add(jbtnLoan);
		
		JButton jbtnDeposit = new JButton("<--");
		jbtnDeposit.setEnabled(false);
		jbtnDeposit.setBounds(23, 105, 90, 51);
		panel_2.add(jbtnDeposit);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3.setBounds(39, 208, 518, 323);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JButton btn1 = new JButton("1");
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = jlblDisplay.getText() + "1";
				jlblDisplay.setText(EnterNumber);
			}
		});
		btn1.setBounds(26, 30, 89, 47);
		panel_3.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = jlblDisplay.getText() + "2";
				jlblDisplay.setText(EnterNumber);
			}
		});
		btn2.setBounds(144, 30, 89, 47);
		panel_3.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = jlblDisplay.getText() + "3";
				jlblDisplay.setText(EnterNumber);
			}
		});
		btn3.setBounds(261, 32, 90, 42);
		panel_3.add(btn3);
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.setBackground(new Color(255, 69, 0));
		btnCancel.setBounds(381, 30, 89, 42);
		panel_3.add(btnCancel);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.setBackground(new Color(255, 255, 0));
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jlblDisplay.setText("");
			}
		});
		btnClear.setBounds(381, 85, 89, 47);
		panel_3.add(btnClear);
		
		JButton btn6 = new JButton("6");
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = jlblDisplay.getText() + "6";
				jlblDisplay.setText(EnterNumber);
			}
		});
		btn6.setBounds(261, 85, 90, 47);
		panel_3.add(btn6);
		
		JButton btn5 = new JButton("5");
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = jlblDisplay.getText() + "5";
				jlblDisplay.setText(EnterNumber);
			}
		});
		btn5.setBounds(144, 88, 89, 47);
		panel_3.add(btn5);
		
		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = jlblDisplay.getText() + "4";
				jlblDisplay.setText(EnterNumber);
			}
		});
		btn4.setBounds(26, 88, 89, 47);
		panel_3.add(btn4);
		
		//although panel_4 is not placed in its correct order, putting it here allows us to call the setVisible() method, making functional the if statements
		JPanel panel_4 = new JPanel();
		panel_4.setVisible(false);
		panel_4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_4.setBounds(567, 30, 636, 501);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JButton btnEnter = new JButton("ENTER");
		btnEnter.setBackground(new Color(0, 255, 0));
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int pin1 = Integer.parseInt(jlblDisplay.getText());
				int pin2 = Integer.parseInt(jlblDisplay.getText());
				int pin3 = Integer.parseInt(jlblDisplay.getText());
				int pin4 = Integer.parseInt(jlblDisplay.getText());
		
				if(pin1 == 1234) {
					jbtnBalance.setEnabled(true);
					jbtnLoan.setEnabled(true);
					jbtnWithdrawal_1.setEnabled(true);
					jbtnDeposit.setEnabled(true);
					
					jlblBalance.setVisible(true);
					jlblLoan.setVisible(true);
					jlblWithdrawal.setVisible(true);
					jlblDeposit.setVisible(true);
					
					panel_4.setVisible(true);
				}
				
				else if(pin2 == 2345) {
					jbtnBalance.setEnabled(true);
					jbtnLoan.setEnabled(true);
					jbtnWithdrawal_1.setEnabled(true);
					jbtnDeposit.setEnabled(true);
					
					jlblBalance.setVisible(true);
					jlblLoan.setVisible(true);
					jlblWithdrawal.setVisible(true);
					jlblDeposit.setVisible(true);
					
					panel_4.setVisible(true);
				}
				
				else if(pin3 == 3456) {
					jbtnBalance.setEnabled(true);
					jbtnLoan.setEnabled(true);
					jbtnWithdrawal_1.setEnabled(true);
					jbtnDeposit.setEnabled(true);
					
					jlblBalance.setVisible(true);
					jlblLoan.setVisible(true);
					jlblWithdrawal.setVisible(true);
					jlblDeposit.setVisible(true);
					
					panel_4.setVisible(true);
				}

				else if(pin4 == 4567) {
					jbtnBalance.setEnabled(true);
					jbtnLoan.setEnabled(true);
					jbtnWithdrawal_1.setEnabled(true);
					jbtnDeposit.setEnabled(true);
					
					jlblBalance.setVisible(true);
					jlblLoan.setVisible(true);
					jlblWithdrawal.setVisible(true);
					jlblDeposit.setVisible(true);
					
					panel_4.setVisible(true);
				}
				
				else {
					jlblDisplay.setText("Invalid Pin");
					
					//panel_4.setVisible(false);
				}
				
			}
		});
		btnEnter.setBounds(381, 146, 89, 47);
		panel_3.add(btnEnter);
		
		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = jlblDisplay.getText() + "9";
				jlblDisplay.setText(EnterNumber);
			}
		});
		btn9.setBounds(261, 143, 90, 47);
		panel_3.add(btn9);
		
		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = jlblDisplay.getText() + "8";
				jlblDisplay.setText(EnterNumber);
			}
		});
		btn8.setBounds(144, 146, 89, 47);
		panel_3.add(btn8);
		
		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = jlblDisplay.getText() + "7";
				jlblDisplay.setText(EnterNumber);
			}
		});
		btn7.setBounds(26, 146, 89, 47);
		panel_3.add(btn7);
		
		JButton button_11 = new JButton("");
		button_11.setBounds(381, 204, 89, 47);
		panel_3.add(button_11);
		
		JButton button_12 = new JButton("");
		button_12.setBounds(261, 204, 93, 47);
		panel_3.add(button_12);
		
		JButton btn0 = new JButton("0");
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = jlblDisplay.getText() + "0";
				jlblDisplay.setText(EnterNumber);
			}
		});
		btn0.setBounds(144, 204, 89, 47);
		panel_3.add(btn0);
		
		JButton button_14 = new JButton("");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_14.setBounds(26, 204, 89, 47);
		panel_3.add(button_14);
	

		
		JLabel lblNewLabel_1 = new JLabel("Interest Rate");
		lblNewLabel_1.setBounds(26, 38, 147, 61);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_4.add(lblNewLabel_1);
		
		jtxtEnter = new JTextField();
		jtxtEnter.setBounds(183, 54, 92, 37);
		panel_4.add(jtxtEnter);
		jtxtEnter.setColumns(10);
		
		JLabel lblNumberOfYears = new JLabel("Number of years");
		lblNumberOfYears.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNumberOfYears.setBounds(26, 110, 187, 61);
		panel_4.add(lblNumberOfYears);
		
		jxtnumberofyears = new JTextField();
		jxtnumberofyears.setColumns(10);
		jxtnumberofyears.setBounds(183, 126, 92, 37);
		panel_4.add(jxtnumberofyears);
		
		JLabel label_3 = new JLabel("Amount of Loan ");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_3.setBounds(26, 182, 187, 61);
		panel_4.add(label_3);
		
		jtxtEnterloanamount = new JTextField();
		jtxtEnterloanamount.setColumns(10);
		jtxtEnterloanamount.setBounds(183, 198, 92, 37);
		panel_4.add(jtxtEnterloanamount);
		
		JLabel label_4 = new JLabel("Monthly Payment");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_4.setBounds(26, 254, 202, 61);
		panel_4.add(label_4);
		
		jlblmonthlypayment = new JTextField();
		jlblmonthlypayment.setColumns(10);
		jlblmonthlypayment.setBounds(183, 270, 92, 37);
		panel_4.add(jlblmonthlypayment);
		
		JLabel label_5 = new JLabel("Total Payment");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_5.setBounds(26, 326, 173, 61);
		panel_4.add(label_5);
		
		jlbltotalpayment = new JTextField();
		jlbltotalpayment.setColumns(10);
		jlbltotalpayment.setBounds(183, 342, 92, 37);
		panel_4.add(jlbltotalpayment);
		
		jtxtReceipt = new JTextArea();
		jtxtReceipt.setColumns(10); 
		jtxtReceipt.setBounds(300, 45, 326, 345);
		panel_4.add(jtxtReceipt);
		
		
		//making the loan button
		
		JButton btnLoan = new JButton("Loan");
		btnLoan.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnLoan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double annualInterestRate = Double.parseDouble(jtxtEnter.getText());
				double monthlyInterestRate = annualInterestRate / 1200;
				int numberOfYears = Integer.parseInt(jxtnumberofyears.getText());
				double loanAmount = Double.parseDouble(jtxtEnterloanamount.getText());
				//--------------------------------------------------------------------
				double monthlyPayment = loanAmount * monthlyInterestRate / (Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
				String imonthlyPayment;
				imonthlyPayment = Double.toString(monthlyPayment);
				imonthlyPayment = String.format("€%.2f", monthlyPayment);
				jlblmonthlypayment.setText(imonthlyPayment);
				//--------------------------------------------------------------------
				double totalPayment = monthlyPayment * numberOfYears * 12;
				String itotalPayment;
				itotalPayment = String.format("€%.2f", totalPayment);
				jlbltotalpayment.setText(itotalPayment); 
			}
		});
		btnLoan.setBounds(26, 410, 111, 61);
		panel_4.add(btnLoan);
		
		//making the receipt button
		
		JButton btnReceipt = new JButton("Receipt");
		btnReceipt.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String anualInterestRate = String.format(jtxtEnter.getText());
				String numberOfYears = String.format(jxtnumberofyears.getText());
				String loanAmount = String.format(jtxtEnterloanamount.getText());
				
				String monthlyPayment = String.format(jlblmonthlypayment.getText());
				String totalPayment = String.format(jlbltotalpayment.getText());
				//=============================================================
				int refs = 1325 + (int) (Math.random() * 4238);
				
				//=============================================================
				Calendar timer = Calendar.getInstance();
				timer.getTime();
				SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
				tTime.format(timer.getTime());
				SimpleDateFormat tDate = new SimpleDateFormat("dd-MM-yyyy");
				tDate.format(timer.getTime());
				
				//https://www.youtube.com/edit?o=U&vid
				//=============================================================jtxtReceipt
				jtxtReceipt.append
				(
						"\tLoan Management Systems\n" +
						" Reference:\t\t\t" + refs +
						"\n=========================================\t" + 
						"\n\n Interest rate:\t\t\t " + anualInterestRate +
						"\n Repayment years:\t\t " + numberOfYears +
						"\n Amount of loan:\t\t " + "€" + loanAmount +
						"\n Monthly payment:\t\t " + monthlyPayment +
						"\n Total Payment:\t\t " + totalPayment +
						
						"\n==========================================\t" + 
						"\n\n Date: " + tDate.format(timer.getTime()) + 
						"\t\t Time " + tTime.format(timer.getTime()) +
						"\n\n\tOperation completed succesfully\n"
						);
			}
		});
		btnReceipt.setBounds(171, 410, 111, 61);
		panel_4.add(btnReceipt);
		
		//making the exit button
		
		JButton btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnExit.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				frame = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog (frame, "confirm if you want to exit",  "Loan Management Systems", 
					JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
				{
					System.exit(0);
				}
			}
		});
		btnExit.setBounds(464, 410, 111, 61);
		panel_4.add(btnExit);
		
		//making the reset button
		
		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnReset.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				jtxtEnter.setText("");
				jxtnumberofyears.setText(null);
				jtxtEnterloanamount.setText(null);
				jlblmonthlypayment.setText(null);
				jlbltotalpayment.setText(null);
				jtxtReceipt.setText(null);

			}
		});
		btnReset.setBounds(320, 410, 111, 61);
		panel_4.add(btnReset);
		
	}
}        





