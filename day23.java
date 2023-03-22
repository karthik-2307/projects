import java.util.*;

import javax.lang.model.util.ElementScanner14;
public class day23
{
  public static void main(String[] args) 
   {
      Scanner s=new Scanner(System.in);
      String A[]={"Rock","Paper","Scissors"};
      String B[]={"Rock","Paper","Scissors"};
      while(true)
      {
         int a=(int)(Math.random()*3);
         int b=(int)(Math.random()*3);
         String pa=A[a];
         String pb=B[b];
         if(a==b)
         {
            System.out.println("MATCH DRAW");
         }
         else if(a==0&&b!=1)
         {
            System.out.println("PLAYER A WINS");
            return ;
         }
         else if(a==1&&b!=0)
         {
            System.out.println("PLAYER A WINS");
            return ;
         }
         else if(a==2&&b!=1)
         {
            System.out.println("PLLAYER A WINS");
            return ;
         }
         else 
         {
            System.out.println("PLAYER B WINS");
            return ;
         }
      }
   }
}