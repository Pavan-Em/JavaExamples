
class Account1
{
 static int account_num=999;
 static String account_holder_name="Pavan";
 static double account_balance=12000;

 public static int withdrawel(int amount)
 {
  if(amount<=account_balance)
  {
   account_balance=account_balance-amount;
   System.out.println("withdrawel successful");
   System.out.println("Available balance:"+account_balance);
   return amount;
  }
 else
  {
   System.out.println("Insafficient Balance");
   System.out.println("Available Balance:"+account_balance);
   return 0;
  }
 }
}
class bankapp1
{
 public static void main(String[]args)
 {
  System.out.println("Account Number:"+Account1.account_num);
  System.out.println("Holder Name:"+Account1.account_holder_name);
  System.out.println("Account Balance:"+Account1.account_balance);
  Account1.withdrawel(13000);
  
 }
}
