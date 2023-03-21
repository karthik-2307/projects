import java.util.*;
import java.util.Timer;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URI;
public class day22  implements ActionListener
{
    public static void main(String args[])
    {
        new day22();
    }
    JButton b1,b2;
    int count=0,seq=0;
    JTextField currtime;
    public String job1[]=new String[100];
    public String date1[]=new String[100];
    public String time1[]=new String[100];
    int check[]=new int[100];
    JTextField job;
    JTextField date;
    JTextField time;
    Timer ti;
    JTextArea ta=new JTextArea(20,20);
    JFrame f=new JFrame("TO-DO'S");
    day22()
    { 
    for(int i=0;i<100;i++)
    {
        check[i]=-1;
    }
      JLabel l1=new JLabel("Enter the JOB :");
      JLabel l2=new JLabel("Enter the DATE:");
      JLabel l3=new JLabel("Enter the time:");
      JLabel l4=new JLabel("Current time is:");
      currtime =new JTextField();
      job =new JTextField("Job to be done",10);
      date =new JTextField("YYYY-MM-DD",10);
      time=new JTextField("HH:MIN");
      b2=new JButton("NEW JOB");
      currtime.setEditable(false);
      l4.setBounds(50,70,150,10);
      currtime.setBounds(165,70,150,20);
      l1.setBounds(55,100,150,10);
      job.setBounds(165,100,150,20);
      l2.setBounds(50,125,150,10);
      date.setBounds(165,125,150,20);
      b2.setBounds(130,170,100,20);
      l3.setBounds(60,155,150,10);
      time.setBounds(165,150,150,20);
      ta.setBounds(10,195,370,900);
      f.add(time);
      f.add(l3);
      f.add(l4);
      f.add(currtime);
      f.add(b2);
      f.add(job);
      f.add(l1);
      f.add(l2);
      f.add(ta);
      f.add(date);
      ti=new Timer();
      check c=new check();
      ti.schedule(new check(),0,1000);
      b2.addActionListener(this);
      f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
      f.setLayout(null);
      f.setSize(400,400);
      f.setVisible(true);
    }
    class check extends TimerTask
{

 //   @Override
    public void run() {
       // System.out.println("In run method");
        Toolkit tool=Toolkit.getDefaultToolkit();
        String dat=String.valueOf(java.time.LocalDate.now());
        currtime.setText(String.valueOf(java.time.LocalTime.now()).substring(0,5));
       // System.out.println(dat);
       
        for(int i=0;i<=count;i++)
        { 
            if(seq>0&&seq<=count&&check[i]>0)
            { 
                try{
                  
                 String tim=time1[i];
                 String hou=tim.substring(0,2);
                 String min=tim.substring(3,tim.length());
                 int hou1=Integer.parseInt(hou);
                 int min1=Integer.parseInt(min);
                String orgti=String.valueOf(java.time.LocalTime.now());
               String orghou=orgti.substring(0,2);
               String orgmin=orgti.substring(3, 5);
               int orghou1=Integer.parseInt(orghou);
               int orgmin1=Integer.parseInt(orgmin);
            if((date1[i].equals(dat)&&min1==orgmin1&&hou1==orghou1))
            {   check[i]=0;
                Desktop desk=Desktop.getDesktop();
                if(job1[i].equalsIgnoreCase("Open Youtube"))
                  {
                     System.out.println("in u tube");
                     desk.browse(new URI("https://www.youtube.com/"));
                  }
                else if(job1[i].equalsIgnoreCase("Play songs on Youtube"))
                {
                    desk.browse(new URI("https://www.youtube.com/watch?v=QCTtc36u-Kk&list=PLRUfIEG26y92SVFpe3b4jlVWxbLlahk52"));
                }
                else if(job1[i].equalsIgnoreCase("open spotify"))
                {
                    desk.browse(new URI("https://open.spotify.com/?"));
                }
                else if(job1[i].equalsIgnoreCase("open notepad"))
                {
                    desk.browse(new URI("https://onlinenotepad.org/notepad"));
                }
                else if(job1[i].equalsIgnoreCase("open whatsapp"))
                {
                    desk.browse(new URI("https://web.whatsapp.com/"));
                }
               for(int j=0;j<5;j++)
               Toolkit.getDefaultToolkit().beep();
               JOptionPane.showMessageDialog(f,job1[i]);
            }
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
            System.out.println(check[count]);
            System.out.println(count);
           job1[count]=job.getText();
           date1[count]=date.getText();
           time1[count]=time.getText();
        //   System.out.println(job.getText());
          // System.out.println(date.getText());
          // String jobent=job.getText();
           String dateto=String.valueOf(count)+"."+job.getText()+"- DATE:"+date.getText()+"- TIME :"+time.getText();
           ta.append(dateto+"\n");
        } count++;
       
    }

}
