package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesReader {

	
	
 private static Properties configfile;	
	
	
	static {
		
		try {
			
	String file="src/test/resources/dataFolder.confrug.properties";
			
			
	
	FileInputStream input = new FileInputStream (file);
	
	configfile = new Properties();
	
	configfile.load(input);
	
	input.close();
	
	
	
	
		}catch(Exception e){
			
			e.printStackTrace();
			
			
			
		}
		
		
		
		
		
	}
	
	
	public static String getProperties(String keyName) {
		
		return configfile.getProperty(keyName);
		
		
		
		
		
		
	}


	}
	
	
	
	
	
	


