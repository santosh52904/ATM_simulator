package bank.management.system;


import java.awt.*;
import javax.swing.*;

import java.awt.event.*;



public class SignupTwo extends JFrame implements ActionListener{
   
    JTextField pan,aadhar;
    JButton next;
    JComboBox religion,category,occupation,education,income;
    JRadioButton eyes,sno,syes,eno;
    String formno;
    
    
    
    
    
    SignupTwo(String formno){
        this.formno=formno;
        setLayout(null);
       
        setTitle("NEW APPLICATION FORM -- PAGE 2");
      
        
        JLabel additionaldetails=new JLabel("Page 1 : Additional Details." );
        additionaldetails.setFont(new Font("Raleway",Font.BOLD,22));
        additionaldetails.setBounds(290, 80, 400, 30);
        add(additionaldetails);
        
        JLabel name=new JLabel("Religion :" );
        name.setFont(new Font("Raleway",Font.BOLD,20));
       name.setBounds(100,140, 100, 30);
        add(name);
        
        String valReligion[]={"Hindu","Sikh","Muslim","Christian","Other"};
       religion=new JComboBox(valReligion);
         religion.setBounds(300, 140, 400, 30);
         religion.setBackground(Color.WHITE);
        add(religion);
        
     
       
        JLabel fname=new JLabel("Category:" );
        fname.setFont(new Font("Raleway",Font.BOLD,20));
       fname.setBounds(100,190, 200, 30);
        add(fname);
        
        String valcategory[]={"General","OBC","SC","ST","Other"} ;
         category=new JComboBox(valcategory);
      category.setBounds(300, 190, 400, 30);
      category.setBackground(Color.WHITE);
        add(category);
        
        JLabel dob=new JLabel("Income:" );
        dob.setFont(new Font("Raleway",Font.BOLD,20));
       dob.setBounds(100,240, 200, 30);
       add(dob);
        
        String incomecategory[]={"Null","<1,50,000","<2,50,000","<5,00,000","Up To 10,00,000"} ;
        income=new JComboBox(incomecategory);
      income.setBounds(300, 240, 400, 30);
      income.setBackground(Color.WHITE);
        add(income);
        
  
        
       
        
         JLabel gender=new JLabel("Educational " );
        gender.setFont(new Font("Raleway",Font.BOLD,20));
       gender.setBounds(100,290, 200, 30);
        add(gender);
        
       
        
         JLabel email=new JLabel("Qualifilication :" );
        email.setFont(new Font("Raleway",Font.BOLD,20));
       email.setBounds(100,315, 200, 30);
        add(email);
        
           String educationValues[]={"Non Graduate","Graduate","Post Graduation","Docterate","Other"} ;
         education=new JComboBox(educationValues);
      education.setBounds(300, 315, 400, 30);
      education.setBackground(Color.WHITE);
        add(education);
        
         
        
             JLabel marital=new JLabel("Occupation :" );
        marital.setFont(new Font("Raleway",Font.BOLD,20));
       marital.setBounds(100,390, 200, 30);
        add(marital);
        
            String occupationalValues[]={"Salaried","Self Employed","Buissiness","Student","Retired","Other"} ;
        occupation=new JComboBox(occupationalValues);
      occupation.setBounds(300, 390, 400, 30);
      occupation.setBackground(Color.WHITE);
        add(occupation);
        
        
        
     
            JLabel address=new JLabel("PAN number :" );
        address.setFont(new Font("Raleway",Font.BOLD,20));
       address.setBounds(100,440, 200, 30);
        add(address);
        
         pan=new JTextField();
        pan.setFont(new Font("Raleway",Font.BOLD,14));
        pan.setBounds(300, 440, 400, 30);
        add(pan);
        
          JLabel city=new JLabel("Aadhar number :" );
       city.setFont(new Font("Raleway",Font.BOLD,20));
       city.setBounds(100,490, 200, 30);
        add(city);
        
        aadhar=new JTextField();
        aadhar.setFont(new Font("Raleway",Font.BOLD,14));
        aadhar.setBounds(300, 490, 400, 30);
        add(aadhar);
        
          JLabel state=new JLabel("Senior Citizen :" );
       state.setFont(new Font("Raleway",Font.BOLD,20));
      state.setBounds(100,540, 200, 30);
        add(state);
        
            syes=new JRadioButton("Yes");
        syes.setBounds(300, 540,100, 30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
       sno=new JRadioButton("No");
        sno.setBounds(450, 540, 100, 30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
        ButtonGroup gendergroup=new ButtonGroup();
        gendergroup.add(syes);
         gendergroup.add(sno);
        
         
        
        
        JLabel pincode=new JLabel("Existing Account :" );
       pincode.setFont(new Font("Raleway",Font.BOLD,20));
      pincode.setBounds(100,590, 200, 30);
        add(pincode);
        
             eyes=new JRadioButton("Yes");
        eyes.setBounds(300, 590,100, 30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
       eno=new JRadioButton("No");
        eno.setBounds(450, 590, 100, 30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
        ButtonGroup yesno=new ButtonGroup();
        yesno.add(eyes);
         yesno.add(eno);
        
//       pinTextField=new JTextField();
//        pinTextField.setFont(new Font("Raleway",Font.BOLD,14));
//        pinTextField.setBounds(300, 590, 400, 30);
//        add(pinTextField);
        
         next=new JButton("Next.");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);
        
        
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        //long converting into the string
        String sreligion=(String)religion.getSelectedItem();
         String scategory=(String)category.getSelectedItem();
          String sincome=(String)income.getSelectedItem();
        String seducation=(String)education.getSelectedItem();
         String soccupation=(String)occupation.getSelectedItem();
         String span=pan.getText();
          String saadhar=aadhar.getText();
        String seniorcitizen=null;
        if(syes.isSelected()){
            seniorcitizen="Yes";
        }else if(sno.isSelected()){
            seniorcitizen="No";
        }
       
        String existingaccount=null;
          if(eyes.isSelected()){
           existingaccount="Yes";
        }else if(eno.isSelected()){
           existingaccount="No";
        }
         
          
          
        
          
          try{
              
                  Conn c=new Conn();
                  String query="insert into signuptwo values('"+formno+"', '"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+saadhar+"','"+seniorcitizen+"','"+existingaccount+"')";
                  c.s.executeUpdate(query);
                  
                  setVisible(false);
                  new SignupThree(formno).setVisible(true);
              
              
          }catch(Exception e){
              System.out.println(e);
          }
        

        
    }

    public static void main(String args[]) {
       new SignupTwo("");
    }
}
