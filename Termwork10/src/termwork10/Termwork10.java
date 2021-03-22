package termwork10;

import java.util.*;
public class Termwork10 {
    public static void main(String[] args) {
        int num,sum=0,x,sum1=0;
        StringBuilder str = new StringBuilder();
        String s="44aP12xD-123bQ2-14";
        char[] c;
        c=s.toCharArray();
        for(int i=0;i<c.length; i++) {
          if(Character.isLetter(c[i])) {
             if (Character.isLowerCase(c[i])) {
                num=c[i]-31;
                if(num==91) 
                  System.out.printf("%c", num - 26); 
                else 
                  System.out.printf("%c", num);
                }
             if(Character.isUpperCase(c[i])) {
                num = c[i] + 31;
                 if (num == 96) 
                  System.out.printf("%c", num + 26); 
                 else 
                  System.out.printf("%c", num);
                }
            }
        if(c[i] == '-')
            {
               if (Character.isDigit(c[i + 1])) {
                    for (int j = i + 1; j < c.length; j++)
                    {
                        if (Character.isDigit(c[j]))
                        {
                            str.append(c[j]);
                            i++;
                        }
                        else
                               break;
                    }
                    x = Integer.parseInt(str.toString());
                    sum+= x;
                    str = new StringBuilder();
                }
            }
           else if(Character.isDigit(c[i]))
            {
                String st = "";
                st+=c[i];
                int ss = Integer.parseInt(st);
                sum1 = sum1 + ss;
            }
        }
        System.out.println("\nSum Of Negatives = -"+sum);
        System.out.println("\nSum Of Positives = "+sum1);
    }
}