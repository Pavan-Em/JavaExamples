class rec1
{
 public static void Rec(int a)
 {
   System.out.print(a+" ");
   if(a==10)
    return;
    a++;
   Rec(a);
 }
 public static void main(String[]args)
 {
  Rec(1);
 }
}
//output 1 2 3 4 5 6 7 8 9 10