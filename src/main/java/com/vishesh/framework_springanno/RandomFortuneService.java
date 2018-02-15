package com.vishesh.framework_springanno;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	private String data[] = { "Beware of the wolf in sheep's clothing", "Diligence is the mother of good luck",
			"The journey is the reward" };

	private Random myRand = new Random();

	public String getFortune() {

		int index = myRand.nextInt(data.length);
		String fortune = data[index];
		return fortune;
	}

}
