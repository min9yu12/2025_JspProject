package ch13;

public class FileloadBean {
	
	private int num;
	private String upFile;
	private int size;
	
	public FileloadBean() {
	};
	
	public FileloadBean(int num, String upFile, int size) {
		this.num = num;
		this.upFile = upFile;
		this.size = size;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getUpFile() {
		return upFile;
	}
	public void setUpFile(String upFile) {
		this.upFile = upFile;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
}
