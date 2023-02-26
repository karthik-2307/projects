import java.util.Random;
public class day11{
   public static void main(String[] args)
   {
       int dic[]=new int[6];
    //  dice[]={1,2,3,4,5,6};
        dic[0]=1;
        dic[1]=2;
        dic[2]=3;
        dic[3]=4;
        dic[4]=5;
        dic[5]=6;
        String coin[]={"HEAD","TAIL"};
      Random r=new Random();
      System.out.println("Dice value is"+r.nextInt(dic.length));
      if(r.nextInt(coin.length)==1)
      System.out.println("COIN VALUE IS : HEAD");
      else
      System.out.println("COIN VALUE IS : TAIL");
    //  int b = (int)(Math.random()*(max-min+1)+min);  
      System.out.println("Random number under 100 :"+(int)(Math.random()*(101)));

   }   
}
