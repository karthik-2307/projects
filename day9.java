import java.util.*;
import java.awt.*;
import javax.swing.*;
import p1.text;
class day9 extends text
{   
    TextField t;
    Button b1;
    day9()
    {
       JFrame f=new JFrame("Quote Genrator");
       Random r=new Random();
      // text te=new text();
      // text te=new text();
       JOptionPane.showMessageDialog(f,text.quot[r.nextInt(text.quot.length)]);
      // f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
       //f.setVisible(true);
       //f.setLayout(null);
       //f.setSize(300,300);
    }
    public static void main(String args[])
    {
        new day9();
    }
}
