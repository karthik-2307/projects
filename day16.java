import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.Timer;
public class day16 extends JFrame {
  private static JFrame f;
   int gap=35;
   float angpoi=(float)(Math.PI/30);
   float angnum=(float)(Math.PI/-6);
   int size=400-gap;
   int xc,yc;
   Calendar cal;
   int hour,minute,sec;
   Color mhc,sc;
   Timer ti;
   TimeZone timeZone;
   public static void main(String args[])
   {
      f=new day16();
      f.setVisible(true);
      f.setTitle("ANALOG CLOCK");
   }
  public day16()
   {
      JButton b1=new JButton();
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setBounds(700,100,400,430);
      timeZone=TimeZone.getDefault();
      ti=new Timer();
      ti.schedule(new TickTimerTask(),0,1000);
   }
   class TickTimerTask extends TimerTask
   {
      public void run()
      {
         cal=(Calendar) Calendar.getInstance(timeZone);
         repaint();
      }
   }
   public void paint(Graphics g)
   {
      super.paint(g);
      size=400-gap;
      xc=400/2;
      yc=400/2+10;
      hour=cal.get(Calendar.HOUR);
      minute=cal.get(Calendar.MINUTE);
      sec=cal.get(Calendar.SECOND);
      g.setColor(Color.BLACK);
      g.fillOval(xc-5, yc-5,10,10);
      g.setColor(Color.RED);
      g.fillOval(xc-3,yc-3,6,6);
      clockface(g);
      clocknum(g);      
      drawHands(g,hour,minute,sec,sc.RED,mhc.BLACK);
   }
   private void drawHands(Graphics g, double hour, double minute, double second, Color colorSecond, Color colorMHour) {
		// TODO Auto-generated method stub
		double rsecond = (second*6)*(Math.PI)/180;
		double rminute = ((minute + (second / 60)) * 6) * (Math.PI) / 180;
		double rhours = ((hour + (minute / 60)) * 30) * (Math.PI) / 180;
				
		g.setColor(colorSecond);
		g.drawLine(xc, yc, xc + (int) (150 * Math.cos(rsecond - (Math.PI / 2))), yc + (int) (150 * Math.sin(rsecond - (Math.PI / 2))));
		g.setColor(colorMHour);
		g.drawLine(xc, yc, xc + (int) (120 * Math.cos(rminute - (Math.PI / 2))), yc + (int) (120 * Math.sin(rminute - (Math.PI / 2))));
		g.drawLine(xc, yc, xc + (int) (90 * Math.cos(rhours - (Math.PI / 2))), yc + (int) (90 * Math.sin(rhours - (Math.PI / 2))));
	}
   private void clocknum(Graphics g) 
   {
      for(int i=12;i>0;i--)
      {
         num(g,(double) (angnum*i),i);
      }
   }
   private void num(Graphics g, Double h, int i) 
   {
      float sin1=(float)Math.sin(h);
      float cos1=(float)Math.cos(h);
     // int x=((int)(size/2-20-25) * -sin1);
      int x = (int)((size/2-10) * -sin1);
      int y=(int)((size/2-10)* -cos1);
      g.drawString(""+i, xc+x,yc+ y);
   }
   void clockface(Graphics g)
   { int tic;
      for(int sec=0;sec<60;sec++)
      {
         if(sec%5==0)
         {
           tic=size/2-20;
           ticks(g,xc,yc,angpoi*sec,tic-20,size/2-20,Color.RED);
         }
         else
         {
            tic=size/2-10;
            ticks(g,xc,yc,angpoi*sec,tic-20,size/2-20,Color.BLACK);
         }
      }
   }
void ticks(Graphics g,int x2,int y2,double ang,int minr,int maxr,Color co)
{
   float sineang=(float)(Math.sin(ang));
   float cosang=(float)(Math.cos(ang));
   int xmin=(int)(minr*sineang);
   int ymin=(int)(minr*cosang);
   int xmax=(int)(maxr*sineang);
   int ymax=(int)(maxr*cosang);
   g.setColor(co);
   g.drawLine(x2+xmin,y2+ymin,x2+xmax,y2+ymax);
}

}
