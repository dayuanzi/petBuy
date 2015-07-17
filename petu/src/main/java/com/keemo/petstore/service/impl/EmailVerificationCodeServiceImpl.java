package com.keemo.petstore.service.impl;

import java.io.IOException;
import java.net.UnknownHostException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keemo.petstore.util.MailMessage;
import com.keemo.petstore.util.SendEmail;
import com.keemo.petstore.dao.AdminDao;
import com.keemo.petstore.bean.Activericode;
import com.keemo.petstore.bean.Admin;
import com.keemo.petstore.service.EmailVerificationCodeService;

public class EmailVerificationCodeServiceImpl implements EmailVerificationCodeService {
	/**
	 * 通过spring的IoC注入UserDAO的一个实例
	 */
	
	private AdminDao adminDao;

	/**
	 * 发送邮件的一个实体
	 */
	private SendEmail sendEmail;

	public Admin getByEmailAndPassword(String email, String password) {

		return getAdminDao().getByEmailAndPassword(email, password);
	}
	
	public Admin getByEmailAndPassword(String email, String password, int active) {
		return getAdminDao().getByEmailAndPassword(email, password, active);
	}

	public Admin getById(int id) {
		return getAdminDao().get(id);
	}

	public SendEmail getSendEmail() {
		return sendEmail;
	}

	public Integer save(Admin admin) {
		return getAdminDao().save(admin);
	}

	public void setEmailVerificationCodeDAO(AdminDao adminDao) {
		this.adminDao = adminDao;
	}

	public void setSendEmail(SendEmail sendEmail) {
		this.sendEmail = sendEmail;
	}

	public void updateActive(Admin emailverificationcode) {
		getAdminDao().update(emailverificationcode);
	}

	/**
	 * 激活邮箱
	 */
	public void sendEmail(String toMail, String subject, String content) {
		String server = EmailVerificationCodeService.SERVER_MAIL;// 邮件服务器
		int port = EmailVerificationCodeService.PORT;// 邮件服务器端口
		MailMessage message = new MailMessage();
		message.setFrom(EmailVerificationCodeService.FROM_MAIL);// 发件人
		message.setTo(toMail);// 收件人

		message.setSubject(subject);// 邮件主题
		message.setContent(content);// 邮件内容
		message.setDatafrom(EmailVerificationCodeService.DATAFROM_MAIL);// 发件人，在邮件的发件人栏目中显示
		message.setDatato(toMail);// 收件人，在邮件的收件人栏目中显示
		message.setUser(EmailVerificationCodeService.USER_MAIL);// 登陆邮箱的用户名
		message.setPassword(EmailVerificationCodeService.PASSWORD_MAIL);// 登陆邮箱的密码

		
		try {
			sendEmail = new SendEmail(server, port);
			boolean flag;
			flag = sendEmail.sendMail(message, server);
			if (flag) {
				System.out.println("邮件发送成功！");
			} else {
				System.out.println("邮件发送失败！");
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	

	// 定义获取随机字符串方法
	public String getRandomChar() {
		// 生成一个0、1、2的随机数字
		int rand = (int) Math.round(Math.random() * 2);
		long itmp = 0;
		char ctmp = '\u0000';
		switch (rand) {
		// 生成大写字母
		case 1:
			itmp = Math.round(Math.random() * 25 + 65);
			ctmp = (char) itmp;
			return String.valueOf(ctmp);
			// 生成小写字母
		case 2:
			itmp = Math.round(Math.random() * 25 + 97);
			ctmp = (char) itmp;
			return String.valueOf(ctmp);
			// 生成数字
		default:
			itmp = Math.round(Math.random() * 9);
			return itmp + "";
		}
	}
	
	
	// 定义获取随机字符串方法
	public String getRandomString() {
	
		String random = "";
		for(int i=0;i<5;i++){
			
			random+=getRandomChar();
			
		}
		return random;
		
	}
	
	
	
	

	public AdminDao getAdminDao() {
		return adminDao;
	}

	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}
}
