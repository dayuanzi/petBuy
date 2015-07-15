package com.keemo.petstore.service;


import com.keemo.petstore.bean.Admin;


public interface EmailVerificationCodeService {
	// 发件人
	static final String FROM_MAIL = "keemo_miao@163.com";
	// 邮件服务器
	static final String SERVER_MAIL = "smtp.163.com";
	// 邮件服务器端口
	static final int PORT = 25;
	// 邮件主题
	static final String SUBJECT_MAIL_ACTIVE = "激活邮件";
	// 邮件主题
	static final String SUBJECT_MAIL_GETVERIFICATIONCODE = "获取验证码";
	// 发件人，在邮件的发件人栏目中显示
	static final String DATAFROM_MAIL = FROM_MAIL;
	// 登陆邮箱的用户名
	static final String USER_MAIL = "keemo_miao@163.com";
	// 登陆邮箱的密码
	static final String PASSWORD_MAIL = "keemo123";

	/**
	 * 保存一条记录
	 * 
	 * @param user  需要被持久化的user实例
	 *           
	 */
	public void save(Admin user);

	/**
	 * 根据id值获取一条记录
	 * 
	 * @param id  需要获取记录的id值
	 *           
	 * @return 对应id值的一条记录
	 */
	public Admin getById(int id);

	/**
	 * 根据email，password获取一条记录
	 * 
	 * @param email 电子邮箱
	 *            
	 * @param password 密码
	 *             
	 * @return 根据email，password返回相应值的一条记录
	 */
	public Admin getByEmailAndPassword(String email, String password);

	/**
	 * 根据email，password，active获取一条记录
	 * 
	 * @param email 电子邮箱
	 *            
	 * @param password  密码
	 *            
	 * @param active  激活状态
	 * @return 根据email，password，active返回相应值的一条记录
	 */
	public Admin getByEmailAndPassword(String email, String password, int active);

	/**
	 * 根据id激活对应的email，active默认为0，激活状态为1
	 * 
	 * @param user  user一个实例
	 *           
	 * @return 返回时候激活成功
	 */
	public void updateActive(Admin user);

	/**
	 * 发送激活邮件
	 * 
	 * @param toMail 收件人邮箱
	 * @param subject 主题
	 * @param content  内容
	 * 
	 */
	public void sendEmail(String toMail, String subject, String content);

	/**
	 * 定义获取随机字符串方法
	 * 
	 * @return 返回一个随机字符串
	 */
	public String getRandomChar();
}
