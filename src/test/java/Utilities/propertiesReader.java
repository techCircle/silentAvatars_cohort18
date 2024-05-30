package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class propertiesReader {
	
	
public static Properties prop;  //declared the properties object.. the value of this prop at this line is NULL
	
	static {
		try {	
			// what file to read
			//read the file into java, and finds the file using
		String filePath = "src/test/resources/propertiesFiles/fityOneTestCase.properties";

		FileInputStream fis = new FileInputStream(filePath);
		prop = new Properties();
		
		prop.load(fis);
		fis.close();
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}	
	}
	public static String getProperty(String key) {
		return prop.getProperty(key);
	}

}
