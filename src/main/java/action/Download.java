package action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import utils.Log4jUtil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

public class Download extends ActionSupport {

    private String filename;

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getContentType(){
        String mimeType = ServletActionContext.getServletContext().getMimeType(filename);
        return mimeType;
    }

//    public String getDowaloadFileName(){
//
//        reutn ;
//    }

    @Override
    public String execute() throws Exception {
        Log4jUtil.getLogger().info("进行下载");
        return SUCCESS;
    }

    public InputStream getInputStream() throws FileNotFoundException, UnsupportedEncodingException {
        filename = new String(filename.getBytes("iso8859-1"), "utf-8"); //解决文件名中文问题
        FileInputStream inputStream = new FileInputStream("F:\\Files\\" + filename);
        return inputStream;
    }
}
