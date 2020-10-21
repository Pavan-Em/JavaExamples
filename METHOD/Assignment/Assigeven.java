class Assigeven
{
 public static int even(int m,int n)
  {
    int v=0;
    if (m<=n)
    {
      for ( m ;m<=n;m++)
       {
         if (m%2==0)
          v++;
       }
     return v;
    }
  else
   {  
     System.out.println("m should be less than n");
     return v;
   }
  }
 public static void main(String[]args)
 {
  int even_no=even(5,5);
  System.out.println("num of even num are "+even_no);
 }
}