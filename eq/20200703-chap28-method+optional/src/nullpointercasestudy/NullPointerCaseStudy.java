package nullpointercasestudy;

class Friend
{
	String name;
	Company cmp;
	
	public Friend(String n, Company c)
	{
		name = n;
		cmp = c;
	}
	
	public String getName()
	{
		return name;
	}
	public Company getCmp()
	{
		return cmp;
	}
}

class Company
{
	String cName;
	ContInfo cInfo;
	
	public Company(String cn, ContInfo ci)
	{
		cName = cn;
		cInfo = ci;
	}
	
	public String getCName()
	{
		return cName;
	}
	public ContInfo getCInfo()
	{
		return cInfo;
	}
}

class ContInfo
{
	String phone;
	String adrs;
	
	public ContInfo(String ph, String ad)
	{
		phone = ph;
		adrs = ad;
	}
	public String getPhone()
	{
		return phone;
	}
	public String getAdrs()
	{
		return adrs;
	}
}

public class NullPointerCaseStudy
{
	public static void showCompAddr(Friend f) {

		String addr = null;
		
		if (f != null)
		{
			Company com = f.getCmp();
		
			if (com != null)
			{
				ContInfo info = com.getCInfo();
				if (info != null)
				{
					addr = info.getAdrs();
				}
			}
			
		}

		if(addr != null)
		{
			System.out.println(addr);
		}
		else
		{
			System.out.println("There's no address information.");
		}
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ContInfo ci = new ContInfo("321-444-577", "Republic of Korea");
		Company cp = new Company("YaHo Co., Ltd.", ci);
		Friend frn = new Friend("LEE SU", cp);
		showCompAddr(frn);
	}

}
