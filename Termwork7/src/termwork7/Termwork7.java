/*Q7. WAP in Java to input a String Array which combination of 
      alphanumeric string & print the sum of all numeric charcters
      in the whole array.*/
package termwork7;

import java.util.*;
class Termwork7
{
  public static void main(String[] args)
   {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter size of array :");
     int x = sc.nextInt();
     String[] arr = new String[x];
     System.out.println("Enter "+x+" elements");
     for(int i = 0;i<x;i++)
     arr[i]=sc.next();
     System.out.println("Inputted Array is "+ Arrays.toString(arr));
     String a = null;
     for(int i=0;i<x;i++)
        {
           for(int j=i+1;j<x;j++)
            {
               int z = arr[j].compareTo(arr[i]);
               if(z<0)
                {
                   a=arr[i];
                   arr[i]=arr[j];
                   arr[j]=a;
                }
            }
        }
        System.out.println("Sorted Array : "+ Arrays.toString(arr));
    }
}