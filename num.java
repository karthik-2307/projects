import java.util.*;
import java.util.concurrent.Flow.Subscriber;
class num
{
  static int mat()
  {
    String str;
    System.out.println("enter the binary code");
    Scanner s=new Scanner(System.in);
    str=s.next();
    //String s1="0";
    int l=str.length();
    int sum=0,k=l-1;char ch;
    int pow;
    System.out.println(l);
    for(int i=0;i<l;i++)
     {
       ch=(str.charAt(i));
       pow=(int) Math.pow(2,k);
       sum=sum+(ch-'0')*pow;
     //  System.out.println());
       k--;
     }
     return sum;
  }
   static void octal()
  {
    int sum=0,rem,k=0;
    int a[]=new int[20];
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the decimal number:");
    int num=s.nextInt();
    while(num>0)
    {
      rem=num%8;
      if(rem<8)
      {
        a[k]=rem;
        k++;
      }
      else if(rem==8)
      {
        a[k]=10;
        k++;
      }
      else if(rem==9)
      {
        a[k]=11;
        k++;
      }
      else if(rem==10)
      {
        a[k]=12;
        k++;
      }
      else if(rem==11)
      {
        a[k]=13;
        k++;
      }
      else if(rem==12)
      {
        a[k]=14;
        k++;
      }
      else if(rem==13)
      {
        a[k]=15;
        k++;
      }
      else if(rem==14)
      {
        a[k]=16;
        k++;
      }
      else if(rem==15)
      {
        a[k]=17;
        k++;
      }
      else if(rem==16)
      {
        a[k]=20;
        k++;
      }
      else if(rem==17)
      {
        a[k]=21;
        k++;
      }
      num=num/8;
    }
    for(int i=k-1;i>=0;i--)
    {
      System.out.print(a[i]);
    }
  }
   public static void main(String args[])
   {
    int num,i=0,choice;
    int stk[]=new int[20];
    //char stk1[]=new char[20];
    String str;
    System.out.println("Enter your choice\n1.Binary\n2.Decimal\n3.Hexadecimal\n4.Octal\n5.To Terminate");
    Scanner s=new Scanner(System.in);
    choice=s.nextInt();
    switch(choice)
    {
        case 1:
         System.out.println("Enter the number");
         num=s.nextInt();
         for(i=0;num>0;i++)
         {
           stk[i]=num%2;
            num=num/2;
         }
         for(i=i-1;i>=0;i--)
         {
          System.out.println(stk[i]);
         } 
         break;
        case 2:
         System.out.println(mat());
         break;
         case 3:
         int k=mat(),rem,a;
         String str1="";
         System.out.println(k);
         for(i=0;k>0;i++)
         {
          rem=k%16;
        //  a=rem*16;
        a=rem;
          if(a<10)
          {
           // System.out.print(a);
           str1=str1+String.valueOf(a);
          }
          else if(a==10)
          {
            //System.out.print("A");
            str1=str1+"A";
          }
          else if(a==11)
          {
            //System.out.print("B");
            str1=str1+"B";
          }
          else if(a==12)
          {
            str1=str1+"C";
          }
          else if(a==13)
          {
           // System.out.print("C");
           str1=str1+"D";
          }
          else if(a==14)
          {
            //System.out.print("D");
            str1=str1+"E";
          }
          else if(a==15)
          {
           // System.out.print("E");
           str1=str1+"F";
          }
          else if(a==16)
          {
            //System.out.print("F");
            str1=str1+"G";
          }
          k=k/16;
        }
        System.out.println(str1);
        for(i=str1.length()-1;i>=0;i--)
        {
          System.out.print(str1.charAt(i));
        }
         break;
        case 4:
        octal();
        break; 
        case 5:
        System.out.println("THANK YOU");
        System.exit(0);
        break;
        default:
        System.out.println("Enter a valid choice");
        break;
    }

  }
}
