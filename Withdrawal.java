package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class Withdrawal extends JFrame implements ActionListener{
    JButton withdrawal,back;
    JTextField amount;
    String pinnumber;
    
  Withdrawal(String pinnumber){
      this.pinnumber=pinnumber;
      ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
      Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
      ImageIcon i3=new ImageIcon(i2);
      JLabel image=new JLabel(i3);
      image.setBounds(0,0,900,900);
      add(image);
      
      JLabel text=new JLabel("Enter the amount you want to withdraw");
      text.setForeground(Color.WHITE);
      text.setFont(new Font("System",Font.BOLD,16));
      text.setBounds(170, 300, 400, 20);
      image.add(text);
      
     amount=new  JTextField();
      amount.setFont(new Font("Raleway",Font.BOLD,22));
      amount.setBounds(170, 350, 320, 25);
      image.add(amount);
      
       withdrawal=new JButton("Withdrawal");
      withdrawal.setBounds(355, 455, 150, 30);
      withdrawal.addActionListener(this);
      image.add(withdrawal);
      
        back=new JButton("Back");
      back.setBounds(355, 490, 150, 30);
       back.addActionListener(this);
      image.add(back);
      
      setSize(900,900);
      setLocation(300,0);
      setVisible(true);
  }
  public void actionPerformed(ActionEvent ae){
      if(ae.getSource()==withdrawal){
          String number=amount.getText();
          Date date=new Date();
          if(number.equals("")){
              JOptionPane.showMessageDialog(null, "Please enter the amount");
          }else{
              try{
             Conn conn=new Conn();
              String query="insert into bank values('"+pinnumber+"','"+date+"','Withdrawal','"+number+"')";
              conn.s.executeUpdate(query);
              JOptionPane.showMessageDialog(null,"Rs  "+number+" Withdrawn successfully");
              setVisible(false);
              new Transaction(pinnumber).setVisible(true);
              }catch(Exception e){
                  System.out.println(e);
                  
              }

          }
      }else if(ae.getSource()==back){
          setVisible(false);
          new Transaction(pinnumber).setVisible(true);
          
      }
  }
   
    public static void main(String args[]) {
       new Withdrawal("");
    }
}

