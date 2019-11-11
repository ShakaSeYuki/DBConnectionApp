package app.connection.db;

import java.io.Serializable;

public class FormTest implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private  String method;
	private  String msg;
	private  String memo;
	
	public FormTest(String method, String msg, String memo) {
		this.method = method;
		this.msg = msg;
		this.memo = memo;
	}
	
	public String getMethod() {
		return method;
	}
	public void setMEthod(String method) {
		this.method = method;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
}
