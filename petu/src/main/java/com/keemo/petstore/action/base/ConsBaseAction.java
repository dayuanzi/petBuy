/**
 * 
 */
package com.keemo.petstore.action.base;

import com.keemo.petstore.service.ConsManager;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author 打水的
 *
 */
public class ConsBaseAction extends ActionSupport
{

	protected ConsManager cons;

	/**
	 * @return the cons
	 */
	public ConsManager getConsManager() {
		return cons;
	}

	/**
	 * @param cons the cons to set
	 */
	public void setConsManager(ConsManager cons) {
		this.cons = cons;
	}
	
	
	
	
	
}
