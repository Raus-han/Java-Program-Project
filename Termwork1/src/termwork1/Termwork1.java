//WAP a program to find Maximum and Minimum among three Number.
package termwork1;
import java.util.Scanner;
public class Termwork1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        // First method through logically     
       /* if(a>b && a>c)
            System.out.println("Maximum value is: " +a);
        else if(b>a && b>c)
            System.out.println("Maximum value is: " +b);
        else 
            System.out.println("Maximum value is: " +c);
            
         if(a<b && a<c)
            System.out.println("Minimum value is: " +a);
         else if(b<a && b<c)
            System.out.println("Minimum value is: " +b);
         else
             System.out.println("Minimum value is: " +c);*/
    //other method through switch case 
    int max,min;
      max=(a>b)?(a>c?a:c):(b>c?b:c);
        System.out.println("Maximum value is: "+max);
      min=(a<b)?(a<c?a:c):(b<c?b:c);
        System.out.println("Minimum value is: "+min);
   
    } 
    
}
