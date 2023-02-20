//Measurement Caluclator(weight,distance,area,volume)//
import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.lang.model.util.ElementScanner14;
import javax.sound.midi.SysexMessage;
class day5
{
    public static void main(String args[])
    {
        int len,bre,heig,mass,rad,x1,x2,y1,y2,choi,sel;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your choice\n1.area\n2.vol\n.3.weight\n.4.dis");
        choi=s.nextInt();
        switch(choi)
        {
            case 1:
              System.out.println("AREA");
              System.out.println("Enter the selection 1.for circle\n2.for others");
              sel=s.nextInt();
              switch(sel)
              {  
                case 1:
                System.out.println("Enter the radius");
                rad=s.nextInt();
                System.out.println("Area of circle is"+rad*rad*3.14);
                break;
                case 2:
                System.out.println("Enter the length");
                len=s.nextInt();
                System.out.println("enter the breadth");
                bre=s.nextInt();
                System.out.println("Area is :"+len*bre);
                break;
              }
              break;
            case 2:
              System.out.println("Enter the length");
              len=s.nextInt();
              System.out.println("Enter the breadth");
              bre=s.nextInt();
              System.out.println("Enter the height");
              heig=s.nextInt();
              System.out.println("Enter choice \n1.tri\n2.oth");
              choi=s.nextInt();
              if(choi==1)
              {
                System.out.println("Volume of triangle is"+(len*bre*heig
                )/2);
              }
              else 
              {
                System.out.println("Volume of triangle is"+len*bre*heig
                );
              }
              break;
            case 3:
               System.out.println("Enter the mass of the body");
               mass=s.nextInt();
               System.out.println("Weight of body is"+mass*9.8);
               break;
            case 4:
              System.out.println("Enter the x and y cordinates of first point");
              x1=s.nextInt();
              y1=s.nextInt();
              System.out.println("Enter the x and y cordinates of the second point");
              x2=s.nextInt();
              y2=s.nextInt();
              System.out.println("Distance is :"+Math.sqrt((x1-y1)^2+(x2-y2^2)));
            break;
            default:
            System.out.println("Invalid Choice");
            break;
        }
    }
}