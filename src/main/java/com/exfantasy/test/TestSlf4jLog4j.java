package com.exfantasy.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestSlf4jLog4j {

	private static final Logger logger = LoggerFactory.getLogger("com.exfantasy.test");

	public static void main(String[] args) {
		Properties props = new Properties();

		try (InputStream is = new FileInputStream("./config/log4j.properties")) {
			props.load(is);
			PropertyConfigurator.configure(props);
		} catch (FileNotFoundException fileNotFoundEx) {
			fileNotFoundEx.printStackTrace();
		} catch (IOException ioEx) {
			ioEx.printStackTrace();
		}

		logger.debug("This is debug msg, name: {}", "葉韶峰");
		logger.info("This is info msg");
	}
}
