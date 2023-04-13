package com.example.twilio.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.twilio.sms.config.TwilioConfig;
import com.twilio.Twilio;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SmsTwilioApplication {
	
	@Autowired
	 TwilioConfig twilioConfig;
	
	@PostConstruct
	public void initTwilio() {
		
		Twilio.init(twilioConfig.getAccountSid(),twilioConfig.getAuthToken());
	}

	public static void main(String[] args) {
		SpringApplication.run(SmsTwilioApplication.class, args);
	}

}
