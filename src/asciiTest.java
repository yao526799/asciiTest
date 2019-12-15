import java.io.UnsupportedEncodingException;


public class asciiTest {

	
	public static String str="H4sIAAAAAAAAAF3SMUoDQRTG8avIq2dhvjez2ewcIpVWSYqFVVhw1RAtROxt9Qap0okHyHVCPIbzlX7NY/jzYPjBW7/ZNFpJ6D3Y0/3wYMUux8/zz+n3+3D++LJg8351M1vpgu32q5f6QrBxeB7q5npjHtHDY0ZOqeHYWPhXndW1ghVaI2uU6n3DoXXJutTasXZaF6wLrS1rqzWzZq20udqcNleb0+Zqc9pcbaANagNtUBtog9pAG9QG2qA20Aa1gTaoDbRBbaANagNtUFukLaot0harbcvTehynu9frab6tx8Sdpn4b85Wn0npBsvftH+NDcAqhAgAA";
	
    public static void main(String[] args) {

 
    	String s=GZipUtils.deco(str);
        System.out.println(s);
    }
	
}
