
package bankmanagementsystem;

import javax.swing.*;   // jframe comes under the swing  package
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;  //this package is for apllying calender in dob
import java.awt.event.*;

public class Signupone extends JFrame implements ActionListener {   

   long random;
    
   JTextField nameTextField, fnameTextField, dobTextField, emailTextField, addressTextField, cityTextField, stateTextField, pinTextField;
   JButton next;
   JRadioButton male, female, other, married, unmarried;         
   JDateChooser datechooser;
            
    Signupone()
    {
        
        setLayout(null);  // to bring content in center
        
        Random ran = new Random(); //random fun is used to get random num & comes under the util package
        random = (Math.abs(ran.nextLong() % 9000L) + 1000L);   //ran.nextlong is for long int num. we dont want soo long thats why we write % 9000L + 1000L
                                                                       //also we write  math.abs  to get a positive number
        
        
        JLabel formno = new JLabel("APPLICATION FORM NO. " + random);   // + random = means we are cancatinaed random to this formno
        formno.setFont(new Font("Raleway", Font.BOLD,38));
        formno.setBounds(140, 20, 600, 40);
        add(formno);
        
        JLabel personalDetails = new JLabel("Page 1: Personal Details ");   
        personalDetails.setFont(new Font("Raleway", Font.BOLD,22));
        personalDetails.setBounds(290, 80, 400, 30);
        add(personalDetails);
        
        JLabel name= new JLabel("Name: ");   //this JLabels are for texts
        name.setFont(new Font("Raleway", Font.BOLD,20));
        name.setBounds(100, 140, 100, 30);
        add(name);
        
        nameTextField =new JTextField();  //this JTextFiels are for textfileds in front of texts
        nameTextField.setFont(new Font("Raleway", Font.BOLD,14));
        nameTextField.setBounds(300,140,400,30);
        add(nameTextField);
        
        JLabel fname= new JLabel(" Father's Name: ");   
        fname.setFont(new Font("Raleway", Font.BOLD,20));
        fname.setBounds(100, 190, 200, 30);
        add(fname);
        
         fnameTextField =new JTextField();
        fnameTextField.setFont(new Font("Raleway", Font.BOLD,14));
        fnameTextField.setBounds(300,190,400,30);
        add(fnameTextField);
        
        JLabel dob= new JLabel(" Date of Birth: ");   
        dob.setFont(new Font("Raleway", Font.BOLD,20));
        dob.setBounds(100, 240, 200, 30);
        add(dob);
        
        
        datechooser = new JDateChooser();  //to insert calendar
        datechooser.setBounds(300,240,400,30);
        add(datechooser);
                
                
                
        JLabel gender= new JLabel(" Gender: ");   
        gender.setFont(new Font("Raleway", Font.BOLD,20));
        gender.setBounds(100, 290, 200, 30);
        add(gender);
        
        
        male = new JRadioButton("Male");   //radio button for male
        male.setBounds(300, 290, 60, 30);
        male.setBackground(Color.WHITE);
        add(male);
        
        female = new JRadioButton("Female");   //radio button  for female
        female.setBounds(450, 290, 120, 30);
        female.setBackground(Color.WHITE);
        add(female);
        
        ButtonGroup gendergroup =  new ButtonGroup();  //to enable clicking any one button among male and female
        gendergroup.add(male);
        gendergroup.add(female);
        
        
        JLabel email= new JLabel(" Email: ");   
        email.setFont(new Font("Raleway", Font.BOLD,20));
        email.setBounds(100, 340, 200, 30);
        add(email);
        
        
        emailTextField =new JTextField();
        emailTextField.setFont(new Font("Raleway", Font.BOLD,14));
        emailTextField.setBounds(300,340,400,30);
        add(emailTextField);
        
        JLabel marital= new JLabel(" Marital Status: ");   
        marital.setFont(new Font("Raleway", Font.BOLD,20));
        marital.setBounds(100, 390, 200, 30);
        add(marital);
        
        
        married = new JRadioButton("Married");   //radio button for married
        married.setBounds(300, 390, 100, 30);
        married.setBackground(Color.WHITE);
        add(married);
        
        unmarried = new JRadioButton("Unmarried");   //radio button  for unmarried
        unmarried.setBounds(450, 390, 100, 30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
        
        other = new JRadioButton("Other");   //radio button  for other
        other.setBounds(630, 390, 100, 30);
        other.setBackground(Color.WHITE);
        add(other);
        
        ButtonGroup marritalgroup =  new ButtonGroup();  //to enable clicking any one button among male and female
        marritalgroup.add(married);
        marritalgroup.add(unmarried);
        marritalgroup.add(other);
        
        JLabel address= new JLabel(" Address: ");   
        address.setFont(new Font("Raleway", Font.BOLD,20));
        address.setBounds(100, 440, 200, 30);
        add(address);
        
        
        addressTextField =new JTextField();
        addressTextField.setFont(new Font("Raleway", Font.BOLD,14));
        addressTextField.setBounds(300,440,400,30);
        add(addressTextField);
        
        
        JLabel city= new JLabel(" City: ");   
        city.setFont(new Font("Raleway", Font.BOLD,20));
        city.setBounds(100, 490, 200, 30);
        add(city);
        
        cityTextField =new JTextField();
        cityTextField.setFont(new Font("Raleway", Font.BOLD,14));
        cityTextField.setBounds(300,490,400,30);
        add(cityTextField);
        
        JLabel state= new JLabel(" State: ");   
        state.setFont(new Font("Raleway", Font.BOLD,20));
        state.setBounds(100, 540, 200, 30);
        add(state);
        
        stateTextField =new JTextField();
        stateTextField.setFont(new Font("Raleway", Font.BOLD,14));
        stateTextField.setBounds(300,540,400,30);
        add(stateTextField);
        
        JLabel pincode= new JLabel(" Pin Code: ");   
        pincode.setFont(new Font("Raleway", Font.BOLD,20));
        pincode.setBounds(100, 590, 200, 30);
        add(pincode);
        
        pinTextField =new JTextField();
        pinTextField.setFont(new Font("Raleway", Font.BOLD,14));
        pinTextField.setBounds(300,590,400,30);
        add(pinTextField);
        
        
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.white);
        
        setSize(850,800);  //creatingn the frame
        setLocation(350,10);    //creatingn the frame
        setVisible(true);        //creatingn the frame
    }
    
    public void actionPerformed(ActionEvent ae){
        String formno = "" + random;   //"" + using this we can conver anything into string as of now we're converting random value which is in long into the string type
        String name = nameTextField.getText();  //by using gettext we're retriving name into nametextfield
        String fname = fnameTextField.getText();
        String dob =  ((JTextField)datechooser.getDateEditor().getUiComponent()).getText();
        
        String gender = null;
        if(male.isSelected()){   //isSelected is used to check which button is selected
            gender = "Male";
        }else if(female.isSelected()){
            gender = "Female";
        }
        
        String email = emailTextField.getText();   //this followuing if else if conditions are for radio button marital status
        String marital = null;
        if(married.isSelected()){
            marital = "Married";
        }else if(unmarried.isSelected()){
            marital = "unmarried";
        }else if(other.isSelected()){
            marital = "other";
        }
        
        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pin = pinTextField.getText();
        
        
        //to hit into database
        
        try{
          
            if(name.equals("")){
                JOptionPane.showConfirmDialog(null, "This Field is Required");  //this is validation
            }
            else{
                Conn c = new Conn();  // object of conn class this will establish connection with datavbase
                String query = "insert into signup values('"+formno+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gender+"', '"+email+"', '"+marital+"', '"+address+"', '"+city+"', '"+pin+"', '"+state+"')";  //THIS IS THE SQL QUERY//'"+...+"' ->THIS IS THE WAY TO CONCAT VALUES AS STRING
                c.s.executeUpdate(query);  // this is ddl query of sql
                
                setVisible(false);  //to close signupone after clicking on nxt button
                new signupTwo(formno).setVisible(true);  //to open signuptwo page after cliking on nxt button
            }
            
        }catch (Exception e){
            System.out.println(e);
        }
       
            
    }
    
    public static void main(String args[]) {
        new Signupone();
    }
}
