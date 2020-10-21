class Assigprimeno
{
 public static boolean prime(int a)
  {
    boolean isprime=true;
    for(int j=2;j<a;j++)
    {
      if(a%j==0)
       {
         isprime=false;
         return isprime;
       }
    }
    return isprime;
  }
 public static void main(String[]args)
 {
   boolean res= prime(60) ;
   System.out.println(res);
 }
}