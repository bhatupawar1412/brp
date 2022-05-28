package Selenium;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFiles {

	public static void main(String[] args) throws IOException {
		// step1
		// project report right click kela and Untitled Text File select kela
		// step 2
//		// then control + s according to project select button press

		FileReader reader = new FileReader("Data.Properties");
		Properties prop = new Properties();
		prop.load(reader);
		
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		System.out.println(prop.getProperty("phoneNumner"));
		

	}

}
