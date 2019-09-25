/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
  public static void main (String[] args) throws java.lang.Exception
  {
    // your code goes here
    int i;
    int m=0; // it is to check the half of the number in the loop
    int flag=0;      
    int n=9;//it is the number to be checked    
    m=n/2;      
    if(n==0||n==1)
    {  
      System.out.println(n+" is not prime number");      
    }
    else
    {  
      for(i=2;i<=m;i++)
      {      
        if(n%i==0)
        {      
          System.out.println(n+" is not prime number");      
          flag=1;      
          break;      
        }      // end of inner if statement
      }   // end of for loop   
      if(flag==0) // if it is at least once divided then it is not a prime
      {
        System.out.println(n+" is prime number"); 
      }  
    }//end of else  
  }
}
