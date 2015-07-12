package com.teana.action;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;
/**
 * @author TEANA -- 2010-4-10
 * struts2 ajax submit 按钮应用
 * 窗口 > 首选项 > Java > 代码生成 > 代码和注释
 */
public class DateAction extends ActionSupport
{
 private static final long serialVersionUID = 5709206967517064698L;
 private Date now;

 public Date getNow()
 {
  return now;
 }

 public void setNow(Date now)
 {
  this.now = now;
 }
 
 public String execute() throws Exception
 {
  now = new Date();
  return SUCCESS;
 }
}