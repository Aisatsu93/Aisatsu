package usingSQL;

public class Student extends Person implements DoingOf
{

	private int mStuID;
	private String mStuName;
	private char mGrade;
	private String mMajorCode;
	
	public Student (int PersonId, int StuID, String StuName, char Grade, String MajorCode)
	{
		super(PersonId, StuName);
		mStuID = StuID;
		mStuName = StuName;
		mGrade = Grade;
		mMajorCode = MajorCode;
	}
	
	
	public int getmStuID()
	{
		return mStuID;
	}
	public void setmStuID(int mStuID)
	{
		this.mStuID = mStuID;
	}
	public String getmStuName()
	{
		return mStuName;
	}
	public void setmStuName(String mStuName)
	{
		this.mStuName = mStuName;
	}
	public char getmGrade()
	{
		return mGrade;
	}
	public void setmGrade(char mGrade)
	{
		this.mGrade = mGrade;
	}
	public String getmMajorCode()
	{
		return mMajorCode;
	}
	public void setmMajorCode(String mMajorCode)
	{
		this.mMajorCode = mMajorCode;
	}
	
	public String work(String doing)
	{
		return "���� ����" + doing + "�� �Ѵ�. ������ �ϰ� �ʹ�.";
	}
	public void sleep()
	{
		System.out.println("10�и� �� �ھ���");
	}
	public void live()
	{
		return 
	}

}
