
package bankmanagementsystem;

import javax.swing.*;   // jframe comes under the swing  package
import java.awt.*;
import java.awt.event.*;

public class signupTwo extends JFrame implements ActionListener {   

//   long random;
    
   JTextField pan,aadhar;
   JButton next;
   JRadioButton Syes, Sno, Eyes, Eno;         
   
   JComboBox religion, category, Occupation, education, income;
   String formno;
            
    signupTwo(String formno)
    {
        this.formno = formno;
        setLayout(null);  // to bring content in center
              
                                                                       
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");                                                             
        
        
        
        JLabel additionalDetails = new JLabel("Page 2: Additional Details ");   
        additionalDetails.setFont(new Font("Raleway", Font.BOLD,22));
        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);
        
        JLabel name= new JLabel("Religion: ");   //this JLabels are for texts
        name.setFont(new Font("Raleway", Font.BOLD,20));
        name.setBounds(100, 140, 100, 30);
        add(name);
        
       
        String valReligion[] = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
        religion = new JComboBox(valReligion);  //jcombobox is for drag n drop menu
        religion.setBounds(300,140,400,30);
        religion.setBackground(Color.WHITE);
        add(religion);
        
        
        
        JLabel fname= new JLabel(" Category: ");   
        fname.setFont(new Font("Raleway", Font.BOLD,20));
        fname.setBounds(100, 190, 200, 30);
        add(fname);
        
        
        String valcategory[]= {"General", "OBC", "SC", "ST", "Other"};
        category = new JComboBox( valcategory);
        category.setBounds(300,190,400,30);
        category.setBackground(Color.WHITE);
        add(category);
        
        JLabel dob= new JLabel(" Income: ");   
        dob.setFont(new Font("Raleway", Font.BOLD,20));
        dob.setBounds(100, 240, 200, 30);
        add(dob);
        
        
        String incomecategory[]= {"Null", "< 1,50,000", "< 2,50,000", "< 5,00,000", "Up to 10,00,000"};
        income = new JComboBox( incomecategory);
        income.setBounds(300,240,400,30);
        income.setBackground(Color.WHITE);
        add(income);

                
                
                
        JLabel gender= new JLabel(" Educational: ");   
        gender.setFont(new Font("Raleway", Font.BOLD,20));
        gender.setBounds(100, 290, 200, 30);
        add(gender);
        
        
        JLabel email= new JLabel(" Qualification: ");   
        email.setFont(new Font("Raleway", Font.BOLD,20));
        email.setBounds(100, 315, 200, 30);
        add(email);
        
        
        String educationalValues[]= {"Non-Graduation", "Graduate", "Post-Graduation", "Doctrate", "Other"};
        education = new JComboBox( educationalValues);
        education.setBounds(300,315,400,30);
        education.setBackground(Color.WHITE);
        add(education);
        
        
        JLabel marital= new JLabel(" Occupation: ");   
        marital.setFont(new Font("Raleway", Font.BOLD,20));
        marital.setBounds(100, 390, 200, 30);
        add(marital);
        
        
        String occupationValues[]= {"Salaried", "Self-Employed", "Bussiness", "Student", "Retired", "Others"};
        //Occupation= new JComboBox( educationalValues);
        Occupation = new JComboBox(occupationValues);

        Occupation.setBounds(300,390,400,30);
        Occupation.setBackground(Color.WHITE);
        add(Occupation);
        
        
        
        JLabel address= new JLabel(" PAN Number: ");   
        address.setFont(new Font("Raleway", Font.BOLD,20));
        address.setBounds(100, 440, 200, 30);
        add(address);
        
        
        pan =new JTextField();
        pan.setFont(new Font("Raleway", Font.BOLD,14));
        pan.setBounds(300,440,400,30);
        add(pan);
        
        
        JLabel city= new JLabel(" Aadhar Number: ");   
        city.setFont(new Font("Raleway", Font.BOLD,20));
        city.setBounds(100, 490, 200, 30);
        add(city);
        
        aadhar = new JTextField();
        aadhar.setFont(new Font("Raleway", Font.BOLD,14));
        aadhar.setBounds(300,490,400,30);
        add(aadhar);
        
        JLabel state= new JLabel(" Senior Citizen: ");   
        state.setFont(new Font("Raleway", Font.BOLD,20));
        state.setBounds(100, 540, 200, 30);
        add(state);
        
        
        
        Syes =new JRadioButton("YES");
        Syes.setBounds(300,540,100,30);
        Syes.setBackground(Color.WHITE);
        add(Syes);
        
        Sno = new JRadioButton("NO");
        Sno.setBounds(400,540,100,30);
        Sno.setBackground(Color.WHITE);
        add(Sno);
        
        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(Syes);
        maritalgroup.add(Sno);
        
                
                
        JLabel pincode= new JLabel(" Existing Account: ");   
        pincode.setFont(new Font("Raleway", Font.BOLD,20));
        pincode.setBounds(100, 590, 200, 30);
        add(pincode);
        
       
        Eyes = new JRadioButton("YES");
        Eyes.setBounds(300,590,100,30);
        Eyes.setBackground(Color.WHITE);
        add(Eyes);
        
        Eno = new JRadioButton("No");
        Eno.setBounds(400,590,100,30);
        Eno.setBackground(Color.WHITE);
        add(Eno);
        
        ButtonGroup emaritalgroup = new ButtonGroup();
        emaritalgroup.add(Eyes);
        emaritalgroup.add(Eno);
        
        
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
        //String formno = "" + random;   //"" + using this we can conver anything into string as of now we're converting random value which is in long into the string type
        String sreligion = (String) religion.getSelectedItem();  //getSelectedItem() is used to get val from dropdown menu  //(String) bcoz we want to covert variable into string
        String scategory = (String) category.getSelectedItem();
        String sincome =  (String) income.getSelectedItem();
        String seducation = (String) education.getSelectedItem();
        String soccupation = (String) Occupation.getSelectedItem();
        
        String seniorcitizen = null;
        if(Syes.isSelected()){   //isSelected is used to check which button is selected
            seniorcitizen = "Yes";
        }else if(Sno.isSelected()){
            seniorcitizen = "No";
        }
        
       
        String existingaccount = null;
        if(Eyes.isSelected()){
            existingaccount = "Yes";
        }else if(Eno.isSelected()){
            existingaccount = "No";
            
        }
        
        String span = pan.getText();
        String saadhar = aadhar.getText();
       
       try{
           Conn c = new Conn();
          // String query = "insert into signuptwo values('"+formno+"', '"+sreligion+"', '"+scategory+"', '"+sincome+"', '"+seducation+"', '"+soccupation+"', '"+span+"', '"+saadhar+"', '"+seniorcitizen+"', '"+existingaccount+"')"; 
          String query = "insert into signuptwo values('"+formno+"', '"+sreligion+"', '"+scategory+"', '"+sincome+"', '"+seducation+"', '"+soccupation+"', '"+span+"', '"+saadhar+"', '"+seniorcitizen+"', '"+existingaccount+"')";

           c.s.executeUpdate(query);
           
           //signup 3 object
            setVisible(false);  
            new signupThree(formno).setVisible(true); 
           
       } catch (Exception e){
           System.out.println(e);
       }
        
        
       
            
    }
    
    public static void main(String args[]) {
        new signupTwo("");
    }
}
