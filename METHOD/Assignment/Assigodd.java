class Assigodd
{
 public static void odd(int m,int n)
 {
  if (m<=n)
   {
     for(  ;m<=n;m++)
      {
        if(m%2 != 0)
         System.out.print(m+" ");
      }
   }
  else
  System.out.println(" m should be less than n");
 }
 public static void main(String[]args)
 {
  odd(20,10);
 }
}