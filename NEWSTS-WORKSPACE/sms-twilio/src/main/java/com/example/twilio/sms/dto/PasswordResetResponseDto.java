package com.example.twilio.sms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PasswordResetResponseDto {

	
	private OtpStatus status;
	private String message;
	
}
