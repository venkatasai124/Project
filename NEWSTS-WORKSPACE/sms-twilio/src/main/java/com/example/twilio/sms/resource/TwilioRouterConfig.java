package com.example.twilio.sms.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class TwilioRouterConfig {

	@Autowired
	 TwilioOTPHandler handler;
	
	public RouterFunction<ServerResponse> handleSMS() {
        return RouterFunctions.route()
                .POST("/router/sendOTP", handler::sendOTP)
                .POST("/router/validateOTP", handler::validateOTP)
                .build();
    }
	
}
