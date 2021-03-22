
package termwork8;
public class Termwork8 {
   public static void main(String args[]) {
    int sum=0,n=0; 
    
    for(int i = 0; i<args.length; i++) {
        int g =Integer.parseInt(args[i]);
        if(g>0){
        sum+=g;
    }
   }
   while(sum!=0)
   {
    n=n+sum%10;  
    sum=sum/10; 
    if(n>10)
     {
      sum=n;
      n=0;
     }
    }
      System.out.println("Sum of digits : "+n);
   }
}