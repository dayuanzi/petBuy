package com.keemo.petstore.bean;

import java.io.Serializable;


public class AttendType
	implements Serializable
{
	private static final long serialVersionUID = 48L;

	//��ʶ����
	private Integer id;
	//�������͵�����
	private String name;
	//������ڶ�Ӧ�ķ���
	private double amerce;
	
	//�޲����Ĺ�����
	public AttendType()
	{
	}
	//��ʼ��ȫ�����ԵĹ�����
	public AttendType(Integer id , String name , double amerce)
	{
		this.id = id;
		this.name = name;
		this.amerce = amerce;
	}

	//id���Ե�setter��getter����
	public void setId(Integer id)
	{
		this.id = id;
	}
	public Integer getId()
	{
		return this.id;
	}

	//name���Ե�setter��getter����
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}

	//amerce���Ե�setter��getter����
	public void setAmerce(double amerce)
	{
		this.amerce = amerce;
	}
	public double getAmerce()
	{
		return this.amerce;
	}
}