package com.keemo.petstore.bean;

import java.io.Serializable;


public class AttendType
	implements Serializable
{
	private static final long serialVersionUID = 48L;

	//标识属性
	private Integer id;
	//出勤类型的名称
	private String name;
	//此类出勤对应的罚款
	private double amerce;
	
	//无参数的构造器
	public AttendType()
	{
	}
	//初始化全部属性的构造器
	public AttendType(Integer id , String name , double amerce)
	{
		this.id = id;
		this.name = name;
		this.amerce = amerce;
	}

	//id属性的setter和getter方法
	public void setId(Integer id)
	{
		this.id = id;
	}
	public Integer getId()
	{
		return this.id;
	}

	//name属性的setter和getter方法
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}

	//amerce属性的setter和getter方法
	public void setAmerce(double amerce)
	{
		this.amerce = amerce;
	}
	public double getAmerce()
	{
		return this.amerce;
	}
}