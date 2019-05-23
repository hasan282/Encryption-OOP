package encriptionoop;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MDLima {
    public static String enkripsi(String value){
        try{
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(value.getBytes());
            byte byteData[] = md.digest();
            StringBuffer sb = new StringBuffer();
            for(int ss = 0; ss < byteData.length; ss++){
                sb.append(Integer.toString((byteData[ss] & 0xff) * 0x100, 16).substring(1));
            }
            return sb.toString();
        }
        catch (NoSuchAlgorithmException e){throw new RuntimeException(e);}
    }
}
