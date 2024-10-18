package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {

		private Properties properties;
		private final String propertyFilePath= "configs//Configuration.properties";

		
		public ConfigFileReader(){
			BufferedReader reader;
			try {
				reader = new BufferedReader(new FileReader(propertyFilePath));
				properties = new Properties();
				try {
					properties.load(reader);
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
			}		
		}
		
	
//		public long getImplicitlyWait() {		
//			String implicitlyWait = properties.getProperty("implicitlyWait");
//			if(implicitlyWait != null) return Long.parseLong(implicitlyWait);
//			else throw new RuntimeException("implicitlyWait not specified in the Configuration.properties file.");		
//		}
		public String getBrowser() {
			String browser = properties.getProperty("browser");
			if(browser != null) return browser;
			else throw new RuntimeException(browser +"not specified in the Configuration.properties file.");
		}
		
		public String getUrl(String appUrl) {
			String url = properties.getProperty(appUrl);
			if(url != null) return url;
			else throw new RuntimeException(appUrl +"not specified in the Configuration.properties file.");
		}
		
//		public String getProperty(String prop) {
//			String expProp = properties.getProperty(prop);
//			if(expProp != null) return expProp;
//			else throw new RuntimeException(prop +"not specified in the Configuration.properties file.");
//		}
		
		public String getPageTitle(String pageName) {
			String title = properties.getProperty(pageName);
			if(title != null) return title;
			else throw new RuntimeException(pageName+" url not specified in the Configuration.properties file.");
		}
		
		public String getIndexUrl() {
			String indexUrl = properties.getProperty("indexUrl");
			if(indexUrl != null) return indexUrl;
			else throw new RuntimeException(" Index url not specified in the Configuration.properties file.");
		}
		
		public String getHomeUrl() {
			String homepageUrl = properties.getProperty("homepageUrl");
			if(homepageUrl != null) return homepageUrl;
			else throw new RuntimeException(" homepage url not specified in the Configuration.properties file.");
		}
		public String getLoginUrl() {
			String loginUrl = properties.getProperty("loginUrl");
			if(loginUrl != null) return loginUrl;
			else throw new RuntimeException(" login url not specified in the Configuration.properties file.");
		}
		
		public String getRegisterUrl() {
			String registerUrl = properties.getProperty("registerUrl");
			if(registerUrl != null) return registerUrl;
			else throw new RuntimeException(" register url not specified in the Configuration.properties file.");
		}
		
		
		public String geWaitTime(String wait) {
			String waitTime = properties.getProperty(wait);
			if(waitTime != null) return wait;
			else throw new RuntimeException( wait+ " not specified in the Configuration.properties file.");
		}
		
		public String getUsername() {
			String username = properties.getProperty("username");
			if(username != null) return username;
			else throw new RuntimeException("username  not specified in the Configuration.properties file.");
		}
		
		public String getPassword() {
			String password = properties.getProperty("password");
			if(password != null) return password;
			else throw new RuntimeException("password not specified in the Configuration.properties file.");	
		}
		public String getPracQnsExpOutput(String expectedOutput) {
			String expectedPracQnsOutput = properties.getProperty(expectedOutput);
			if(expectedPracQnsOutput != null) return expectedPracQnsOutput;
			else throw new RuntimeException(expectedOutput+"not specified in the Configuration.properties file.");
		}
		
		public String getPracQnsCode1() {
			String pythonCode01 = properties.getProperty("pythonCode1");
			if(pythonCode01 != null) return pythonCode01;
			else throw new RuntimeException("PYTHONCODE1 not specified in the Configuration.properties file.");
		}
		public String getPracQnsCode2(String pythonCode2) {
			String pythonCode02 = properties.getProperty(pythonCode2);
			if(pythonCode02 != null) return pythonCode02;
			else throw new RuntimeException(pythonCode2+"not specified in the Configuration.properties file.");
		}
		public String getPracQnsCode3(String pythonCode3) {
			String pythonCode03 = properties.getProperty(pythonCode3);
			if(pythonCode03 != null) return pythonCode03;
			else throw new RuntimeException(pythonCode3+"not specified in the Configuration.properties file.");
		}
		public String getPracQnsCode4(String pythonCode4) {
			String pythonCode04 = properties.getProperty(pythonCode4);
			if(pythonCode04 != null) return pythonCode04;
			else throw new RuntimeException(pythonCode4+"not specified in the Configuration.properties file.");
		}
		public String getPracQnsCode5(String pythonCode5) {
			String pythonCode05 = properties.getProperty(pythonCode5);
			if(pythonCode05 != null) return pythonCode05;
			else throw new RuntimeException(pythonCode5+"not specified in the Configuration.properties file.");
		}
		public String getPracQnsCode6(String pythonCode6) {
			String pythonCode06 = properties.getProperty(pythonCode6);
			if(pythonCode06 != null) return pythonCode06;
			else throw new RuntimeException(pythonCode6+"not specified in the Configuration.properties file.");
		}
		public String getPracQnsCode7(String pythonCode7) {
			String pythonCode07 = properties.getProperty(pythonCode7);
			if(pythonCode07 != null) return pythonCode07;
			else throw new RuntimeException(pythonCode7+"not specified in the Configuration.properties file.");
		}
		public String getPracQnsCode8(String pythonCode8) {
			String pythonCode08 = properties.getProperty(pythonCode8);
			if(pythonCode08 != null) return pythonCode08;
			else throw new RuntimeException(pythonCode8+"not specified in the Configuration.properties file.");
		}
	}

	
	

