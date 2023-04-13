package com.example.twilio.sms.dto;

import lombok.Data;

@Data
public class PasswordResetRequestDto {

	private String phonenumber;
	private String username;
	private String oneTimePassword;
	
}
