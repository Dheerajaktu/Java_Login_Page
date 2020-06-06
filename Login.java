Basically it's a Login_Page using Java Swing+AWT technology with basic validation....!!

//-------------------------------Coding Here--------------------------------------------//

import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.BorderLayout;
import java.awt.GridLayout;

public class LoginPage extends JFrame{
	
	// Here we are taking all variable & with its class type
	JPanel panel;// here panel1 is reference variable which type of JPanel
	JLabel user_lable, password_label, message;  // taking variable with class data type
    JTextField username_text;   // taking variable with class data type
    JPasswordField password_text;   // taking variable with class data type
    JButton submit, cancel;  // taking variable with class data type
    
   LoginPage()
   {
	   // user label
	   user_lable=new JLabel();
	   user_lable.setText("User_Name: ");
	   username_text=new JTextField();
	   
	   // password
	   password_label=new JLabel();
	   password_label.setText("Password: ");
	   password_text=new JPasswordField();
	   
	   // Submit
	   
	   submit=new JButton("Submit: ");
	   panel=new JPanel(new GridLayout(3,1));
	   panel.add(user_lable);
	   panel.add(username_text);
	   panel.add(password_label);
	   panel.add(password_text);
	   
	   message =new JLabel();
	   panel.add(message);
	   panel.add(submit);
	   
	   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  
	   // Adding the listener component here//
	 //  submit.addActionListener(this);
	   add(panel, BorderLayout.CENTER);
	   setTitle("Please Login Here !!!");
	   setSize(500, 300);
	   setVisible(true);   
   }
   
   public static void main(String[] args) {
	   new LoginPage();
   }
   
   public void actionPerformed(ActionEvent ae) {
	   String username=username_text.getText();
	   String password=password_text.getText();
	   if(username.trim().equals("dheeraj") && password.trim().equals("sharma"))
	   {
		   message.setText("Hello dheeraj"+username+" ");
	   }
	   else
	   {
		   message.setText("Invalid user!!!");
	   }
	   
   }

}

