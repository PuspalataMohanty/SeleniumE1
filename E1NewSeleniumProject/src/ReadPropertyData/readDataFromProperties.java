package ReadPropertyData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class readDataFromProperties {
public static void main(String[] args) throws IOException {
	FileInputStream fis = new FileInputStream("./Data/config.properties");
	Properties prop = new Properties();
	prop.load(fis);
	
	String data = prop.getProperty("username");
	System.out.println(data);
	
}
}
