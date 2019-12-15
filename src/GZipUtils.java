import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;



public class GZipUtils {
	  public static final int BUFFER = 1024;
	    public static final String EXT = ".gz";

	    public static void compress(File paramFile)
	            throws Exception
	    {
	        compress(paramFile, true);
	    }

	    public static void compress(File paramFile, boolean paramBoolean)
	            throws Exception
	    {
	        FileInputStream localFileInputStream = new FileInputStream(paramFile);
	        Object localObject = new StringBuilder();
	        ((StringBuilder)localObject).append(paramFile.getPath());
	        ((StringBuilder)localObject).append(".gz");
	        localObject = new FileOutputStream(((StringBuilder)localObject).toString());
	        compress(localFileInputStream, (OutputStream)localObject);
	        localFileInputStream.close();
	        ((FileOutputStream)localObject).flush();
	        ((FileOutputStream)localObject).close();
	        if (paramBoolean) {
	            paramFile.delete();
	        }
	    }

	    public static void compress(InputStream paramInputStream, OutputStream paramOutputStream)
	            throws IOException
	    {
	        paramOutputStream = new GZIPOutputStream(paramOutputStream);
	        byte[] arrayOfByte = new byte['?'];
	        for (;;)
	        {
	            int i = paramInputStream.read(arrayOfByte, 0, 1024);
	            if (i == -1) {
	                break;
	            }
	            paramOutputStream.write(arrayOfByte, 0, i);
	        }
	        ((GZIPOutputStream) paramOutputStream).finish();
	        paramOutputStream.flush();
	        paramOutputStream.close();
	    }

	    public static void compress(String paramString)
	            throws Exception
	    {
	        compress(paramString, true);
	    }

	    public static void compress(String paramString, boolean paramBoolean)
	            throws Exception
	    {
	        compress(new File(paramString), paramBoolean);
	    }

	    public static byte[] compress(byte[] paramArrayOfByte)
	            throws IOException
	    {
	        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(paramArrayOfByte);
	        ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
	        compress(byteArrayInputStream, localByteArrayOutputStream);
	        byte[] arrayOfByte = localByteArrayOutputStream.toByteArray();
	        localByteArrayOutputStream.flush();
	        localByteArrayOutputStream.close();
	        byteArrayInputStream.close();
	        return arrayOfByte;
	    }

	    public static String deco(String paramString)
	    {

	        try
	        {
	            if (paramString.contains("无法找到资源"))
	            {
	                //Log.d("deco", "无法找到资源");
	                return "";
	            }
	          byte[] bt3=Base64Utils.decode(paramString);
	          String  paramString2 = new String(decompress(bt3));
	           String str=paramString2;
	            return paramString2;
	        }
	        catch (Exception e)
	        {
	            e.printStackTrace();
	        }
	        return "";
	    }

	    public static void decompress(File paramFile)
	            throws Exception
	    {
	        decompress(paramFile, true);
	    }

	    public static void decompress(File paramFile, boolean paramBoolean)
	            throws Exception
	    {
	        FileInputStream localFileInputStream = new FileInputStream(paramFile);
	        FileOutputStream localFileOutputStream = new FileOutputStream(paramFile.getPath().replace(".gz", ""));
	        decompress(localFileInputStream, localFileOutputStream);
	        localFileInputStream.close();
	        localFileOutputStream.flush();
	        localFileOutputStream.close();
	        if (paramBoolean) {
	            paramFile.delete();
	        }
	    }

	    public static void decompress(InputStream paramInputStream, OutputStream paramOutputStream)
	            throws IOException
	    {
	        GZIPInputStream gzipInput = new GZIPInputStream(paramInputStream);
	        byte[] arrayOfByte = new byte[1024];
	        for (;;)
	        {
	            int i = gzipInput.read(arrayOfByte, 0, 1024);
	            if (i == -1) {
	                break;
	            }
	            paramOutputStream.write(arrayOfByte, 0, i);
	        }
	        gzipInput.close();
	    }



	    public static void decompress(String paramString)
	            throws Exception
	    {
	        decompress(paramString, true);
	    }

	    public static void decompress(String paramString, boolean paramBoolean)
	            throws Exception
	    {
	        decompress(new File(paramString), paramBoolean);
	    }

	    public static byte[] decompress(byte[] paramArrayOfByte)
	            throws IOException
	    {
	        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(paramArrayOfByte);
	        ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
	        decompress(byteArrayInputStream, localByteArrayOutputStream);
	        byte[] arrayOfByte = localByteArrayOutputStream.toByteArray();
	        localByteArrayOutputStream.flush();
	        localByteArrayOutputStream.close();
	        byteArrayInputStream.close();
	        return arrayOfByte;
	    }
}
