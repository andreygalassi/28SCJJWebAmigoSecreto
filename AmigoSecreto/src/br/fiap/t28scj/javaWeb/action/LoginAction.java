package br.fiap.t28scj.javaWeb.action;

import java.util.Map;

import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

@Results({ 
	@Result(name = "ok", location = "/menu.jsp"), 
	@Result(name = "erro", location = "/login.jsp"),
	@Result(name = "cadastro", location = "/cadUsuario.jsp")
})
public class LoginAction extends ActionSupport implements SessionAware{  
	private String name,password;  
	private SessionMap<String,Object> sessionMap;  
	
	@Override  
	public void setSession(Map<String, Object> map) {  
	    sessionMap=(SessionMap)map;  
	}  
	  
	public String execute(){  
		System.out.println(sessionMap.values());
		if(password.equals("admin")){  
		    sessionMap.put("login","true");  
		    sessionMap.put("name",name);  
		      
		    return "ok";  
		}  
		else{  
		    return "erro";  
		}  
	}  
	  
	public String logout(){  
	    if(sessionMap!=null){  
	        sessionMap.invalidate();  
	    }  
	    return "erro";  
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public SessionMap<String, Object> getSessionMap() {
		return sessionMap;
	}

	public void setSessionMap(SessionMap<String, Object> sessionMap) {
		this.sessionMap = sessionMap;
	}  
	  
}  