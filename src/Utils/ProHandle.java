package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ProHandle {
	public static Properties OR;
	public static InputStream input;
	public static String Filepath=System.getProperty("C:/Users/Baburao/workspace/Program/OR.pro");
	
	public static String fetchKey(String Key) throws IOException,FileNotFoundException {
		OR = new Properties();
		input= new FileInputStream(Filepath);
		OR.load(input);
	

		//Retrieve values through properties key
		
		String value= OR.getProperty(Key);
		return value;
				
		
	}
	

}
