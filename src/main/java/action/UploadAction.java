package action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.io.FileUtils;
import utils.Log4jUtil;

import java.io.File;
import java.io.IOException;

public class UploadAction extends ActionSupport {
    private File upload;  //文件实体
    private String uploadContentType; //文件类型
    private String uploadFileName;    //文件名

    public String getUploadFileName() {
        return uploadFileName;
    }

    public void setUploadFileName(String uploadFileName) {
        this.uploadFileName = uploadFileName;
    }

    public void setUpload(File upload) {
        this.upload = upload;
    }

    public void setUploadContentType(String uploadContentType) {
        this.uploadContentType = uploadContentType;
    }

    public File getUpload() {
        return upload;
    }

    public String getUploadContentType() {
        return uploadContentType;
    }

    @Override
    public String execute() throws IOException {
        System.out.println("文件上传action");
        System.out.println("文件类型：" + uploadContentType);
        System.out.println("文件名：" + uploadFileName);
        //完成文件上传
        FileUtils.copyFile(upload,new File("F:\\Files",uploadFileName));
        Log4jUtil.getLogger().info("进行文件的上传");
        return "success";
    }
}
