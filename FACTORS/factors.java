class factors
{
 public static int num(int n)
 {
   if (n == 1)
   return 1;
   return num(n-1)*n;
 }
 public static void main(String[]args)
 {
   int res=num(20);
   System.out.print(res);
 }
}