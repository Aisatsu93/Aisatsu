package usingSQL;

public class Major
{

	private String m_MajorCode;
	private String m_MajorName;
	
	public String toString()
	{
		return "�а���ȣ: " + m_MajorCode + " �а���: " + m_MajorName;
	}
	
	public String getM_MajorName()
	{
		return m_MajorName;
	}
	
	public void setM_MajorName(String m_MajorName)
	{
		this.m_MajorName = m_MajorName;
	}
	
	public String getM_MajorCode()
	{
		return m_MajorCode;
	}
	
	public void setM_MajorCode(String m_MajorCode)
	{
		this.m_MajorCode = m_MajorCode;
	}
	
	public Major (String MajorCode, String MajorName)
	{
		m_MajorCode = MajorCode;
		m_MajorName = MajorName;
	}

}
