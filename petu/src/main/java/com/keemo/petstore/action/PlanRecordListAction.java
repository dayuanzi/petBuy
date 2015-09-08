/**
 * 
 */
package com.keemo.petstore.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.Result;

import com.keemo.petstore.action.base.AdmBaseAction;
import com.keemo.petstore.bean.Imagmsg;
import com.keemo.petstore.bean.Planrecord;
/**
 * @author 打水的
 *
 */
public class PlanRecordListAction extends AdmBaseAction{

	
	final String PLAN_LIST = "planlist";
	public Integer planid;
	public List<Imagmsg> imagelist;
	public List<Imagmsg> videolist;
	public List<Planrecord> recordlist;
	
	
	/**
	 * @return the planid
	 */
	public Integer getPlanid() {
		return planid;
	}


	/**
	 * @param planid the planid to set
	 */
	public void setPlanid(Integer planid) {
		this.planid = planid;
	}


	/**
	 * @return the imagelist
	 */
	public List<Imagmsg> getImagelist() {
		return imagelist;
	}


	/**
	 * @param imagelist the imagelist to set
	 */
	public void setImagelist(List<Imagmsg> imagelist) {
		this.imagelist = imagelist;
	}


	/**
	 * @return the videolist
	 */
	public List<Imagmsg> getVideolist() {
		return videolist;
	}


	/**
	 * @param videolist the videolist to set
	 */
	public void setVideolist(List<Imagmsg> videolist) {
		this.videolist = videolist;
	}


	/**
	 * @return the recordlist
	 */
	public List<Planrecord> getRecordlist() {
		return recordlist;
	}


	/**
	 * @param recordlist the recordlist to set
	 */
	public void setRecordlist(List<Planrecord> recordlist) {
		this.recordlist = recordlist;
	}


	@Action(value = "PlanRecordListAction", 
				results = { 
				     @Result(name = "planlist", 
				    		 location = "/content/recordlist.jsp")})
	public String PlanRecordListAction() throws Exception{
		
		
		recordlist = adm.getRecordList(planid);
		imagelist = img.getPlanrecordImageList(planid, 1);
		videolist = img.getPlanrecordImageList(planid, 2);
		
		return PLAN_LIST;
	}
	
}
