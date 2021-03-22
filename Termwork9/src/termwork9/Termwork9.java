package termwork9;
class Termwork9 
{   
   public static void main(String[] args)
    {
       Object o[] ={27,"raushan",05,5.65,"kumar"};
       int sum = 0;
       for(int i=0;i<5;i++)  {
        if(o[i]instanceof Integer) {
        Integer n = (Integer)o[i];
          sum=sum+n;
        }
            if(o[i]instanceof String) {
               String r = " ";
               String n = (String)o[i];
               for (int j=(n.length())-1;j>=0;j--)
               r = r+n.charAt(j);
               System.out.println("Reverse of String : "+r);
               r = " ";  
}
} 	System.out.println("Sum : "+sum);            
    }
}