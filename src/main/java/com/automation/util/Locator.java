package com.automation.util;

import static com.automation.util.PropertiesFile.getObject;

public class Locator {
	public static final String SINGUP_FULLNAME = getObject("signup.fullname");
	public static final String SINGUP_COMPANYNAME = getObject("signup.companyname");
	public static final String SINGUP_EMAIL = getObject("signup.email");
	public static final String SINGUP_CONTACTL = getObject("signup.contact");
	public static final String SINGUP_PASSWORD = getObject("signup.password");
	public static final String SINGUP_IMNOTROBOT = getObject("signup.imnotrobot");
	public static final String SINGUP_SIGNUPBTN = getObject("signup.signupbtn");
}
