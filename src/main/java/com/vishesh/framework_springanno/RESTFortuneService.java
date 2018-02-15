package com.vishesh.framework_springanno;

import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements FortuneService {

	public String getFortune() {
		return "REST FORTUNE";
	}

}
