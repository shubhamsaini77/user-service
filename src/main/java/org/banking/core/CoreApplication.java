package org.banking.core;

import org.banking.core.common.WhiteRoseObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

@SpringBootApplication(scanBasePackages = "org.whiteRose.banking")
public class CoreApplication {

	public static void main(String[] args) {
//		SpringApplication.run(CoreApplication.class, args);

		SpringApplication springApplication = new SpringApplication(CoreApplication.class);
		springApplication.run(args);
	}

	private static boolean checkCacheManager()
	{
		try {
			WhiteRoseObject whiteRoseObject = new WhiteRoseObject();
			whiteRoseObject.setId(UUID.randomUUID().toString());
		} catch (Exception e)
		{
			e.printStackTrace();
			return false;
		}
		return true;
	}

}
