package org.dnyanyog.enumm;

public enum ResponseCode {
	LOGIN_SUCCESS("Success","Login Successful"),
	LOGIN_FAIL("Fail","Login Failed"),
	USER_FOUND("Success","User added Successfuly"),
	USER_SEARCH("Success","User Found Successfully"),
	USER_NOT_FOUND("Fail","User Not Found"),
	USER_DELETE("Success","User DeleteD Successfully"),
	USER_UPDATE("Success","User Updated Successfully");
	
	private final String status;
	private final String message;
	
	ResponseCode(String status,String message){
		this.status=status;
		this.message=message;
	}
	
	public String getStatus() {
		return status;
	}
	
	public String getMessage() {
		return message;
	}	
}
