class recprime
{
 public static void prime(int n)
 {
   if (n==1)
   return;
   n--;
   prime(n);
  
   boolean isprime=true;
   for(int i=2;i<n;i++)
    {
      if (n%i == 0)
       {
       isprime=false;//return;
        break;
       }
    }
   if (isprime)
   System.out.print(n+" ");
  }
 public static void main(String[]args)
 {
  prime(7);
 }
}
// output 1 2 3 5 7 11 13 17 19 23 29