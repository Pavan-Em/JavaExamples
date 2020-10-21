class rec2
{
 public static void Rec(int a)
 {
  if (a==0)
  return;
  a--;
  Rec(a);
  if(a%2 != 0)
  System.out.print(a+" ");
 }
 public static void main(String[]args)
 {
   Rec(30);
 }
}
//op 1 3 5 7 9 11 15 17 19 21 23 25 27 29