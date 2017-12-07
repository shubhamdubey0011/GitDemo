package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyReader {

    Properties properties = new Properties();
    InputStream inputStream = null;

    public PropertyReader() 
    {
        loadProperties();
    }

    private void loadProperties() {
        try 
        {
        	//•To load Properties from property files into java Properties object.
            inputStream = new FileInputStream("F:/Java_LAB_Workspace/cucumber/src/test/resource/testdata/config.properties");
            properties.load(inputStream);
        } 
        
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }

    public String readProperty(String key) {
        return properties.getProperty(key);
    }
}
