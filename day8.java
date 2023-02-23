import java.time.*;
import java.util.TimeZone;
import java.awt.*;
import java.awt.event.*;

public class day8 extends Thread{
    day8()
    {
        Frame f=new Frame("DIGITAL CLOCK");
        Label ci1=new Label("INDIA");
        Label ci2=new Label("TOKYO");
        Label ci3=new Label("AMERICA");
        Label ci4=new Label("NEPAL");
        Label ci5=new Label("AFRICA");
        TextField t1=new TextField(5);
        TextField t2=new TextField(5);
        TextField t3=new TextField(5);
        TextField a1=new TextField(5);
        TextField a2=new TextField(5);
        TextField a3=new TextField(5);
        TextField b1=new TextField(5);
        TextField b2=new TextField(5);
        TextField b3=new TextField(5);
        TextField c1=new TextField(5);
        TextField c2=new TextField(5);
        TextField c3=new TextField(5);
        TextField d1=new TextField(5);
        TextField d2=new TextField(5);
        TextField d3=new TextField(5);
        f.add(ci1);
        f.add(t1);
        f.add(t3);
        f.add(t2);
        f.add(ci2);
        f.add(a1);
        f.add(a3);
        f.add(a2);
        f.add(ci3);
        f.add(b1);
        f.add(b3);
        f.add(b2);
        f.add(ci4);
        f.add(c1);
        f.add(c3);
        f.add(c2);
        f.add(ci5);
        f.add(d1);
        f.add(d3);
        f.add(d2);
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
        f.setSize(350,350);
        while(true)
        {
     
            TimeZone tz = TimeZone.getDefault();  
        TimeZone timezone = TimeZone.getTimeZone("Asia/Kolkata");   
        DayOfWeek dayOfWeek = DayOfWeek.from(LocalDate.now());
      //  DateTimeFormatter f1 = DateTimeFormatter.ofPattern( "HH:mm:ss" );
        t1.setText(String.valueOf(java.time.LocalDate.now()));
        t2.setText(String.valueOf(java.time.LocalTime.now()));
        t3.setText(String.valueOf(dayOfWeek));
        ZoneId zoneid1 = ZoneId.of("Asia/Tokyo"); //tokyo 
        dayOfWeek = DayOfWeek.from(LocalDate.now());
        a1.setText(String.valueOf(LocalDate.now(zoneid1)));
        a2.setText(String.valueOf(LocalTime.now(zoneid1)));
        a3.setText(String.valueOf(dayOfWeek));
         zoneid1 = ZoneId.of("America/Miquelon");  //america
        dayOfWeek = DayOfWeek.from(LocalDate.now());
        b1.setText(String.valueOf(LocalDate.now(zoneid1)));
        b2.setText(String.valueOf(LocalTime.now(zoneid1)));
        b3.setText(String.valueOf(dayOfWeek));
        zoneid1 = ZoneId.of("Asia/Katmandu");  //nepal
        dayOfWeek = DayOfWeek.from(LocalDate.now());
        c1.setText(String.valueOf(LocalDate.now(zoneid1)));
        c2.setText(String.valueOf(LocalTime.now(zoneid1)));
        c3.setText(String.valueOf(dayOfWeek));
        zoneid1 = ZoneId.of("Africa/Lome");  //Africa
        dayOfWeek = DayOfWeek.from(LocalDate.now());
        d1.setText(String.valueOf(LocalDate.now(zoneid1)));
        d2.setText(String.valueOf(LocalTime.now(zoneid1)));
        d3.setText(String.valueOf(dayOfWeek));
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
       new day8();
    }
}
