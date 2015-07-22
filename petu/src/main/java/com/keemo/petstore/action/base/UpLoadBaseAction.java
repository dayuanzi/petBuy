package com.keemo.petstore.action.base;



import java.io.File;  
import java.io.IOException;  
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;  
import org.apache.commons.io.FileUtils;  
import org.apache.struts2.ServletActionContext;  

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;  
public class UpLoadBaseAction extends ActionSupport {  
private static final long serialVersionUID = 1L;
    // 上传多个文件的集合文本  
    private String imageType;
    private List<File> upload;  
    // /多个上传文件的类型集合  
    private List<String> uploadContentType;  
   // 多个上传文件的文件名集合  
    private List<String> uploadFileName;  
  
    private String userid;
    
    
    public String getImageType() {
            return imageType;  
     }  
  
    public void setImageType(String imageType) {  
  
       this.imageType = imageType;  
    }  
  
    public List<File> getUpload() {  
  
       return upload;  
    }  
  
    public void setUpload(List<File> upload) {  
  
       this.upload = upload;  
    }  
  
    public List<String> getUploadContentType() {  
  
       return uploadContentType;  
    }  
  
    public void setUploadContentType(List<String> uploadContentType) {  
  
       this.uploadContentType = uploadContentType;  
    }  
  
    public List<String> getUploadFileName() {  
  
       return uploadFileName;  
    }  
  
    public void setUploadFileName(List<String> uploadFileName) {  
  
       this.uploadFileName = uploadFileName;  
    }  
  
    public String upLoad() {  
  
       // 把上传的文件放到指定的路径下  
    	


       String path =null;
       switch(Integer.valueOf(imageType)){
       
           case 1: path = ServletActionContext.getServletContext().getRealPath("/WEB-INF/uploadList");
             
       }
    	
       // 写到指定的路径中  
  
       File file = new File(path);  
  
       // 如果指定的路径没有就创建  
  
       if (!file.exists()) {  
           file.mkdirs();  
       }  
  
       // 把得到的文件的集合通过循环的方式读取并放在指定的路径下  
  
       for (int i = 0; i < upload.size(); i++) {  

            
            
            try {
				FileUtils.copyFile(upload.get(i), new File(file,reName(uploadFileName.get(i),i)));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
      
       }  
  
       return SUCCESS;  
    }  
    
    
    String reName(String oldName,Integer index){
    	
    	ActionContext ctx = ActionContext.getContext();
    	userid = (String) ctx.getSession().get("userid");
    	DateFormat formatDate = new SimpleDateFormat("yyyyMMddhhmmss");
        String  formatDateStr = formatDate.format(new Date());
    	String[] picfo = oldName.split("\\.");
    	return userid+formatDateStr+String.valueOf(index)+"."+picfo[picfo.length-1];
    	
    
    	
    }
}  