package com.keemo.petstore.bean;

import java.io.Serializable;
import java.util.*;


public class Manager
	extends Employee implements Serializable
{
	private static final long serialVersionUID = 48L;
	//�þ������Ĳ���
	private String dept;
	//�þ����Ӧ������Ա��
	private Set<Employee> employees = new HashSet<Employee>();
	//�þ���ǩ�����������
	private Set<CheckBack> checks = new HashSet<CheckBack>();


	//�޲����Ĺ�����
	public Manager()
	{
	}
	//��ʼ��ȫ�����ԵĹ�����
	public Manager(String dept , Set<Employee> employees 
		, Set<CheckBack> checks)
	{
		this.dept = dept;
		this.employees = employees;
		this.checks = checks;
	}

	//dept���Ե�setter��getter����
	public void setDept(String dept)
	{
		this.dept = dept;
	}
	public String getDept()
	{
		return this.dept;
	}

	//employees���Ե�setter��getter����
	public void setEmployees(Set<Employee> employees)
	{
		this.employees = employees;
	}
	public Set<Employee> getEmployees()
	{
		return this.employees;
	}

	//checks���Ե�setter��getter����
	public void setChecks(Set<CheckBack> checks)
	{
		this.checks = checks;
	}
	public Set<CheckBack> getChecks()
	{
		return this.checks;
	}
}