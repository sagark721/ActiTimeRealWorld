package com.actitime.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * This is a generic class for data driven testing
 * @author HAREESH
 *
 */
public class FileLib {
	/**
	 * This is generic method for reading the data frome the property file
	 * @param key
	 * @return String
	 * @throws IOException
	 */
	public String getPropertyData(String key) throws IOException {

		FileInputStream fis=new FileInputStream("./data/propertydata.property");

		Properties p=new Properties();

		p.load(fis);

		String data=p.getProperty(key);
		
		return data;
	}

	
	}

