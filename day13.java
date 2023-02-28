import java.util.*;

import javax.lang.model.util.ElementScanner14;

import java.awt.*;
import java.awt.event.*;
public class day13
{   
    public static String str[]={"PLANET","Planet that glow","Important to cse students"," the fourth stomach of a ruminant"," such as a cow or sheep",
    " to deceive or get the better of (someone) by trickery","a great misfortune or disaster","speechless with amazement","lasting a very short time"
," to cheat a person","gadget","out-and-out nonsense"," the letter Z","an old, decrepit, or unpretentious automobile"," to complain, especially chronically "};
    public static String org[]={"EARTH","SUN","LAPTOPS","Abomasum","Bamboozle","Calamity","Dumfounded","Ephemeral","Finagle","Gizmo","Hokum","Izzar"
,"Jalopy","Kvetch"};
public static String jumb[]={"HTRAE","NSU","TAPLOPS","Amobaumm","Bomlaozbe","Claaimty","Dmuofunedd","Epehmreal","Fanieg","izgmo ","Hmkuo","Izzrad"
,"ajlopy","Ktecvh"};
//public static String pos[]={"1-E","2-U","1-L:3-P","3.o:8.m","1.B:3.b","2.a:4.a",""};
/**Button Submit,hint;
day13()
{
   Submit=new Button("SUBMIT");
   hint=new Button("HINT");
   Frame f=new Frame("Word Guessing");
   f.addWindowListener(new WindowAdapter() {
    public void windowClosing(WindowEvent e)
    {
         System.exit(0);
    }
   });
}**/
   public static void main(String[] args)
   {
          //random function vadali and positions kusa return chedam//
          Random r=new Random();
          int i=r.nextInt(str.length);
          System.out.println(day13
        .str[i]);
          //System.out.println((int)Math.random()*(org[i].length()+1));
          //System.out.println(str.length);
          //System.out.println(org.length);
         // System.out.println(r.nextInt(str.length));
        // System.out.println(i);
         Scanner s=new Scanner(System.in);
         int num=3;
         System.out.println("Jumbled words are:"+jumb[i]);
         System.out.println(org[i]);
         String str1=org[i];
         int count=0;
         while(num>0)
         {
         System.out.println("Enter the Word");
         String word=s.nextLine();
         if(word.equalsIgnoreCase(org[i]))
         {
                System.out.println("YOU WIN");
                count++;
                break;
         }
         else
         {
            System.out.println("Try Again");
            System.out.println("Your remaining chances are"+num);
         }
         num--;
        }
        if(count==0)
        System.out.println("YOU LOOSE");
   }
}