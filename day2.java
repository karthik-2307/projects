import java.util.*;
public class day2 {
 /**  static  int word(String arr)
    {
        int len=arr.length();
        int i=0,count=0;
        while(i<len)
        {
            char ch=arr.charAt(i);
            int a=ch;
            if(a==32||a==46)
             count++;
             i++;
        }
        return count;
    }
    static int sentence(String arr)
    {
        int len=arr.length();
        int i=0,count=0;
        while(i<len)
        {
            char ch=arr.charAt(i);
            int a=ch;
            if(a==46)
             count++;
             i++;
        }
        return count;
    }**/
    static int letter(String arr)
    { 
        int len=arr.length();
        int i=0,count=0;
        while(i<len)
        {
            char ch=arr.charAt(i);
            int a=ch;
            if(a>=65&&a<=122)
             count++;
             i++;
        }
        return count;
      
        //return 0;
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String str;
        System.out.println("Enter the string");
        str=s.nextLine();
       // System.out.println("Number of letters :"+letter(str));
        //System.out.println("Number of sentences are:"+sentence(str));
        //System.out.println("Number od words are:"+word(str));
        String st[]=str.split("\\ ");
        String ab[]=str.split("\\.");
        int a=st.length;
        System.out.println("Number of words are:"+a);
        System.out.println("Number of sentances are:"+ab.length+1);
        System.out.println("Number of letters are:"+letter(str));
       // System.out.println(str);
      // char ch='A';
       //System.out.println(Integer.parseInt(String.valueOf(ch)));
    }
    
}
