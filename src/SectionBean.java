
public class SectionBean
{
  private String data;
  private int id;
  private int msNUm;
  private String plan;
  private int qsNum;
  
  public SectionBean() {}
  
  public SectionBean(int paramInt1, String paramString1, int paramInt2, int paramInt3, String paramString2)
  {
    this.id = paramInt1;
    this.plan = paramString1;
    this.msNUm = paramInt2;
    this.qsNum = paramInt3;
    this.data = paramString2;
  }
  
  public String getData()
  {
    return this.data;
  }
  
  public int getId()
  {
    return this.id;
  }
  
  public int getMsNUm()
  {
    return this.msNUm;
  }
  
  public String getPlan()
  {
    return this.plan;
  }
  
  public int getQsNum()
  {
    return this.qsNum;
  }
  
  public void setData(String paramString)
  {
    this.data = paramString;
  }
  
  public void setId(int paramInt)
  {
    this.id = paramInt;
  }
  
  public void setMsNUm(int paramInt)
  {
    this.msNUm = paramInt;
  }
  
  public void setPlan(String paramString)
  {
    this.plan = paramString;
  }
  
  public void setQsNum(int paramInt)
  {
    this.qsNum = paramInt;
  }
}

