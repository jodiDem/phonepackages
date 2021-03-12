import java.util.Scanner;
public class Parcial2
{
   static Scanner l = new Scanner(System.in);
   static int n;
   static int [] seconds;
   static int [] adding;
   
   public static void main(String [] args)
   {
       Parcial2 obj = new Parcial2();
       int x = 1;
       System.out.print("Cases:");
       n = l.nextInt();
       seconds = new int [n];
       adding = new int [n];
        if (n > 0 && n < 20)
       { 
           System.out.print("How many seconds for each call:");
           for (int i = 0; i < n; i++)
           {
             seconds[i] = l.nextInt(); 
          }
           System.out.println(); 
           
           obj.doStuff();
           x++;
        
       }
   }
   
   public int milePckg()
   {
      int add1=0; //after you add the seconds together 
      for (int i = 0; i < seconds.length; i++)
       {
        if (seconds[i] >= 1 && seconds[i] <= 2000)
       {
           if(seconds[i] <= 29)
           {
              adding[i] = 10;
           }
            else
               if (seconds[i] <= 59 && seconds[i] >= 30)
              {
                  adding[i] = 20;
                }
                else if (seconds[i] >= 60)
                
                {
                    adding[i] = (seconds[i] / 29) * 10;
                    if (seconds[i] % 29 != 1)
                    {
                        adding[i]+= 10;
                    }
                }
       }
      }
      for (int i = 0; i < adding.length; i++)
      {
          add1+= adding [i];
      }
      return add1;
   }
   
   public int juicePckg()
   {
       int add2=0; //the variable to add 15 cents every time needed 
        for (int i = 0; i < seconds.length; i++)
         {
          if (seconds[i] >= 1 && seconds[i] <= 2000)
           {
              if(seconds[i] <= 59)
              {
                    adding [i] = 15;
              }
                    else if (seconds[i] >= 60)
                    {
                        adding[i] = (seconds[i] / 59) * 15;
                        if (seconds[i] % 59 != 0)
                        {
                            adding [i]+= 15;
                        }
                        
                    }
           }
       }
       for (int i = 0; i < adding.length; i++)
        {
            add2+= adding [i];
        } 
        return add2;
   }
   
   public void doStuff()
   {
       milePckg();
       juicePckg();
       if (milePckg() == juicePckg())
        {
             System.out.print("Mile Juice " + juicePckg());
        }
        else
          if (milePckg() < juicePckg())
       {
           System.out.print("Mile " + milePckg());
        }
        else //if (juicePckg() < milePckg())
       {
            System.out.print("Juice " + juicePckg());
        }
        
    }
   
}
