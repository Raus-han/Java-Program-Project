/*Q6. WAP in Java to input a String Array  & sort it according to telephone 
      dictionary.*/
package termwork6;

import java.util.*;
class Termwork6
{
  public static void main(String[] args)
   {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter size of array :");
	int x = sc.nextInt();
	String[] arr = new String[x];
	System.out.println("Enter "+x+" elements");
	for(int i = 0;i < x;i++)
	arr[i]=sc.next();
	System.out.println("Inputted Array is "+ Arrays.toString(arr));
	int sum=0;
	for(int i=0;i<x;i++)
	 {
	  for(int j=0;j<arr[j].length();j++)
	    {
		char c=arr[i].charAt(j);
		if(Character.isDigit(c))
		sum=sum+(c-48);
	    }
	 }
	   System.out.println("Sum : "+sum);
	}
}