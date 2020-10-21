class s4
{
	public static void main(String[]args)
	{
		String s1="pavan";
		String s4="pavan";
		String s2=new String(s1);
		String s3=new String(s2);
		String s5=new String("pavan");
		System.out.println("s1:"+s1);//pavan
		System.out.println("s2:"+s2);//pavan
		System.out.println("s3:"+s3);//pavan
		System.out.println("s4:"+s4);//pavan
		System.out.println("s5:"+s5);//pavan
		System.out.println("s1.hc:"+s1.hashCode());//1
		System.out.println("s2.hc:"+s2.hashCode());//1
		System.out.println("s3.hc:"+s3.hashCode());//1
		System.out.println("s4.hc:"+s4.hashCode());//1
		System.out.println("s5.hc:"+s5.hashCode());//1
		System.out.println("s1.identity:"+System.identityHashCode(s1));//1
		System.out.println("s2.identity:"+System.identityHashCode(s2));//2
		System.out.println("s3.identity:"+System.identityHashCode(s3));//3
		System.out.println("s4.identity:"+System.identityHashCode(s4));//1
		System.out.println("s5.identity:"+System.identityHashCode(s5));//5
		System.out.println("s1==s4:"+(s1==s4));//true
		System.out.println("s1==s2:"+(s1==s2));//false
		System.out.println("s2==s5;"+(s2==s5));//false
		System.out.println("s1.equals(s4):"+s1.equals(s4));//true
		System.out.println("s1.equals(s2):"+s1.equals(s2));//true
		System.out.println("s2.equals(s5):"+s2.equals(s5));//true

	}

}