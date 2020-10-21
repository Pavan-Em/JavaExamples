class methodeven1
{
 public static int even(int n)
 {
  int m; int x=0;
  for (m =0 ;m<=n;m++)
  {
   if (m%2 == 0)
    x++;
  }
   return x;
 }
 public static void main(String[]args)
 {
  int res=even(30);
  System.out.print(res);
 }
}