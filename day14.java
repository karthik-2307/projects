import javax.swing.*;
import java.awt.event.*;
public class day14 implements ActionListener {
  int sec=0;
  int hours=0;
  int min=0;
  int elapsedtime=0;
  int mill=0;
  boolean check=false;
  String sec1=String.format("%02d",sec);
  String min1=String.format("%02d",min);
  String hou1=String.format("%02d",hours);
  String mil1=String.format("%02d",mill);
  JLabel t1=new JLabel();
 // JTextField t1=new JTextField();
  JButton b1=new JButton("START");
  JButton b2=new JButton("RESET");
  Timer te=new Timer(1000,new ActionListener()
  {
       public void actionPerformed(ActionEvent e )
       {
           elapsedtime+=1000;
           mill=elapsedtime*10^3;
           hours=elapsedtime/3600000;
           sec=(elapsedtime/1000)%60;
           min=(elapsedtime/60000)%60;
           String sec1=String.format("%02d",sec);
           String min1=String.format("%02d",min);
           String hou1=String.format("%02d",hours);
           String mil1=String.format("%02d",mill);
           t1.setText(hou1+":"+min1+":"+sec1+":"+mil1);
       }
  });
    day14()
    {
        JFrame f=new JFrame("TIMER");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        t1.setText(hou1+":"+min1+":"+sec1);
        //t1.setBorder(BorderFactory.createBevelBorder(1));
       // t1.setOpaque(true);
        t1.setHorizontalAlignment(JTextField.CENTER);
        t1.setBounds(50,100,50,50);
        b1.setBounds(100,200,100,50);
        b2.setBounds(200,200,100,50);
        b1.addActionListener(this);
        b2.addActionListener(this);
        f.add(b1);
        f.add(b2);
        f.add(t1);
        f.setSize(420,420);
        f.setVisible(true);
        f.setLayout(null);
    }
    public static void main(String[] args)
    {
        new day14();
    }
    public void start()
    {
        te.start();

    }
    public void stop()
    {
        te.stop();
    }
    public void reset()
    {   
        te.stop();
        sec=0;
        hours=0;
        elapsedtime=0;
        min=0;
        System.out.println("Hl");
        sec1=String.format("%02d",sec);
        min1=String.format("%02d",min);
        hou1=String.format("%02d",hours);
        t1.setText(hou1+":"+min1+":"+sec1);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
    if(e.getSource()==b1)
    {
       if(check==false)
       {
         start();
         b1.setText("STOP");
         check=true;
       }
       else 
       {
        stop();
        check=true;
        b1.setText("START");
       }
    }
    if(e.getSource()==b2)
    {
        //stop();
        check=false;
        b1.setText("START");
        System.out.println("HELLO");
       reset();
    }
    }
}
