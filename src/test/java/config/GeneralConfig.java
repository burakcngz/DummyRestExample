package config;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class GeneralConfig {

    private static Properties properties;
    private static String propertyFilePath = "src/test/java/config/config.properties";

    public static void ReadProperty(){
        BufferedReader reader;

        try{
            reader = new BufferedReader(new FileReader(propertyFilePath));
            properties = new Properties();
            try{
                properties.load(reader);
                reader.close();
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
            throw new RuntimeException("Config Property file not found at "+propertyFilePath);
        }
    }
    public static String getConfigValue(String key){
        return properties.getProperty(key);
    }

}
