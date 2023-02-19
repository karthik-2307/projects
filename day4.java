import java.time.*;
import java.awt.*;
import java.awt.event.*;
public class day4 extends Thread{
    day4()
    {
        Frame f=new Frame("DIGITAL CLOCK");
        TextField t1=new TextField(5);
        TextField t2=new TextField(5);
        TextField t3=new TextField(5);
        f.add(t1);
        f.add(t3);
        f.add(t2);
        t1.setEditable(false);
        t2.setEditable(false);
        t3.setEditable(false);
        f.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
              System.exit(0);
            }
        }
        );
      
        f.setLayout(new FlowLayout());
        f.setVisible(true);
        f.setSize(400,400);
        while(true)
        {
      // Date d=new java.util.Date();
        //System.out.println(d);
        DayOfWeek dayOfWeek = DayOfWeek.from(LocalDate.now());
      //  DateTimeFormatter f1 = DateTimeFormatter.ofPattern( "HH:mm:ss" );
        t1.setText(String.valueOf(java.time.LocalDate.now()));
        t2.setText(String.valueOf(java.time.LocalTime.now()));
        t3.setText(String.valueOf(dayOfWeek));
       // DayOfWeek d=DayOfWeek.from(LocalDate.now());
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        }
    
    }
    public static void main(String args[])
    {
       new day4();
    }
}
