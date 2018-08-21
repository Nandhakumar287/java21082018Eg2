import java.io.*;
import java.util.*;
 
  public class Armstrong
  {
    public static void main(String args[])
    {
      int new_value,store_value=0,temp;
      Scanner sc=new Scanner(Sysatem.in);
      System.out.println("Enter any Integer Between 100 to 999");
      int value=sc.nextInt();
      temp=value;
      while(value>0)
      {
        new_value=value%10;
        store_value=store_value+(new_value*new_value*new_value);
        value=value/10;
      }
      if(store_value==temp)
      {
      Sysytem.out.println("Yes!It's a Armstrong");
      }
      else
      {
      System.out.println("NO!It's Not a armstrong");
      }
     }
   }   
     
  
      
      
