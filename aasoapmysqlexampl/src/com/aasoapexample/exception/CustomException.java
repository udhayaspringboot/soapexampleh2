package com.aasoapexample.exception;

public class CustomException extends Exception{
	
	private String errorDetail;

	public CustomException(String reason,String errorDetail) {
		super(reason);
		this.errorDetail = errorDetail;
	}
	public String getFaultInfo()
	{
		return errorDetail;
	}

}
