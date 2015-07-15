
package com.keemo.petstore.util;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.security.crypto.password.PasswordEncoder;


public class PasswordEncodeAspect {
	private PasswordEncoder encoder;

	public String encodePassword(ProceedingJoinPoint pjp) throws Throwable {
        Object output = pjp.proceed();
        System.out.println(output);
        String r= encoder.encode((String)output);
        System.out.println(r);
        return r;
    }

	/**
	 * @return the encoder
	 */
	public PasswordEncoder getEncoder() {
		return encoder;
	}

	/**
	 * @param encoder the encoder to set
	 */
	public void setEncoder(PasswordEncoder encoder) {
		this.encoder = encoder;
	}

}
