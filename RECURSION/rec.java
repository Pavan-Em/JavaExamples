class rec
{
 public static void Rec(int a)
 {
   if(a==0)
    {
      return;
    }
    a--;
   Rec(a);
   a=a+1;
   System.out.print(a+" ");
 }
 public static void main(String[]args)
 {
  Rec(10);
 }
}
//output 1 2 3 4 5 6 7 8 9