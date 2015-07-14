/**
 * 
 */
package com.petu.webapp.util;

import org.springframework.security.authentication.encoding.Md5PasswordEncoder;

public class Util {

	public static String encodePassword(String password, String salt) {

		Md5PasswordEncoder pwEncoder;
		pwEncoder = new Md5PasswordEncoder();
		pwEncoder.setEncodeHashAsBase64(true);
		return pwEncoder.encodePassword(password, salt);
	}

}
