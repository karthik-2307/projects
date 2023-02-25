import java.awt.*;
import java.awt.event.*;
public class day10 extends Thread implements ActionListener
{   Button b1=new Button("START");
    Button b2=new Button("STOP");
    Label l1=new Label("Enter time");
    TextField t1=new TextField(5);
    TextField t2=new TextField(5);
    day10()
    {
       Frame f=new Frame("TIMER");
       f.addWindowListener(new WindowAdapter()
       {
           public void windowClosing(WindowEvent e)
           {
             System.exit(0);
           }
       }
       );
       f.add(l1);
       f.add(t2);
       f.add(t1);
       f.add(b1);
       f.add(b2);
       b2.addActionListener(this);
       b1.addActionListener(this);
       f.setVisible(true);
       f.setSize(400,400);
       f.setLayout(new FlowLayout());
    }
    public void actionPerformed(ActionEvent e)
    {  if(e.getSource()==b1)
        {
           // System.out.println("HELLO:");
            int time=Integer.parseInt(t1.getText());
            //time=time*60;
            int min=Integer.parseInt(t2.getText());
        while(time>0||min>0)
        {   if(time==0)
            {
                min--;
                time=59;
            }
            t2.setText(String.valueOf(min));
            t1.setText(String.valueOf(time));
            try {
                sleep(1000);
            } catch (InterruptedException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            time--;
        }
        int i=0;
        t1.setText("00");
        t2.setText("00");
        while(i<5){
        Toolkit.getDefaultToolkit().beep();
        try {
            sleep(2000);
        } catch (InterruptedException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        i++;
        }
    }
    if(e.getSource()==b2)
    { 
        System.exit(0);
    }
    }
    public static void main(String[] args)
    {
        new day10();
    }
}