/**
 * 
 */
/**
 * @author wang
 *
 */
package com.wang.exception;

public class BaseException extends Exception{

	
	private String errorCode;
	
	private String errorMsg;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4578252713502988222L;

	public BaseException(String errorCode, String errorMsg) {
		super();
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
		System.out.println("±¨´í---------------->" + errorCode + "      " + errorMsg);
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	
}