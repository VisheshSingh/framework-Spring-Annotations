package com.vishesh.framework_springanno;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {

	public String getFortune() {
		return "DATABASE FORTUNE";
	}

}
