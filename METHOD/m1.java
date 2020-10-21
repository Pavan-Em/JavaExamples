class m1
{
  public static void add()
   {
     int a,b;
     a=10; b=10;
     int res=a+b;
     System.out.println(res);
   }
  public static void Add(int a,int b)
   {
     int res=a+b;
     System.out.println(res);
   }
  public static double multi(double a,double b)
   {
     double res=a*b;
     return res;
   }
  public static int Multi(int a,int b)
   {
     int res=a*b;
     return res;
   }
  public static void main(String[]args)
   {
     add();//20
     Add(10,2);//12
     int res=(int)multi(5,6);
     System.out.println(res);//30
     int resu=(int)(multi(5.2,6.3)*Multi(10,3));
     System.out.println(Multi(10,3));//30
     System.out.println(resu);//982
   }
}