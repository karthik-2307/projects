import java.util.*;
import java.util.Timer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Timer.*;
public class day19  implements ActionListener
{
    JButton b1,b2;
    int count=0,seq=0;
   public String job1[]=new String[100];
    public String date1[]=new String[100];
    int check[]=new int[100];
    JTextField job;
    JTextField date;
    Timer ti;
    JTextArea ta=new JTextArea(20,20);
    JFrame f=new JFrame("TO-DO'S");
    day19()
    {
       
    for(int i=0;i<100;i++)
    {
        check[i]=0;
    }
      JLabel l1=new JLabel("Enter the JOB :");
      JLabel l2=new JLabel("Enter the DATE:");
      job =new JTextField("Job to be done",10);
      date =new JTextField("YYYY-MM-DD",10);
      b2=new JButton("NEW JOB");
      l1.setBounds(55,100,150,10);
      job.setBounds(165,100,150,20);
      l2.setBounds(50,125,150,10);
      date.setBounds(165,125,150,20);
      b2.setBounds(130,150,100,20);
      ta.setBounds(10,175,370,170);
      f.add(b2);
      f.add(job);
      f.add(l1);
      f.add(l2);
      f.add(ta);
      f.add(date);
      ti=new Timer();
      check c=new check();
      ti.schedule(new check(),0,5000);
      b2.addActionListener(this);
      f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
      f.setLayout(null);
      f.setSize(400,400);
      f.setVisible(true);
    }
    class check extends TimerTask
{

    @Override
    public void run() {
        System.out.println("In run method");
        Toolkit tool=Toolkit.getDefaultToolkit();
        String dat=String.valueOf(java.time.LocalDate.now());
        for(int i=0;i<=count;i++)
        {
            if(seq>0&&seq<=count&&check[i]>0)
            {
                check[i]=0;
                try{
                  //  String date2=date1[i].reverse();
                 //   String date2=String.reverse(date1[i]);
            if(date1[i].equals(dat))
            {
               for(int j=0;j<5;j++)
               Toolkit.getDefaultToolkit().beep();
               JOptionPane.showMessageDialog(f,job1[i]);
            }
           // JOptionPane.showMessageDialog(f,job1[i]);
        }
        catch(Exception e)
        {
           // e.printStackTrace();
           System.out.println("HELLO");
           System.out.println(dat);
           System.out.println(date1[i]);
        }
        }
        }
    }
    
}
    public void actionPerformed(ActionEvent e)
    {
       
        seq++;
        if(e.getSource()==b2)
        {  
            check[count]=1;
           job1[count]=String.valueOf(job.getText());
           date1[count]=date.getText();
        //   System.out.println(job.getText());
          // System.out.println(date.getText());
          // String jobent=job.getText();
           String dateto=String.valueOf(count)+"."+job.getText()+"-"+date.getText();
           ta.append(dateto+"\n");
        } count++;
       
    }
  /**   public void run()
    {
        System.out.println("In run method");
        Toolkit tool=Toolkit.getDefaultToolkit();
        int dat=Integer.parseInt(String.valueOf(java.time.LocalDate.now()));
        for(int i=0;i<=count;i++)
        {
            if(date1[i]==dat)
            {
               for(int j=0;j<5;j++)
               tool.beep();
            }
            JOptionPane.showMessageDialog(f,job1[i]);
        }
    }**/
    public static void main(String args[])
    {
        new day19();
    }
}
