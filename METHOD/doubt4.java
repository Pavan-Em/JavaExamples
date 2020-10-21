class doubt4
{
 static int n=1;
 public static void main(String[]args)
 {
  System.out.println(2);
  aa();
 }
 public static void aa()
 {
   if(n==2)
   return;
   n++;
   main(String[]args);
 }
}