
package bankmanagementsystem;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;   //for actionlistener
import java.util.*;  // for random class

public class signupThree extends JFrame implements ActionListener
{  //JFrame comes under package swing

    JRadioButton r1, r2, r3, r4;
    JCheckBox c1, c2, c3, c4, c5, c6, c7;
    JButton Submit, Cancle;
    String formno;
    
    signupThree(String formno){
        
         this.formno = formno;
        setLayout(null); //to let setBounds work
        
        JLabel l1 = new JLabel("Page 3: Account Details");  //JLabel class comes under JFrame
        l1.setFont(new Font("Raleway", Font.BOLD,22));  //font class comes under awt package
         l1.setBounds(180,40,400,40);
        
        add(l1);
        
        JLabel type = new JLabel(" Account Type");  //JLabel class comes under JFrame
        type.setFont(new Font("Raleway", Font.BOLD,20));  //font class comes under awt package
        type.setBounds(100,140,200,30);
        add(type);
        
        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font ("Raleway", Font.BOLD,16));
        r1.setBackground(Color.WHITE);
        r1.setBounds(100, 180, 150, 20);
        add(r1);
        
        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font ("Raleway", Font.BOLD,16));
        r2.setBackground(Color.WHITE);
        r2.setBounds(350, 180, 250, 20);
        add(r2);
        
        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font ("Raleway", Font.BOLD,16));
        r3.setBackground(Color.WHITE);
        r3.setBounds(100, 220, 250, 20);
        add(r3);
        
        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font ("Raleway", Font.BOLD,16));
        r4.setBackground(Color.WHITE);
        r4.setBounds(350, 220, 250, 20);
        add(r4);
        
        ButtonGroup groupaccount = new ButtonGroup();
        groupaccount.add(r1);
        groupaccount.add(r2);
        groupaccount.add(r3);
        groupaccount.add(r4);
        
        
        JLabel card = new JLabel(" Card Number");  
        card.setFont(new Font("Raleway", Font.BOLD,20)); 
        card.setBounds(100,300,200,30);
        add(card);
        
        JLabel number = new JLabel("XXXX-XXXX-XXXX-4184");  
        number.setFont(new Font("Raleway", Font.BOLD,20));  
        number.setBounds(330,300,300,30);
        add(number);
        
        JLabel carddetail = new JLabel("Your 16 Digit Card Number");  
        carddetail.setFont(new Font("Raleway", Font.BOLD,12));  
        carddetail.setBounds(100,330,300,20);
        add(carddetail);
        
        
        JLabel pin = new JLabel(" PIN");  
        pin.setFont(new Font("Raleway", Font.BOLD,20));  
        pin.setBounds(100,370,200,30);
        add(pin);
        
        JLabel pnumber = new JLabel("XXXX");  
        pnumber.setFont(new Font("Raleway", Font.BOLD,20));  
        pnumber.setBounds(330,370,300,30);
        add(pnumber);
        
        
        JLabel pindetail = new JLabel("Your 4 Digit Pin");  
        pindetail.setFont(new Font("Raleway", Font.BOLD,12));  
        pindetail.setBounds(100,400,300,20);
        add(pindetail);
        
        JLabel services = new JLabel("Services Required:");  
        services.setFont(new Font("Raleway", Font.BOLD,20));  
        services.setBounds(100,430,300,30);
        add(services);
        
        
        c1 = new JCheckBox(" ATM CARD");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway", Font.BOLD, 16));
        c1.setBounds(100, 480, 200, 30);
        add(c1);
        
        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway", Font.BOLD, 16));
        c2.setBounds(350, 480, 200, 30);
        add(c2);
        
        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway", Font.BOLD, 16));
        c3.setBounds(100, 530, 200, 30);
        add(c3);
        
        c4 = new JCheckBox(" Email & SMS Alerts");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway", Font.BOLD, 16));
        c4.setBounds(350, 530, 200, 30);
        add(c4);
        
        c5 = new JCheckBox("Check Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway", Font.BOLD, 16));
        c5.setBounds(100, 580, 200, 30);
        add(c5);
        
        c6 = new JCheckBox("E-Statement");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway", Font.BOLD, 16));
        c6.setBounds(350, 580, 200, 30);
        add(c6);
        
        c7 = new JCheckBox("I hereby declare that above entered details are correct to the best of my knowledge");
        
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway", Font.BOLD, 12));
        c7.setBounds(100, 620, 600, 30);
        add(c7);
        
        
        Submit = new JButton("Submit");
        Submit.setBackground(Color.BLACK);
        Submit.setForeground(Color.WHITE);
        Submit.setFont(new Font("Raleway", Font.BOLD, 14));
        Submit.setBounds(250,660,100,30);
        Submit.addActionListener(this);
        add(Submit);
        
        Cancle = new JButton("Cancle");
        Cancle.setBackground(Color.BLACK);
        Cancle.setForeground(Color.WHITE);
        Cancle.setFont(new Font("Raleway", Font.BOLD, 14));
        Cancle.setBounds(420,660,100,30);
        Cancle.addActionListener(this);
        add(Cancle);
        
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(800,750);
        setLocation(350,0);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==Submit){
            String accountType = null;
            if(r1.isSelected()){
                accountType = "Saving Account";
            }else if(r2.isSelected()){
                accountType = "Fixed Deposit";
            }else if(r3.isSelected()){
                accountType = "Current Account";
            }else if(r4.isSelected()){
                accountType = "Reccuring Deposite Account";
            }
            
            Random random = new Random();
            String cardnumber = "" + Math.abs((random.nextLong()% 90000000L) + 5040936000000000L);  //to generate random card no.
            
            String pinnumber = "" + Math.abs((random.nextLong() % 9000L) + 1000L);  //to generate random pin no.
            
            String facility = "";    // below lines are for multiple checkbox
            if(c1.isSelected()){
                facility = facility + " ATM Card";
            }else if(c2.isSelected()){
                facility = facility + " Internet Banking";
            }else if(c3.isSelected()){
                facility = facility + " Mobile Banking";
            }else if(c4.isSelected()){
                facility = facility + " Email & SMS Alerts";
            }else if(c5.isSelected()){
                facility = facility + " Check Book";
            }else if(c6.isSelected()){
                facility = facility + " E-Statements";
            }
            
            
            try{
                if(accountType.equals("")) {

                    JOptionPane.showMessageDialog(null, "Account Type is Required");
                }else {
                    Conn conn = new Conn();
                 
                  // String query1 = "insert into signupThree values('"+formno+"', '"+accountType+"', '"+cardnumber+"', '"+pinnumber+"', '"+facility+"', )" ;
                  String query1 = "INSERT INTO signupThree VALUES('"+formno+"', '"+accountType+"', '"+cardnumber+"', '"+pinnumber+"', '"+facility+"')";
                 
                  String query2 = "INSERT INTO Login VALUES('"+formno+"',  '"+cardnumber+"', '"+pinnumber+"')";
                  

                   conn.s.executeUpdate(query1);
                   conn.s.executeUpdate(query2);
                   
                   
                   JOptionPane.showMessageDialog(null, "Card Number: " + cardnumber + "\n Pin: " + pinnumber );
                   
                   
                   setVisible(false);
                   new Deposit(pinnumber).setVisible(false);
                }
                
                
            }catch(Exception e){
                System.out.println(e);
            }
            
        }else if (ae.getSource()==Cancle){
            setVisible(false);
            new  Login().setVisible(true);
    }
    
    }
    public static void main(String args[]){
       
        new signupThree("");
    }
}

