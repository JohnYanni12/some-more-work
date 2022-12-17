package FileHandler;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileDemo1 {
    public static void main(String[] args) throws IOException {

        String path = "Data/config.properties"; //location of the file
        var fileInputStream = new FileInputStream(path);//Navigating to the file
        var properties = new Properties(); //that special software which helps us read data from that file
properties.load(fileInputStream);//load all the data from the file inside (memory)
        System.out.println(properties.getProperty("URL"));
        System.out.println(properties.getProperty("password"));
        fileInputStream.close();
    }
}