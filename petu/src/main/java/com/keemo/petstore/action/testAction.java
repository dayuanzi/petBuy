/**
 * 
 */
package com.keemo.petstore.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.Result;

import com.keemo.petstore.service.AdmManager;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author 打水的
 *
 */
public class testAction extends ActionSupport{

	
	AdmManager adm;
	
	/**
	 * @return the adm
	 */
	public AdmManager getAdmManager() {
		return adm;
	}

	/**
	 * @param adm the adm to set
	 */
	public void setAdmManager(AdmManager adm) {
		this.adm = adm;
	}

	@Action(value = "textAction",
			results = { @Result(name = "success", 
					            location = "/login.jsp")})
	String excute(){
		
		System.out.println(111);
		adm.getCatById(1);
		System.out.println(222);
		adm.getCatteryById(1);
		System.out.println(333);
		return "success";
		
	}
	
	
}
