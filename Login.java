package 
        bankmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*; //this package is for actionlistener
import java.sql.*;  // for resultset class


public class Login extends JFrame implements ActionListener {   //action listener is used for performing any operation
    
    JButton login, signup, clear; // we're globally defining it so that it can be used throgh out the code
    JTextField cardTextField; //we're defining this 2 textfields globally to use it anywhwre in code
    JPasswordField pinTextField;
    Login()
    {
        setTitle("AUTOMATED TELLER MACHINE");
        
        setLayout(null);
        
        ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = il.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70, 10, 100, 100);
        add(label);
        
        JLabel text = new JLabel("Welcome to BOI ATM");
        text.setFont(new Font("Osward", Font.BOLD, 38));
        text.setBounds(200, 40, 400, 40);
        add(text); 
        
        
        JLabel cardno = new JLabel("Card No:");
        cardno.setFont(new Font("Raleway", Font.BOLD, 28));
        cardno.setBounds(120, 150, 150, 40);
        add(cardno); 
        
        cardTextField = new JTextField();
        cardTextField.setBounds(300, 150, 230, 30);
        cardTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(cardTextField);
        
        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Raleway", Font.BOLD, 28));
        pin.setBounds(120, 220, 250, 30);
        add(pin); 
        
        pinTextField = new JPasswordField();
        pinTextField.setBounds(300, 220, 230, 30);
        pinTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(pinTextField);
        
        
        login = new JButton("SIGN IN");     //to make button
        login.setBounds(300,300,100,30);   //to set location of button
        login.setBackground(Color.BLACK);    //setting button color
        login.setForeground(Color.white);   //setting text color
        login.addActionListener(this);    // TO let us know that button is clicked
        add(login);      //passing function throgh object
        
        
        clear = new JButton("CLEAR");    //to make button
        clear.setBounds(430,300,100,30);   //to set location of button
        clear.setBackground(Color.BLACK);     //setting button color
        clear.setForeground(Color.white);     //setting text color
        clear.addActionListener(this);   // TO let us know that button is clicked
        add(clear);       //passing function throgh object
        
        
          
        signup = new JButton("SIGN UP"); //to make button
        signup.setBounds(300,350,230,30); //to set location of button
        signup.setBackground(Color.BLACK); //setting button color
        signup.setForeground(Color.white); //setting text color
        signup.addActionListener(this);  // TO let us know that button is clicked
        add(signup); //passing function throgh object
        
        
        getContentPane().setBackground(Color.white);
        
        setSize(800,480);
        setVisible(true);
        setLocation(350,200);    
    }
    
    public void actionPerformed(ActionEvent ae)
    {  //this line is imp to write coz we had implemented an abstract eventlistener
                                                 //actionevent is a classand ae is a obj that will tell us what action performed on ehich button
                                                 
        if(ae.getSource()==clear){
            cardTextField.setText("");  //settext fun is for setting text in textfiled if we leave ("") empty then also it will ok or we can also write text
            pinTextField.setText("");
        }   else if(ae.getSource()==login){
            Conn conn = new Conn();
            String  cardnumber = cardTextField.getText();
            String  pinnumber =  pinTextField.getText();
            String query = "select * from login  where cardnumber = '"+cardnumber+"' and pin = '"+pinnumber+"'";
            
            try{
                
              ResultSet rs =  conn.s.executeQuery(query);
              
              if(rs.next()){
                  setVisible(false);
                  new Transactions(pinnumber).setVisible(true);
              }else {
                  JOptionPane.showMessageDialog(null, "Incorrect Card Number or Pin");
              }
              
                
            }catch(Exception e){
                System.out.println(e);
            }
            
            
        }   else if(ae.getSource()==signup){
            setVisible(false);    // this will close login and show signup page once we clicked on signup button
            new Signupone().setVisible(true);
        }                                
    }

    public static void main(String args[]) {
        new Login();
    }
}
