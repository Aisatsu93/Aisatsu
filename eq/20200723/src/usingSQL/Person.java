package usingSQL;

public class Person implements DoingOfPerson
{
	private int mPersonID;
	private String mPersonName;
	
	public Person (int personId, String pName)
	{
		mPersonID = personId;
		mPersonName = pName;
	}
	
	public int getmPersonID()
	{
		return mPersonID;
	}
	public void setmPersonID(int mPersonID)
	{
		this.mPersonID = mPersonID;
	}
	public String getmPersonName()
	{
		return mPersonName;
	}
	public void setmPersonName(String mPersonName)
	{
		this.mPersonName = mPersonName;
	}
	
	
	
	public String work(String doing)
	{
		return "���� ����" + doing + "�� �Ѵ�. �л��϶��� �׸���.";
	}
	public void sleep()
	{
		System.out.println("zzZ");
	}
	

}
