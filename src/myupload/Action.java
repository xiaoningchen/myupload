package myupload;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class Action extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private File file;
	private String fileContentType;
	private String fileFileName;
	private String desc;

	private FileOutputStream out;

	private FileInputStream in;
	
	
	public File getFile() {
		return file;
	}


	public void setFile(File file) {
		this.file = file;
	}


	public String getFileContentType() {
		return fileContentType;
	}


	public void setFileContentType(String fileContentType) {
		this.fileContentType = fileContentType;
	}


	public String getFileFileName() {
		return fileFileName;
	}


	public void setFileFileName(String fileFileName) {
		this.fileFileName = fileFileName;
	}


	public String getDesc() {
		return desc;
	}


	public void setDesc(String desc) {
		this.desc = desc;
	}


	public String upload() throws Exception {
		System.out.println(file);
		System.out.println(fileContentType);
		System.out.println(fileFileName);
		ServletContext context = ServletActionContext.getServletContext();
		String dir = context.getRealPath("/files/"+fileFileName);
		System.out.println("~~"+dir);
		out = new FileOutputStream(dir);
		in = new FileInputStream(file);
		byte [] buffer = new byte[1024];
		int len = 0;
		while((len = in.read(buffer)) != -1){
			out.write(buffer,0,len);
		}
		out.close();
		in.close();
		return SUCCESS;
	}

}
