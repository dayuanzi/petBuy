/**
 * 
 */
package com.petu.webapp.util;

import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


 
public class UtilSupport {
	private Md5PasswordEncoder pwEncoder;

	
	public String encodePassword(String password, String salt) {
		// TODO Auto-generated method stub

		pwEncoder = new Md5PasswordEncoder();
		pwEncoder.setEncodeHashAsBase64(true);
		return pwEncoder.encodePassword(password, salt);
	}

	/**
	 * @return the pwEncoder
	 */
	public Md5PasswordEncoder getPwdEncoder() {
		return pwEncoder;
	}

	/**
	 * @param pwEncoder
	 *            the pwdEncoder to set
	 */
	public void setPwdEncoder(Md5PasswordEncoder pwEncoder) {
		this.pwEncoder = pwEncoder;
	}
}
