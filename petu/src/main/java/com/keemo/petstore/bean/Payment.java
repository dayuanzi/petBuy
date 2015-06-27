package com.keemo.petstore.bean;

import java.io.Serializable;
import java.sql.Date;


public class Payment
	implements Serializable
{
	private static final long serialVersionUID = 48L;
	//��ʶ����
	private Integer id;
	private String payMonth;
	//��н������
	private double amount;
	//��н��Ա��
	private Employee employee;
	
	//�޲����Ĺ�����
	public Payment()
	{
	}
	//��ʼ��ȫ�����ԵĹ�����
	public Payment(Integer id , String payMonth , 
		double amount , Employee employee)
	{
		this.id = id;
		this.payMonth = payMonth;
		this.amount = amount;
		this.employee = employee;
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

	//payMonth���Ե�setter��getter����
	public void setPayMonth(String payMonth)
	{
		this.payMonth = payMonth;
	}
	public String getPayMonth()
	{
		return this.payMonth;
	}

	//amount���Ե�setter��getter����
	public void setAmount(double amount)
	{
		this.amount = amount;
	}
	public double getAmount()
	{
		return this.amount;
	}

	//employee���Ե�setter��getter����
	public void setEmployee(Employee employee)
	{
		this.employee = employee;
	}
	public Employee getEmployee()
	{
		return this.employee;
	}
}