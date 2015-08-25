package com.keemo.petstore.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.keemo.petstore.action.base.*;
import com.keemo.petstore.exception.*;
import com.opensymphony.xwork2.*;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.interceptor.*;
import com.keemo.petstore.bean.*;

import static com.keemo.petstore.service.MemManager.*;


public class MemberDetailAction
	extends MemBaseAction
{
	private final String MEM_DET = "memdetail";
	private final String MEM_ORD_LIST = "memordlist";
	private final String MEM_CAT_LIST = "memcatlist";
	private final String MEM_CART_LIST = "memcartlist";
	private final String MEM_CATT_LIST = "memcatterylist";
	private final String MEM_REGIS_CATT= "memregiscattery";
	private final String MEM_PLAN_LIST= "memplanlist";
	
	


	private Admin admin;
	private List<List<Cat>> ordercatslist;
	private List<List<Imagmsg>> ordercatsimagelist;
	private List<Cat> catlist;
	private List<List<Cart>> cartlist;
	private List<Cattery> catterylist;
	private Integer pageNumber;
	private Byte ispay;
	private List<Imagmsg> mainimage;
	private List<List<Imagmsg>> catterycatimagelist;
	private List<Imagmsg> owncatimagelist;
	private List<Breedingplan> planlist;
	private List<Imagmsg> imagelist_mom;
	private List<Imagmsg> imagelist_dad;
	
	
	
	/**
	 * @return the planlist
	 */
	public List<Breedingplan> getPlanlist() {
		return planlist;
	}
	/**
	 * @param planlist the planlist to set
	 */
	public void setPlanlist(List<Breedingplan> planlist) {
		this.planlist = planlist;
	}
	/**
	 * @return the imagelist_mom
	 */
	public List<Imagmsg> getImagelist_mom() {
		return imagelist_mom;
	}
	/**
	 * @param imagelist_mom the imagelist_mom to set
	 */
	public void setImagelist_mom(List<Imagmsg> imagelist_mom) {
		this.imagelist_mom = imagelist_mom;
	}
	/**
	 * @return the imagelist_dad
	 */
	public List<Imagmsg> getImagelist_dad() {
		return imagelist_dad;
	}
	/**
	 * @param imagelist_dad the imagelist_dad to set
	 */
	public void setImagelist_dad(List<Imagmsg> imagelist_dad) {
		this.imagelist_dad = imagelist_dad;
	}
	/**
	 * @return the ordercatsimagelist
	 */
	public List<List<Imagmsg>> getOrdercatsimagelist() {
		return ordercatsimagelist;
	}
	/**
	 * @param ordercatsimagelist the ordercatsimagelist to set
	 */
	public void setOrdercatsimagelist(List<List<Imagmsg>> ordercatsimagelist) {
		this.ordercatsimagelist = ordercatsimagelist;
	}
	/**
	 * @return the catterycatimagelist
	 */
	public List<List<Imagmsg>> getCatterycatimagelist() {
		return catterycatimagelist;
	}
	/**
	 * @param catterycatimagelist the catterycatimagelist to set
	 */
	public void setCatterycatimagelist(List<List<Imagmsg>> catterycatimagelist) {
		this.catterycatimagelist = catterycatimagelist;
	}
	/**
	 * @return the owncatimagelist
	 */
	public List<Imagmsg> getOwncatimagelist() {
		return owncatimagelist;
	}
	/**
	 * @param owncatimagelist the owncatimagelist to set
	 */
	public void setOwncatimagelist(List<Imagmsg> owncatimagelist) {
		this.owncatimagelist = owncatimagelist;
	}
	/**
	 * @return the ispay
	 */
	public Byte getIspay() {
		return ispay;
	}
	/**
	 * @return the mainimage
	 */
	public List<Imagmsg> getMainimage() {
		return mainimage;
	}
	/**
	 * @param mainimage the mainimage to set
	 */
	public void setMainimage(List<Imagmsg> mainimage) {
		this.mainimage = mainimage;
	}
	/**
	 * @param ispay the ispay to set
	 */
	public void setIspay(Byte ispay) {
		this.ispay = ispay;
	}
	/**
	 * @return the pageNumber
	 */
	public Integer getPageNumber() {
		return pageNumber;
	}
	/**
	 * @param pageNumber the pageNumber to set
	 */
	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}



	
	
	
	/**
	 * @return the ordercatslist
	 */
	public List<List<Cat>> getOrdercatslist() {
		return ordercatslist;
	}
	/**
	 * @param ordercatslist the ordercatslist to set
	 */
	public void setOrdercatslist(List<List<Cat>> ordercatslist) {
		this.ordercatslist = ordercatslist;
	}
	public void setCatlist(List<Cat> catlist)
	{
		this.catlist = catlist;
	}
	public List<Cat> getCatlist()
	{
		return this.catlist;
	}
	
	public void setCartlist(List<List<Cart>> cartlist)
	{
		this.cartlist = cartlist;
	}
	public List<List<Cart>> getCartlist()
	{
		return this.cartlist;
	}
	
	public void setCatterylist(List<Cattery> catterylist)
	{
		this.catterylist = catterylist;
	}
	public List<Cattery> getCatterylist()
	{
		return this.catterylist;
	}
	
	
	/**
	 * @return the admin
	 */
	public Admin getAdmin() {
		return admin;
	}
	/**
	 * @param admin the admin to set
	 */
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
    
	
	
	
	public String execute()
		throws Exception
	{

	/*	ActionContext ctx = ActionContext.getContext();
		String catIdStr = ((String[])ctx.getParameters().get("catId"))[0];
		Integer catId = Integer.valueOf(catIdStr);
		this.cat = adm.getCatById(catId);
		*/
		return MEM_DET;
	}
	
	
	 @Action(value = "MemOrderListAction",
				results = { @Result(name = "memordlist", 
						            location = "/WEB-INF/content/memordlistdiv.jsp")})
						            
	public String MemOrderListAction() throws Exception
	{
		ActionContext ctx = ActionContext.getContext();
		String userIdStr = ((String)ctx.getSession().get("userid"));		
		Integer userId = Integer.valueOf(userIdStr);
		Integer pageNo = (pageNumber-1) * WebConstant.memOrderPageSize;
		ordercatslist = mem.getOrdersbyUserid(pageNo, WebConstant.memOrderPageSize, userId, ispay);
		this.ordercatsimagelist = new ArrayList<List<Imagmsg>>();
		for(int i=0;i<ordercatslist.size();i++){
			List<Cat> ordercatlistmid =  ordercatslist.get(i);
			List<Imagmsg> imagemidlist = new ArrayList<Imagmsg>();
			
			for(int j=0;j<ordercatlistmid.size();j++){
				
				imagemidlist.add(img.getCatImagebyId(ordercatlistmid.get(j).getId())); 
			}
			
			ordercatsimagelist.add(imagemidlist);
		}
		
		return MEM_ORD_LIST;
		
	}
	

	 
 @Action(value = "MemOwnCatsAction",
			results = { @Result(name = "memcatlist", 
					            location = "/WEB-INF/content/memcatlistdiv.jsp")})
 
 
	public String MemOwnCatsAction() throws Exception{
		
		ActionContext ctx = ActionContext.getContext();
		String userIdStr = ((String)ctx.getSession().get("userid"));
		
		Integer userId = Integer.valueOf(userIdStr);
		Integer pageNo = (pageNumber-1) * WebConstant.memCatPageSize;
		catlist = mem.getOwnedCatsbyUserid(pageNo, WebConstant.memCatPageSize, userId);
		this.owncatimagelist = new ArrayList<Imagmsg>();
		try{
			for(int i=0;i<catlist.size();i++){
				
				this.owncatimagelist.add(img.getCatImagebyId(catlist.get(i).getId()));
			}
		}
		catch(Exception e){
			e.printStackTrace();
			throw e;
		}

		return MEM_CAT_LIST;
	}
	
	
 
    @Action(value = "MemCartAction",
			results = { @Result(name = "memcartlist", 
					            location = "/WEB-INF/content/memcartlistdiv.jsp")})
    public String MemCartAction() throws Exception
    {
		
		ActionContext ctx = ActionContext.getContext();
		String userIdStr = ((String)ctx.getSession().get("userid"));
		Integer userId = Integer.valueOf(userIdStr);

		Integer pageNo = (pageNumber-1) * WebConstant.memCartPageSize;
		try{
			cartlist = mem.getCartbyUserid(pageNo, WebConstant.memCartPageSize, userId);
		}
		catch (Exception e){
			e.printStackTrace();
			throw e;
		}
		
		return MEM_CART_LIST;
	}
    
    
    @Action(value = "MemFollowedAction",
			results = { @Result(name = "memcatterylist", 
					            location = "/WEB-INF/content/memcatterylistdiv.jsp")})
    public String MemFollowedAction() throws Exception{
		
		ActionContext ctx = ActionContext.getContext();
		String userIdStr = ((String)ctx.getSession().get("userid"));		
		Integer userId = Integer.valueOf(userIdStr);

		Integer pageNo = (pageNumber-1) * WebConstant.memFollowedCatteryPageSize;
		catterylist = mem.getFollowedCatterybyUserid(pageNo,  WebConstant.memFollowedCatteryPageSize, userId);
		this.catterycatimagelist = new ArrayList<List<Imagmsg>>();
		this.mainimage = new ArrayList<Imagmsg>();
		try{
			
        for(int i=0;i<catterylist.size();i++){
			
			List<Imagmsg> catteryImageList = new ArrayList<Imagmsg>();
			List<Cat> catteryCatsList = new ArrayList<Cat>();
			
			Integer catteryId = catterylist.get(i).getId();
			
			catteryCatsList = mem.getCatsbyCatteryId(catteryId);
			this.mainimage.add(img.getCatteryImagebyId(catteryId));
			for(int j=0;j<catteryCatsList.size()&&j<4;j++){
				
				catteryImageList.add(img.getCatImagebyId(catteryCatsList.get(j).getId()));
				
			}
			
			this.catterycatimagelist.add(catteryImageList);

		}
		}
		catch(Exception e){
			
			e.printStackTrace();
			throw e;
			
		}
		
		return MEM_CATT_LIST;
	}
    
    
    @Action(value = "MemPlanAction",
			results = { @Result(name = "memplanlist", 
					            location = "/WEB-INF/content/memplanlistdiv.jsp")})
					    		
	public String MemPlanAction()
		throws Exception
	{

		ActionContext ctx = ActionContext.getContext();
		
			this.imagelist_dad = new ArrayList<Imagmsg>();
			this.imagelist_mom = new ArrayList<Imagmsg>();
			String userIdStr = ((String)ctx.getSession().get("userid"));
		    Integer userId = Integer.valueOf(userIdStr);
		    Integer pageNo = (pageNumber-1) * WebConstant.memPlanPageSize;
			this.planlist = mem.getPlanListByUser(pageNo,WebConstant.memPlanPageSize,userId);

			for (int i = 0;i<planlist.size();i++){
				this.imagelist_mom.add(img.getParentcatImagebyId(planlist.get(i).getParentcatByMother().getId()));
				this.imagelist_dad.add(img.getParentcatImagebyId(planlist.get(i).getParentcatByFather().getId()));
				
			}
		
		return MEM_PLAN_LIST;
	}
    
    
    
    
    
    
	@Action(value = "MemRegisterAction",
			results = { @Result(name = "memregist", 
					            location = "/content/catdetail.jsp")})
	
    public String MemRegisterAction(){
    	
    	ActionContext ctx = ActionContext.getContext();
        if(admin.getNickname()!=null){
	        ctx.getSession().put("nickname", this.admin.getNickname());
        }
        if(admin.getSex()!=null){
	        ctx.getSession().put("sex", this.admin.getSex());
        }
        
        if(admin.getAddress()!=null){
	        ctx.getSession().put("address", this.admin.getAddress());
        }
        
        if(admin.getBirthday()!=null){
	        ctx.getSession().put("birthday", this.admin.getBirthday());
        }
        
        if(admin.getPhone()!=null){
	        ctx.getSession().put("phone", this.admin.getPhone());
        }
        
        if(admin.getEducation()!=null){
	        ctx.getSession().put("education", this.admin.getEducation());
        }
        
        if(admin.getSalary()!=null){
	        ctx.getSession().put("salary", this.admin.getSalary());
        }
        
        if(admin.getCompany()!=null){
	        ctx.getSession().put("company", this.admin.getCompany());
        }
        
        if(admin.getMarriage()!=null){
	        ctx.getSession().put("marriage", this.admin.getMarriage());
        }
        
        if(admin.getCatcount()!=null){
	        ctx.getSession().put("catcount", this.admin.getCatcount());
        }
        
        if(admin.getBuyreason()!=null){
	        ctx.getSession().put("buyreason", this.admin.getBuyreason());
        }
        
        if(admin.getSelfintroduce()!=null){
	        ctx.getSession().put("selfintroduce", this.admin.getSelfintroduce());
        }
        
        if(admin.getExperience()!=null){
	        ctx.getSession().put("experience", this.admin.getExperience());
        }
        
  
        
    	
    	return null;
    }
	
	
	@Action(value = "MemSubmitAction",
			results = { @Result(name = "memregist", 
					            location = "/content/catdetail.jsp")})
	
    public String MemSubmitAction() throws Exception{
    	
    	ActionContext ctx = ActionContext.getContext();
    	
    	Integer userid = Integer.valueOf((String)ctx.getSession().get("userid"));
    	
    	Admin adminNew = mem.getAdmin(userid);
  //    	Admin adminNew = new Admin();
    	String nickname = (String)ctx.getSession().get("nickname");
    	if(nickname!=null){
    		adminNew.setNickname(nickname);
    		System.out.println(nickname);
    	}
    	else{
    		
    		HttpServletResponse response = ServletActionContext.getResponse();
       		response.setContentType("text/json");
       		response.setStatus(200);
           	response.getWriter().write("failed");
           	return null;
           	
    	}
    	
    	Byte sex = (Byte)ctx.getSession().get("sex");
    	if(sex!=null){
    		adminNew.setSex(sex);
    		System.out.println(sex);
    	}
    	else{
    		HttpServletResponse response = ServletActionContext.getResponse();
       		response.setContentType("text/json");
       		response.setStatus(200);
           	response.getWriter().write("failed");
           	return null;
    		
    	}
    	String address = (String)ctx.getSession().get("address");
    	if(address!=null){
    		adminNew.setAddress(address);
    		System.out.println(address);
    	}
    	else{
    		
    		HttpServletResponse response = ServletActionContext.getResponse();
       		response.setContentType("text/json");
       		response.setStatus(200);
           	response.getWriter().write("failed");
           	return null;
    	}

    	Date birthday = (Date)ctx.getSession().get("birthday");
    	if(birthday!=null){
    		adminNew.setBirthday(birthday);
    		System.out.println(birthday);
    	}
    	else
    	{
    		
    		HttpServletResponse response = ServletActionContext.getResponse();
       		response.setContentType("text/json");
       		response.setStatus(200);
           	response.getWriter().write("failed");
           	return null;
    	}
    	
    	String phone = (String)ctx.getSession().get("phone");
    	if(phone!=null){
    		adminNew.setPhone(phone);
    		System.out.println(phone);
    	}
    	else{
    		HttpServletResponse response = ServletActionContext.getResponse();
       		response.setContentType("text/json");
       		response.setStatus(200);
           	response.getWriter().write("failed");
           	return null;
    		
    	}
    	
    	String education = (String)ctx.getSession().get("education");
    	if(education!=null){
    		adminNew.setEducation(education);
    		System.out.println(education);
    	}
    	else{
    		HttpServletResponse response = ServletActionContext.getResponse();
       		response.setContentType("text/json");
       		response.setStatus(200);
           	response.getWriter().write("failed");
           	return null;
    		
    	}
    	
    	String salary = (String)ctx.getSession().get("salary");
    	if(salary!=null){
    		adminNew.setSalary(salary);
    		System.out.println(salary);
    	}
    	else
    	{
    		HttpServletResponse response = ServletActionContext.getResponse();
       		response.setContentType("text/json");
       		response.setStatus(200);
           	response.getWriter().write("failed");
           	return null;
    		
    	}
    	
    	String company = (String)ctx.getSession().get("company");
    	if(company!=null){
    		adminNew.setCompany(company);
    		System.out.println(company);
    	}
    	else{
    		HttpServletResponse response = ServletActionContext.getResponse();
       		response.setContentType("text/json");
       		response.setStatus(200);
           	response.getWriter().write("failed");
           	return null;
    		
    	}
    
    	Byte marriage = (Byte)ctx.getSession().get("marriage");
    	if(marriage!=null){
    		adminNew.setMarriage(marriage);
    		System.out.println(marriage);
    	}
    	else
    	{
    		HttpServletResponse response = ServletActionContext.getResponse();
       		response.setContentType("text/json");
       		response.setStatus(200);
           	response.getWriter().write("failed");
           	return null;
    	}
    	
    	
    	Byte experience = (Byte)ctx.getSession().get("experience");
    	if(experience!=null){
    		adminNew.setExperience(experience);
    		System.out.println(experience);
    	}
    	else{
    		HttpServletResponse response = ServletActionContext.getResponse();
       		response.setContentType("text/json");
       		response.setStatus(200);
           	response.getWriter().write("failed");
           	return null;
    	}
    	
    	
    	Integer catcount = (Integer)ctx.getSession().get("catcount");
    	if(company!=null){
    		adminNew.setCatcount(catcount);
    		System.out.println(catcount);
    	}
    	else{
    		HttpServletResponse response = ServletActionContext.getResponse();
       		response.setContentType("text/json");
       		response.setStatus(200);
           	response.getWriter().write("failed");
           	return null;
    	}
    	
    	String buyreason = (String)ctx.getSession().get("buyreason");
    	if(buyreason!=null){
    		adminNew.setBuyreason(buyreason);
    		System.out.println(buyreason);
    	}
    	else
    	{
    		HttpServletResponse response = ServletActionContext.getResponse();
       		response.setContentType("text/json");
       		response.setStatus(200);
           	response.getWriter().write("failed");
           	return null;
    	}
    	
    	
    	String selfintroduce = (String)ctx.getSession().get("selfintroduce");
    	if(selfintroduce!=null){
    		adminNew.setSelfintroduce(selfintroduce);
    		System.out.println(selfintroduce);
    	}
    	else
    	{
    		HttpServletResponse response = ServletActionContext.getResponse();
       		response.setContentType("text/json");
       		response.setStatus(200);
           	response.getWriter().write("failed");
           	return null;
    	}
    
    	try{
        mem.updateAdmin(adminNew);
    	HttpServletResponse response = ServletActionContext.getResponse();
   		response.setContentType("text/json");
   		response.setStatus(200);
       	response.getWriter().write("success");
    	}
    	catch(Exception e){
        	HttpServletResponse response = ServletActionContext.getResponse();
       		response.setContentType("text/json");
       		response.setStatus(200);
           	response.getWriter().write("failed");
    		e.printStackTrace();
    		return null;
    	//	throw e;
    	}

    	return null;
    }
	
}