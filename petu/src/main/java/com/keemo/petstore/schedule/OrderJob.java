/**
 * 
 */
package com.keemo.petstore.schedule;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import com.keemo.petstore.service.MemManager;

/**
 * @author 打水的
 *
 */
public class OrderJob extends QuartzJobBean {

	
	
	/* (non-Javadoc)
	 * @see org.springframework.scheduling.quartz.QuartzJobBean#executeInternal(org.quartz.JobExecutionContext)
	 */
	
	private MemManager memManager;
	/**
	 * @return the memManager
	 */
	public MemManager getMemManager() {
		return memManager;
	}
	/**
	 * @param memManager the memManager to set
	 */
	public void setMemManager(MemManager memManager) {
		this.memManager = memManager;
	}
	@Override
	protected void executeInternal(JobExecutionContext arg0)
			throws JobExecutionException {
		// TODO Auto-generated method stub
		System.out.println("执行了调度器");
	}

}
