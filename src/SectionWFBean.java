import java.util.List;


public class SectionWFBean
{
  private List<SectionBean> sectionBeans;
  private String wf;
  
  public SectionWFBean() {}
  
  public SectionWFBean(String paramString, List<SectionBean> paramList)
  {
    this.wf = paramString;
    this.sectionBeans = paramList;
  }
  
  public List<SectionBean> getSectionBeans()
  {
    return this.sectionBeans;
  }
  
  public String getWf()
  {
    return this.wf;
  }
  
  public void setSectionBeans(List<SectionBean> paramList)
  {
    this.sectionBeans = paramList;
  }
  
  public void setWf(String paramString)
  {
    this.wf = paramString;
  }
}
