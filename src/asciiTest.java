
import java.util.ArrayList;
import java.util.List;



import com.alibaba.fastjson.JSONObject;

public class asciiTest {

	
	public static String str="H4sIAAAAAAAAAF3SMUoDQRTG8avIq2dhvjez2ewcIpVWSYqFVVhw1RAtROxt9Qap0okHyHVCPIbzlX7NY/jzYPjBW7/ZNFpJ6D3Y0/3wYMUux8/zz+n3+3D++LJg8351M1vpgu32q5f6QrBxeB7q5npjHtHDY0ZOqeHYWPhXndW1ghVaI2uU6n3DoXXJutTasXZaF6wLrS1rqzWzZq20udqcNleb0+Zqc9pcbaANagNtUBtog9pAG9QG2qA20Aa1gTaoDbRBbaANagNtUFukLaot0harbcvTehynu9frab6tx8Sdpn4b85Wn0npBsvftH+NDcAqhAgAA";
	
    public static void test(final int[] args){
        if(args.length>1){
            args[0]=5;
        }
    }
	
    public static void main(String[] args) {

      // str="hello world";
    	String s=GZipUtils.deco(str);
    	

       // String str2 = GZipUtils.deco(((Map)JSONObject.parse(str)).get("data").toString());
    	
    	//int[] a={1,2,3};
    	//test(a);
    	
    	
        List<SectionBean> localList = JSONObject.parseArray(s, SectionBean.class);
        SectionWFBean localSectionWFBean = new SectionWFBean();
        localSectionWFBean.setWf("getName");
        localSectionWFBean.setSectionBeans(localList);
        ArrayList<SectionWFBean> localArrayList = new ArrayList<SectionWFBean>();
        localArrayList.add(localSectionWFBean);
    	
    	
        System.out.println(s);
    }


        //int[] a={1,2,3};
         
    //  args=a;//±‡“Î¥ÌŒÛ
     //   args={1,3};//≤ª‘ –Ì         
         
    
}
