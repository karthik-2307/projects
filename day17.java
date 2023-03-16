import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;
public class day17 implements ActionListener{
    JButton b1;
    JTextField t1,t2;
    JLabel l1;
    day17()
    {
        JFrame f=new JFrame("PASSWORD GENRATOR");
        b1=new JButton("GET PSSWORD");
        t1=new JTextField(20);
        l1=new JLabel("PASSWORD");
        t1.setEditable(false);
        b1.setBounds(100,100,200,50);
        f.add(l1);
        f.add(t1);
        f.add(b1);
        b1.addActionListener(this);
        f.setVisible(true);
        f.setLayout(new FlowLayout());
        f.setSize(400,400);
       f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    }
    public static void main(String args[])
    {
        new day17();
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        char[] lc = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char[] uc= {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};   
        char[] symb={'!','@','#','$','^','&','(',')','[',',','.','?','?',']'};
        char[] ar={'+','-','=','%','*'};
        Random r=new Random();
        int arr[]=new int[4];
        int a=r.nextInt(lc.length);
        String password=String.valueOf(lc[a]);
        a=r.nextInt(symb.length);
         a=r.nextInt(ar.length);
        password=password+String.valueOf(ar[a]);
        password=password+String.valueOf(symb[a]);
        a=r.nextInt(uc.length);
        password=password+String.valueOf(uc[a]);
        password=password+String.valueOf((int)(Math.random()*(100)));
        t1.setText(password);
    }
}
