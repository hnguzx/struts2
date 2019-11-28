import org.junit.Test;
import utils.Md5Util;

public class Demo {
    @Test
    public void t(){
        System.out.println("运行测试！");
    }

    @Test
    public void md5Test(){
        String string = "你好";
         Md5Util.byteArrayToHexString(string.getBytes());
    }
}
