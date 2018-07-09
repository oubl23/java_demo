package com.oubl23.demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class Reader {
    public String getConfigFromPath(String path, String key, String chartSet) {
        Properties prop = new Properties();
        InputStream input = null;
        String result = null;
        try {

            input = new FileInputStream(path);
            InputStreamReader reader = new InputStreamReader(input, chartSet);

            // load a properties file
            prop.load(reader);

            // get the property value and print it out

            result = prop.getProperty(key);
            System.out.println(result);

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return result;
    }

    public String getConfigFromClassPath(String path, String key, String chartSet) {
        Properties prop = new Properties();
        InputStream input = null;
        String result = null;
        try {

            input = this.getClass().getClassLoader().getResourceAsStream(path);
            if (input == null) {
                System.out.println("Sorry, unable to find " + path);
                return null;
            }

            //load a properties file from class path, inside static method
            prop.load(new InputStreamReader(input,chartSet));

            //get the property value and print it out
            result = prop.getProperty(key);
            System.out.println(result);

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return result;
    }

}
