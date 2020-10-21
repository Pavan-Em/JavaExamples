package AC;

public class special  implements mail {
	
	public static void main(String[] args) {
		
		mail obj=new special();
		mail.emaildetails[] o=new mail.emaildetails[3];
		o[0]=new mail.emaildetails("jordan","fooju" , "Hashta");
		o[1]=new mail.emaildetails("jordan","fooju" , "El");
		o[2]=new mail.emaildetails("jordan","fooju" , "Fuego");
		for(int i=0;i<o.length;i++)
		{
			obj.sendmail(o[i]);
			if(i<o.length-1)
			System.out.println("=========================");
		}
	}
	
	public void sendmail(emaildetails e)
	{
		System.out.println("tolist---->"+e.tolist);
		System.out.println("cclist---->"+e.cclist);
		System.out.println("subject--->"+e.subject);
	}

}


interface mail
{
	void sendmail(emaildetails e);
	class emaildetails
	{
		String tolist;
		String cclist;
		String subject;
		
		emaildetails(String to,String cc,String sub)
		{
			this.tolist=to;
			this.cclist=cc;
			this.subject=sub;
		}
	}
}
