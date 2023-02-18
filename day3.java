//currency converter//
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import javax.swing.*;
public class day3 implements ActionListener {
    Button b1;
    TextField t1,t2,t3,t4;
    MenuItem i1,i2,i3,o1,o2,o3;
    int i=0;
    day3()
    {
       Frame f=new Frame("Currency Converter");
      t1=new TextField(10);
     // t1.setBounds(10,10,100,15);
      t2=new TextField(10);
      t3=new TextField(10);
      t3.setText("INPUT");
      t4=new TextField(10);
      t4.setText("OUTPUT");
     // t2.setBounds(10,10,10,5);
     f.add(t3);
     f.add(t4);
      f.add(t1);
      f.add(t2);
      f.addWindowListener(new WindowAdapter()
      {
        public void windowClosing(WindowEvent e)
        {
            System.exit(0);
        }
      });
      MenuBar m=new MenuBar();
      Menu m1=new Menu("INPUT");
      Menu m2=new Menu("OUTPUT");
     i1=new MenuItem("RUPEES");
     i2=new MenuItem("DOLLARS");
     i3=new MenuItem("EUROS");
     o1=new MenuItem("RUPEES");
     o2=new MenuItem("DOLLARS");
     o3=new MenuItem("EUROS");
      //m1.addMenuListener((MenuListener) i1);
      i1.addActionListener(this);
      i2.addActionListener(this);
      i3.addActionListener(this);
      o1.addActionListener(this);
      o2.addActionListener(this);
      o3.addActionListener(this);
      m1.add(i1);
      m1.add(i2);
      m1.add(i3);
      m2.add(o1);
      m2.add(o2);
      m2.add(o3);
      m.add(m1);
      m.add(m2);
      f.setLayout(new FlowLayout());
      f.setSize(400,400);
      f.setVisible(true);
    f.setMenuBar(m);
    }
    public static void main(String[] args)
    {
        new day3();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        //String ch=(String) e.getSource();
        float out;
        String in=t1.getText();
        if(e.getSource()==i1)
        {
          // t1.setText("100");
           i=1;
           //t2.setText("check");
           t3.setText("RUPEE");
        }
        else  if(e.getSource()==i2)
        {
           // t1.setText("100");
           t3.setText("DOLLAR");
           i=2;
        }
        else  if(e.getSource()==i3)
        { 
           t3.setText("EURO");
           i=3;
        }
        else  if(e.getSource()==o2&&i==1)
        {   
            t4.setText("DOLLAR");
            out=(float) (Float.parseFloat(in)/(82.75));
            t2.setText(String.valueOf(out));
        }
        else  if(e.getSource()==o3&&i==1)
        {
            t4.setText("EUROS");
            out=(float) (Float.parseFloat(in)/(88.49));   
            t2.setText(String.valueOf(out));
        }
        else  if(e.getSource()==o1&&i==2)
        {
            t4.setText("RUPEE");
            out=(float) (Float.parseFloat(in)*(82.75));
            t2.setText(String.valueOf(out));
        }
        else  if(e.getSource()==o3&&i==2)
        {
            t4.setText("EUROS");
            out=(float) (Float.parseFloat(in)*(0.94));   
            t2.setText(String.valueOf(out));
        }
        else  if(e.getSource()==o1&&i==3)
        {   
            t4.setText("RUPEE");
            out=(float) (Float.parseFloat(in)*(88.49));   
            t2.setText(String.valueOf(out));
        }
        else  if(e.getSource()==o2&&i==3)
        {   
            t4.setText("DOLLAR");
            out=(float) (Float.parseFloat(in)*(1.07));   
            t2.setText(String.valueOf(out));
        }
        
    }
    
}

