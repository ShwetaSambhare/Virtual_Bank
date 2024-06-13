
package bankmanagementsystem;


import javax.swing.*;
import java.awt.*; // for image class
import java.awt.event.*;
import java.sql.*;
import java.util.Date;  //for date class

public class FastCash extends JFrame implements ActionListener{

    JButton deposit, Withdrawl, ministatement, pinchange, fastcash, balanceinquiry, exit;
    String pinnumber;
    
    FastCash(String pinnumber){
        
        this.pinnumber = pinnumber;
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);
        
        JLabel text = new JLabel("Select Withdrawl Amount");
        text.setBounds(210, 300, 700, 35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        image.add(text);
        
        
        deposit = new JButton("Rs.100");
        deposit.setBounds(170, 415, 150, 30);
        deposit.addActionListener(this);
        image.add(deposit);
        
        Withdrawl = new JButton("Rs.500 ");
        Withdrawl.setBounds(355, 415, 150, 30);
        Withdrawl.addActionListener(this);
        image.add(Withdrawl);
        
        fastcash = new JButton("Rs.1000");
        fastcash.setBounds(170, 450, 150, 30);
        fastcash.addActionListener(this);
        image.add(fastcash);
        
        ministatement = new JButton("Rs.2000");
        ministatement.setBounds(355, 450, 150, 30);
        ministatement.addActionListener(this);
        image.add(ministatement);
        
        pinchange = new JButton("Rs.5000");
        pinchange.setBounds(170, 485, 150, 30);
        pinchange.addActionListener(this);
        image.add(pinchange);
        
        balanceinquiry = new JButton("Rs.10000");
        balanceinquiry.setBounds(355, 485, 150, 30);
        balanceinquiry.addActionListener(this);
        image.add(balanceinquiry);
        
        exit = new JButton("BACK");
        exit.setBounds(355, 520, 150, 30);
        exit.addActionListener(this);
        image.add(exit);
        
        setSize(900,900);
        setLocation(300,0);
        
        setUndecorated(true);  //to make clr upper white portion
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        
        if (ae.getSource() == exit){   //getsource() is for getting source of the button
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        }else {
            String amount = ((JButton)ae.getSource()).getText().substring(3);  //substring is used for not taking that particular string and we pass 3 here coz we dont want rs. so rs and space total is 3 space thats why we passed 3 
            
            Conn c = new Conn();
            
            try{
                ResultSet rs = c.s.executeQuery("Select * from bank where pin = '" + pinnumber + "'");  //resultset include in sql package
                int balance= 0;
                while(rs.next()){
                    if(rs.getString("type").equals("Deposit")){
                        balance += Integer.parseInt(rs.getString("amount"));  //balance is int so we need to convert it into string by parseint
                    }else{ 
                        balance -= Integer.parseInt(rs.getString("amount"));  //to get balance
                    }
                }
                if(ae.getSource() != exit && balance < Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null, "Insufficient balance");
                    return;
                }
                
                Date date = new Date();
                String query = "insert into bank values('"+pinnumber+"', '"+date+"', 'Withdrawl', '"+amount+"')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Rs "+ amount + "Debited Successfully");
                
                setVisible(false);
                new  Transactions(pinnumber).setVisible(true);
                
            }catch(Exception e){
                System.out.println(e);
            }
        }
        
    }
    
    public static void main(String args[]) {
        new FastCash("");
    }
}
