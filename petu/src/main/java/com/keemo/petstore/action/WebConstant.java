package com.keemo.petstore.action;


public interface WebConstant
{
	//首页页面单页显示单元的个数
	Integer admIndexPageSize = 10;
	//首页页面单页显示凡与计划单元的个数
	Integer admIndexPlanPageSize = 5;
	//未登录浏览页面单页显示单元的个数
	Integer admPageSize = 2;
	//未登录浏览猫舍列表页面单页显示单元的个数
	Integer admCatteryPageSize = 2;
	//猫舍详情页面猫咪列表显示单元个数
	Integer admCattDetCatPageSize = 2;
	//用户订单列表显示单元个数
	Integer memOrderPageSize = 2;
	//用户拥有猫咪列表的单元个数
	Integer memCatPageSize = 2;
	//用户拥有购物车列表的单元个数
	Integer memCartPageSize = 2;
	//用户拥有购物车列表的单元个数
	Integer memFollowedCatteryPageSize = 2;
	//默认价格区间最小值
    Double priceLow = 0.00;
    //默认价格区间最大值
	Double priceHigh = 1000000.00;
	
	
	
	
	String USR_LEVEL = "usr";
	//HttpSession里代表经理的level值
	String MGR_LEVEL = "mgr";
	//HttpSession里代表员工的level值
	String EMP_LEVEL = "emp";
	//HttpSession里代表用户级别的属性名
	String LEVEL = "level";
	//HttpSession里代表用户名的属性名
	String USER = "user";
}
