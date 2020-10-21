class doubt1
{
 public static void num(int n)
 {
  System.out.print(n+" ");
  if (n==0)
  return;
  n--;
  num(n);
 }
 public static void main(String[]args)
 {
  num(10);
 }
}
//10 9 8 7 6 5 4 3 2 1 0