import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
public class day18 implements ActionListener{
    JFrame f=new JFrame("URL SHORTNER");
    JButton b1=new JButton("SUBMIT");
    JTextField t1,t2;
    JLabel l1,l2;
   /** public void paint(Graphics g)
    {
        Toolkit t=Toolkit.getDefaultToolkit();
        Image i=t.getImage("Screenshot_20230220_110747.png");
        g.drawImage(i, 120, 100, f);
    }**/
    String tourl(int n)
    {
        //String str;
        StringBuffer str=new StringBuffer();
        char map[] = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray(); 
        while(n>0)
        {
            str.append(map[n%62]);
            n=n/62;
        }
        return str.reverse().toString();
    }
    int shorturl(String str)
    {
        int str1=0;
        for(int i=0;i<str.length();i++)
        {
          if('a'<=str.charAt(i)&&str.charAt(i)<='z')
          {
            str1=str1*62+str.charAt(i)-'a';
          }  
          if('A'<=str.charAt(i)&&str.charAt(i)<='Z')
          {
            str1=str1*62+str.charAt(i)-'A'+26;
          }
          if(0<=str.charAt(i)&&str.charAt(i)<=9)
          {
            str1=str1*62+str.charAt(i)+56-0;
          }
        }
        return str1;
    }
   
    day18()
    {   
        t1=new JTextField(10);
        t2=new JTextField(10);
        l1=new JLabel("Your url is:");
        l2=new JLabel("Enter the id of url :");
        l2.setBounds(50,100,150,10);
        t1.setBounds(165,100,150,20);
        l1.setBounds(93,125,150,10);
        t2.setBounds(165,125,150,20);
        b1.setBounds(140,150,100,20);
        f.add(l2);
        f.add(t1);
        f.add(l1);
        f.add(t2);
        f.add(b1);
        b1.addActionListener(this);
        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    } public void actionPerformed(ActionEvent e)
    {
       int a=Integer.parseInt(t1.getText());
        String chg=tourl(a);
        t2.setText(chg);
        //String s1=t1.getText();
        //int num=shorturl(s1);
        //t2.setText(String.valueOf(num));
      //  System.out.println(chg);
    }
    public static void main(String args[])
    {
        new day18();
    }
}
