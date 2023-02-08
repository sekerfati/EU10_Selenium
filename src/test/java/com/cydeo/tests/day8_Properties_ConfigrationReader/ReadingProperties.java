package com.cydeo.tests.day8_Properties_ConfigrationReader;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {
  @Test
  public void reading_from_properties_test() throws IOException {
   // 1- create the object of  Properties class
      Properties properties=new Properties();

  // 2- we need to open the file in java memory: FileInputStream
     FileInputStream  file= new FileInputStream("configuration.properties");

// 3- load the properties object using FileInputStream object
      properties.load(file);

// 4- use "properties" object to read the value
      System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser"));
      System.out.println("properties.getProperty(\"env\") = " + properties.getProperty("env"));
      System.out.println("properties.getProperty(\"username\") = " + properties.getProperty("username"));





  }



}
