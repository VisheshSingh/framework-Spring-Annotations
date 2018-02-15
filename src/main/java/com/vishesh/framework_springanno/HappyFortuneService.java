package com.vishesh.framework_springanno;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	public String getFortune() {
		return "Today, you will be very happy...";
	}

}
