package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import bean.TBean;

public class RegisterNewUser {
	
	private String ip;
	private String credential;
	private String name ="unknown";
	private Object user = "Unkown";
	public Object checkRegisterRequest(String ip,String credential,String name){
		if (credential ==  null || credential.equals("")){
			return "Reject";
		}
		
		if (ip == null ||ip.equals("")){
			throw new RuntimeException(":<<exception>>");
		}
		
		return "OK";
	}
	
	public Object regResult(){
		if (credential ==  null || credential.equals("")){
			return "Reject";
		}
		if (ip == null ||ip.equals("")){
			throw new RuntimeException("message<<exception>>");
		}
		
		return "OK";
	}

	
	public Object executeRegister(String ip,String credential,String name){
		return null;
	}
	
	public void setIp(String ip){
		this.ip = ip;
	}
	
	public void setCredential(String cre){
		this.credential = cre;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public Object name(){
		List<String> ss = new ArrayList<String>();
		ss.add("aaa");
		return ss;
	}
	
	public Object queryUserByIp(String ip){
		
		QueryWrapper q = new QueryWrapper("ip","name");
		q.addRow("192.168.1.1","Jennifer");
		q.addRow("192.168.1.1","Unkown");
		
		return q;
		
	}
	
	public Object getUser(){
		TBean bean = new TBean();
		bean.setId("bean1");
		bean.setName("Steven");
		return bean ;
	}
	
	
	public RegisterNewUser getThis(){
		return this;
	}
	public  int[] list(int ... a){
		return new int[]{1,2};
	}

}
