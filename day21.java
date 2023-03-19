import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class day21 implements ActionListener
{
    JButton b1;
    JLabel l1;
    JTextField t1,t2;
    JFrame f=new JFrame("PASSWORD GENRATOR");
   day21()
   {
     b1=new JButton("Get Password :");
     l1=new JLabel("Type of password 4-digit or 6-digit :");
     t1=new JTextField(10);
     t2=new JTextField(10);
     f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
     f.add(l1);
     f.add(t1);
     f.add(t2);
     f.add(b1);
     b1.addActionListener(this);
     f.setSize(400,400);
     f.setVisible(true);
     f.setLayout(new FlowLayout());
   } 
   public static void main(String args[])
   {
    new day21();
   }
@Override
public void actionPerformed(ActionEvent e) 
{
  int a=Integer.parseInt(t1.getText());
  String password="";
  if(a==4)
  {
    for(int i=0;i<4;i++)
    {
      password=password+String.valueOf((int)(Math.random()*10));
    }
  }
  else if(a==6)
  {
    for(int i=0;i<6;i++)
    {
      password=password+String.valueOf((int)(Math.random()*10));
    }
  }
  t2.setText(password);
}   
}
